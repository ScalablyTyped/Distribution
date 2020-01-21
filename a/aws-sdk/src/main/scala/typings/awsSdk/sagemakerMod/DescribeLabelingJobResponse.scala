package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLabelingJobResponse extends js.Object {
  /**
    * The date and time that the labeling job was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    * If the job failed, the reason that it failed. 
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * Configuration information required for human workers to complete a labeling task.
    */
  var HumanTaskConfig: typings.awsSdk.sagemakerMod.HumanTaskConfig = js.native
  /**
    * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects.
    */
  var InputConfig: LabelingJobInputConfig = js.native
  /**
    * A unique identifier for work done as part of a labeling job.
    */
  var JobReferenceCode: typings.awsSdk.sagemakerMod.JobReferenceCode = js.native
  /**
    * The attribute used as the label in the output manifest file.
    */
  var LabelAttributeName: js.UndefOr[typings.awsSdk.sagemakerMod.LabelAttributeName] = js.native
  /**
    * The S3 location of the JSON file that defines the categories used to label data objects. Please note the following label-category limits:   Semantic segmentation labeling jobs using automated labeling: 20 labels   Box bounding labeling jobs (all): 10 lables   The file is a JSON structure in the following format:  {    "document-version": "2018-11-28"    "labels": [    {    "label": "label 1"    },    {    "label": "label 2"    },    ...    {    "label": "label n"    }    ]   } 
    */
  var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.native
  /**
    * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine, the number of objects than couldn't be labeled, and the total number of objects labeled. 
    */
  var LabelCounters: typings.awsSdk.sagemakerMod.LabelCounters = js.native
  /**
    * Configuration information for automated data labeling.
    */
  var LabelingJobAlgorithmsConfig: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobAlgorithmsConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the labeling job.
    */
  var LabelingJobArn: typings.awsSdk.sagemakerMod.LabelingJobArn = js.native
  /**
    * The name assigned to the labeling job when it was created.
    */
  var LabelingJobName: typings.awsSdk.sagemakerMod.LabelingJobName = js.native
  /**
    * The location of the output produced by the labeling job.
    */
  var LabelingJobOutput: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobOutput] = js.native
  /**
    * The processing status of the labeling job. 
    */
  var LabelingJobStatus: typings.awsSdk.sagemakerMod.LabelingJobStatus = js.native
  /**
    * The date and time that the labeling job was last updated.
    */
  var LastModifiedTime: Timestamp = js.native
  /**
    * The location of the job's output data and the AWS Key Management Service key ID for the key used to encrypt the output data, if any.
    */
  var OutputConfig: LabelingJobOutputConfig = js.native
  /**
    * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data labeling.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped.
    */
  var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.native
  /**
    * An array of key/value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object DescribeLabelingJobResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    HumanTaskConfig: HumanTaskConfig,
    InputConfig: LabelingJobInputConfig,
    JobReferenceCode: JobReferenceCode,
    LabelCounters: LabelCounters,
    LabelingJobArn: LabelingJobArn,
    LabelingJobName: LabelingJobName,
    LabelingJobStatus: LabelingJobStatus,
    LastModifiedTime: Timestamp,
    OutputConfig: LabelingJobOutputConfig,
    RoleArn: RoleArn,
    FailureReason: FailureReason = null,
    LabelAttributeName: LabelAttributeName = null,
    LabelCategoryConfigS3Uri: S3Uri = null,
    LabelingJobAlgorithmsConfig: LabelingJobAlgorithmsConfig = null,
    LabelingJobOutput: LabelingJobOutput = null,
    StoppingConditions: LabelingJobStoppingConditions = null,
    Tags: TagList = null
  ): DescribeLabelingJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskConfig = HumanTaskConfig.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobReferenceCode = JobReferenceCode.asInstanceOf[js.Any], LabelCounters = LabelCounters.asInstanceOf[js.Any], LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any], LabelingJobName = LabelingJobName.asInstanceOf[js.Any], LabelingJobStatus = LabelingJobStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LabelAttributeName != null) __obj.updateDynamic("LabelAttributeName")(LabelAttributeName.asInstanceOf[js.Any])
    if (LabelCategoryConfigS3Uri != null) __obj.updateDynamic("LabelCategoryConfigS3Uri")(LabelCategoryConfigS3Uri.asInstanceOf[js.Any])
    if (LabelingJobAlgorithmsConfig != null) __obj.updateDynamic("LabelingJobAlgorithmsConfig")(LabelingJobAlgorithmsConfig.asInstanceOf[js.Any])
    if (LabelingJobOutput != null) __obj.updateDynamic("LabelingJobOutput")(LabelingJobOutput.asInstanceOf[js.Any])
    if (StoppingConditions != null) __obj.updateDynamic("StoppingConditions")(StoppingConditions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLabelingJobResponse]
  }
}

