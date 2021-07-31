package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransformJobRequest extends StObject {
  
  /**
    * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record  is a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.  To enable the batch strategy, you must set the SplitType property to Line, RecordIO, or TFRecord. To use only one record when making an HTTP invocation request to a container, set BatchStrategy to SingleRecord and SplitType to Line. To fit as many records in a mini-batch as can fit within the MaxPayloadInMB limit, set BatchStrategy to MultiRecord and SplitType to Line.
    */
  var BatchStrategy: js.UndefOr[typings.awsSdk.sagemakerMod.BatchStrategy] = js.undefined
  
  /**
    * The data structure used to specify the data to be used for inference in a batch transform job and to associate the data that is relevant to the prediction results in the output. The input filter provided allows you to exclude input data that is not needed for inference in a batch transform job. The output filter provided allows you to include input data relevant to interpreting the predictions in the output from the job. For more information, see Associate Prediction Results with their Corresponding Input Records.
    */
  var DataProcessing: js.UndefOr[typings.awsSdk.sagemakerMod.DataProcessing] = js.undefined
  
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
  
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.undefined
  
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. If MaxConcurrentTransforms is set to 0 or left unset, Amazon SageMaker checks the optional execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters endpoint is not enabled, the default value is 1. For more information on execution-parameters, see How Containers Serve Requests. For built-in algorithms, you don't need to set a value for MaxConcurrentTransforms.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.undefined
  
  /**
    * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The value in MaxPayloadInMB must be greater than, or equal to, the size of a single record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB.  For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value to 0. This feature works only in supported algorithms. Currently, Amazon SageMaker built-in algorithms do not support HTTP chunked encoding.
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsSdk.sagemakerMod.MaxPayloadInMB] = js.undefined
  
  /**
    * Configures the timeout and maximum number of retries for processing a transform job invocation.
    */
  var ModelClientConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ModelClientConfig] = js.undefined
  
  /**
    * The name of the model that you want to use for the transform job. ModelName must be the name of an existing Amazon SageMaker model within an AWS Region in an AWS account.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName
  
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Describes the input source and the way the transform job consumes it.
    */
  var TransformInput: typings.awsSdk.sagemakerMod.TransformInput
  
  /**
    * The name of the transform job. The name must be unique within an AWS Region in an AWS account. 
    */
  var TransformJobName: typings.awsSdk.sagemakerMod.TransformJobName
  
  /**
    * Describes the results of the transform job.
    */
  var TransformOutput: typings.awsSdk.sagemakerMod.TransformOutput
  
  /**
    * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
    */
  var TransformResources: typings.awsSdk.sagemakerMod.TransformResources
}
object CreateTransformJobRequest {
  
  @scala.inline
  def apply(
    ModelName: ModelName,
    TransformInput: TransformInput,
    TransformJobName: TransformJobName,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources
  ): CreateTransformJobRequest = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any], TransformInput = TransformInput.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformOutput = TransformOutput.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransformJobRequest]
  }
  
  @scala.inline
  implicit class CreateTransformJobRequestMutableBuilder[Self <: CreateTransformJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchStrategy(value: BatchStrategy): Self = StObject.set(x, "BatchStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchStrategyUndefined: Self = StObject.set(x, "BatchStrategy", js.undefined)
    
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
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTransformInput(value: TransformInput): Self = StObject.set(x, "TransformInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOutput(value: TransformOutput): Self = StObject.set(x, "TransformOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformResources(value: TransformResources): Self = StObject.set(x, "TransformResources", value.asInstanceOf[js.Any])
  }
}
