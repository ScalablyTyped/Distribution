package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransformJobRequest extends js.Object {
  /**
    * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record  is a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.  To enable the batch strategy, you must set the SplitType property to Line, RecordIO, or TFRecord. To use only one record when making an HTTP invocation request to a container, set BatchStrategy to SingleRecord and SplitType to Line. To fit as many records in a mini-batch as can fit within the MaxPayloadInMB limit, set BatchStrategy to MultiRecord and SplitType to Line.
    */
  var BatchStrategy: js.UndefOr[typings.awsSdk.sagemakerMod.BatchStrategy] = js.native
  /**
    * The data structure used to specify the data to be used for inference in a batch transform job and to associate the data that is relevant to the prediction results in the output. The input filter provided allows you to exclude input data that is not needed for inference in a batch transform job. The output filter provided allows you to include input data relevant to interpreting the predictions in the output from the job. For more information, see Associate Prediction Results with their Corresponding Input Records.
    */
  var DataProcessing: js.UndefOr[typings.awsSdk.sagemakerMod.DataProcessing] = js.native
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.native
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. If MaxConcurrentTransforms is set to 0 or left unset, Amazon SageMaker checks the optional execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters endpoint is not enabled, the default value is 1. For more information on execution-parameters, see How Containers Serve Requests. For built-in algorithms, you don't need to set a value for MaxConcurrentTransforms.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.native
  /**
    * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The value in MaxPayloadInMB must be greater than, or equal to, the size of a single record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB.  For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value to 0. This feature works only in supported algorithms. Currently, Amazon SageMaker built-in algorithms do not support HTTP chunked encoding.
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsSdk.sagemakerMod.MaxPayloadInMB] = js.native
  /**
    * Configures the timeout and maximum number of retries for processing a transform job invocation.
    */
  var ModelClientConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ModelClientConfig] = js.native
  /**
    * The name of the model that you want to use for the transform job. ModelName must be the name of an existing Amazon SageMaker model within an AWS Region in an AWS account.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName = js.native
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Describes the input source and the way the transform job consumes it.
    */
  var TransformInput: typings.awsSdk.sagemakerMod.TransformInput = js.native
  /**
    * The name of the transform job. The name must be unique within an AWS Region in an AWS account. 
    */
  var TransformJobName: typings.awsSdk.sagemakerMod.TransformJobName = js.native
  /**
    * Describes the results of the transform job.
    */
  var TransformOutput: typings.awsSdk.sagemakerMod.TransformOutput = js.native
  /**
    * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
    */
  var TransformResources: typings.awsSdk.sagemakerMod.TransformResources = js.native
}

object CreateTransformJobRequest {
  @scala.inline
  def apply(
    ModelName: ModelName,
    TransformInput: TransformInput,
    TransformJobName: TransformJobName,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources,
    BatchStrategy: BatchStrategy = null,
    DataProcessing: DataProcessing = null,
    Environment: TransformEnvironmentMap = null,
    ExperimentConfig: ExperimentConfig = null,
    MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
    MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
    ModelClientConfig: ModelClientConfig = null,
    Tags: TagList = null
  ): CreateTransformJobRequest = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any], TransformInput = TransformInput.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformOutput = TransformOutput.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    if (BatchStrategy != null) __obj.updateDynamic("BatchStrategy")(BatchStrategy.asInstanceOf[js.Any])
    if (DataProcessing != null) __obj.updateDynamic("DataProcessing")(DataProcessing.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (ExperimentConfig != null) __obj.updateDynamic("ExperimentConfig")(ExperimentConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxConcurrentTransforms)) __obj.updateDynamic("MaxConcurrentTransforms")(MaxConcurrentTransforms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxPayloadInMB)) __obj.updateDynamic("MaxPayloadInMB")(MaxPayloadInMB.get.asInstanceOf[js.Any])
    if (ModelClientConfig != null) __obj.updateDynamic("ModelClientConfig")(ModelClientConfig.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransformJobRequest]
  }
}

