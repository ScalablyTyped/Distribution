package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingJobDefinition extends js.Object {
  
  /**
    * The hyperparameters used for the training job.
    */
  var HyperParameters: js.UndefOr[typings.awsSdk.sagemakerMod.HyperParameters] = js.native
  
  /**
    * An array of Channel objects, each of which specifies an input source.
    */
  var InputDataConfig: typings.awsSdk.sagemakerMod.InputDataConfig = js.native
  
  /**
    * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts.
    */
  var OutputDataConfig: typings.awsSdk.sagemakerMod.OutputDataConfig = js.native
  
  /**
    * The resources, including the ML compute instances and ML storage volumes, to use for model training.
    */
  var ResourceConfig: typings.awsSdk.sagemakerMod.ResourceConfig = js.native
  
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts.
    */
  var StoppingCondition: typings.awsSdk.sagemakerMod.StoppingCondition = js.native
  
  /**
    * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.
    */
  var TrainingInputMode: typings.awsSdk.sagemakerMod.TrainingInputMode = js.native
}
object TrainingJobDefinition {
  
  @scala.inline
  def apply(
    InputDataConfig: InputDataConfig,
    OutputDataConfig: OutputDataConfig,
    ResourceConfig: ResourceConfig,
    StoppingCondition: StoppingCondition,
    TrainingInputMode: TrainingInputMode
  ): TrainingJobDefinition = {
    val __obj = js.Dynamic.literal(InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any], TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJobDefinition]
  }
  
  @scala.inline
  implicit class TrainingJobDefinitionOps[Self <: TrainingJobDefinition] (val x: Self) extends AnyVal {
    
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
    def setInputDataConfigVarargs(value: Channel*): Self = this.set("InputDataConfig", js.Array(value :_*))
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = this.set("OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceConfig(value: ResourceConfig): Self = this.set("ResourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingCondition(value: StoppingCondition): Self = this.set("StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingInputMode(value: TrainingInputMode): Self = this.set("TrainingInputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameters(value: HyperParameters): Self = this.set("HyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperParameters: Self = this.set("HyperParameters", js.undefined)
  }
}
