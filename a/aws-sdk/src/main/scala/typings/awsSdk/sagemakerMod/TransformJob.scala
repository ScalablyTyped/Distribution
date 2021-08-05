package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformJob extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobArn] = js.undefined
  
  /**
    * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
    */
  var BatchStrategy: js.UndefOr[typings.awsSdk.sagemakerMod.BatchStrategy] = js.undefined
  
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  var DataProcessing: js.UndefOr[typings.awsSdk.sagemakerMod.DataProcessing] = js.undefined
  
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
  
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.undefined
  
  /**
    * If the transform job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the labeling job that created the transform job.
    */
  var LabelingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobArn] = js.undefined
  
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. If MaxConcurrentTransforms is set to 0 or left unset, SageMaker checks the optional execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters endpoint is not enabled, the default value is 1. For built-in algorithms, you don't need to set a value for MaxConcurrentTransforms.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.undefined
  
  /**
    * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The value in MaxPayloadInMB must be greater than, or equal to, the size of a single record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB. For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value to 0. This feature works only in supported algorithms. Currently, SageMaker built-in algorithms do not support HTTP chunked encoding.
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsSdk.sagemakerMod.MaxPayloadInMB] = js.undefined
  
  var ModelClientConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ModelClientConfig] = js.undefined
  
  /**
    * The name of the model associated with the transform job.
    */
  var ModelName: js.UndefOr[typings.awsSdk.sagemakerMod.ModelName] = js.undefined
  
  /**
    * A list of tags associated with the transform job.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time interval between this time and the value of TransformStartTime.
    */
  var TransformEndTime: js.UndefOr[Timestamp] = js.undefined
  
  var TransformInput: js.UndefOr[typings.awsSdk.sagemakerMod.TransformInput] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJobArn] = js.undefined
  
  /**
    * The name of the transform job.
    */
  var TransformJobName: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJobName] = js.undefined
  
  /**
    * The status of the transform job. Transform job statuses are:    InProgress - The job is in progress.    Completed - The job has completed.    Failed - The transform job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTransformJob call.    Stopping - The transform job is stopping.    Stopped - The transform job has stopped.  
    */
  var TransformJobStatus: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJobStatus] = js.undefined
  
  var TransformOutput: js.UndefOr[typings.awsSdk.sagemakerMod.TransformOutput] = js.undefined
  
  var TransformResources: js.UndefOr[typings.awsSdk.sagemakerMod.TransformResources] = js.undefined
  
  /**
    * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time and the value of TransformEndTime.
    */
  var TransformStartTime: js.UndefOr[Timestamp] = js.undefined
}
object TransformJob {
  
  inline def apply(): TransformJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformJob]
  }
  
  extension [Self <: TransformJob](x: Self) {
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobArnUndefined: Self = StObject.set(x, "AutoMLJobArn", js.undefined)
    
    inline def setBatchStrategy(value: BatchStrategy): Self = StObject.set(x, "BatchStrategy", value.asInstanceOf[js.Any])
    
    inline def setBatchStrategyUndefined: Self = StObject.set(x, "BatchStrategy", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataProcessing(value: DataProcessing): Self = StObject.set(x, "DataProcessing", value.asInstanceOf[js.Any])
    
    inline def setDataProcessingUndefined: Self = StObject.set(x, "DataProcessing", js.undefined)
    
    inline def setEnvironment(value: TransformEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    inline def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLabelingJobArn(value: LabelingJobArn): Self = StObject.set(x, "LabelingJobArn", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobArnUndefined: Self = StObject.set(x, "LabelingJobArn", js.undefined)
    
    inline def setMaxConcurrentTransforms(value: MaxConcurrentTransforms): Self = StObject.set(x, "MaxConcurrentTransforms", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentTransformsUndefined: Self = StObject.set(x, "MaxConcurrentTransforms", js.undefined)
    
    inline def setMaxPayloadInMB(value: MaxPayloadInMB): Self = StObject.set(x, "MaxPayloadInMB", value.asInstanceOf[js.Any])
    
    inline def setMaxPayloadInMBUndefined: Self = StObject.set(x, "MaxPayloadInMB", js.undefined)
    
    inline def setModelClientConfig(value: ModelClientConfig): Self = StObject.set(x, "ModelClientConfig", value.asInstanceOf[js.Any])
    
    inline def setModelClientConfigUndefined: Self = StObject.set(x, "ModelClientConfig", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTransformEndTime(value: Timestamp): Self = StObject.set(x, "TransformEndTime", value.asInstanceOf[js.Any])
    
    inline def setTransformEndTimeUndefined: Self = StObject.set(x, "TransformEndTime", js.undefined)
    
    inline def setTransformInput(value: TransformInput): Self = StObject.set(x, "TransformInput", value.asInstanceOf[js.Any])
    
    inline def setTransformInputUndefined: Self = StObject.set(x, "TransformInput", js.undefined)
    
    inline def setTransformJobArn(value: TransformJobArn): Self = StObject.set(x, "TransformJobArn", value.asInstanceOf[js.Any])
    
    inline def setTransformJobArnUndefined: Self = StObject.set(x, "TransformJobArn", js.undefined)
    
    inline def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
    
    inline def setTransformJobNameUndefined: Self = StObject.set(x, "TransformJobName", js.undefined)
    
    inline def setTransformJobStatus(value: TransformJobStatus): Self = StObject.set(x, "TransformJobStatus", value.asInstanceOf[js.Any])
    
    inline def setTransformJobStatusUndefined: Self = StObject.set(x, "TransformJobStatus", js.undefined)
    
    inline def setTransformOutput(value: TransformOutput): Self = StObject.set(x, "TransformOutput", value.asInstanceOf[js.Any])
    
    inline def setTransformOutputUndefined: Self = StObject.set(x, "TransformOutput", js.undefined)
    
    inline def setTransformResources(value: TransformResources): Self = StObject.set(x, "TransformResources", value.asInstanceOf[js.Any])
    
    inline def setTransformResourcesUndefined: Self = StObject.set(x, "TransformResources", js.undefined)
    
    inline def setTransformStartTime(value: Timestamp): Self = StObject.set(x, "TransformStartTime", value.asInstanceOf[js.Any])
    
    inline def setTransformStartTimeUndefined: Self = StObject.set(x, "TransformStartTime", js.undefined)
  }
}
