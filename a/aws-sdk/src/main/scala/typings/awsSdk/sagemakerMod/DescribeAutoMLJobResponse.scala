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
    * This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not provided by you. If you do provide them, then they'll be the same as provided.
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
    RoleArn: RoleArn
  ): DescribeAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobResponse]
  }
  @scala.inline
  implicit class DescribeAutoMLJobResponseOps[Self <: DescribeAutoMLJobResponse] (val x: Self) extends AnyVal {
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
    def setAutoMLJobArn(value: AutoMLJobArn): Self = this.set("AutoMLJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobName(value: AutoMLJobName): Self = this.set("AutoMLJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = this.set("AutoMLJobSecondaryStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobStatus(value: AutoMLJobStatus): Self = this.set("AutoMLJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputDataConfigVarargs(value: AutoMLChannel*): Self = this.set("InputDataConfig", js.Array(value :_*))
    @scala.inline
    def setInputDataConfig(value: AutoMLInputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputDataConfig(value: AutoMLOutputDataConfig): Self = this.set("OutputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobArtifacts(value: AutoMLJobArtifacts): Self = this.set("AutoMLJobArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLJobArtifacts: Self = this.set("AutoMLJobArtifacts", js.undefined)
    @scala.inline
    def setAutoMLJobConfig(value: AutoMLJobConfig): Self = this.set("AutoMLJobConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLJobConfig: Self = this.set("AutoMLJobConfig", js.undefined)
    @scala.inline
    def setAutoMLJobObjective(value: AutoMLJobObjective): Self = this.set("AutoMLJobObjective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLJobObjective: Self = this.set("AutoMLJobObjective", js.undefined)
    @scala.inline
    def setBestCandidate(value: AutoMLCandidate): Self = this.set("BestCandidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBestCandidate: Self = this.set("BestCandidate", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setFailureReason(value: AutoMLFailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setGenerateCandidateDefinitionsOnly(value: GenerateCandidateDefinitionsOnly): Self = this.set("GenerateCandidateDefinitionsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateCandidateDefinitionsOnly: Self = this.set("GenerateCandidateDefinitionsOnly", js.undefined)
    @scala.inline
    def setProblemType(value: ProblemType): Self = this.set("ProblemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProblemType: Self = this.set("ProblemType", js.undefined)
    @scala.inline
    def setResolvedAttributes(value: ResolvedAttributes): Self = this.set("ResolvedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvedAttributes: Self = this.set("ResolvedAttributes", js.undefined)
  }
  
}

