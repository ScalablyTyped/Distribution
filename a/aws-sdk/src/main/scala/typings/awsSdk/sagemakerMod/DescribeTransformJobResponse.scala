package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransformJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AutoML transform job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  /**
    * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record  is a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.  To enable the batch strategy, you must set SplitType to Line, RecordIO, or TFRecord.
    */
  var BatchStrategy: js.UndefOr[typings.awsSdk.sagemakerMod.BatchStrategy] = js.native
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: Timestamp = js.native
  var DataProcessing: js.UndefOr[typings.awsSdk.sagemakerMod.DataProcessing] = js.native
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.native
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * If the transform job failed, FailureReason describes why it failed. A transform job creates a log file, which includes error messages, and stores it as an Amazon S3 object. For more information, see Log Amazon SageMaker Events with Amazon CloudWatch.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or training job.
    */
  var LabelingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobArn] = js.native
  /**
    * The maximum number of parallel requests on each instance node that can be launched in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.native
  /**
    * The maximum payload size, in MB, used in the transform job.
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsSdk.sagemakerMod.MaxPayloadInMB] = js.native
  /**
    * The timeout and maximum number of retries for processing a transform job invocation.
    */
  var ModelClientConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ModelClientConfig] = js.native
  /**
    * The name of the model used in the transform job.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName = js.native
  /**
    * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time interval between this time and the value of TransformStartTime.
    */
  var TransformEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Describes the dataset to be transformed and the Amazon S3 location where it is stored.
    */
  var TransformInput: typings.awsSdk.sagemakerMod.TransformInput = js.native
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typings.awsSdk.sagemakerMod.TransformJobArn = js.native
  /**
    * The name of the transform job.
    */
  var TransformJobName: typings.awsSdk.sagemakerMod.TransformJobName = js.native
  /**
    * The status of the transform job. If the transform job failed, the reason is returned in the FailureReason field.
    */
  var TransformJobStatus: typings.awsSdk.sagemakerMod.TransformJobStatus = js.native
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: js.UndefOr[typings.awsSdk.sagemakerMod.TransformOutput] = js.native
  /**
    * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
    */
  var TransformResources: typings.awsSdk.sagemakerMod.TransformResources = js.native
  /**
    * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time and the value of TransformEndTime.
    */
  var TransformStartTime: js.UndefOr[Timestamp] = js.native
}

object DescribeTransformJobResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    ModelName: ModelName,
    TransformInput: TransformInput,
    TransformJobArn: TransformJobArn,
    TransformJobName: TransformJobName,
    TransformJobStatus: TransformJobStatus,
    TransformResources: TransformResources
  ): DescribeTransformJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], TransformInput = TransformInput.asInstanceOf[js.Any], TransformJobArn = TransformJobArn.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobResponse]
  }
  @scala.inline
  implicit class DescribeTransformJobResponseOps[Self <: DescribeTransformJobResponse] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelName(value: ModelName): Self = this.set("ModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformInput(value: TransformInput): Self = this.set("TransformInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformJobArn(value: TransformJobArn): Self = this.set("TransformJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = this.set("TransformJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformJobStatus(value: TransformJobStatus): Self = this.set("TransformJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformResources(value: TransformResources): Self = this.set("TransformResources", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = this.set("AutoMLJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLJobArn: Self = this.set("AutoMLJobArn", js.undefined)
    @scala.inline
    def setBatchStrategy(value: BatchStrategy): Self = this.set("BatchStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchStrategy: Self = this.set("BatchStrategy", js.undefined)
    @scala.inline
    def setDataProcessing(value: DataProcessing): Self = this.set("DataProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataProcessing: Self = this.set("DataProcessing", js.undefined)
    @scala.inline
    def setEnvironment(value: TransformEnvironmentMap): Self = this.set("Environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    @scala.inline
    def setExperimentConfig(value: ExperimentConfig): Self = this.set("ExperimentConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentConfig: Self = this.set("ExperimentConfig", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setLabelingJobArn(value: LabelingJobArn): Self = this.set("LabelingJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelingJobArn: Self = this.set("LabelingJobArn", js.undefined)
    @scala.inline
    def setMaxConcurrentTransforms(value: MaxConcurrentTransforms): Self = this.set("MaxConcurrentTransforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrentTransforms: Self = this.set("MaxConcurrentTransforms", js.undefined)
    @scala.inline
    def setMaxPayloadInMB(value: MaxPayloadInMB): Self = this.set("MaxPayloadInMB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPayloadInMB: Self = this.set("MaxPayloadInMB", js.undefined)
    @scala.inline
    def setModelClientConfig(value: ModelClientConfig): Self = this.set("ModelClientConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelClientConfig: Self = this.set("ModelClientConfig", js.undefined)
    @scala.inline
    def setTransformEndTime(value: Timestamp): Self = this.set("TransformEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformEndTime: Self = this.set("TransformEndTime", js.undefined)
    @scala.inline
    def setTransformOutput(value: TransformOutput): Self = this.set("TransformOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformOutput: Self = this.set("TransformOutput", js.undefined)
    @scala.inline
    def setTransformStartTime(value: Timestamp): Self = this.set("TransformStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformStartTime: Self = this.set("TransformStartTime", js.undefined)
  }
  
}

