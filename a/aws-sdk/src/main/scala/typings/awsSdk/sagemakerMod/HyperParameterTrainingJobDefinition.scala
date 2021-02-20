package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterTrainingJobDefinition extends StObject {
  
  /**
    * The HyperParameterAlgorithmSpecification object that specifies the resource algorithm to use for the training jobs that the tuning job launches.
    */
  var AlgorithmSpecification: HyperParameterAlgorithmSpecification = js.native
  
  var CheckpointConfig: js.UndefOr[typings.awsSdk.sagemakerMod.CheckpointConfig] = js.native
  
  /**
    * The job definition name.
    */
  var DefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.native
  
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean indicating whether managed spot training is enabled (True) or not (False).
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.native
  
  /**
    * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If network isolation is used for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specified VPC, but the training container does not have network access.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  
  var HyperParameterRanges: js.UndefOr[ParameterRanges] = js.native
  
  /**
    * An array of Channel objects that specify the input for the training jobs that the tuning job launches.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.sagemakerMod.InputDataConfig] = js.native
  
  /**
    * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning job launches.
    */
  var OutputDataConfig: typings.awsSdk.sagemakerMod.OutputDataConfig = js.native
  
  /**
    * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning job launches. Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.
    */
  var ResourceConfig: typings.awsSdk.sagemakerMod.ResourceConfig = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  
  /**
    * Specifies the values of hyperparameters that do not change for the tuning job.
    */
  var StaticHyperParameters: js.UndefOr[HyperParameters] = js.native
  
  /**
    * Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you are willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon SageMaker ends the training job. Use this API to cap model training costs.
    */
  var StoppingCondition: typings.awsSdk.sagemakerMod.StoppingCondition = js.native
  
  var TuningObjective: js.UndefOr[HyperParameterTuningJobObjective] = js.native
  
  /**
    * The VpcConfig object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.VpcConfig] = js.native
}
object HyperParameterTrainingJobDefinition {
  
  @scala.inline
  def apply(
    AlgorithmSpecification: HyperParameterAlgorithmSpecification,
    OutputDataConfig: OutputDataConfig,
    ResourceConfig: ResourceConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition
  ): HyperParameterTrainingJobDefinition = {
    val __obj = js.Dynamic.literal(AlgorithmSpecification = AlgorithmSpecification.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTrainingJobDefinition]
  }
  
  @scala.inline
  implicit class HyperParameterTrainingJobDefinitionMutableBuilder[Self <: HyperParameterTrainingJobDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmSpecification(value: HyperParameterAlgorithmSpecification): Self = StObject.set(x, "AlgorithmSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointConfig(value: CheckpointConfig): Self = StObject.set(x, "CheckpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointConfigUndefined: Self = StObject.set(x, "CheckpointConfig", js.undefined)
    
    @scala.inline
    def setDefinitionName(value: HyperParameterTrainingJobDefinitionName): Self = StObject.set(x, "DefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionNameUndefined: Self = StObject.set(x, "DefinitionName", js.undefined)
    
    @scala.inline
    def setEnableInterContainerTrafficEncryption(value: Boolean): Self = StObject.set(x, "EnableInterContainerTrafficEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInterContainerTrafficEncryptionUndefined: Self = StObject.set(x, "EnableInterContainerTrafficEncryption", js.undefined)
    
    @scala.inline
    def setEnableManagedSpotTraining(value: Boolean): Self = StObject.set(x, "EnableManagedSpotTraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableManagedSpotTrainingUndefined: Self = StObject.set(x, "EnableManagedSpotTraining", js.undefined)
    
    @scala.inline
    def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    @scala.inline
    def setHyperParameterRanges(value: ParameterRanges): Self = StObject.set(x, "HyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterRangesUndefined: Self = StObject.set(x, "HyperParameterRanges", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setInputDataConfigVarargs(value: Channel*): Self = StObject.set(x, "InputDataConfig", js.Array(value :_*))
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceConfig(value: ResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticHyperParameters(value: HyperParameters): Self = StObject.set(x, "StaticHyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticHyperParametersUndefined: Self = StObject.set(x, "StaticHyperParameters", js.undefined)
    
    @scala.inline
    def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningObjective(value: HyperParameterTuningJobObjective): Self = StObject.set(x, "TuningObjective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningObjectiveUndefined: Self = StObject.set(x, "TuningObjective", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
