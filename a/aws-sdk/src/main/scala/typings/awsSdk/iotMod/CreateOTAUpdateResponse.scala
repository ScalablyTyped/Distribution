package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOTAUpdateResponse extends StObject {
  
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined
  
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined
  
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
  
  /**
    * The OTA update status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
}
object CreateOTAUpdateResponse {
  
  inline def apply(): CreateOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOTAUpdateResponse]
  }
  
  extension [Self <: CreateOTAUpdateResponse](x: Self) {
    
    inline def setAwsIotJobArn(value: AwsIotJobArn): Self = StObject.set(x, "awsIotJobArn", value.asInstanceOf[js.Any])
    
    inline def setAwsIotJobArnUndefined: Self = StObject.set(x, "awsIotJobArn", js.undefined)
    
    inline def setAwsIotJobId(value: AwsIotJobId): Self = StObject.set(x, "awsIotJobId", value.asInstanceOf[js.Any])
    
    inline def setAwsIotJobIdUndefined: Self = StObject.set(x, "awsIotJobId", js.undefined)
    
    inline def setOtaUpdateArn(value: OTAUpdateArn): Self = StObject.set(x, "otaUpdateArn", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateArnUndefined: Self = StObject.set(x, "otaUpdateArn", js.undefined)
    
    inline def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateIdUndefined: Self = StObject.set(x, "otaUpdateId", js.undefined)
    
    inline def setOtaUpdateStatus(value: OTAUpdateStatus): Self = StObject.set(x, "otaUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateStatusUndefined: Self = StObject.set(x, "otaUpdateStatus", js.undefined)
  }
}
