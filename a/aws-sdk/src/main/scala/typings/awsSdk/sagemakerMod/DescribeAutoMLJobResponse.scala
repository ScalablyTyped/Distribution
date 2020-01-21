package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutoMLJobResponse extends js.Object {
  /**
    * Returns the job's ARN.
    */
  var AutoMLJobArn: typings.awsSdk.sagemakerMod.AutoMLJobArn = js.native
  /**
    * Returns information on the job's artifacts found in AutoMLJobArtifacts.
    */
  var AutoMLJobArtifacts: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobArtifacts] = js.native
  /**
    * Returns the job's config.
    */
  var AutoMLJobConfig: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobConfig] = js.native
  /**
    * Returns the name of a job.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
  /**
    * Returns the job's objective.
    */
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  /**
    * Returns the job's AutoMLJobSecondaryStatus.
    */
  var AutoMLJobSecondaryStatus: typings.awsSdk.sagemakerMod.AutoMLJobSecondaryStatus = js.native
  /**
    * Returns the job's AutoMLJobStatus.
    */
  var AutoMLJobStatus: typings.awsSdk.sagemakerMod.AutoMLJobStatus = js.native
  /**
    * Returns the job's BestCandidate.
    */
  var BestCandidate: js.UndefOr[AutoMLCandidate] = js.native
  /**
    * Returns the job's creation time.
    */
  var CreationTime: Timestamp = js.native
  /**
    * Returns the job's end time.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Returns the job's FailureReason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  /**
    * Returns the job's output from GenerateCandidateDefinitionsOnly.
    */
  var GenerateCandidateDefinitionsOnly: js.UndefOr[typings.awsSdk.sagemakerMod.GenerateCandidateDefinitionsOnly] = js.native
  /**
    * Returns the job's input data config.
    */
  var InputDataConfig: AutoMLInputDataConfig = js.native
  /**
    * Returns the job's last modified time.
    */
  var LastModifiedTime: Timestamp = js.native
  /**
    * Returns the job's output data config.
    */
  var OutputDataConfig: AutoMLOutputDataConfig = js.native
  /**
    * Returns the job's problem type.
    */
  var ProblemType: js.UndefOr[typings.awsSdk.sagemakerMod.ProblemType] = js.native
  /**
    * This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They’re auto-inferred values, if not provided by you. If you do provide them, then they’ll be the same as provided.
    */
  var ResolvedAttributes: js.UndefOr[typings.awsSdk.sagemakerMod.ResolvedAttributes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read permission to the input data location and write permission to the output data location in Amazon S3.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
}

object DescribeAutoMLJobResponse {
  @scala.inline
  def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: Timestamp,
    InputDataConfig: AutoMLInputDataConfig,
    LastModifiedTime: Timestamp,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn,
    AutoMLJobArtifacts: AutoMLJobArtifacts = null,
    AutoMLJobConfig: AutoMLJobConfig = null,
    AutoMLJobObjective: AutoMLJobObjective = null,
    BestCandidate: AutoMLCandidate = null,
    EndTime: Timestamp = null,
    FailureReason: AutoMLFailureReason = null,
    GenerateCandidateDefinitionsOnly: js.UndefOr[scala.Boolean] = js.undefined,
    ProblemType: ProblemType = null,
    ResolvedAttributes: ResolvedAttributes = null
  ): DescribeAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (AutoMLJobArtifacts != null) __obj.updateDynamic("AutoMLJobArtifacts")(AutoMLJobArtifacts.asInstanceOf[js.Any])
    if (AutoMLJobConfig != null) __obj.updateDynamic("AutoMLJobConfig")(AutoMLJobConfig.asInstanceOf[js.Any])
    if (AutoMLJobObjective != null) __obj.updateDynamic("AutoMLJobObjective")(AutoMLJobObjective.asInstanceOf[js.Any])
    if (BestCandidate != null) __obj.updateDynamic("BestCandidate")(BestCandidate.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (!js.isUndefined(GenerateCandidateDefinitionsOnly)) __obj.updateDynamic("GenerateCandidateDefinitionsOnly")(GenerateCandidateDefinitionsOnly.asInstanceOf[js.Any])
    if (ProblemType != null) __obj.updateDynamic("ProblemType")(ProblemType.asInstanceOf[js.Any])
    if (ResolvedAttributes != null) __obj.updateDynamic("ResolvedAttributes")(ResolvedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobResponse]
  }
}

