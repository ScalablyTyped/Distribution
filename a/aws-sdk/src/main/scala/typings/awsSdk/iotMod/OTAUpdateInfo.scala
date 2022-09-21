package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OTAUpdateInfo extends StObject {
  
  /**
    * A collection of name/value pairs
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined
  
  /**
    * The IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined
  
  /**
    * The IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined
  
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined
  
  /**
    * Configuration information for pre-signed URLs. Valid when protocols contains HTTP.
    */
  var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.undefined
  
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.undefined
  
  /**
    * Error information associated with the OTA update.
    */
  var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
  
  /**
    * The date when the OTA update was last updated.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
  
  /**
    * A list of files associated with the OTA update.
    */
  var otaUpdateFiles: js.UndefOr[OTAUpdateFiles] = js.undefined
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
  
  /**
    * The status of the OTA update.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
  
  /**
    * The protocol used to transfer the OTA update image. Valid values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the target device can choose the protocol.
    */
  var protocols: js.UndefOr[Protocols] = js.undefined
  
  /**
    * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is added to a target group, even after the OTA update was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  
  /**
    * The targets of the OTA update.
    */
  var targets: js.UndefOr[Targets] = js.undefined
}
object OTAUpdateInfo {
  
  inline def apply(): OTAUpdateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateInfo]
  }
  
  extension [Self <: OTAUpdateInfo](x: Self) {
    
    inline def setAdditionalParameters(value: AdditionalParameterMap): Self = StObject.set(x, "additionalParameters", value.asInstanceOf[js.Any])
    
    inline def setAdditionalParametersUndefined: Self = StObject.set(x, "additionalParameters", js.undefined)
    
    inline def setAwsIotJobArn(value: AwsIotJobArn): Self = StObject.set(x, "awsIotJobArn", value.asInstanceOf[js.Any])
    
    inline def setAwsIotJobArnUndefined: Self = StObject.set(x, "awsIotJobArn", js.undefined)
    
    inline def setAwsIotJobId(value: AwsIotJobId): Self = StObject.set(x, "awsIotJobId", value.asInstanceOf[js.Any])
    
    inline def setAwsIotJobIdUndefined: Self = StObject.set(x, "awsIotJobId", js.undefined)
    
    inline def setAwsJobExecutionsRolloutConfig(value: AwsJobExecutionsRolloutConfig): Self = StObject.set(x, "awsJobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    inline def setAwsJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "awsJobExecutionsRolloutConfig", js.undefined)
    
    inline def setAwsJobPresignedUrlConfig(value: AwsJobPresignedUrlConfig): Self = StObject.set(x, "awsJobPresignedUrlConfig", value.asInstanceOf[js.Any])
    
    inline def setAwsJobPresignedUrlConfigUndefined: Self = StObject.set(x, "awsJobPresignedUrlConfig", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDescription(value: OTAUpdateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setOtaUpdateArn(value: OTAUpdateArn): Self = StObject.set(x, "otaUpdateArn", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateArnUndefined: Self = StObject.set(x, "otaUpdateArn", js.undefined)
    
    inline def setOtaUpdateFiles(value: OTAUpdateFiles): Self = StObject.set(x, "otaUpdateFiles", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateFilesUndefined: Self = StObject.set(x, "otaUpdateFiles", js.undefined)
    
    inline def setOtaUpdateFilesVarargs(value: OTAUpdateFile*): Self = StObject.set(x, "otaUpdateFiles", js.Array(value*))
    
    inline def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateIdUndefined: Self = StObject.set(x, "otaUpdateId", js.undefined)
    
    inline def setOtaUpdateStatus(value: OTAUpdateStatus): Self = StObject.set(x, "otaUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateStatusUndefined: Self = StObject.set(x, "otaUpdateStatus", js.undefined)
    
    inline def setProtocols(value: Protocols): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value*))
    
    inline def setTargetSelection(value: TargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
