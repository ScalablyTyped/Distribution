package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Path extends js.Object {
  /**
    * The name of the S3 bucket that contains the file.
    */
  var Bucket: S3BucketName = js.native
  /**
    * The name of the file.
    */
  var Key: S3ObjectKey = js.native
}

object S3Path {
  @scala.inline
  def apply(Bucket: S3BucketName, Key: S3ObjectKey): S3Path = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3Path]
  }
}

