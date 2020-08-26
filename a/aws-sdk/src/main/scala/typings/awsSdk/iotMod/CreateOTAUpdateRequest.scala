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
  def apply(files: OTAUpdateFiles, otaUpdateId: OTAUpdateId, roleArn: RoleArn, targets: Targets): CreateOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], otaUpdateId = otaUpdateId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOTAUpdateRequest]
  }
  @scala.inline
  implicit class CreateOTAUpdateRequestOps[Self <: CreateOTAUpdateRequest] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: OTAUpdateFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: OTAUpdateFiles): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = this.set("otaUpdateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalParameters(value: AdditionalParameterMap): Self = this.set("additionalParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalParameters: Self = this.set("additionalParameters", js.undefined)
    @scala.inline
    def setAwsJobAbortConfig(value: AwsJobAbortConfig): Self = this.set("awsJobAbortConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsJobAbortConfig: Self = this.set("awsJobAbortConfig", js.undefined)
    @scala.inline
    def setAwsJobExecutionsRolloutConfig(value: AwsJobExecutionsRolloutConfig): Self = this.set("awsJobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsJobExecutionsRolloutConfig: Self = this.set("awsJobExecutionsRolloutConfig", js.undefined)
    @scala.inline
    def setAwsJobPresignedUrlConfig(value: AwsJobPresignedUrlConfig): Self = this.set("awsJobPresignedUrlConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsJobPresignedUrlConfig: Self = this.set("awsJobPresignedUrlConfig", js.undefined)
    @scala.inline
    def setAwsJobTimeoutConfig(value: AwsJobTimeoutConfig): Self = this.set("awsJobTimeoutConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsJobTimeoutConfig: Self = this.set("awsJobTimeoutConfig", js.undefined)
    @scala.inline
    def setDescription(value: OTAUpdateDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: Protocols): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetSelection(value: TargetSelection): Self = this.set("targetSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSelection: Self = this.set("targetSelection", js.undefined)
  }
  
}

