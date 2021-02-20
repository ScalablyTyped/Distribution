package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformJob extends StObject {
  
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
  implicit class TransformJobMutableBuilder[Self <: TransformJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobArnUndefined: Self = StObject.set(x, "AutoMLJobArn", js.undefined)
    
    @scala.inline
    def setBatchStrategy(value: BatchStrategy): Self = StObject.set(x, "BatchStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchStrategyUndefined: Self = StObject.set(x, "BatchStrategy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDataProcessing(value: DataProcessing): Self = StObject.set(x, "DataProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataProcessingUndefined: Self = StObject.set(x, "DataProcessing", js.undefined)
    
    @scala.inline
    def setEnvironment(value: TransformEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLabelingJobArn(value: LabelingJobArn): Self = StObject.set(x, "LabelingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobArnUndefined: Self = StObject.set(x, "LabelingJobArn", js.undefined)
    
    @scala.inline
    def setMaxConcurrentTransforms(value: MaxConcurrentTransforms): Self = StObject.set(x, "MaxConcurrentTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentTransformsUndefined: Self = StObject.set(x, "MaxConcurrentTransforms", js.undefined)
    
    @scala.inline
    def setMaxPayloadInMB(value: MaxPayloadInMB): Self = StObject.set(x, "MaxPayloadInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPayloadInMBUndefined: Self = StObject.set(x, "MaxPayloadInMB", js.undefined)
    
    @scala.inline
    def setModelClientConfig(value: ModelClientConfig): Self = StObject.set(x, "ModelClientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelClientConfigUndefined: Self = StObject.set(x, "ModelClientConfig", js.undefined)
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTransformEndTime(value: Timestamp): Self = StObject.set(x, "TransformEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformEndTimeUndefined: Self = StObject.set(x, "TransformEndTime", js.undefined)
    
    @scala.inline
    def setTransformInput(value: TransformInput): Self = StObject.set(x, "TransformInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformInputUndefined: Self = StObject.set(x, "TransformInput", js.undefined)
    
    @scala.inline
    def setTransformJobArn(value: TransformJobArn): Self = StObject.set(x, "TransformJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobArnUndefined: Self = StObject.set(x, "TransformJobArn", js.undefined)
    
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobNameUndefined: Self = StObject.set(x, "TransformJobName", js.undefined)
    
    @scala.inline
    def setTransformJobStatus(value: TransformJobStatus): Self = StObject.set(x, "TransformJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobStatusUndefined: Self = StObject.set(x, "TransformJobStatus", js.undefined)
    
    @scala.inline
    def setTransformOutput(value: TransformOutput): Self = StObject.set(x, "TransformOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOutputUndefined: Self = StObject.set(x, "TransformOutput", js.undefined)
    
    @scala.inline
    def setTransformResources(value: TransformResources): Self = StObject.set(x, "TransformResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformResourcesUndefined: Self = StObject.set(x, "TransformResources", js.undefined)
    
    @scala.inline
    def setTransformStartTime(value: Timestamp): Self = StObject.set(x, "TransformStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformStartTimeUndefined: Self = StObject.set(x, "TransformStartTime", js.undefined)
  }
}
