package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadEntityDefinitionsResponse extends js.Object {
  /**
    * The ID that specifies the upload action. You can use this to track the status of the upload.
    */
  var uploadId: UploadId = js.native
}

object UploadEntityDefinitionsResponse {
  @scala.inline
  def apply(uploadId: UploadId): UploadEntityDefinitionsResponse = {
    val __obj = js.Dynamic.literal(uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadEntityDefinitionsResponse]
  }
}

