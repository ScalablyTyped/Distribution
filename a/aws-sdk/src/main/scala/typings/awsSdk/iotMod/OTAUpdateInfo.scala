package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OTAUpdateInfo extends js.Object {
  
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
  implicit class OTAUpdateInfoOps[Self <: OTAUpdateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalParameters(value: AdditionalParameterMap): Self = this.set("additionalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalParameters: Self = this.set("additionalParameters", js.undefined)
    
    @scala.inline
    def setAwsIotJobArn(value: AwsIotJobArn): Self = this.set("awsIotJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIotJobArn: Self = this.set("awsIotJobArn", js.undefined)
    
    @scala.inline
    def setAwsIotJobId(value: AwsIotJobId): Self = this.set("awsIotJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIotJobId: Self = this.set("awsIotJobId", js.undefined)
    
    @scala.inline
    def setAwsJobExecutionsRolloutConfig(value: AwsJobExecutionsRolloutConfig): Self = this.set("awsJobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsJobExecutionsRolloutConfig: Self = this.set("awsJobExecutionsRolloutConfig", js.undefined)
    
    @scala.inline
    def setAwsJobPresignedUrlConfig(value: AwsJobPresignedUrlConfig): Self = this.set("awsJobPresignedUrlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsJobPresignedUrlConfig: Self = this.set("awsJobPresignedUrlConfig", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: OTAUpdateDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = this.set("errorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorInfo: Self = this.set("errorInfo", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    
    @scala.inline
    def setOtaUpdateArn(value: OTAUpdateArn): Self = this.set("otaUpdateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtaUpdateArn: Self = this.set("otaUpdateArn", js.undefined)
    
    @scala.inline
    def setOtaUpdateFilesVarargs(value: OTAUpdateFile*): Self = this.set("otaUpdateFiles", js.Array(value :_*))
    
    @scala.inline
    def setOtaUpdateFiles(value: OTAUpdateFiles): Self = this.set("otaUpdateFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtaUpdateFiles: Self = this.set("otaUpdateFiles", js.undefined)
    
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = this.set("otaUpdateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtaUpdateId: Self = this.set("otaUpdateId", js.undefined)
    
    @scala.inline
    def setOtaUpdateStatus(value: OTAUpdateStatus): Self = this.set("otaUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtaUpdateStatus: Self = this.set("otaUpdateStatus", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: Protocols): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    
    @scala.inline
    def setTargetSelection(value: TargetSelection): Self = this.set("targetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSelection: Self = this.set("targetSelection", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Targets): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
}
