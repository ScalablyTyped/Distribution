package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canary extends js.Object {
  /**
    * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts include the log file, screenshots, and HAR files.
    */
  var ArtifactS3Location: js.UndefOr[String] = js.native
  var Code: js.UndefOr[CanaryCodeOutput] = js.native
  /**
    * The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda ARN format, see Resources and Conditions for Lambda Actions.
    */
  var EngineArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the IAM role used to run the canary. This role must include lambda.amazonaws.com as a principal in the trust policy.
    */
  var ExecutionRoleArn: js.UndefOr[Arn] = js.native
  /**
    * The number of days to retain data about failed runs of this canary.
    */
  var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.native
  /**
    * The unique ID of this canary.
    */
  var Id: js.UndefOr[UUID] = js.native
  /**
    * The name of the canary.
    */
  var Name: js.UndefOr[CanaryName] = js.native
  var RunConfig: js.UndefOr[CanaryRunConfigOutput] = js.native
  /**
    * Specifies the runtime version to use for the canary. Currently, the only valid value is syn-1.0. For more information about runtime versions, see  Canary Runtime Versions.
    */
  var RuntimeVersion: js.UndefOr[String] = js.native
  /**
    * A structure that contains information about how often the canary is to run, and when these runs are to stop.
    */
  var Schedule: js.UndefOr[CanaryScheduleOutput] = js.native
  /**
    * A structure that contains information about the canary's status.
    */
  var Status: js.UndefOr[CanaryStatus] = js.native
  /**
    * The number of days to retain data about successful runs of this canary.
    */
  var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.native
  /**
    * The list of key-value pairs that are associated with the canary.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * A structure that contains information about when the canary was created, modified, and most recently run.
    */
  var Timeline: js.UndefOr[CanaryTimeline] = js.native
  var VpcConfig: js.UndefOr[VpcConfigOutput] = js.native
}

object Canary {
  @scala.inline
  def apply(): Canary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Canary]
  }
  @scala.inline
  implicit class CanaryOps[Self <: Canary] (val x: Self) extends AnyVal {
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
    def setArtifactS3Location(value: String): Self = this.set("ArtifactS3Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactS3Location: Self = this.set("ArtifactS3Location", js.undefined)
    @scala.inline
    def setCode(value: CanaryCodeOutput): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setEngineArn(value: Arn): Self = this.set("EngineArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineArn: Self = this.set("EngineArn", js.undefined)
    @scala.inline
    def setExecutionRoleArn(value: Arn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("ExecutionRoleArn", js.undefined)
    @scala.inline
    def setFailureRetentionPeriodInDays(value: MaxSize1024): Self = this.set("FailureRetentionPeriodInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureRetentionPeriodInDays: Self = this.set("FailureRetentionPeriodInDays", js.undefined)
    @scala.inline
    def setId(value: UUID): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: CanaryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRunConfig(value: CanaryRunConfigOutput): Self = this.set("RunConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunConfig: Self = this.set("RunConfig", js.undefined)
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("RuntimeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("RuntimeVersion", js.undefined)
    @scala.inline
    def setSchedule(value: CanaryScheduleOutput): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    @scala.inline
    def setStatus(value: CanaryStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSuccessRetentionPeriodInDays(value: MaxSize1024): Self = this.set("SuccessRetentionPeriodInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessRetentionPeriodInDays: Self = this.set("SuccessRetentionPeriodInDays", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTimeline(value: CanaryTimeline): Self = this.set("Timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeline: Self = this.set("Timeline", js.undefined)
    @scala.inline
    def setVpcConfig(value: VpcConfigOutput): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

