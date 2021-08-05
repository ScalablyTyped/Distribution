package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOTAUpdateRequest extends StObject {
  
  /**
    * Specifies if the stream associated with an OTA update should be deleted when the OTA update is deleted.
    */
  var deleteStream: js.UndefOr[DeleteStream] = js.undefined
  
  /**
    * Specifies if the AWS Job associated with the OTA update should be deleted when the OTA update is deleted.
    */
  var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined
  
  /**
    * The ID of the OTA update to delete.
    */
  var otaUpdateId: OTAUpdateId
}
object DeleteOTAUpdateRequest {
  
  inline def apply(otaUpdateId: OTAUpdateId): DeleteOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOTAUpdateRequest]
  }
  
  extension [Self <: DeleteOTAUpdateRequest](x: Self) {
    
    inline def setDeleteStream(value: DeleteStream): Self = StObject.set(x, "deleteStream", value.asInstanceOf[js.Any])
    
    inline def setDeleteStreamUndefined: Self = StObject.set(x, "deleteStream", js.undefined)
    
    inline def setForceDeleteAWSJob(value: ForceDeleteAWSJob): Self = StObject.set(x, "forceDeleteAWSJob", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteAWSJobUndefined: Self = StObject.set(x, "forceDeleteAWSJob", js.undefined)
    
    inline def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
  }
}
