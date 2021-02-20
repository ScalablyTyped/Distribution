package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOTAUpdateRequest extends StObject {
  
  /**
    * Specifies if the stream associated with an OTA update should be deleted when the OTA update is deleted.
    */
  var deleteStream: js.UndefOr[DeleteStream] = js.native
  
  /**
    * Specifies if the AWS Job associated with the OTA update should be deleted when the OTA update is deleted.
    */
  var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.native
  
  /**
    * The ID of the OTA update to delete.
    */
  var otaUpdateId: OTAUpdateId = js.native
}
object DeleteOTAUpdateRequest {
  
  @scala.inline
  def apply(otaUpdateId: OTAUpdateId): DeleteOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOTAUpdateRequest]
  }
  
  @scala.inline
  implicit class DeleteOTAUpdateRequestMutableBuilder[Self <: DeleteOTAUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteStream(value: DeleteStream): Self = StObject.set(x, "deleteStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteStreamUndefined: Self = StObject.set(x, "deleteStream", js.undefined)
    
    @scala.inline
    def setForceDeleteAWSJob(value: ForceDeleteAWSJob): Self = StObject.set(x, "forceDeleteAWSJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteAWSJobUndefined: Self = StObject.set(x, "forceDeleteAWSJob", js.undefined)
    
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
  }
}
