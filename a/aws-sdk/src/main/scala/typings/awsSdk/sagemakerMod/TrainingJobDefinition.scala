package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingJobDefinition extends StObject {
  
  /**
    * The hyperparameters used for the training job.
    */
  var HyperParameters: js.UndefOr[typings.awsSdk.sagemakerMod.HyperParameters] = js.undefined
  
  /**
    * An array of Channel objects, each of which specifies an input source.
    */
  var InputDataConfig: typings.awsSdk.sagemakerMod.InputDataConfig
  
  /**
    * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts.
    */
  var OutputDataConfig: typings.awsSdk.sagemakerMod.OutputDataConfig
  
  /**
    * The resources, including the ML compute instances and ML storage volumes, to use for model training.
    */
  var ResourceConfig: typings.awsSdk.sagemakerMod.ResourceConfig
  
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts.
    */
  var StoppingCondition: typings.awsSdk.sagemakerMod.StoppingCondition
  
  /**
    * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.
    */
  var TrainingInputMode: typings.awsSdk.sagemakerMod.TrainingInputMode
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
  implicit class TrainingJobDefinitionMutableBuilder[Self <: TrainingJobDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperParameters(value: HyperParameters): Self = StObject.set(x, "HyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParametersUndefined: Self = StObject.set(x, "HyperParameters", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigVarargs(value: Channel*): Self = StObject.set(x, "InputDataConfig", js.Array(value :_*))
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceConfig(value: ResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingInputMode(value: TrainingInputMode): Self = StObject.set(x, "TrainingInputMode", value.asInstanceOf[js.Any])
  }
}
