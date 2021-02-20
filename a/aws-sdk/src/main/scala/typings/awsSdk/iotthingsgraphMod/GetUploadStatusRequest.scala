package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUploadStatusRequest extends StObject {
  
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
  
  @scala.inline
  implicit class GetUploadStatusRequestMutableBuilder[Self <: GetUploadStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
