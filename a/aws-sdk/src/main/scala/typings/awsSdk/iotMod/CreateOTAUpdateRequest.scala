package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOTAUpdateRequest extends js.Object {
  /**
    * A list of additional OTA update parameters which are name-value pairs.
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.native
  /**
    * The criteria that determine when and how a job abort takes place.
    */
  var awsJobAbortConfig: js.UndefOr[AwsJobAbortConfig] = js.native
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.native
  /**
    * Configuration information for pre-signed URLs.
    */
  var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.native
  /**
    * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to TIMED_OUT.
    */
  var awsJobTimeoutConfig: js.UndefOr[AwsJobTimeoutConfig] = js.native
  /**
    * The description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.native
  /**
    * The files to be streamed by the OTA update.
    */
  var files: OTAUpdateFiles = js.native
  /**
    * The ID of the OTA update to be created.
    */
  var otaUpdateId: OTAUpdateId = js.native
  /**
    * The protocol used to transfer the OTA update image. Valid values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the target device can choose the protocol.
    */
  var protocols: js.UndefOr[Protocols] = js.native
  /**
    * The IAM role that grants AWS IoT access to the Amazon S3, AWS IoT jobs and AWS Code Signing resources to create an OTA update job.
    */
  var roleArn: RoleArn = js.native
  /**
    * Metadata which can be used to manage updates.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing when a change is detected in a target. For example, an update will run on a thing when the thing is added to a target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS | SNAPSHOT.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * The devices targeted to receive OTA updates.
    */
  var targets: Targets = js.native
}

object CreateOTAUpdateRequest {
  @scala.inline
  def apply(
    files: OTAUpdateFiles,
    otaUpdateId: OTAUpdateId,
    roleArn: RoleArn,
    targets: Targets,
    additionalParameters: AdditionalParameterMap = null,
    awsJobAbortConfig: AwsJobAbortConfig = null,
    awsJobExecutionsRolloutConfig: AwsJobExecutionsRolloutConfig = null,
    awsJobPresignedUrlConfig: AwsJobPresignedUrlConfig = null,
    awsJobTimeoutConfig: AwsJobTimeoutConfig = null,
    description: OTAUpdateDescription = null,
    protocols: Protocols = null,
    tags: TagList = null,
    targetSelection: TargetSelection = null
  ): CreateOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], otaUpdateId = otaUpdateId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    if (additionalParameters != null) __obj.updateDynamic("additionalParameters")(additionalParameters.asInstanceOf[js.Any])
    if (awsJobAbortConfig != null) __obj.updateDynamic("awsJobAbortConfig")(awsJobAbortConfig.asInstanceOf[js.Any])
    if (awsJobExecutionsRolloutConfig != null) __obj.updateDynamic("awsJobExecutionsRolloutConfig")(awsJobExecutionsRolloutConfig.asInstanceOf[js.Any])
    if (awsJobPresignedUrlConfig != null) __obj.updateDynamic("awsJobPresignedUrlConfig")(awsJobPresignedUrlConfig.asInstanceOf[js.Any])
    if (awsJobTimeoutConfig != null) __obj.updateDynamic("awsJobTimeoutConfig")(awsJobTimeoutConfig.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOTAUpdateRequest]
  }
}

