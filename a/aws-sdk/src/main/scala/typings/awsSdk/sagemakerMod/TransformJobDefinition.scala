package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    TransformResources: TransformResources
  ): TransformJobDefinition = {
    val __obj = js.Dynamic.literal(TransformInput = TransformInput.asInstanceOf[js.Any], TransformOutput = TransformOutput.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobDefinition]
  }
  
  @scala.inline
  implicit class TransformJobDefinitionOps[Self <: TransformJobDefinition] (val x: Self) extends AnyVal {
    
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
    def setTransformInput(value: TransformInput): Self = this.set("TransformInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOutput(value: TransformOutput): Self = this.set("TransformOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformResources(value: TransformResources): Self = this.set("TransformResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchStrategy(value: BatchStrategy): Self = this.set("BatchStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchStrategy: Self = this.set("BatchStrategy", js.undefined)
    
    @scala.inline
    def setEnvironment(value: TransformEnvironmentMap): Self = this.set("Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    
    @scala.inline
    def setMaxConcurrentTransforms(value: MaxConcurrentTransforms): Self = this.set("MaxConcurrentTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentTransforms: Self = this.set("MaxConcurrentTransforms", js.undefined)
    
    @scala.inline
    def setMaxPayloadInMB(value: MaxPayloadInMB): Self = this.set("MaxPayloadInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPayloadInMB: Self = this.set("MaxPayloadInMB", js.undefined)
  }
}
