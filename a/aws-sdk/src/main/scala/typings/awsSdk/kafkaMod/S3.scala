package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3 extends js.Object {
  var Bucket: js.UndefOr[string] = js.native
  var Enabled: boolean = js.native
  var Prefix: js.UndefOr[string] = js.native
}

object S3 {
  @scala.inline
  def apply(Enabled: boolean, Bucket: string = null, Prefix: string = null): S3 = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
}

