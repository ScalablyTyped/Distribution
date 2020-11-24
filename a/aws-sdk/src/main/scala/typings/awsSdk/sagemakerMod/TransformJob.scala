package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformJob extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  
  /**
    * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
    */
  var BatchStrategy: js.UndefOr[typings.awsSdk.sagemakerMod.BatchStrategy] = js.native
  
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  var DataProcessing: js.UndefOr[typings.awsSdk.sagemakerMod.DataProcessing] = js.native
  
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.native
  
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  
  /**
    * If the transform job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the labeling job that created the transform job.
    */
  var LabelingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobArn] = js.native
  
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. If MaxConcurrentTransforms is set to 0 or left unset, SageMaker checks the optional execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters endpoint is not enabled, the default value is 1. For built-in algorithms, you don't need to set a value for MaxConcurrentTransforms.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.native
  
  /**
    * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The value in MaxPayloadInMB must be greater than, or equal to, the size of a single record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB. For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value to 0. This feature works only in supported algorithms. Currently, SageMaker built-in algorithms do not support HTTP chunked encoding.
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsSdk.sagemakerMod.MaxPayloadInMB] = js.native
  
  var ModelClientConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ModelClientConfig] = js.native
  
  /**
    * The name of the model associated with the transform job.
    */
  var ModelName: js.UndefOr[typings.awsSdk.sagemakerMod.ModelName] = js.native
  
  /**
    * A list of tags associated with the transform job.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time interval between this time and the value of TransformStartTime.
    */
  var TransformEndTime: js.UndefOr[Timestamp] = js.native
  
  var TransformInput: js.UndefOr[typings.awsSdk.sagemakerMod.TransformInput] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJobArn] = js.native
  
  /**
    * The name of the transform job.
    */
  var TransformJobName: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJobName] = js.native
  
  /**
    * The status of the transform job. Transform job statuses are:    InProgress - The job is in progress.    Completed - The job has completed.    Failed - The transform job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTransformJob call.    Stopping - The transform job is stopping.    Stopped - The transform job has stopped.  
    */
  var TransformJobStatus: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJobStatus] = js.native
  
  var TransformOutput: js.UndefOr[typings.awsSdk.sagemakerMod.TransformOutput] = js.native
  
  var TransformResources: js.UndefOr[typings.awsSdk.sagemakerMod.TransformResources] = js.native
  
  /**
    * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time and the value of TransformEndTime.
    */
  var TransformStartTime: js.UndefOr[Timestamp] = js.native
}
object TransformJob {
  
  @scala.inline
  def apply(): TransformJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformJob]
  }
  
  @scala.inline
  implicit class TransformJobOps[Self <: TransformJob] (val x: Self) extends AnyVal {
    
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
    def deleteAutoMLJobArn: Self = this.set("AutoMLJobArn", js.undefined)
    
    @scala.inline
    def setBatchStrategy(value: BatchStrategy): Self = this.set("BatchStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchStrategy: Self = this.set("BatchStrategy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
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
    def setModelName(value: ModelName): Self = this.set("ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelName: Self = this.set("ModelName", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTransformEndTime(value: Timestamp): Self = this.set("TransformEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformEndTime: Self = this.set("TransformEndTime", js.undefined)
    
    @scala.inline
    def setTransformInput(value: TransformInput): Self = this.set("TransformInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformInput: Self = this.set("TransformInput", js.undefined)
    
    @scala.inline
    def setTransformJobArn(value: TransformJobArn): Self = this.set("TransformJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformJobArn: Self = this.set("TransformJobArn", js.undefined)
    
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = this.set("TransformJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformJobName: Self = this.set("TransformJobName", js.undefined)
    
    @scala.inline
    def setTransformJobStatus(value: TransformJobStatus): Self = this.set("TransformJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformJobStatus: Self = this.set("TransformJobStatus", js.undefined)
    
    @scala.inline
    def setTransformOutput(value: TransformOutput): Self = this.set("TransformOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOutput: Self = this.set("TransformOutput", js.undefined)
    
    @scala.inline
    def setTransformResources(value: TransformResources): Self = this.set("TransformResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformResources: Self = this.set("TransformResources", js.undefined)
    
    @scala.inline
    def setTransformStartTime(value: Timestamp): Self = this.set("TransformStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformStartTime: Self = this.set("TransformStartTime", js.undefined)
  }
}
