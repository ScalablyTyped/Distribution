package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageLocation extends js.Object {
  /**
    * The name of the S3 bucket.
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * The key.
    */
  var Key: js.UndefOr[String] = js.native
}

object StorageLocation {
  @scala.inline
  def apply(Bucket: String = null, Key: String = null): StorageLocation = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLocation]
  }
}

