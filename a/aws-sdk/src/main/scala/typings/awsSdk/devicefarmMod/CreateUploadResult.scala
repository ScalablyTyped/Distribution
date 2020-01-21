package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUploadResult extends js.Object {
  /**
    * The newly created upload.
    */
  var upload: js.UndefOr[Upload] = js.native
}

object CreateUploadResult {
  @scala.inline
  def apply(upload: Upload = null): CreateUploadResult = {
    val __obj = js.Dynamic.literal()
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUploadResult]
  }
}

