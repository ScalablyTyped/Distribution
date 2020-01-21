package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    additionalParameters: AdditionalParameterMap = null,
    awsIotJobArn: AwsIotJobArn = null,
    awsIotJobId: AwsIotJobId = null,
    awsJobExecutionsRolloutConfig: AwsJobExecutionsRolloutConfig = null,
    awsJobPresignedUrlConfig: AwsJobPresignedUrlConfig = null,
    creationDate: DateType = null,
    description: OTAUpdateDescription = null,
    errorInfo: ErrorInfo = null,
    lastModifiedDate: DateType = null,
    otaUpdateArn: OTAUpdateArn = null,
    otaUpdateFiles: OTAUpdateFiles = null,
    otaUpdateId: OTAUpdateId = null,
    otaUpdateStatus: OTAUpdateStatus = null,
    protocols: Protocols = null,
    targetSelection: TargetSelection = null,
    targets: Targets = null
  ): OTAUpdateInfo = {
    val __obj = js.Dynamic.literal()
    if (additionalParameters != null) __obj.updateDynamic("additionalParameters")(additionalParameters.asInstanceOf[js.Any])
    if (awsIotJobArn != null) __obj.updateDynamic("awsIotJobArn")(awsIotJobArn.asInstanceOf[js.Any])
    if (awsIotJobId != null) __obj.updateDynamic("awsIotJobId")(awsIotJobId.asInstanceOf[js.Any])
    if (awsJobExecutionsRolloutConfig != null) __obj.updateDynamic("awsJobExecutionsRolloutConfig")(awsJobExecutionsRolloutConfig.asInstanceOf[js.Any])
    if (awsJobPresignedUrlConfig != null) __obj.updateDynamic("awsJobPresignedUrlConfig")(awsJobPresignedUrlConfig.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errorInfo != null) __obj.updateDynamic("errorInfo")(errorInfo.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (otaUpdateArn != null) __obj.updateDynamic("otaUpdateArn")(otaUpdateArn.asInstanceOf[js.Any])
    if (otaUpdateFiles != null) __obj.updateDynamic("otaUpdateFiles")(otaUpdateFiles.asInstanceOf[js.Any])
    if (otaUpdateId != null) __obj.updateDynamic("otaUpdateId")(otaUpdateId.asInstanceOf[js.Any])
    if (otaUpdateStatus != null) __obj.updateDynamic("otaUpdateStatus")(otaUpdateStatus.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[OTAUpdateInfo]
  }
}

