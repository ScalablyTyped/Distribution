package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformJobDefinition extends js.Object {
  /**
    * A string that determines the number of records included in a single mini-batch.  SingleRecord means only one record is used per mini-batch. MultiRecord means a mini-batch is set to contain as many records that can fit within the MaxPayloadInMB limit.
    */
  var BatchStrategy: js.UndefOr[typings.awsSdk.sagemakerMod.BatchStrategy] = js.native
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.native
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.native
  /**
    * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsSdk.sagemakerMod.MaxPayloadInMB] = js.native
  /**
    * A description of the input source and the way the transform job consumes it.
    */
  var TransformInput: typings.awsSdk.sagemakerMod.TransformInput = js.native
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: typings.awsSdk.sagemakerMod.TransformOutput = js.native
  /**
    * Identifies the ML compute instances for the transform job.
    */
  var TransformResources: typings.awsSdk.sagemakerMod.TransformResources = js.native
}

object TransformJobDefinition {
  @scala.inline
  def apply(
    TransformInput: TransformInput,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources,
    BatchStrategy: BatchStrategy = null,
    Environment: TransformEnvironmentMap = null,
    MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
    MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined
  ): TransformJobDefinition = {
    val __obj = js.Dynamic.literal(TransformInput = TransformInput.asInstanceOf[js.Any], TransformOutput = TransformOutput.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    if (BatchStrategy != null) __obj.updateDynamic("BatchStrategy")(BatchStrategy.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxConcurrentTransforms)) __obj.updateDynamic("MaxConcurrentTransforms")(MaxConcurrentTransforms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxPayloadInMB)) __obj.updateDynamic("MaxPayloadInMB")(MaxPayloadInMB.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobDefinition]
  }
}

