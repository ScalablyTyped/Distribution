package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUploadStatusRequest extends js.Object {
  /**
    * The ID of the upload. This value is returned by the UploadEntityDefinitions action.
    */
  var uploadId: UploadId = js.native
}

object GetUploadStatusRequest {
  @scala.inline
  def apply(uploadId: UploadId): GetUploadStatusRequest = {
    val __obj = js.Dynamic.literal(uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadStatusRequest]
  }
}

