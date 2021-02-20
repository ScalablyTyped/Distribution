package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OTAUpdateInfo extends StObject {
  
  /**
    * A collection of name/value pairs
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.native
  
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.native
  
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.native
  
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.native
  
  /**
    * Configuration information for pre-signed URLs. Valid when protocols contains HTTP.
    */
  var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.native
  
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * A description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.native
  
  /**
    * Error information associated with the OTA update.
    */
  var errorInfo: js.UndefOr[ErrorInfo] = js.native
  
  /**
    * The date when the OTA update was last updated.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  
  /**
    * A list of files associated with the OTA update.
    */
  var otaUpdateFiles: js.UndefOr[OTAUpdateFiles] = js.native
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
  
  /**
    * The status of the OTA update.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.native
  
  /**
    * The protocol used to transfer the OTA update image. Valid values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the target device can choose the protocol.
    */
  var protocols: js.UndefOr[Protocols] = js.native
  
  /**
    * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is added to a target group, even after the OTA update was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  
  /**
    * The targets of the OTA update.
    */
  var targets: js.UndefOr[Targets] = js.native
}
object OTAUpdateInfo {
  
  @scala.inline
  def apply(): OTAUpdateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateInfo]
  }
  
  @scala.inline
  implicit class OTAUpdateInfoMutableBuilder[Self <: OTAUpdateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalParameters(value: AdditionalParameterMap): Self = StObject.set(x, "additionalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalParametersUndefined: Self = StObject.set(x, "additionalParameters", js.undefined)
    
    @scala.inline
    def setAwsIotJobArn(value: AwsIotJobArn): Self = StObject.set(x, "awsIotJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIotJobArnUndefined: Self = StObject.set(x, "awsIotJobArn", js.undefined)
    
    @scala.inline
    def setAwsIotJobId(value: AwsIotJobId): Self = StObject.set(x, "awsIotJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIotJobIdUndefined: Self = StObject.set(x, "awsIotJobId", js.undefined)
    
    @scala.inline
    def setAwsJobExecutionsRolloutConfig(value: AwsJobExecutionsRolloutConfig): Self = StObject.set(x, "awsJobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "awsJobExecutionsRolloutConfig", js.undefined)
    
    @scala.inline
    def setAwsJobPresignedUrlConfig(value: AwsJobPresignedUrlConfig): Self = StObject.set(x, "awsJobPresignedUrlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsJobPresignedUrlConfigUndefined: Self = StObject.set(x, "awsJobPresignedUrlConfig", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: OTAUpdateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setOtaUpdateArn(value: OTAUpdateArn): Self = StObject.set(x, "otaUpdateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateArnUndefined: Self = StObject.set(x, "otaUpdateArn", js.undefined)
    
    @scala.inline
    def setOtaUpdateFiles(value: OTAUpdateFiles): Self = StObject.set(x, "otaUpdateFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateFilesUndefined: Self = StObject.set(x, "otaUpdateFiles", js.undefined)
    
    @scala.inline
    def setOtaUpdateFilesVarargs(value: OTAUpdateFile*): Self = StObject.set(x, "otaUpdateFiles", js.Array(value :_*))
    
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateIdUndefined: Self = StObject.set(x, "otaUpdateId", js.undefined)
    
    @scala.inline
    def setOtaUpdateStatus(value: OTAUpdateStatus): Self = StObject.set(x, "otaUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateStatusUndefined: Self = StObject.set(x, "otaUpdateStatus", js.undefined)
    
    @scala.inline
    def setProtocols(value: Protocols): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    
    @scala.inline
    def setTargetSelection(value: TargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
