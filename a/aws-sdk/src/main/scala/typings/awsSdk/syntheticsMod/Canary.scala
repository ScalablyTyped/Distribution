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
  def apply(
    ArtifactS3Location: String = null,
    Code: CanaryCodeOutput = null,
    EngineArn: Arn = null,
    ExecutionRoleArn: Arn = null,
    FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
    Id: UUID = null,
    Name: CanaryName = null,
    RunConfig: CanaryRunConfigOutput = null,
    RuntimeVersion: String = null,
    Schedule: CanaryScheduleOutput = null,
    Status: CanaryStatus = null,
    SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
    Tags: TagMap = null,
    Timeline: CanaryTimeline = null,
    VpcConfig: VpcConfigOutput = null
  ): Canary = {
    val __obj = js.Dynamic.literal()
    if (ArtifactS3Location != null) __obj.updateDynamic("ArtifactS3Location")(ArtifactS3Location.asInstanceOf[js.Any])
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (EngineArn != null) __obj.updateDynamic("EngineArn")(EngineArn.asInstanceOf[js.Any])
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(FailureRetentionPeriodInDays)) __obj.updateDynamic("FailureRetentionPeriodInDays")(FailureRetentionPeriodInDays.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RunConfig != null) __obj.updateDynamic("RunConfig")(RunConfig.asInstanceOf[js.Any])
    if (RuntimeVersion != null) __obj.updateDynamic("RuntimeVersion")(RuntimeVersion.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(SuccessRetentionPeriodInDays)) __obj.updateDynamic("SuccessRetentionPeriodInDays")(SuccessRetentionPeriodInDays.get.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canary]
  }
}

