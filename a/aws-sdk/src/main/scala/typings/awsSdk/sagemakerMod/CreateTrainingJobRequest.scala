package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrainingJobRequest extends StObject {
  
  /**
    * The registry path of the Docker image that contains the training algorithm and algorithm-specific metadata, including the input mode. For more information about algorithms provided by Amazon SageMaker, see Algorithms. For information about providing your own algorithms, see Using Your Own Algorithms with Amazon SageMaker. 
    */
  var AlgorithmSpecification: typings.awsSdk.sagemakerMod.AlgorithmSpecification
  
  /**
    * Contains information about the output location for managed spot training checkpoint data.
    */
  var CheckpointConfig: js.UndefOr[typings.awsSdk.sagemakerMod.CheckpointConfig] = js.undefined
  
  var DebugHookConfig: js.UndefOr[typings.awsSdk.sagemakerMod.DebugHookConfig] = js.undefined
  
  /**
    * Configuration information for debugging rules.
    */
  var DebugRuleConfigurations: js.UndefOr[typings.awsSdk.sagemakerMod.DebugRuleConfigurations] = js.undefined
  
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training. For more information, see Protect Communications Between ML Compute Instances in a Distributed Training Job.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To train models using managed spot training, choose True. Managed spot training provides a fully managed and scalable infrastructure for training machine learning models. this option is useful when training jobs can be interrupted and when there is flexibility when the training job is run.  The complete and intermediate results of jobs are stored in an Amazon S3 bucket, and can be used as a starting point to train models incrementally. Amazon SageMaker provides metrics and logs in CloudWatch. They can be used to see when managed spot training jobs are running, interrupted, resumed, or completed. 
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If you enable network isolation for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specified VPC, but the training container does not have network access.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.undefined
  
  /**
    * Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you start the learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.  You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and value is limited to 256 characters, as specified by the Length Constraint. 
    */
  var HyperParameters: js.UndefOr[typings.awsSdk.sagemakerMod.HyperParameters] = js.undefined
  
  /**
    * An array of Channel objects. Each channel is a named input source. InputDataConfig describes the input data and its location.  Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of input data, training_data and validation_data. The configuration for each channel provides the S3, EFS, or FSx location where the input data is stored. It also provides information about the stored data: the MIME type, compression method, and whether the data is wrapped in RecordIO format.  Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an S3 bucket to a local directory in the Docker container, or makes it available as input streams. For example, if you specify an EFS location, input data files will be made available as input streams. They do not need to be downloaded.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.sagemakerMod.InputDataConfig] = js.undefined
  
  /**
    * Specifies the path to the S3 location where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts. 
    */
  var OutputDataConfig: typings.awsSdk.sagemakerMod.OutputDataConfig
  
  /**
    * The resources, including the ML compute instances and ML storage volumes, to use for model training.  ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML storage volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.
    */
  var ResourceConfig: typings.awsSdk.sagemakerMod.ResourceConfig
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.  During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket, download a Docker image that contains training code, write model artifacts to an S3 bucket, write logs to Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these tasks to an IAM role. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost. 
    */
  var StoppingCondition: typings.awsSdk.sagemakerMod.StoppingCondition
  
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  var TensorBoardOutputConfig: js.UndefOr[typings.awsSdk.sagemakerMod.TensorBoardOutputConfig] = js.undefined
  
  /**
    * The name of the training job. The name must be unique within an AWS Region in an AWS account. 
    */
  var TrainingJobName: typings.awsSdk.sagemakerMod.TrainingJobName
  
  /**
    * A VpcConfig object that specifies the VPC that you want your training job to connect to. Control access to and from your training container by configuring the VPC. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.VpcConfig] = js.undefined
}
object CreateTrainingJobRequest {
  
  inline def apply(
    AlgorithmSpecification: AlgorithmSpecification,
    OutputDataConfig: OutputDataConfig,
    ResourceConfig: ResourceConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition,
    TrainingJobName: TrainingJobName
  ): CreateTrainingJobRequest = {
    val __obj = js.Dynamic.literal(AlgorithmSpecification = AlgorithmSpecification.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrainingJobRequest]
  }
  
  extension [Self <: CreateTrainingJobRequest](x: Self) {
    
    inline def setAlgorithmSpecification(value: AlgorithmSpecification): Self = StObject.set(x, "AlgorithmSpecification", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfig(value: CheckpointConfig): Self = StObject.set(x, "CheckpointConfig", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfigUndefined: Self = StObject.set(x, "CheckpointConfig", js.undefined)
    
    inline def setDebugHookConfig(value: DebugHookConfig): Self = StObject.set(x, "DebugHookConfig", value.asInstanceOf[js.Any])
    
    inline def setDebugHookConfigUndefined: Self = StObject.set(x, "DebugHookConfig", js.undefined)
    
    inline def setDebugRuleConfigurations(value: DebugRuleConfigurations): Self = StObject.set(x, "DebugRuleConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDebugRuleConfigurationsUndefined: Self = StObject.set(x, "DebugRuleConfigurations", js.undefined)
    
    inline def setDebugRuleConfigurationsVarargs(value: DebugRuleConfiguration*): Self = StObject.set(x, "DebugRuleConfigurations", js.Array(value :_*))
    
    inline def setEnableInterContainerTrafficEncryption(value: Boolean): Self = StObject.set(x, "EnableInterContainerTrafficEncryption", value.asInstanceOf[js.Any])
    
    inline def setEnableInterContainerTrafficEncryptionUndefined: Self = StObject.set(x, "EnableInterContainerTrafficEncryption", js.undefined)
    
    inline def setEnableManagedSpotTraining(value: Boolean): Self = StObject.set(x, "EnableManagedSpotTraining", value.asInstanceOf[js.Any])
    
    inline def setEnableManagedSpotTrainingUndefined: Self = StObject.set(x, "EnableManagedSpotTraining", js.undefined)
    
    inline def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    inline def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    inline def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    inline def setHyperParameters(value: HyperParameters): Self = StObject.set(x, "HyperParameters", value.asInstanceOf[js.Any])
    
    inline def setHyperParametersUndefined: Self = StObject.set(x, "HyperParameters", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setInputDataConfigVarargs(value: Channel*): Self = StObject.set(x, "InputDataConfig", js.Array(value :_*))
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceConfig(value: ResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTensorBoardOutputConfig(value: TensorBoardOutputConfig): Self = StObject.set(x, "TensorBoardOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setTensorBoardOutputConfigUndefined: Self = StObject.set(x, "TensorBoardOutputConfig", js.undefined)
    
    inline def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
