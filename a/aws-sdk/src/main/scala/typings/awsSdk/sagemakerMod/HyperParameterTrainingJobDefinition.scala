package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTrainingJobDefinition extends js.Object {
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
    StoppingCondition: StoppingCondition,
    CheckpointConfig: CheckpointConfig = null,
    DefinitionName: HyperParameterTrainingJobDefinitionName = null,
    EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
    EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
    EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
    HyperParameterRanges: ParameterRanges = null,
    InputDataConfig: InputDataConfig = null,
    StaticHyperParameters: HyperParameters = null,
    TuningObjective: HyperParameterTuningJobObjective = null,
    VpcConfig: VpcConfig = null
  ): HyperParameterTrainingJobDefinition = {
    val __obj = js.Dynamic.literal(AlgorithmSpecification = AlgorithmSpecification.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    if (CheckpointConfig != null) __obj.updateDynamic("CheckpointConfig")(CheckpointConfig.asInstanceOf[js.Any])
    if (DefinitionName != null) __obj.updateDynamic("DefinitionName")(DefinitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableInterContainerTrafficEncryption)) __obj.updateDynamic("EnableInterContainerTrafficEncryption")(EnableInterContainerTrafficEncryption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableManagedSpotTraining)) __obj.updateDynamic("EnableManagedSpotTraining")(EnableManagedSpotTraining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation.get.asInstanceOf[js.Any])
    if (HyperParameterRanges != null) __obj.updateDynamic("HyperParameterRanges")(HyperParameterRanges.asInstanceOf[js.Any])
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig.asInstanceOf[js.Any])
    if (StaticHyperParameters != null) __obj.updateDynamic("StaticHyperParameters")(StaticHyperParameters.asInstanceOf[js.Any])
    if (TuningObjective != null) __obj.updateDynamic("TuningObjective")(TuningObjective.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTrainingJobDefinition]
  }
}

