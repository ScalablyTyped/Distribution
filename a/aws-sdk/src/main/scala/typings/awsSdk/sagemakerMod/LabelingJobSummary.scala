package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers into a label for a data object. For more information, see Annotation Consolidation.
    */
  var AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn] = js.native
  /**
    * The date and time that the job was created (timestamp).
    */
  var CreationTime: Timestamp = js.native
  /**
    * If the LabelingJobStatus field is Failed, this field contains a description of the error.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * Input configuration for the labeling job.
    */
  var InputConfig: js.UndefOr[LabelingJobInputConfig] = js.native
  /**
    * Counts showing the progress of the labeling job.
    */
  var LabelCounters: typings.awsSdk.sagemakerMod.LabelCounters = js.native
  /**
    * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
    */
  var LabelingJobArn: typings.awsSdk.sagemakerMod.LabelingJobArn = js.native
  /**
    * The name of the labeling job.
    */
  var LabelingJobName: typings.awsSdk.sagemakerMod.LabelingJobName = js.native
  /**
    * The location of the output produced by the labeling job.
    */
  var LabelingJobOutput: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobOutput] = js.native
  /**
    * The current status of the labeling job. 
    */
  var LabelingJobStatus: typings.awsSdk.sagemakerMod.LabelingJobStatus = js.native
  /**
    * The date and time that the job was last modified (timestamp).
    */
  var LastModifiedTime: Timestamp = js.native
  /**
    * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a worker.
    */
  var PreHumanTaskLambdaArn: LambdaFunctionArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the work team assigned to the job.
    */
  var WorkteamArn: typings.awsSdk.sagemakerMod.WorkteamArn = js.native
}

object LabelingJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    LabelCounters: LabelCounters,
    LabelingJobArn: LabelingJobArn,
    LabelingJobName: LabelingJobName,
    LabelingJobStatus: LabelingJobStatus,
    LastModifiedTime: Timestamp,
    PreHumanTaskLambdaArn: LambdaFunctionArn,
    WorkteamArn: WorkteamArn,
    AnnotationConsolidationLambdaArn: LambdaFunctionArn = null,
    FailureReason: FailureReason = null,
    InputConfig: LabelingJobInputConfig = null,
    LabelingJobOutput: LabelingJobOutput = null
  ): LabelingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LabelCounters = LabelCounters.asInstanceOf[js.Any], LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any], LabelingJobName = LabelingJobName.asInstanceOf[js.Any], LabelingJobStatus = LabelingJobStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], PreHumanTaskLambdaArn = PreHumanTaskLambdaArn.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    if (AnnotationConsolidationLambdaArn != null) __obj.updateDynamic("AnnotationConsolidationLambdaArn")(AnnotationConsolidationLambdaArn.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (InputConfig != null) __obj.updateDynamic("InputConfig")(InputConfig.asInstanceOf[js.Any])
    if (LabelingJobOutput != null) __obj.updateDynamic("LabelingJobOutput")(LabelingJobOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobSummary]
  }
}

