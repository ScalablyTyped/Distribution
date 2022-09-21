package typings.awsSdk.sagemakerMod

import typings.awsSdk.anon.DescribeEndpointInputwait
import typings.awsSdk.anon.DescribeImageRequestwaite
import typings.awsSdk.anon.DescribeImageVersionReque
import typings.awsSdk.anon.DescribeNotebookInstanceI
import typings.awsSdk.anon.DescribeProcessingJobRequ
import typings.awsSdk.anon.DescribeTrainingJobReques
import typings.awsSdk.anon.DescribeTransformJobReque
import typings.awsSdk.awsSdkStrings.endpointDeleted
import typings.awsSdk.awsSdkStrings.endpointInService
import typings.awsSdk.awsSdkStrings.imageCreated
import typings.awsSdk.awsSdkStrings.imageDeleted_
import typings.awsSdk.awsSdkStrings.imageUpdated
import typings.awsSdk.awsSdkStrings.imageVersionCreated
import typings.awsSdk.awsSdkStrings.imageVersionDeleted
import typings.awsSdk.awsSdkStrings.notebookInstanceDeleted
import typings.awsSdk.awsSdkStrings.notebookInstanceInService
import typings.awsSdk.awsSdkStrings.notebookInstanceStopped
import typings.awsSdk.awsSdkStrings.processingJobCompletedOrStopped
import typings.awsSdk.awsSdkStrings.trainingJobCompletedOrStopped
import typings.awsSdk.awsSdkStrings.transformJobCompletedOrStopped
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SageMaker extends Service {
  
  /**
    * Creates an association between the source and the destination. A source can be associated with multiple destinations, and a destination can be associated with multiple sources. An association is a lineage tracking entity. For more information, see Amazon SageMaker ML Lineage Tracking.
    */
  def addAssociation(): Request[AddAssociationResponse, AWSError] = js.native
  def addAssociation(callback: js.Function2[/* err */ AWSError, /* data */ AddAssociationResponse, Unit]): Request[AddAssociationResponse, AWSError] = js.native
  /**
    * Creates an association between the source and the destination. A source can be associated with multiple destinations, and a destination can be associated with multiple sources. An association is a lineage tracking entity. For more information, see Amazon SageMaker ML Lineage Tracking.
    */
  def addAssociation(params: AddAssociationRequest): Request[AddAssociationResponse, AWSError] = js.native
  def addAssociation(
    params: AddAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddAssociationResponse, Unit]
  ): Request[AddAssociationResponse, AWSError] = js.native
  
  /**
    * Adds or overwrites one or more tags for the specified SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see Amazon Web Services Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob    Tags that you add to a SageMaker Studio Domain or User Profile by calling this API are also added to any Apps that the Domain or User Profile launches after you call this API, but not to Apps that the Domain or User Profile launched before you called this API. To make sure that the tags associated with a Domain or User Profile are also added to all Apps that the Domain or User Profile launches, add the tags when you first create the Domain or User Profile by specifying them in the Tags parameter of CreateDomain or CreateUserProfile. 
    */
  def addTags(): Request[AddTagsOutput, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see Amazon Web Services Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob    Tags that you add to a SageMaker Studio Domain or User Profile by calling this API are also added to any Apps that the Domain or User Profile launches after you call this API, but not to Apps that the Domain or User Profile launched before you called this API. To make sure that the tags associated with a Domain or User Profile are also added to all Apps that the Domain or User Profile launches, add the tags when you first create the Domain or User Profile by specifying them in the Tags parameter of CreateDomain or CreateUserProfile. 
    */
  def addTags(params: AddTagsInput): Request[AddTagsOutput, AWSError] = js.native
  def addTags(params: AddTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  
  /**
    * Associates a trial component with a trial. A trial component can be associated with multiple trials. To disassociate a trial component from a trial, call the DisassociateTrialComponent API.
    */
  def associateTrialComponent(): Request[AssociateTrialComponentResponse, AWSError] = js.native
  def associateTrialComponent(callback: js.Function2[/* err */ AWSError, /* data */ AssociateTrialComponentResponse, Unit]): Request[AssociateTrialComponentResponse, AWSError] = js.native
  /**
    * Associates a trial component with a trial. A trial component can be associated with multiple trials. To disassociate a trial component from a trial, call the DisassociateTrialComponent API.
    */
  def associateTrialComponent(params: AssociateTrialComponentRequest): Request[AssociateTrialComponentResponse, AWSError] = js.native
  def associateTrialComponent(
    params: AssociateTrialComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTrialComponentResponse, Unit]
  ): Request[AssociateTrialComponentResponse, AWSError] = js.native
  
  /**
    * This action batch describes a list of versioned model packages
    */
  def batchDescribeModelPackage(): Request[BatchDescribeModelPackageOutput, AWSError] = js.native
  def batchDescribeModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ BatchDescribeModelPackageOutput, Unit]): Request[BatchDescribeModelPackageOutput, AWSError] = js.native
  /**
    * This action batch describes a list of versioned model packages
    */
  def batchDescribeModelPackage(params: BatchDescribeModelPackageInput): Request[BatchDescribeModelPackageOutput, AWSError] = js.native
  def batchDescribeModelPackage(
    params: BatchDescribeModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDescribeModelPackageOutput, Unit]
  ): Request[BatchDescribeModelPackageOutput, AWSError] = js.native
  
  @JSName("config")
  var config_SageMaker: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an action. An action is a lineage tracking entity that represents an action or activity. For example, a model deployment or an HPO job. Generally, an action involves at least one input or output artifact. For more information, see Amazon SageMaker ML Lineage Tracking.
    */
  def createAction(): Request[CreateActionResponse, AWSError] = js.native
  def createAction(callback: js.Function2[/* err */ AWSError, /* data */ CreateActionResponse, Unit]): Request[CreateActionResponse, AWSError] = js.native
  /**
    * Creates an action. An action is a lineage tracking entity that represents an action or activity. For example, a model deployment or an HPO job. Generally, an action involves at least one input or output artifact. For more information, see Amazon SageMaker ML Lineage Tracking.
    */
  def createAction(params: CreateActionRequest): Request[CreateActionResponse, AWSError] = js.native
  def createAction(
    params: CreateActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateActionResponse, Unit]
  ): Request[CreateActionResponse, AWSError] = js.native
  
  /**
    * Create a machine learning algorithm that you can use in SageMaker and list in the Amazon Web Services Marketplace.
    */
  def createAlgorithm(): Request[CreateAlgorithmOutput, AWSError] = js.native
  def createAlgorithm(callback: js.Function2[/* err */ AWSError, /* data */ CreateAlgorithmOutput, Unit]): Request[CreateAlgorithmOutput, AWSError] = js.native
  /**
    * Create a machine learning algorithm that you can use in SageMaker and list in the Amazon Web Services Marketplace.
    */
  def createAlgorithm(params: CreateAlgorithmInput): Request[CreateAlgorithmOutput, AWSError] = js.native
  def createAlgorithm(
    params: CreateAlgorithmInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAlgorithmOutput, Unit]
  ): Request[CreateAlgorithmOutput, AWSError] = js.native
  
  /**
    * Creates a running app for the specified UserProfile. This operation is automatically invoked by Amazon SageMaker Studio upon access to the associated Domain, and when new kernel configurations are selected by the user. A user may have multiple Apps active simultaneously.
    */
  def createApp(): Request[CreateAppResponse, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]): Request[CreateAppResponse, AWSError] = js.native
  /**
    * Creates a running app for the specified UserProfile. This operation is automatically invoked by Amazon SageMaker Studio upon access to the associated Domain, and when new kernel configurations are selected by the user. A user may have multiple Apps active simultaneously.
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResponse, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]
  ): Request[CreateAppResponse, AWSError] = js.native
  
  /**
    * Creates a configuration for running a SageMaker image as a KernelGateway app. The configuration specifies the Amazon Elastic File System (EFS) storage volume on the image, and a list of the kernels in the image.
    */
  def createAppImageConfig(): Request[CreateAppImageConfigResponse, AWSError] = js.native
  def createAppImageConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppImageConfigResponse, Unit]): Request[CreateAppImageConfigResponse, AWSError] = js.native
  /**
    * Creates a configuration for running a SageMaker image as a KernelGateway app. The configuration specifies the Amazon Elastic File System (EFS) storage volume on the image, and a list of the kernels in the image.
    */
  def createAppImageConfig(params: CreateAppImageConfigRequest): Request[CreateAppImageConfigResponse, AWSError] = js.native
  def createAppImageConfig(
    params: CreateAppImageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppImageConfigResponse, Unit]
  ): Request[CreateAppImageConfigResponse, AWSError] = js.native
  
  /**
    * Creates an artifact. An artifact is a lineage tracking entity that represents a URI addressable object or data. Some examples are the S3 URI of a dataset and the ECR registry path of an image. For more information, see Amazon SageMaker ML Lineage Tracking.
    */
  def createArtifact(): Request[CreateArtifactResponse, AWSError] = js.native
  def createArtifact(callback: js.Function2[/* err */ AWSError, /* data */ CreateArtifactResponse, Unit]): Request[CreateArtifactResponse, AWSError] = js.native
  /**
    * Creates an artifact. An artifact is a lineage tracking entity that represents a URI addressable object or data. Some examples are the S3 URI of a dataset and the ECR registry path of an image. For more information, see Amazon SageMaker ML Lineage Tracking.
    */
  def createArtifact(params: CreateArtifactRequest): Request[CreateArtifactResponse, AWSError] = js.native
  def createArtifact(
    params: CreateArtifactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateArtifactResponse, Unit]
  ): Request[CreateArtifactResponse, AWSError] = js.native
  
  /**
    * Creates an Autopilot job. Find the best-performing model after you run an Autopilot job by calling . For information about how to use Autopilot, see Automate Model Development with Amazon SageMaker Autopilot.
    */
  def createAutoMLJob(): Request[CreateAutoMLJobResponse, AWSError] = js.native
  def createAutoMLJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateAutoMLJobResponse, Unit]): Request[CreateAutoMLJobResponse, AWSError] = js.native
  /**
    * Creates an Autopilot job. Find the best-performing model after you run an Autopilot job by calling . For information about how to use Autopilot, see Automate Model Development with Amazon SageMaker Autopilot.
    */
  def createAutoMLJob(params: CreateAutoMLJobRequest): Request[CreateAutoMLJobResponse, AWSError] = js.native
  def createAutoMLJob(
    params: CreateAutoMLJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAutoMLJobResponse, Unit]
  ): Request[CreateAutoMLJobResponse, AWSError] = js.native
  
  /**
    * Creates a Git repository as a resource in your SageMaker account. You can associate the repository with notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a resource in your SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in Amazon Web Services CodeCommit or in any other Git repository.
    */
  def createCodeRepository(): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  def createCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateCodeRepositoryOutput, Unit]): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  /**
    * Creates a Git repository as a resource in your SageMaker account. You can associate the repository with notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a resource in your SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in Amazon Web Services CodeCommit or in any other Git repository.
    */
  def createCodeRepository(params: CreateCodeRepositoryInput): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  def createCodeRepository(
    params: CreateCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCodeRepositoryOutput, Unit]
  ): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  
  /**
    * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with Amazon Web Services IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on    The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job.    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def createCompilationJob(): Request[CreateCompilationJobResponse, AWSError] = js.native
  def createCompilationJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateCompilationJobResponse, Unit]): Request[CreateCompilationJobResponse, AWSError] = js.native
  /**
    * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with Amazon Web Services IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on    The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job.    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def createCompilationJob(params: CreateCompilationJobRequest): Request[CreateCompilationJobResponse, AWSError] = js.native
  def createCompilationJob(
    params: CreateCompilationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCompilationJobResponse, Unit]
  ): Request[CreateCompilationJobResponse, AWSError] = js.native
  
  /**
    * Creates a context. A context is a lineage tracking entity that represents a logical grouping of other tracking or experiment entities. Some examples are an endpoint and a model package. For more information, see Amazon SageMaker ML Lineage Tracking.
    */
  def createContext(): Request[CreateContextResponse, AWSError] = js.native
  def createContext(callback: js.Function2[/* err */ AWSError, /* data */ CreateContextResponse, Unit]): Request[CreateContextResponse, AWSError] = js.native
  /**
    * Creates a context. A context is a lineage tracking entity that represents a logical grouping of other tracking or experiment entities. Some examples are an endpoint and a model package. For more information, see Amazon SageMaker ML Lineage Tracking.
    */
  def createContext(params: CreateContextRequest): Request[CreateContextResponse, AWSError] = js.native
  def createContext(
    params: CreateContextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContextResponse, Unit]
  ): Request[CreateContextResponse, AWSError] = js.native
  
  /**
    * Creates a definition for a job that monitors data quality and drift. For information about model monitor, see Amazon SageMaker Model Monitor.
    */
  def createDataQualityJobDefinition(): Request[CreateDataQualityJobDefinitionResponse, AWSError] = js.native
  def createDataQualityJobDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataQualityJobDefinitionResponse, Unit]
  ): Request[CreateDataQualityJobDefinitionResponse, AWSError] = js.native
  /**
    * Creates a definition for a job that monitors data quality and drift. For information about model monitor, see Amazon SageMaker Model Monitor.
    */
  def createDataQualityJobDefinition(params: CreateDataQualityJobDefinitionRequest): Request[CreateDataQualityJobDefinitionResponse, AWSError] = js.native
  def createDataQualityJobDefinition(
    params: CreateDataQualityJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataQualityJobDefinitionResponse, Unit]
  ): Request[CreateDataQualityJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a device fleet.
    */
  def createDeviceFleet(): Request[js.Object, AWSError] = js.native
  def createDeviceFleet(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a device fleet.
    */
  def createDeviceFleet(params: CreateDeviceFleetRequest): Request[js.Object, AWSError] = js.native
  def createDeviceFleet(
    params: CreateDeviceFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates a Domain used by Amazon SageMaker Studio. A domain consists of an associated Amazon Elastic File System (EFS) volume, a list of authorized users, and a variety of security, application, policy, and Amazon Virtual Private Cloud (VPC) configurations. An Amazon Web Services account is limited to one domain per region. Users within a domain can share notebook files and other artifacts with each other.  EFS storage  When a domain is created, an EFS volume is created for use by all of the users within the domain. Each user receives a private home directory within the EFS volume for notebooks, Git repositories, and data files. SageMaker uses the Amazon Web Services Key Management Service (Amazon Web Services KMS) to encrypt the EFS volume attached to the domain with an Amazon Web Services managed key by default. For more control, you can specify a customer managed key. For more information, see Protect Data at Rest Using Encryption.  VPC configuration  All SageMaker Studio traffic between the domain and the EFS volume is through the specified VPC and subnets. For other Studio traffic, you can specify the AppNetworkAccessType parameter. AppNetworkAccessType corresponds to the network access type that you choose when you onboard to Studio. The following options are available:    PublicInternetOnly - Non-EFS traffic goes through a VPC managed by Amazon SageMaker, which allows internet access. This is the default value.    VpcOnly - All Studio traffic is through the specified VPC and subnets. Internet access is disabled by default. To allow internet access, you must specify a NAT gateway. When internet access is disabled, you won't be able to run a Studio notebook or to train or host models unless your VPC has an interface endpoint to the SageMaker API and runtime or a NAT gateway and your security groups allow outbound connections.    NFS traffic over TCP on port 2049 needs to be allowed in both inbound and outbound rules in order to launch a SageMaker Studio app successfully.  For more information, see Connect SageMaker Studio Notebooks to Resources in a VPC.
    */
  def createDomain(): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates a Domain used by Amazon SageMaker Studio. A domain consists of an associated Amazon Elastic File System (EFS) volume, a list of authorized users, and a variety of security, application, policy, and Amazon Virtual Private Cloud (VPC) configurations. An Amazon Web Services account is limited to one domain per region. Users within a domain can share notebook files and other artifacts with each other.  EFS storage  When a domain is created, an EFS volume is created for use by all of the users within the domain. Each user receives a private home directory within the EFS volume for notebooks, Git repositories, and data files. SageMaker uses the Amazon Web Services Key Management Service (Amazon Web Services KMS) to encrypt the EFS volume attached to the domain with an Amazon Web Services managed key by default. For more control, you can specify a customer managed key. For more information, see Protect Data at Rest Using Encryption.  VPC configuration  All SageMaker Studio traffic between the domain and the EFS volume is through the specified VPC and subnets. For other Studio traffic, you can specify the AppNetworkAccessType parameter. AppNetworkAccessType corresponds to the network access type that you choose when you onboard to Studio. The following options are available:    PublicInternetOnly - Non-EFS traffic goes through a VPC managed by Amazon SageMaker, which allows internet access. This is the default value.    VpcOnly - All Studio traffic is through the specified VPC and subnets. Internet access is disabled by default. To allow internet access, you must specify a NAT gateway. When internet access is disabled, you won't be able to run a Studio notebook or to train or host models unless your VPC has an interface endpoint to the SageMaker API and runtime or a NAT gateway and your security groups allow outbound connections.    NFS traffic over TCP on port 2049 needs to be allowed in both inbound and outbound rules in order to launch a SageMaker Studio app successfully.  For more information, see Connect SageMaker Studio Notebooks to Resources in a VPC.
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]
  ): Request[CreateDomainResponse, AWSError] = js.native
  
  /**
    * Creates an edge deployment plan, consisting of multiple stages. Each stage may have a different deployment configuration and devices.
    */
  def createEdgeDeploymentPlan(): Request[CreateEdgeDeploymentPlanResponse, AWSError] = js.native
  def createEdgeDeploymentPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateEdgeDeploymentPlanResponse, Unit]): Request[CreateEdgeDeploymentPlanResponse, AWSError] = js.native
  /**
    * Creates an edge deployment plan, consisting of multiple stages. Each stage may have a different deployment configuration and devices.
    */
  def createEdgeDeploymentPlan(params: CreateEdgeDeploymentPlanRequest): Request[CreateEdgeDeploymentPlanResponse, AWSError] = js.native
  def createEdgeDeploymentPlan(
    params: CreateEdgeDeploymentPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEdgeDeploymentPlanResponse, Unit]
  ): Request[CreateEdgeDeploymentPlanResponse, AWSError] = js.native
  
  /**
    * Creates a new stage in an existing edge deployment plan.
    */
  def createEdgeDeploymentStage(): Request[js.Object, AWSError] = js.native
  def createEdgeDeploymentStage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a new stage in an existing edge deployment plan.
    */
  def createEdgeDeploymentStage(params: CreateEdgeDeploymentStageRequest): Request[js.Object, AWSError] = js.native
  def createEdgeDeploymentStage(
    params: CreateEdgeDeploymentStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a SageMaker Edge Manager model packaging job. Edge Manager will use the model artifacts from the Amazon Simple Storage Service bucket that you specify. After the model has been packaged, Amazon SageMaker saves the resulting artifacts to an S3 bucket that you specify.
    */
  def createEdgePackagingJob(): Request[js.Object, AWSError] = js.native
  def createEdgePackagingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts a SageMaker Edge Manager model packaging job. Edge Manager will use the model artifacts from the Amazon Simple Storage Service bucket that you specify. After the model has been packaged, Amazon SageMaker saves the resulting artifacts to an S3 bucket that you specify.
    */
  def createEdgePackagingJob(params: CreateEdgePackagingJobRequest): Request[js.Object, AWSError] = js.native
  def createEdgePackagingJob(
    params: CreateEdgePackagingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates an endpoint using the endpoint configuration specified in the request. SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.   Use this API to deploy models using SageMaker hosting services.  For an example that calls this method when deploying a model to SageMaker hosting services, see the Create Endpoint example notebook.    You must not delete an EndpointConfig that is in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig.  The endpoint name must be unique within an Amazon Web Services Region in your Amazon Web Services account.  When it receives the request, SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.   When you call CreateEndpoint, a load call is made to DynamoDB to verify that your endpoint configuration exists. When you read data from a DynamoDB table supporting  Eventually Consistent Reads , the response might not reflect the results of a recently completed write operation. The response might include some stale data. If the dependent entities are not yet in DynamoDB, this causes a validation error. If you repeat your read request after a short time, the response should return the latest data. So retry logic is recommended to handle these possible issues. We also recommend that customers call DescribeEndpointConfig before calling CreateEndpoint to minimize the potential impact of a DynamoDB eventually consistent read.  When SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. If any of the models hosted at this endpoint get model data from an Amazon S3 location, SageMaker uses Amazon Web Services Security Token Service to download model artifacts from the S3 path you provided. Amazon Web Services STS is activated in your IAM user account by default. If you previously deactivated Amazon Web Services STS for a region, you need to reactivate Amazon Web Services STS for that region. For more information, see Activating and Deactivating Amazon Web Services STS in an Amazon Web Services Region in the Amazon Web Services Identity and Access Management User Guide.   To add the IAM role policies for using this API operation, go to the IAM console, and choose Roles in the left navigation pane. Search the IAM role that you want to grant access to use the CreateEndpoint and CreateEndpointConfig API operations, add the following policies to the role.    Option 1: For a full SageMaker access, search and attach the AmazonSageMakerFullAccess policy.   Option 2: For granting a limited access to an IAM role, paste the following Action elements manually into the JSON file of the IAM role:   "Action": ["sagemaker:CreateEndpoint", "sagemaker:CreateEndpointConfig"]   "Resource": [   "arn:aws:sagemaker:region:account-id:endpoint/endpointName"   "arn:aws:sagemaker:region:account-id:endpoint-config/endpointConfigName"   ]  For more information, see SageMaker API Permissions: Actions, Permissions, and Resources Reference.   
    */
  def createEndpoint(): Request[CreateEndpointOutput, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointOutput, Unit]): Request[CreateEndpointOutput, AWSError] = js.native
  /**
    * Creates an endpoint using the endpoint configuration specified in the request. SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.   Use this API to deploy models using SageMaker hosting services.  For an example that calls this method when deploying a model to SageMaker hosting services, see the Create Endpoint example notebook.    You must not delete an EndpointConfig that is in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig.  The endpoint name must be unique within an Amazon Web Services Region in your Amazon Web Services account.  When it receives the request, SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.   When you call CreateEndpoint, a load call is made to DynamoDB to verify that your endpoint configuration exists. When you read data from a DynamoDB table supporting  Eventually Consistent Reads , the response might not reflect the results of a recently completed write operation. The response might include some stale data. If the dependent entities are not yet in DynamoDB, this causes a validation error. If you repeat your read request after a short time, the response should return the latest data. So retry logic is recommended to handle these possible issues. We also recommend that customers call DescribeEndpointConfig before calling CreateEndpoint to minimize the potential impact of a DynamoDB eventually consistent read.  When SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. If any of the models hosted at this endpoint get model data from an Amazon S3 location, SageMaker uses Amazon Web Services Security Token Service to download model artifacts from the S3 path you provided. Amazon Web Services STS is activated in your IAM user account by default. If you previously deactivated Amazon Web Services STS for a region, you need to reactivate Amazon Web Services STS for that region. For more information, see Activating and Deactivating Amazon Web Services STS in an Amazon Web Services Region in the Amazon Web Services Identity and Access Management User Guide.   To add the IAM role policies for using this API operation, go to the IAM console, and choose Roles in the left navigation pane. Search the IAM role that you want to grant access to use the CreateEndpoint and CreateEndpointConfig API operations, add the following policies to the role.    Option 1: For a full SageMaker access, search and attach the AmazonSageMakerFullAccess policy.   Option 2: For granting a limited access to an IAM role, paste the following Action elements manually into the JSON file of the IAM role:   "Action": ["sagemaker:CreateEndpoint", "sagemaker:CreateEndpointConfig"]   "Resource": [   "arn:aws:sagemaker:region:account-id:endpoint/endpointName"   "arn:aws:sagemaker:region:account-id:endpoint-config/endpointConfigName"   ]  For more information, see SageMaker API Permissions: Actions, Permissions, and Resources Reference.   
    */
  def createEndpoint(params: CreateEndpointInput): Request[CreateEndpointOutput, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointOutput, Unit]
  ): Request[CreateEndpointOutput, AWSError] = js.native
  
  /**
    * Creates an endpoint configuration that SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want SageMaker to provision. Then you call the CreateEndpoint API.   Use this API if you want to use SageMaker hosting services to deploy models into production.   In the request, you define a ProductionVariant, for each model that you want to deploy. Each ProductionVariant parameter also describes the resources that you want SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B.   When you call CreateEndpoint, a load call is made to DynamoDB to verify that your endpoint configuration exists. When you read data from a DynamoDB table supporting  Eventually Consistent Reads , the response might not reflect the results of a recently completed write operation. The response might include some stale data. If the dependent entities are not yet in DynamoDB, this causes a validation error. If you repeat your read request after a short time, the response should return the latest data. So retry logic is recommended to handle these possible issues. We also recommend that customers call DescribeEndpointConfig before calling CreateEndpoint to minimize the potential impact of a DynamoDB eventually consistent read. 
    */
  def createEndpointConfig(): Request[CreateEndpointConfigOutput, AWSError] = js.native
  def createEndpointConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointConfigOutput, Unit]): Request[CreateEndpointConfigOutput, AWSError] = js.native
  /**
    * Creates an endpoint configuration that SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want SageMaker to provision. Then you call the CreateEndpoint API.   Use this API if you want to use SageMaker hosting services to deploy models into production.   In the request, you define a ProductionVariant, for each model that you want to deploy. Each ProductionVariant parameter also describes the resources that you want SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B.   When you call CreateEndpoint, a load call is made to DynamoDB to verify that your endpoint configuration exists. When you read data from a DynamoDB table supporting  Eventually Consistent Reads , the response might not reflect the results of a recently completed write operation. The response might include some stale data. If the dependent entities are not yet in DynamoDB, this causes a validation error. If you repeat your read request after a short time, the response should return the latest data. So retry logic is recommended to handle these possible issues. We also recommend that customers call DescribeEndpointConfig before calling CreateEndpoint to minimize the potential impact of a DynamoDB eventually consistent read. 
    */
  def createEndpointConfig(params: CreateEndpointConfigInput): Request[CreateEndpointConfigOutput, AWSError] = js.native
  def createEndpointConfig(
    params: CreateEndpointConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointConfigOutput, Unit]
  ): Request[CreateEndpointConfigOutput, AWSError] = js.native
  
  /**
    * Creates an SageMaker experiment. An experiment is a collection of trials that are observed, compared and evaluated as a group. A trial is a set of steps, called trial components, that produce a machine learning model. The goal of an experiment is to determine the components that produce the best model. Multiple trials are performed, each one isolating and measuring the impact of a change to one or more inputs, while keeping the remaining inputs constant. When you use SageMaker Studio or the SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the Amazon Web Services SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to experiments, trials, trial components and then use the Search API to search for the tags. To add a description to an experiment, specify the optional Description parameter. To add a description later, or to change the description, call the UpdateExperiment API. To get a list of all your experiments, call the ListExperiments API. To view an experiment's properties, call the DescribeExperiment API. To get a list of all the trials associated with an experiment, call the ListTrials API. To create a trial call the CreateTrial API.
    */
  def createExperiment(): Request[CreateExperimentResponse, AWSError] = js.native
  def createExperiment(callback: js.Function2[/* err */ AWSError, /* data */ CreateExperimentResponse, Unit]): Request[CreateExperimentResponse, AWSError] = js.native
  /**
    * Creates an SageMaker experiment. An experiment is a collection of trials that are observed, compared and evaluated as a group. A trial is a set of steps, called trial components, that produce a machine learning model. The goal of an experiment is to determine the components that produce the best model. Multiple trials are performed, each one isolating and measuring the impact of a change to one or more inputs, while keeping the remaining inputs constant. When you use SageMaker Studio or the SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the Amazon Web Services SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to experiments, trials, trial components and then use the Search API to search for the tags. To add a description to an experiment, specify the optional Description parameter. To add a description later, or to change the description, call the UpdateExperiment API. To get a list of all your experiments, call the ListExperiments API. To view an experiment's properties, call the DescribeExperiment API. To get a list of all the trials associated with an experiment, call the ListTrials API. To create a trial call the CreateTrial API.
    */
  def createExperiment(params: CreateExperimentRequest): Request[CreateExperimentResponse, AWSError] = js.native
  def createExperiment(
    params: CreateExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExperimentResponse, Unit]
  ): Request[CreateExperimentResponse, AWSError] = js.native
  
  /**
    * Create a new FeatureGroup. A FeatureGroup is a group of Features defined in the FeatureStore to describe a Record.  The FeatureGroup defines the schema and features contained in the FeatureGroup. A FeatureGroup definition is composed of a list of Features, a RecordIdentifierFeatureName, an EventTimeFeatureName and configurations for its OnlineStore and OfflineStore. Check Amazon Web Services service quotas to see the FeatureGroups quota for your Amazon Web Services account.  You must include at least one of OnlineStoreConfig and OfflineStoreConfig to create a FeatureGroup. 
    */
  def createFeatureGroup(): Request[CreateFeatureGroupResponse, AWSError] = js.native
  def createFeatureGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateFeatureGroupResponse, Unit]): Request[CreateFeatureGroupResponse, AWSError] = js.native
  /**
    * Create a new FeatureGroup. A FeatureGroup is a group of Features defined in the FeatureStore to describe a Record.  The FeatureGroup defines the schema and features contained in the FeatureGroup. A FeatureGroup definition is composed of a list of Features, a RecordIdentifierFeatureName, an EventTimeFeatureName and configurations for its OnlineStore and OfflineStore. Check Amazon Web Services service quotas to see the FeatureGroups quota for your Amazon Web Services account.  You must include at least one of OnlineStoreConfig and OfflineStoreConfig to create a FeatureGroup. 
    */
  def createFeatureGroup(params: CreateFeatureGroupRequest): Request[CreateFeatureGroupResponse, AWSError] = js.native
  def createFeatureGroup(
    params: CreateFeatureGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFeatureGroupResponse, Unit]
  ): Request[CreateFeatureGroupResponse, AWSError] = js.native
  
  /**
    * Creates a flow definition.
    */
  def createFlowDefinition(): Request[CreateFlowDefinitionResponse, AWSError] = js.native
  def createFlowDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowDefinitionResponse, Unit]): Request[CreateFlowDefinitionResponse, AWSError] = js.native
  /**
    * Creates a flow definition.
    */
  def createFlowDefinition(params: CreateFlowDefinitionRequest): Request[CreateFlowDefinitionResponse, AWSError] = js.native
  def createFlowDefinition(
    params: CreateFlowDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowDefinitionResponse, Unit]
  ): Request[CreateFlowDefinitionResponse, AWSError] = js.native
  
  /**
    * Defines the settings you will use for the human review workflow user interface. Reviewers will see a three-panel interface with an instruction area, the item to review, and an input area.
    */
  def createHumanTaskUi(): Request[CreateHumanTaskUiResponse, AWSError] = js.native
  def createHumanTaskUi(callback: js.Function2[/* err */ AWSError, /* data */ CreateHumanTaskUiResponse, Unit]): Request[CreateHumanTaskUiResponse, AWSError] = js.native
  /**
    * Defines the settings you will use for the human review workflow user interface. Reviewers will see a three-panel interface with an instruction area, the item to review, and an input area.
    */
  def createHumanTaskUi(params: CreateHumanTaskUiRequest): Request[CreateHumanTaskUiResponse, AWSError] = js.native
  def createHumanTaskUi(
    params: CreateHumanTaskUiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHumanTaskUiResponse, Unit]
  ): Request[CreateHumanTaskUiResponse, AWSError] = js.native
  
  /**
    * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
    */
  def createHyperParameterTuningJob(): Request[CreateHyperParameterTuningJobResponse, AWSError] = js.native
  def createHyperParameterTuningJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateHyperParameterTuningJobResponse, Unit]): Request[CreateHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured by an objective metric that you choose.
    */
  def createHyperParameterTuningJob(params: CreateHyperParameterTuningJobRequest): Request[CreateHyperParameterTuningJobResponse, AWSError] = js.native
  def createHyperParameterTuningJob(
    params: CreateHyperParameterTuningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHyperParameterTuningJobResponse, Unit]
  ): Request[CreateHyperParameterTuningJobResponse, AWSError] = js.native
  
  /**
    * Creates a custom SageMaker image. A SageMaker image is a set of image versions. Each image version represents a container image stored in Amazon Elastic Container Registry (ECR). For more information, see Bring your own SageMaker image.
    */
  def createImage(): Request[CreateImageResponse, AWSError] = js.native
  def createImage(callback: js.Function2[/* err */ AWSError, /* data */ CreateImageResponse, Unit]): Request[CreateImageResponse, AWSError] = js.native
  /**
    * Creates a custom SageMaker image. A SageMaker image is a set of image versions. Each image version represents a container image stored in Amazon Elastic Container Registry (ECR). For more information, see Bring your own SageMaker image.
    */
  def createImage(params: CreateImageRequest): Request[CreateImageResponse, AWSError] = js.native
  def createImage(
    params: CreateImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImageResponse, Unit]
  ): Request[CreateImageResponse, AWSError] = js.native
  
  /**
    * Creates a version of the SageMaker image specified by ImageName. The version represents the Amazon Elastic Container Registry (ECR) container image specified by BaseImage.
    */
  def createImageVersion(): Request[CreateImageVersionResponse, AWSError] = js.native
  def createImageVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateImageVersionResponse, Unit]): Request[CreateImageVersionResponse, AWSError] = js.native
  /**
    * Creates a version of the SageMaker image specified by ImageName. The version represents the Amazon Elastic Container Registry (ECR) container image specified by BaseImage.
    */
  def createImageVersion(params: CreateImageVersionRequest): Request[CreateImageVersionResponse, AWSError] = js.native
  def createImageVersion(
    params: CreateImageVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImageVersionResponse, Unit]
  ): Request[CreateImageVersionResponse, AWSError] = js.native
  
  /**
    * Starts a recommendation job. You can create either an instance recommendation or load test job.
    */
  def createInferenceRecommendationsJob(): Request[CreateInferenceRecommendationsJobResponse, AWSError] = js.native
  def createInferenceRecommendationsJob(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInferenceRecommendationsJobResponse, Unit]
  ): Request[CreateInferenceRecommendationsJobResponse, AWSError] = js.native
  /**
    * Starts a recommendation job. You can create either an instance recommendation or load test job.
    */
  def createInferenceRecommendationsJob(params: CreateInferenceRecommendationsJobRequest): Request[CreateInferenceRecommendationsJobResponse, AWSError] = js.native
  def createInferenceRecommendationsJob(
    params: CreateInferenceRecommendationsJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInferenceRecommendationsJobResponse, Unit]
  ): Request[CreateInferenceRecommendationsJobResponse, AWSError] = js.native
  
  /**
    * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models.  You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when want the data to stay within your organization or when a specific set of skills is required.   One or more vendors that you select from the Amazon Web Services Marketplace. Vendors provide expertise in specific areas.    The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. For more information, see Using Automated Data Labeling. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models. You can use this operation to create a static labeling job or a streaming labeling job. A static labeling job stops if all data objects in the input manifest file identified in ManifestS3Uri have been labeled. A streaming labeling job runs perpetually until it is manually stopped, or remains idle for 10 days. You can send new data objects to an active (InProgress) streaming labeling job in real time. To learn how to create a static labeling job, see Create a Labeling Job (API)  in the Amazon SageMaker Developer Guide. To learn how to create a streaming labeling job, see Create a Streaming Labeling Job.
    */
  def createLabelingJob(): Request[CreateLabelingJobResponse, AWSError] = js.native
  def createLabelingJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelingJobResponse, Unit]): Request[CreateLabelingJobResponse, AWSError] = js.native
  /**
    * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models.  You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when want the data to stay within your organization or when a specific set of skills is required.   One or more vendors that you select from the Amazon Web Services Marketplace. Vendors provide expertise in specific areas.    The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. For more information, see Using Automated Data Labeling. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models. You can use this operation to create a static labeling job or a streaming labeling job. A static labeling job stops if all data objects in the input manifest file identified in ManifestS3Uri have been labeled. A streaming labeling job runs perpetually until it is manually stopped, or remains idle for 10 days. You can send new data objects to an active (InProgress) streaming labeling job in real time. To learn how to create a static labeling job, see Create a Labeling Job (API)  in the Amazon SageMaker Developer Guide. To learn how to create a streaming labeling job, see Create a Streaming Labeling Job.
    */
  def createLabelingJob(params: CreateLabelingJobRequest): Request[CreateLabelingJobResponse, AWSError] = js.native
  def createLabelingJob(
    params: CreateLabelingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelingJobResponse, Unit]
  ): Request[CreateLabelingJobResponse, AWSError] = js.native
  
  /**
    * Creates a model in SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the Docker image that contains inference code, artifacts (from prior training), and a custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  For an example that calls this method when deploying a model to SageMaker hosting services, see Create a Model (Amazon Web Services SDK for Python (Boto 3)).  To run a batch transform using your model, you start a job with the CreateTransformJob API. SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the request, you also provide an IAM role that SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other Amazon Web Services resources, you grant necessary permissions via this role.
    */
  def createModel(): Request[CreateModelOutput, AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelOutput, Unit]): Request[CreateModelOutput, AWSError] = js.native
  /**
    * Creates a model in SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the Docker image that contains inference code, artifacts (from prior training), and a custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  For an example that calls this method when deploying a model to SageMaker hosting services, see Create a Model (Amazon Web Services SDK for Python (Boto 3)).  To run a batch transform using your model, you start a job with the CreateTransformJob API. SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the request, you also provide an IAM role that SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other Amazon Web Services resources, you grant necessary permissions via this role.
    */
  def createModel(params: CreateModelInput): Request[CreateModelOutput, AWSError] = js.native
  def createModel(
    params: CreateModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelOutput, Unit]
  ): Request[CreateModelOutput, AWSError] = js.native
  
  /**
    * Creates the definition for a model bias job.
    */
  def createModelBiasJobDefinition(): Request[CreateModelBiasJobDefinitionResponse, AWSError] = js.native
  def createModelBiasJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelBiasJobDefinitionResponse, Unit]): Request[CreateModelBiasJobDefinitionResponse, AWSError] = js.native
  /**
    * Creates the definition for a model bias job.
    */
  def createModelBiasJobDefinition(params: CreateModelBiasJobDefinitionRequest): Request[CreateModelBiasJobDefinitionResponse, AWSError] = js.native
  def createModelBiasJobDefinition(
    params: CreateModelBiasJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelBiasJobDefinitionResponse, Unit]
  ): Request[CreateModelBiasJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates the definition for a model explainability job.
    */
  def createModelExplainabilityJobDefinition(): Request[CreateModelExplainabilityJobDefinitionResponse, AWSError] = js.native
  def createModelExplainabilityJobDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelExplainabilityJobDefinitionResponse, Unit]
  ): Request[CreateModelExplainabilityJobDefinitionResponse, AWSError] = js.native
  /**
    * Creates the definition for a model explainability job.
    */
  def createModelExplainabilityJobDefinition(params: CreateModelExplainabilityJobDefinitionRequest): Request[CreateModelExplainabilityJobDefinitionResponse, AWSError] = js.native
  def createModelExplainabilityJobDefinition(
    params: CreateModelExplainabilityJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelExplainabilityJobDefinitionResponse, Unit]
  ): Request[CreateModelExplainabilityJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a model package that you can use to create SageMaker models or list on Amazon Web Services Marketplace, or a versioned model that is part of a model group. Buyers can subscribe to model packages listed on Amazon Web Services Marketplace to create models in SageMaker. To create a model package by specifying a Docker container that contains your inference code and the Amazon S3 location of your model artifacts, provide values for InferenceSpecification. To create a model from an algorithm resource that you created or subscribed to in Amazon Web Services Marketplace, provide a value for SourceAlgorithmSpecification.  There are two types of model packages:   Versioned - a model that is part of a model group in the model registry.   Unversioned - a model package that is not part of a model group.   
    */
  def createModelPackage(): Request[CreateModelPackageOutput, AWSError] = js.native
  def createModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelPackageOutput, Unit]): Request[CreateModelPackageOutput, AWSError] = js.native
  /**
    * Creates a model package that you can use to create SageMaker models or list on Amazon Web Services Marketplace, or a versioned model that is part of a model group. Buyers can subscribe to model packages listed on Amazon Web Services Marketplace to create models in SageMaker. To create a model package by specifying a Docker container that contains your inference code and the Amazon S3 location of your model artifacts, provide values for InferenceSpecification. To create a model from an algorithm resource that you created or subscribed to in Amazon Web Services Marketplace, provide a value for SourceAlgorithmSpecification.  There are two types of model packages:   Versioned - a model that is part of a model group in the model registry.   Unversioned - a model package that is not part of a model group.   
    */
  def createModelPackage(params: CreateModelPackageInput): Request[CreateModelPackageOutput, AWSError] = js.native
  def createModelPackage(
    params: CreateModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelPackageOutput, Unit]
  ): Request[CreateModelPackageOutput, AWSError] = js.native
  
  /**
    * Creates a model group. A model group contains a group of model versions.
    */
  def createModelPackageGroup(): Request[CreateModelPackageGroupOutput, AWSError] = js.native
  def createModelPackageGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelPackageGroupOutput, Unit]): Request[CreateModelPackageGroupOutput, AWSError] = js.native
  /**
    * Creates a model group. A model group contains a group of model versions.
    */
  def createModelPackageGroup(params: CreateModelPackageGroupInput): Request[CreateModelPackageGroupOutput, AWSError] = js.native
  def createModelPackageGroup(
    params: CreateModelPackageGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelPackageGroupOutput, Unit]
  ): Request[CreateModelPackageGroupOutput, AWSError] = js.native
  
  /**
    * Creates a definition for a job that monitors model quality and drift. For information about model monitor, see Amazon SageMaker Model Monitor.
    */
  def createModelQualityJobDefinition(): Request[CreateModelQualityJobDefinitionResponse, AWSError] = js.native
  def createModelQualityJobDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelQualityJobDefinitionResponse, Unit]
  ): Request[CreateModelQualityJobDefinitionResponse, AWSError] = js.native
  /**
    * Creates a definition for a job that monitors model quality and drift. For information about model monitor, see Amazon SageMaker Model Monitor.
    */
  def createModelQualityJobDefinition(params: CreateModelQualityJobDefinitionRequest): Request[CreateModelQualityJobDefinitionResponse, AWSError] = js.native
  def createModelQualityJobDefinition(
    params: CreateModelQualityJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelQualityJobDefinitionResponse, Unit]
  ): Request[CreateModelQualityJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs to monitor the data captured for an Amazon SageMaker Endoint.
    */
  def createMonitoringSchedule(): Request[CreateMonitoringScheduleResponse, AWSError] = js.native
  def createMonitoringSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreateMonitoringScheduleResponse, Unit]): Request[CreateMonitoringScheduleResponse, AWSError] = js.native
  /**
    * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs to monitor the data captured for an Amazon SageMaker Endoint.
    */
  def createMonitoringSchedule(params: CreateMonitoringScheduleRequest): Request[CreateMonitoringScheduleResponse, AWSError] = js.native
  def createMonitoringSchedule(
    params: CreateMonitoringScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMonitoringScheduleResponse, Unit]
  ): Request[CreateMonitoringScheduleResponse, AWSError] = js.native
  
  /**
    * Creates an SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, SageMaker does the following:   Creates a network interface in the SageMaker VPC.   (Option) If you specified SubnetId, SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the SageMaker VPC. If you specified SubnetId of your VPC, SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, SageMaker returns its Amazon Resource Name (ARN). You can't change the name of a notebook instance after you create it. After SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
    */
  def createNotebookInstance(): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  def createNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceOutput, Unit]): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  /**
    * Creates an SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, SageMaker does the following:   Creates a network interface in the SageMaker VPC.   (Option) If you specified SubnetId, SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the SageMaker VPC. If you specified SubnetId of your VPC, SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, SageMaker returns its Amazon Resource Name (ARN). You can't change the name of a notebook instance after you create it. After SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
    */
  def createNotebookInstance(params: CreateNotebookInstanceInput): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  def createNotebookInstance(
    params: CreateNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceOutput, Unit]
  ): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  
  /**
    * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def createNotebookInstanceLifecycleConfig(): Request[CreateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def createNotebookInstanceLifecycleConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[CreateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle configuration is a collection of shell scripts that run when you create or start a notebook instance. Each lifecycle configuration script has a limit of 16384 characters. The value of the $PATH environment variable that is available to both scripts is /sbin:bin:/usr/sbin:/usr/bin. View CloudWatch Logs for notebook instance lifecycle configurations in log group /aws/sagemaker/NotebookInstances in log stream [notebook-instance-name]/[LifecycleConfigHook]. Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes, it fails and the notebook instance is not created or started. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def createNotebookInstanceLifecycleConfig(params: CreateNotebookInstanceLifecycleConfigInput): Request[CreateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def createNotebookInstanceLifecycleConfig(
    params: CreateNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[CreateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  
  /**
    * Creates a pipeline using a JSON pipeline definition.
    */
  def createPipeline(): Request[CreatePipelineResponse, AWSError] = js.native
  def createPipeline(callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineResponse, Unit]): Request[CreatePipelineResponse, AWSError] = js.native
  /**
    * Creates a pipeline using a JSON pipeline definition.
    */
  def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse, AWSError] = js.native
  def createPipeline(
    params: CreatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineResponse, Unit]
  ): Request[CreatePipelineResponse, AWSError] = js.native
  
  /**
    * Creates a URL for a specified UserProfile in a Domain. When accessed in a web browser, the user will be automatically signed in to Amazon SageMaker Studio, and granted access to all of the Apps and files associated with the Domain's Amazon Elastic File System (EFS) volume. This operation can only be called when the authentication mode equals IAM.  The IAM role or user passed to this API defines the permissions to access the app. Once the presigned URL is created, no additional permission is required to access this URL. IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the app. You can restrict access to this API and to the URL that it returns to a list of IP addresses, Amazon VPCs or Amazon VPC Endpoints that you specify. For more information, see Connect to SageMaker Studio Through an Interface VPC Endpoint .  The URL that you get from a call to CreatePresignedDomainUrl has a default timeout of 5 minutes. You can configure this value using ExpiresInSeconds. If you try to use the URL after the timeout limit expires, you are directed to the Amazon Web Services console sign-in page. 
    */
  def createPresignedDomainUrl(): Request[CreatePresignedDomainUrlResponse, AWSError] = js.native
  def createPresignedDomainUrl(callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedDomainUrlResponse, Unit]): Request[CreatePresignedDomainUrlResponse, AWSError] = js.native
  /**
    * Creates a URL for a specified UserProfile in a Domain. When accessed in a web browser, the user will be automatically signed in to Amazon SageMaker Studio, and granted access to all of the Apps and files associated with the Domain's Amazon Elastic File System (EFS) volume. This operation can only be called when the authentication mode equals IAM.  The IAM role or user passed to this API defines the permissions to access the app. Once the presigned URL is created, no additional permission is required to access this URL. IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the app. You can restrict access to this API and to the URL that it returns to a list of IP addresses, Amazon VPCs or Amazon VPC Endpoints that you specify. For more information, see Connect to SageMaker Studio Through an Interface VPC Endpoint .  The URL that you get from a call to CreatePresignedDomainUrl has a default timeout of 5 minutes. You can configure this value using ExpiresInSeconds. If you try to use the URL after the timeout limit expires, you are directed to the Amazon Web Services console sign-in page. 
    */
  def createPresignedDomainUrl(params: CreatePresignedDomainUrlRequest): Request[CreatePresignedDomainUrlResponse, AWSError] = js.native
  def createPresignedDomainUrl(
    params: CreatePresignedDomainUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedDomainUrlResponse, Unit]
  ): Request[CreatePresignedDomainUrlResponse, AWSError] = js.native
  
  /**
    * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the SageMaker console, when you choose Open next to a notebook instance, SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page.  The IAM role or user used to call this API defines the permissions to access the notebook instance. Once the presigned URL is created, no additional permission is required to access this URL. IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the notebook instance. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.  The URL that you get from a call to CreatePresignedNotebookInstanceUrl is valid only for 5 minutes. If you try to use the URL after the 5-minute limit expires, you are directed to the Amazon Web Services console sign-in page. 
    */
  def createPresignedNotebookInstanceUrl(): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  def createPresignedNotebookInstanceUrl(
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedNotebookInstanceUrlOutput, Unit]
  ): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  /**
    * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the SageMaker console, when you choose Open next to a notebook instance, SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page.  The IAM role or user used to call this API defines the permissions to access the notebook instance. Once the presigned URL is created, no additional permission is required to access this URL. IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the notebook instance. You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.  The URL that you get from a call to CreatePresignedNotebookInstanceUrl is valid only for 5 minutes. If you try to use the URL after the 5-minute limit expires, you are directed to the Amazon Web Services console sign-in page. 
    */
  def createPresignedNotebookInstanceUrl(params: CreatePresignedNotebookInstanceUrlInput): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  def createPresignedNotebookInstanceUrl(
    params: CreatePresignedNotebookInstanceUrlInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedNotebookInstanceUrlOutput, Unit]
  ): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  
  /**
    * Creates a processing job.
    */
  def createProcessingJob(): Request[CreateProcessingJobResponse, AWSError] = js.native
  def createProcessingJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateProcessingJobResponse, Unit]): Request[CreateProcessingJobResponse, AWSError] = js.native
  /**
    * Creates a processing job.
    */
  def createProcessingJob(params: CreateProcessingJobRequest): Request[CreateProcessingJobResponse, AWSError] = js.native
  def createProcessingJob(
    params: CreateProcessingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProcessingJobResponse, Unit]
  ): Request[CreateProcessingJobResponse, AWSError] = js.native
  
  /**
    * Creates a machine learning (ML) project that can contain one or more templates that set up an ML pipeline from training to deploying an approved model.
    */
  def createProject(): Request[CreateProjectOutput, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectOutput, Unit]): Request[CreateProjectOutput, AWSError] = js.native
  /**
    * Creates a machine learning (ML) project that can contain one or more templates that set up an ML pipeline from training to deploying an approved model.
    */
  def createProject(params: CreateProjectInput): Request[CreateProjectOutput, AWSError] = js.native
  def createProject(
    params: CreateProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectOutput, Unit]
  ): Request[CreateProjectOutput, AWSError] = js.native
  
  /**
    * Creates a new Studio Lifecycle Configuration.
    */
  def createStudioLifecycleConfig(): Request[CreateStudioLifecycleConfigResponse, AWSError] = js.native
  def createStudioLifecycleConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateStudioLifecycleConfigResponse, Unit]): Request[CreateStudioLifecycleConfigResponse, AWSError] = js.native
  /**
    * Creates a new Studio Lifecycle Configuration.
    */
  def createStudioLifecycleConfig(params: CreateStudioLifecycleConfigRequest): Request[CreateStudioLifecycleConfigResponse, AWSError] = js.native
  def createStudioLifecycleConfig(
    params: CreateStudioLifecycleConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStudioLifecycleConfigResponse, Unit]
  ): Request[CreateStudioLifecycleConfigResponse, AWSError] = js.native
  
  /**
    * Starts a model training job. After training completes, SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a machine learning service other than SageMaker, provided that you know how to use them for inference.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to enable the estimation of model parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of hyperparameters for each training algorithm provided by SageMaker, see Algorithms.   You must not include any security-sensitive information, such as account access IDs, secrets, and tokens, in the dictionary for configuring hyperparameters. SageMaker rejects the training job request and returns an exception error for detected credentials, if such user input is found.     InputDataConfig - Describes the training dataset and the Amazon S3, EFS, or FSx location where it is stored.    OutputDataConfig - Identifies the Amazon S3 bucket where you want SageMaker to save the results of model training.     ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     EnableManagedSpotTraining - Optimize the cost of training machine learning models by up to 80% by using Amazon EC2 Spot instances. For more information, see Managed Spot Training.     RoleArn - The Amazon Resource Name (ARN) that SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that SageMaker can successfully complete model training.     StoppingCondition - To help cap training costs, use MaxRuntimeInSeconds to set a time limit for training. Use MaxWaitTimeInSeconds to specify how long a managed spot training job has to complete.     Environment - The environment variables to set in the Docker container.    RetryStrategy - The number of times to retry the job when the job fails due to an InternalServerError.    For more information about SageMaker, see How It Works. 
    */
  def createTrainingJob(): Request[CreateTrainingJobResponse, AWSError] = js.native
  def createTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrainingJobResponse, Unit]): Request[CreateTrainingJobResponse, AWSError] = js.native
  /**
    * Starts a model training job. After training completes, SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a machine learning service other than SageMaker, provided that you know how to use them for inference.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to enable the estimation of model parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of hyperparameters for each training algorithm provided by SageMaker, see Algorithms.   You must not include any security-sensitive information, such as account access IDs, secrets, and tokens, in the dictionary for configuring hyperparameters. SageMaker rejects the training job request and returns an exception error for detected credentials, if such user input is found.     InputDataConfig - Describes the training dataset and the Amazon S3, EFS, or FSx location where it is stored.    OutputDataConfig - Identifies the Amazon S3 bucket where you want SageMaker to save the results of model training.     ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     EnableManagedSpotTraining - Optimize the cost of training machine learning models by up to 80% by using Amazon EC2 Spot instances. For more information, see Managed Spot Training.     RoleArn - The Amazon Resource Name (ARN) that SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that SageMaker can successfully complete model training.     StoppingCondition - To help cap training costs, use MaxRuntimeInSeconds to set a time limit for training. Use MaxWaitTimeInSeconds to specify how long a managed spot training job has to complete.     Environment - The environment variables to set in the Docker container.    RetryStrategy - The number of times to retry the job when the job fails due to an InternalServerError.    For more information about SageMaker, see How It Works. 
    */
  def createTrainingJob(params: CreateTrainingJobRequest): Request[CreateTrainingJobResponse, AWSError] = js.native
  def createTrainingJob(
    params: CreateTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrainingJobResponse, Unit]
  ): Request[CreateTrainingJobResponse, AWSError] = js.native
  
  /**
    * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an Amazon Web Services Region in an Amazon Web Services account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same Amazon Web Services Region and Amazon Web Services account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.   For more information about how batch transformation works, see Batch Transform.
    */
  def createTransformJob(): Request[CreateTransformJobResponse, AWSError] = js.native
  def createTransformJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateTransformJobResponse, Unit]): Request[CreateTransformJobResponse, AWSError] = js.native
  /**
    * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an Amazon Web Services Region in an Amazon Web Services account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same Amazon Web Services Region and Amazon Web Services account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.   For more information about how batch transformation works, see Batch Transform.
    */
  def createTransformJob(params: CreateTransformJobRequest): Request[CreateTransformJobResponse, AWSError] = js.native
  def createTransformJob(
    params: CreateTransformJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransformJobResponse, Unit]
  ): Request[CreateTransformJobResponse, AWSError] = js.native
  
  /**
    * Creates an SageMaker trial. A trial is a set of steps called trial components that produce a machine learning model. A trial is part of a single SageMaker experiment. When you use SageMaker Studio or the SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the Amazon Web Services SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to a trial and then use the Search API to search for the tags. To get a list of all your trials, call the ListTrials API. To view a trial's properties, call the DescribeTrial API. To create a trial component, call the CreateTrialComponent API.
    */
  def createTrial(): Request[CreateTrialResponse, AWSError] = js.native
  def createTrial(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrialResponse, Unit]): Request[CreateTrialResponse, AWSError] = js.native
  /**
    * Creates an SageMaker trial. A trial is a set of steps called trial components that produce a machine learning model. A trial is part of a single SageMaker experiment. When you use SageMaker Studio or the SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the Amazon Web Services SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to a trial and then use the Search API to search for the tags. To get a list of all your trials, call the ListTrials API. To view a trial's properties, call the DescribeTrial API. To create a trial component, call the CreateTrialComponent API.
    */
  def createTrial(params: CreateTrialRequest): Request[CreateTrialResponse, AWSError] = js.native
  def createTrial(
    params: CreateTrialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrialResponse, Unit]
  ): Request[CreateTrialResponse, AWSError] = js.native
  
  /**
    * Creates a trial component, which is a stage of a machine learning trial. A trial is composed of one or more trial components. A trial component can be used in multiple trials. Trial components include pre-processing jobs, training jobs, and batch transform jobs. When you use SageMaker Studio or the SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the Amazon Web Services SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to a trial component and then use the Search API to search for the tags.
    */
  def createTrialComponent(): Request[CreateTrialComponentResponse, AWSError] = js.native
  def createTrialComponent(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrialComponentResponse, Unit]): Request[CreateTrialComponentResponse, AWSError] = js.native
  /**
    * Creates a trial component, which is a stage of a machine learning trial. A trial is composed of one or more trial components. A trial component can be used in multiple trials. Trial components include pre-processing jobs, training jobs, and batch transform jobs. When you use SageMaker Studio or the SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the Amazon Web Services SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to a trial component and then use the Search API to search for the tags.
    */
  def createTrialComponent(params: CreateTrialComponentRequest): Request[CreateTrialComponentResponse, AWSError] = js.native
  def createTrialComponent(
    params: CreateTrialComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrialComponentResponse, Unit]
  ): Request[CreateTrialComponentResponse, AWSError] = js.native
  
  /**
    * Creates a user profile. A user profile represents a single user within a domain, and is the main way to reference a "person" for the purposes of sharing, reporting, and other user-oriented features. This entity is created when a user onboards to Amazon SageMaker Studio. If an administrator invites a person by email or imports them from Amazon Web Services SSO, a user profile is automatically created. A user profile is the primary holder of settings for an individual user and has a reference to the user's private Amazon Elastic File System (EFS) home directory. 
    */
  def createUserProfile(): Request[CreateUserProfileResponse, AWSError] = js.native
  def createUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserProfileResponse, Unit]): Request[CreateUserProfileResponse, AWSError] = js.native
  /**
    * Creates a user profile. A user profile represents a single user within a domain, and is the main way to reference a "person" for the purposes of sharing, reporting, and other user-oriented features. This entity is created when a user onboards to Amazon SageMaker Studio. If an administrator invites a person by email or imports them from Amazon Web Services SSO, a user profile is automatically created. A user profile is the primary holder of settings for an individual user and has a reference to the user's private Amazon Elastic File System (EFS) home directory. 
    */
  def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResponse, AWSError] = js.native
  def createUserProfile(
    params: CreateUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserProfileResponse, Unit]
  ): Request[CreateUserProfileResponse, AWSError] = js.native
  
  /**
    * Use this operation to create a workforce. This operation will return an error if a workforce already exists in the Amazon Web Services Region that you specify. You can only create one workforce in each Amazon Web Services Region per Amazon Web Services account. If you want to create a new workforce in an Amazon Web Services Region where a workforce already exists, use the API operation to delete the existing workforce and then use CreateWorkforce to create a new workforce. To create a private workforce using Amazon Cognito, you must specify a Cognito user pool in CognitoConfig. You can also create an Amazon Cognito workforce using the Amazon SageMaker console. For more information, see  Create a Private Workforce (Amazon Cognito). To create a private workforce using your own OIDC Identity Provider (IdP), specify your IdP configuration in OidcConfig. Your OIDC IdP must support groups because groups are used by Ground Truth and Amazon A2I to create work teams. For more information, see  Create a Private Workforce (OIDC IdP).
    */
  def createWorkforce(): Request[CreateWorkforceResponse, AWSError] = js.native
  def createWorkforce(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkforceResponse, Unit]): Request[CreateWorkforceResponse, AWSError] = js.native
  /**
    * Use this operation to create a workforce. This operation will return an error if a workforce already exists in the Amazon Web Services Region that you specify. You can only create one workforce in each Amazon Web Services Region per Amazon Web Services account. If you want to create a new workforce in an Amazon Web Services Region where a workforce already exists, use the API operation to delete the existing workforce and then use CreateWorkforce to create a new workforce. To create a private workforce using Amazon Cognito, you must specify a Cognito user pool in CognitoConfig. You can also create an Amazon Cognito workforce using the Amazon SageMaker console. For more information, see  Create a Private Workforce (Amazon Cognito). To create a private workforce using your own OIDC Identity Provider (IdP), specify your IdP configuration in OidcConfig. Your OIDC IdP must support groups because groups are used by Ground Truth and Amazon A2I to create work teams. For more information, see  Create a Private Workforce (OIDC IdP).
    */
  def createWorkforce(params: CreateWorkforceRequest): Request[CreateWorkforceResponse, AWSError] = js.native
  def createWorkforce(
    params: CreateWorkforceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkforceResponse, Unit]
  ): Request[CreateWorkforceResponse, AWSError] = js.native
  
  /**
    * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
    */
  def createWorkteam(): Request[CreateWorkteamResponse, AWSError] = js.native
  def createWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkteamResponse, Unit]): Request[CreateWorkteamResponse, AWSError] = js.native
  /**
    * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools. You must first create the user pools before you can create a work team. You cannot create more than 25 work teams in an account and region.
    */
  def createWorkteam(params: CreateWorkteamRequest): Request[CreateWorkteamResponse, AWSError] = js.native
  def createWorkteam(
    params: CreateWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkteamResponse, Unit]
  ): Request[CreateWorkteamResponse, AWSError] = js.native
  
  /**
    * Deletes an action.
    */
  def deleteAction(): Request[DeleteActionResponse, AWSError] = js.native
  def deleteAction(callback: js.Function2[/* err */ AWSError, /* data */ DeleteActionResponse, Unit]): Request[DeleteActionResponse, AWSError] = js.native
  /**
    * Deletes an action.
    */
  def deleteAction(params: DeleteActionRequest): Request[DeleteActionResponse, AWSError] = js.native
  def deleteAction(
    params: DeleteActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteActionResponse, Unit]
  ): Request[DeleteActionResponse, AWSError] = js.native
  
  /**
    * Removes the specified algorithm from your account.
    */
  def deleteAlgorithm(): Request[js.Object, AWSError] = js.native
  def deleteAlgorithm(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified algorithm from your account.
    */
  def deleteAlgorithm(params: DeleteAlgorithmInput): Request[js.Object, AWSError] = js.native
  def deleteAlgorithm(
    params: DeleteAlgorithmInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Used to stop and delete an app.
    */
  def deleteApp(): Request[js.Object, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Used to stop and delete an app.
    */
  def deleteApp(params: DeleteAppRequest): Request[js.Object, AWSError] = js.native
  def deleteApp(params: DeleteAppRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an AppImageConfig.
    */
  def deleteAppImageConfig(): Request[js.Object, AWSError] = js.native
  def deleteAppImageConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an AppImageConfig.
    */
  def deleteAppImageConfig(params: DeleteAppImageConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteAppImageConfig(
    params: DeleteAppImageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an artifact. Either ArtifactArn or Source must be specified.
    */
  def deleteArtifact(): Request[DeleteArtifactResponse, AWSError] = js.native
  def deleteArtifact(callback: js.Function2[/* err */ AWSError, /* data */ DeleteArtifactResponse, Unit]): Request[DeleteArtifactResponse, AWSError] = js.native
  /**
    * Deletes an artifact. Either ArtifactArn or Source must be specified.
    */
  def deleteArtifact(params: DeleteArtifactRequest): Request[DeleteArtifactResponse, AWSError] = js.native
  def deleteArtifact(
    params: DeleteArtifactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteArtifactResponse, Unit]
  ): Request[DeleteArtifactResponse, AWSError] = js.native
  
  /**
    * Deletes an association.
    */
  def deleteAssociation(): Request[DeleteAssociationResponse, AWSError] = js.native
  def deleteAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssociationResponse, Unit]): Request[DeleteAssociationResponse, AWSError] = js.native
  /**
    * Deletes an association.
    */
  def deleteAssociation(params: DeleteAssociationRequest): Request[DeleteAssociationResponse, AWSError] = js.native
  def deleteAssociation(
    params: DeleteAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssociationResponse, Unit]
  ): Request[DeleteAssociationResponse, AWSError] = js.native
  
  /**
    * Deletes the specified Git repository from your account.
    */
  def deleteCodeRepository(): Request[js.Object, AWSError] = js.native
  def deleteCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Git repository from your account.
    */
  def deleteCodeRepository(params: DeleteCodeRepositoryInput): Request[js.Object, AWSError] = js.native
  def deleteCodeRepository(
    params: DeleteCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an context.
    */
  def deleteContext(): Request[DeleteContextResponse, AWSError] = js.native
  def deleteContext(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContextResponse, Unit]): Request[DeleteContextResponse, AWSError] = js.native
  /**
    * Deletes an context.
    */
  def deleteContext(params: DeleteContextRequest): Request[DeleteContextResponse, AWSError] = js.native
  def deleteContext(
    params: DeleteContextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContextResponse, Unit]
  ): Request[DeleteContextResponse, AWSError] = js.native
  
  /**
    * Deletes a data quality monitoring job definition.
    */
  def deleteDataQualityJobDefinition(): Request[js.Object, AWSError] = js.native
  def deleteDataQualityJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a data quality monitoring job definition.
    */
  def deleteDataQualityJobDefinition(params: DeleteDataQualityJobDefinitionRequest): Request[js.Object, AWSError] = js.native
  def deleteDataQualityJobDefinition(
    params: DeleteDataQualityJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a fleet.
    */
  def deleteDeviceFleet(): Request[js.Object, AWSError] = js.native
  def deleteDeviceFleet(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a fleet.
    */
  def deleteDeviceFleet(params: DeleteDeviceFleetRequest): Request[js.Object, AWSError] = js.native
  def deleteDeviceFleet(
    params: DeleteDeviceFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Used to delete a domain. If you onboarded with IAM mode, you will need to delete your domain to onboard again using Amazon Web Services SSO. Use with caution. All of the members of the domain will lose access to their EFS volume, including data, notebooks, and other artifacts. 
    */
  def deleteDomain(): Request[js.Object, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Used to delete a domain. If you onboarded with IAM mode, you will need to delete your domain to onboard again using Amazon Web Services SSO. Use with caution. All of the members of the domain will lose access to their EFS volume, including data, notebooks, and other artifacts. 
    */
  def deleteDomain(params: DeleteDomainRequest): Request[js.Object, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an edge deployment plan if (and only if) all the stages in the plan are inactive or there are no stages in the plan.
    */
  def deleteEdgeDeploymentPlan(): Request[js.Object, AWSError] = js.native
  def deleteEdgeDeploymentPlan(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an edge deployment plan if (and only if) all the stages in the plan are inactive or there are no stages in the plan.
    */
  def deleteEdgeDeploymentPlan(params: DeleteEdgeDeploymentPlanRequest): Request[js.Object, AWSError] = js.native
  def deleteEdgeDeploymentPlan(
    params: DeleteEdgeDeploymentPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete a stage in an edge deployment plan if (and only if) the stage is inactive.
    */
  def deleteEdgeDeploymentStage(): Request[js.Object, AWSError] = js.native
  def deleteEdgeDeploymentStage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a stage in an edge deployment plan if (and only if) the stage is inactive.
    */
  def deleteEdgeDeploymentStage(params: DeleteEdgeDeploymentStageRequest): Request[js.Object, AWSError] = js.native
  def deleteEdgeDeploymentStage(
    params: DeleteEdgeDeploymentStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an endpoint. SageMaker frees up all of the resources that were deployed when the endpoint was created.  SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call. When you delete your endpoint, SageMaker asynchronously deletes associated endpoint resources such as KMS key grants. You might still see these resources in your account for a few minutes after deleting your endpoint. Do not delete or revoke the permissions for your  ExecutionRoleArn , otherwise SageMaker cannot delete these resources.
    */
  def deleteEndpoint(): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint. SageMaker frees up all of the resources that were deployed when the endpoint was created.  SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call. When you delete your endpoint, SageMaker asynchronously deletes associated endpoint resources such as KMS key grants. You might still see these resources in your account for a few minutes after deleting your endpoint. Do not delete or revoke the permissions for your  ExecutionRoleArn , otherwise SageMaker cannot delete these resources.
    */
  def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration.  You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. If you delete the EndpointConfig of an endpoint that is active or being created or updated you may lose visibility into the instance type the endpoint is using. The endpoint must be deleted in order to stop incurring charges.
    */
  def deleteEndpointConfig(): Request[js.Object, AWSError] = js.native
  def deleteEndpointConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration.  You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. If you delete the EndpointConfig of an endpoint that is active or being created or updated you may lose visibility into the instance type the endpoint is using. The endpoint must be deleted in order to stop incurring charges.
    */
  def deleteEndpointConfig(params: DeleteEndpointConfigInput): Request[js.Object, AWSError] = js.native
  def deleteEndpointConfig(
    params: DeleteEndpointConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an SageMaker experiment. All trials associated with the experiment must be deleted first. Use the ListTrials API to get a list of the trials associated with the experiment.
    */
  def deleteExperiment(): Request[DeleteExperimentResponse, AWSError] = js.native
  def deleteExperiment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperimentResponse, Unit]): Request[DeleteExperimentResponse, AWSError] = js.native
  /**
    * Deletes an SageMaker experiment. All trials associated with the experiment must be deleted first. Use the ListTrials API to get a list of the trials associated with the experiment.
    */
  def deleteExperiment(params: DeleteExperimentRequest): Request[DeleteExperimentResponse, AWSError] = js.native
  def deleteExperiment(
    params: DeleteExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperimentResponse, Unit]
  ): Request[DeleteExperimentResponse, AWSError] = js.native
  
  /**
    * Delete the FeatureGroup and any data that was written to the OnlineStore of the FeatureGroup. Data cannot be accessed from the OnlineStore immediately after DeleteFeatureGroup is called.  Data written into the OfflineStore will not be deleted. The Amazon Web Services Glue database and tables that are automatically created for your OfflineStore are not deleted. 
    */
  def deleteFeatureGroup(): Request[js.Object, AWSError] = js.native
  def deleteFeatureGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete the FeatureGroup and any data that was written to the OnlineStore of the FeatureGroup. Data cannot be accessed from the OnlineStore immediately after DeleteFeatureGroup is called.  Data written into the OfflineStore will not be deleted. The Amazon Web Services Glue database and tables that are automatically created for your OfflineStore are not deleted. 
    */
  def deleteFeatureGroup(params: DeleteFeatureGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteFeatureGroup(
    params: DeleteFeatureGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified flow definition.
    */
  def deleteFlowDefinition(): Request[DeleteFlowDefinitionResponse, AWSError] = js.native
  def deleteFlowDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowDefinitionResponse, Unit]): Request[DeleteFlowDefinitionResponse, AWSError] = js.native
  /**
    * Deletes the specified flow definition.
    */
  def deleteFlowDefinition(params: DeleteFlowDefinitionRequest): Request[DeleteFlowDefinitionResponse, AWSError] = js.native
  def deleteFlowDefinition(
    params: DeleteFlowDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowDefinitionResponse, Unit]
  ): Request[DeleteFlowDefinitionResponse, AWSError] = js.native
  
  /**
    * Use this operation to delete a human task user interface (worker task template).  To see a list of human task user interfaces (work task templates) in your account, use . When you delete a worker task template, it no longer appears when you call ListHumanTaskUis.
    */
  def deleteHumanTaskUi(): Request[DeleteHumanTaskUiResponse, AWSError] = js.native
  def deleteHumanTaskUi(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHumanTaskUiResponse, Unit]): Request[DeleteHumanTaskUiResponse, AWSError] = js.native
  /**
    * Use this operation to delete a human task user interface (worker task template).  To see a list of human task user interfaces (work task templates) in your account, use . When you delete a worker task template, it no longer appears when you call ListHumanTaskUis.
    */
  def deleteHumanTaskUi(params: DeleteHumanTaskUiRequest): Request[DeleteHumanTaskUiResponse, AWSError] = js.native
  def deleteHumanTaskUi(
    params: DeleteHumanTaskUiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHumanTaskUiResponse, Unit]
  ): Request[DeleteHumanTaskUiResponse, AWSError] = js.native
  
  /**
    * Deletes a SageMaker image and all versions of the image. The container images aren't deleted.
    */
  def deleteImage(): Request[DeleteImageResponse, AWSError] = js.native
  def deleteImage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageResponse, Unit]): Request[DeleteImageResponse, AWSError] = js.native
  /**
    * Deletes a SageMaker image and all versions of the image. The container images aren't deleted.
    */
  def deleteImage(params: DeleteImageRequest): Request[DeleteImageResponse, AWSError] = js.native
  def deleteImage(
    params: DeleteImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageResponse, Unit]
  ): Request[DeleteImageResponse, AWSError] = js.native
  
  /**
    * Deletes a version of a SageMaker image. The container image the version represents isn't deleted.
    */
  def deleteImageVersion(): Request[DeleteImageVersionResponse, AWSError] = js.native
  def deleteImageVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageVersionResponse, Unit]): Request[DeleteImageVersionResponse, AWSError] = js.native
  /**
    * Deletes a version of a SageMaker image. The container image the version represents isn't deleted.
    */
  def deleteImageVersion(params: DeleteImageVersionRequest): Request[DeleteImageVersionResponse, AWSError] = js.native
  def deleteImageVersion(
    params: DeleteImageVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageVersionResponse, Unit]
  ): Request[DeleteImageVersionResponse, AWSError] = js.native
  
  /**
    * Deletes a model. The DeleteModel API deletes only the model entry that was created in SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
    */
  def deleteModel(): Request[js.Object, AWSError] = js.native
  def deleteModel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model. The DeleteModel API deletes only the model entry that was created in SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
    */
  def deleteModel(params: DeleteModelInput): Request[js.Object, AWSError] = js.native
  def deleteModel(params: DeleteModelInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Amazon SageMaker model bias job definition.
    */
  def deleteModelBiasJobDefinition(): Request[js.Object, AWSError] = js.native
  def deleteModelBiasJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon SageMaker model bias job definition.
    */
  def deleteModelBiasJobDefinition(params: DeleteModelBiasJobDefinitionRequest): Request[js.Object, AWSError] = js.native
  def deleteModelBiasJobDefinition(
    params: DeleteModelBiasJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Amazon SageMaker model explainability job definition.
    */
  def deleteModelExplainabilityJobDefinition(): Request[js.Object, AWSError] = js.native
  def deleteModelExplainabilityJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon SageMaker model explainability job definition.
    */
  def deleteModelExplainabilityJobDefinition(params: DeleteModelExplainabilityJobDefinitionRequest): Request[js.Object, AWSError] = js.native
  def deleteModelExplainabilityJobDefinition(
    params: DeleteModelExplainabilityJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a model package. A model package is used to create SageMaker models or list on Amazon Web Services Marketplace. Buyers can subscribe to model packages listed on Amazon Web Services Marketplace to create models in SageMaker.
    */
  def deleteModelPackage(): Request[js.Object, AWSError] = js.native
  def deleteModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model package. A model package is used to create SageMaker models or list on Amazon Web Services Marketplace. Buyers can subscribe to model packages listed on Amazon Web Services Marketplace to create models in SageMaker.
    */
  def deleteModelPackage(params: DeleteModelPackageInput): Request[js.Object, AWSError] = js.native
  def deleteModelPackage(
    params: DeleteModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified model group.
    */
  def deleteModelPackageGroup(): Request[js.Object, AWSError] = js.native
  def deleteModelPackageGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified model group.
    */
  def deleteModelPackageGroup(params: DeleteModelPackageGroupInput): Request[js.Object, AWSError] = js.native
  def deleteModelPackageGroup(
    params: DeleteModelPackageGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a model group resource policy.
    */
  def deleteModelPackageGroupPolicy(): Request[js.Object, AWSError] = js.native
  def deleteModelPackageGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model group resource policy.
    */
  def deleteModelPackageGroupPolicy(params: DeleteModelPackageGroupPolicyInput): Request[js.Object, AWSError] = js.native
  def deleteModelPackageGroupPolicy(
    params: DeleteModelPackageGroupPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the secified model quality monitoring job definition.
    */
  def deleteModelQualityJobDefinition(): Request[js.Object, AWSError] = js.native
  def deleteModelQualityJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the secified model quality monitoring job definition.
    */
  def deleteModelQualityJobDefinition(params: DeleteModelQualityJobDefinitionRequest): Request[js.Object, AWSError] = js.native
  def deleteModelQualityJobDefinition(
    params: DeleteModelQualityJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a monitoring schedule. Also stops the schedule had not already been stopped. This does not delete the job execution history of the monitoring schedule. 
    */
  def deleteMonitoringSchedule(): Request[js.Object, AWSError] = js.native
  def deleteMonitoringSchedule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a monitoring schedule. Also stops the schedule had not already been stopped. This does not delete the job execution history of the monitoring schedule. 
    */
  def deleteMonitoringSchedule(params: DeleteMonitoringScheduleRequest): Request[js.Object, AWSError] = js.native
  def deleteMonitoringSchedule(
    params: DeleteMonitoringScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Deletes an SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
    */
  def deleteNotebookInstance(): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes an SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
    */
  def deleteNotebookInstance(params: DeleteNotebookInstanceInput): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstance(
    params: DeleteNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a notebook instance lifecycle configuration.
    */
  def deleteNotebookInstanceLifecycleConfig(): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstanceLifecycleConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a notebook instance lifecycle configuration.
    */
  def deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstanceLifecycleConfig(
    params: DeleteNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a pipeline if there are no running instances of the pipeline. To delete a pipeline, you must stop all running instances of the pipeline using the StopPipelineExecution API. When you delete a pipeline, all instances of the pipeline are deleted.
    */
  def deletePipeline(): Request[DeletePipelineResponse, AWSError] = js.native
  def deletePipeline(callback: js.Function2[/* err */ AWSError, /* data */ DeletePipelineResponse, Unit]): Request[DeletePipelineResponse, AWSError] = js.native
  /**
    * Deletes a pipeline if there are no running instances of the pipeline. To delete a pipeline, you must stop all running instances of the pipeline using the StopPipelineExecution API. When you delete a pipeline, all instances of the pipeline are deleted.
    */
  def deletePipeline(params: DeletePipelineRequest): Request[DeletePipelineResponse, AWSError] = js.native
  def deletePipeline(
    params: DeletePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePipelineResponse, Unit]
  ): Request[DeletePipelineResponse, AWSError] = js.native
  
  /**
    * Delete the specified project.
    */
  def deleteProject(): Request[js.Object, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete the specified project.
    */
  def deleteProject(params: DeleteProjectInput): Request[js.Object, AWSError] = js.native
  def deleteProject(params: DeleteProjectInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the Studio Lifecycle Configuration. In order to delete the Lifecycle Configuration, there must be no running apps using the Lifecycle Configuration. You must also remove the Lifecycle Configuration from UserSettings in all Domains and UserProfiles.
    */
  def deleteStudioLifecycleConfig(): Request[js.Object, AWSError] = js.native
  def deleteStudioLifecycleConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the Studio Lifecycle Configuration. In order to delete the Lifecycle Configuration, there must be no running apps using the Lifecycle Configuration. You must also remove the Lifecycle Configuration from UserSettings in all Domains and UserProfiles.
    */
  def deleteStudioLifecycleConfig(params: DeleteStudioLifecycleConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteStudioLifecycleConfig(
    params: DeleteStudioLifecycleConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified tags from an SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API.   When you call this API to delete tags from a SageMaker Studio Domain or User Profile, the deleted tags are not removed from Apps that the SageMaker Studio Domain or User Profile launched before you called this API. 
    */
  def deleteTags(): Request[DeleteTagsOutput, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsOutput, Unit]): Request[DeleteTagsOutput, AWSError] = js.native
  /**
    * Deletes the specified tags from an SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API.   When you call this API to delete tags from a SageMaker Studio Domain or User Profile, the deleted tags are not removed from Apps that the SageMaker Studio Domain or User Profile launched before you called this API. 
    */
  def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput, AWSError] = js.native
  def deleteTags(
    params: DeleteTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsOutput, Unit]
  ): Request[DeleteTagsOutput, AWSError] = js.native
  
  /**
    * Deletes the specified trial. All trial components that make up the trial must be deleted first. Use the DescribeTrialComponent API to get the list of trial components.
    */
  def deleteTrial(): Request[DeleteTrialResponse, AWSError] = js.native
  def deleteTrial(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrialResponse, Unit]): Request[DeleteTrialResponse, AWSError] = js.native
  /**
    * Deletes the specified trial. All trial components that make up the trial must be deleted first. Use the DescribeTrialComponent API to get the list of trial components.
    */
  def deleteTrial(params: DeleteTrialRequest): Request[DeleteTrialResponse, AWSError] = js.native
  def deleteTrial(
    params: DeleteTrialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrialResponse, Unit]
  ): Request[DeleteTrialResponse, AWSError] = js.native
  
  /**
    * Deletes the specified trial component. A trial component must be disassociated from all trials before the trial component can be deleted. To disassociate a trial component from a trial, call the DisassociateTrialComponent API.
    */
  def deleteTrialComponent(): Request[DeleteTrialComponentResponse, AWSError] = js.native
  def deleteTrialComponent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrialComponentResponse, Unit]): Request[DeleteTrialComponentResponse, AWSError] = js.native
  /**
    * Deletes the specified trial component. A trial component must be disassociated from all trials before the trial component can be deleted. To disassociate a trial component from a trial, call the DisassociateTrialComponent API.
    */
  def deleteTrialComponent(params: DeleteTrialComponentRequest): Request[DeleteTrialComponentResponse, AWSError] = js.native
  def deleteTrialComponent(
    params: DeleteTrialComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrialComponentResponse, Unit]
  ): Request[DeleteTrialComponentResponse, AWSError] = js.native
  
  /**
    * Deletes a user profile. When a user profile is deleted, the user loses access to their EFS volume, including data, notebooks, and other artifacts.
    */
  def deleteUserProfile(): Request[js.Object, AWSError] = js.native
  def deleteUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user profile. When a user profile is deleted, the user loses access to their EFS volume, including data, notebooks, and other artifacts.
    */
  def deleteUserProfile(params: DeleteUserProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteUserProfile(
    params: DeleteUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Use this operation to delete a workforce. If you want to create a new workforce in an Amazon Web Services Region where a workforce already exists, use this operation to delete the existing workforce and then use to create a new workforce.  If a private workforce contains one or more work teams, you must use the operation to delete all work teams before you delete the workforce. If you try to delete a workforce that contains one or more work teams, you will recieve a ResourceInUse error. 
    */
  def deleteWorkforce(): Request[DeleteWorkforceResponse, AWSError] = js.native
  def deleteWorkforce(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkforceResponse, Unit]): Request[DeleteWorkforceResponse, AWSError] = js.native
  /**
    * Use this operation to delete a workforce. If you want to create a new workforce in an Amazon Web Services Region where a workforce already exists, use this operation to delete the existing workforce and then use to create a new workforce.  If a private workforce contains one or more work teams, you must use the operation to delete all work teams before you delete the workforce. If you try to delete a workforce that contains one or more work teams, you will recieve a ResourceInUse error. 
    */
  def deleteWorkforce(params: DeleteWorkforceRequest): Request[DeleteWorkforceResponse, AWSError] = js.native
  def deleteWorkforce(
    params: DeleteWorkforceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkforceResponse, Unit]
  ): Request[DeleteWorkforceResponse, AWSError] = js.native
  
  /**
    * Deletes an existing work team. This operation can't be undone.
    */
  def deleteWorkteam(): Request[DeleteWorkteamResponse, AWSError] = js.native
  def deleteWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkteamResponse, Unit]): Request[DeleteWorkteamResponse, AWSError] = js.native
  /**
    * Deletes an existing work team. This operation can't be undone.
    */
  def deleteWorkteam(params: DeleteWorkteamRequest): Request[DeleteWorkteamResponse, AWSError] = js.native
  def deleteWorkteam(
    params: DeleteWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkteamResponse, Unit]
  ): Request[DeleteWorkteamResponse, AWSError] = js.native
  
  /**
    * Deregisters the specified devices. After you deregister a device, you will need to re-register the devices.
    */
  def deregisterDevices(): Request[js.Object, AWSError] = js.native
  def deregisterDevices(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters the specified devices. After you deregister a device, you will need to re-register the devices.
    */
  def deregisterDevices(params: DeregisterDevicesRequest): Request[js.Object, AWSError] = js.native
  def deregisterDevices(
    params: DeregisterDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes an action.
    */
  def describeAction(): Request[DescribeActionResponse, AWSError] = js.native
  def describeAction(callback: js.Function2[/* err */ AWSError, /* data */ DescribeActionResponse, Unit]): Request[DescribeActionResponse, AWSError] = js.native
  /**
    * Describes an action.
    */
  def describeAction(params: DescribeActionRequest): Request[DescribeActionResponse, AWSError] = js.native
  def describeAction(
    params: DescribeActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeActionResponse, Unit]
  ): Request[DescribeActionResponse, AWSError] = js.native
  
  /**
    * Returns a description of the specified algorithm that is in your account.
    */
  def describeAlgorithm(): Request[DescribeAlgorithmOutput, AWSError] = js.native
  def describeAlgorithm(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlgorithmOutput, Unit]): Request[DescribeAlgorithmOutput, AWSError] = js.native
  /**
    * Returns a description of the specified algorithm that is in your account.
    */
  def describeAlgorithm(params: DescribeAlgorithmInput): Request[DescribeAlgorithmOutput, AWSError] = js.native
  def describeAlgorithm(
    params: DescribeAlgorithmInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlgorithmOutput, Unit]
  ): Request[DescribeAlgorithmOutput, AWSError] = js.native
  
  /**
    * Describes the app.
    */
  def describeApp(): Request[DescribeAppResponse, AWSError] = js.native
  def describeApp(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppResponse, Unit]): Request[DescribeAppResponse, AWSError] = js.native
  /**
    * Describes the app.
    */
  def describeApp(params: DescribeAppRequest): Request[DescribeAppResponse, AWSError] = js.native
  def describeApp(
    params: DescribeAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppResponse, Unit]
  ): Request[DescribeAppResponse, AWSError] = js.native
  
  /**
    * Describes an AppImageConfig.
    */
  def describeAppImageConfig(): Request[DescribeAppImageConfigResponse, AWSError] = js.native
  def describeAppImageConfig(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppImageConfigResponse, Unit]): Request[DescribeAppImageConfigResponse, AWSError] = js.native
  /**
    * Describes an AppImageConfig.
    */
  def describeAppImageConfig(params: DescribeAppImageConfigRequest): Request[DescribeAppImageConfigResponse, AWSError] = js.native
  def describeAppImageConfig(
    params: DescribeAppImageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppImageConfigResponse, Unit]
  ): Request[DescribeAppImageConfigResponse, AWSError] = js.native
  
  /**
    * Describes an artifact.
    */
  def describeArtifact(): Request[DescribeArtifactResponse, AWSError] = js.native
  def describeArtifact(callback: js.Function2[/* err */ AWSError, /* data */ DescribeArtifactResponse, Unit]): Request[DescribeArtifactResponse, AWSError] = js.native
  /**
    * Describes an artifact.
    */
  def describeArtifact(params: DescribeArtifactRequest): Request[DescribeArtifactResponse, AWSError] = js.native
  def describeArtifact(
    params: DescribeArtifactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeArtifactResponse, Unit]
  ): Request[DescribeArtifactResponse, AWSError] = js.native
  
  /**
    * Returns information about an Amazon SageMaker AutoML job.
    */
  def describeAutoMLJob(): Request[DescribeAutoMLJobResponse, AWSError] = js.native
  def describeAutoMLJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutoMLJobResponse, Unit]): Request[DescribeAutoMLJobResponse, AWSError] = js.native
  /**
    * Returns information about an Amazon SageMaker AutoML job.
    */
  def describeAutoMLJob(params: DescribeAutoMLJobRequest): Request[DescribeAutoMLJobResponse, AWSError] = js.native
  def describeAutoMLJob(
    params: DescribeAutoMLJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutoMLJobResponse, Unit]
  ): Request[DescribeAutoMLJobResponse, AWSError] = js.native
  
  /**
    * Gets details about the specified Git repository.
    */
  def describeCodeRepository(): Request[DescribeCodeRepositoryOutput, AWSError] = js.native
  def describeCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeRepositoryOutput, Unit]): Request[DescribeCodeRepositoryOutput, AWSError] = js.native
  /**
    * Gets details about the specified Git repository.
    */
  def describeCodeRepository(params: DescribeCodeRepositoryInput): Request[DescribeCodeRepositoryOutput, AWSError] = js.native
  def describeCodeRepository(
    params: DescribeCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeRepositoryOutput, Unit]
  ): Request[DescribeCodeRepositoryOutput, AWSError] = js.native
  
  /**
    * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def describeCompilationJob(): Request[DescribeCompilationJobResponse, AWSError] = js.native
  def describeCompilationJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCompilationJobResponse, Unit]): Request[DescribeCompilationJobResponse, AWSError] = js.native
  /**
    * Returns information about a model compilation job. To create a model compilation job, use CreateCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def describeCompilationJob(params: DescribeCompilationJobRequest): Request[DescribeCompilationJobResponse, AWSError] = js.native
  def describeCompilationJob(
    params: DescribeCompilationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCompilationJobResponse, Unit]
  ): Request[DescribeCompilationJobResponse, AWSError] = js.native
  
  /**
    * Describes a context.
    */
  def describeContext(): Request[DescribeContextResponse, AWSError] = js.native
  def describeContext(callback: js.Function2[/* err */ AWSError, /* data */ DescribeContextResponse, Unit]): Request[DescribeContextResponse, AWSError] = js.native
  /**
    * Describes a context.
    */
  def describeContext(params: DescribeContextRequest): Request[DescribeContextResponse, AWSError] = js.native
  def describeContext(
    params: DescribeContextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContextResponse, Unit]
  ): Request[DescribeContextResponse, AWSError] = js.native
  
  /**
    * Gets the details of a data quality monitoring job definition.
    */
  def describeDataQualityJobDefinition(): Request[DescribeDataQualityJobDefinitionResponse, AWSError] = js.native
  def describeDataQualityJobDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataQualityJobDefinitionResponse, Unit]
  ): Request[DescribeDataQualityJobDefinitionResponse, AWSError] = js.native
  /**
    * Gets the details of a data quality monitoring job definition.
    */
  def describeDataQualityJobDefinition(params: DescribeDataQualityJobDefinitionRequest): Request[DescribeDataQualityJobDefinitionResponse, AWSError] = js.native
  def describeDataQualityJobDefinition(
    params: DescribeDataQualityJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataQualityJobDefinitionResponse, Unit]
  ): Request[DescribeDataQualityJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Describes the device.
    */
  def describeDevice(): Request[DescribeDeviceResponse, AWSError] = js.native
  def describeDevice(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceResponse, Unit]): Request[DescribeDeviceResponse, AWSError] = js.native
  /**
    * Describes the device.
    */
  def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse, AWSError] = js.native
  def describeDevice(
    params: DescribeDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceResponse, Unit]
  ): Request[DescribeDeviceResponse, AWSError] = js.native
  
  /**
    * A description of the fleet the device belongs to.
    */
  def describeDeviceFleet(): Request[DescribeDeviceFleetResponse, AWSError] = js.native
  def describeDeviceFleet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceFleetResponse, Unit]): Request[DescribeDeviceFleetResponse, AWSError] = js.native
  /**
    * A description of the fleet the device belongs to.
    */
  def describeDeviceFleet(params: DescribeDeviceFleetRequest): Request[DescribeDeviceFleetResponse, AWSError] = js.native
  def describeDeviceFleet(
    params: DescribeDeviceFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceFleetResponse, Unit]
  ): Request[DescribeDeviceFleetResponse, AWSError] = js.native
  
  /**
    * The description of the domain.
    */
  def describeDomain(): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]): Request[DescribeDomainResponse, AWSError] = js.native
  /**
    * The description of the domain.
    */
  def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(
    params: DescribeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]
  ): Request[DescribeDomainResponse, AWSError] = js.native
  
  /**
    * Describes an edge deployment plan with deployment status per stage.
    */
  def describeEdgeDeploymentPlan(): Request[DescribeEdgeDeploymentPlanResponse, AWSError] = js.native
  def describeEdgeDeploymentPlan(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEdgeDeploymentPlanResponse, Unit]): Request[DescribeEdgeDeploymentPlanResponse, AWSError] = js.native
  /**
    * Describes an edge deployment plan with deployment status per stage.
    */
  def describeEdgeDeploymentPlan(params: DescribeEdgeDeploymentPlanRequest): Request[DescribeEdgeDeploymentPlanResponse, AWSError] = js.native
  def describeEdgeDeploymentPlan(
    params: DescribeEdgeDeploymentPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEdgeDeploymentPlanResponse, Unit]
  ): Request[DescribeEdgeDeploymentPlanResponse, AWSError] = js.native
  
  /**
    * A description of edge packaging jobs.
    */
  def describeEdgePackagingJob(): Request[DescribeEdgePackagingJobResponse, AWSError] = js.native
  def describeEdgePackagingJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEdgePackagingJobResponse, Unit]): Request[DescribeEdgePackagingJobResponse, AWSError] = js.native
  /**
    * A description of edge packaging jobs.
    */
  def describeEdgePackagingJob(params: DescribeEdgePackagingJobRequest): Request[DescribeEdgePackagingJobResponse, AWSError] = js.native
  def describeEdgePackagingJob(
    params: DescribeEdgePackagingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEdgePackagingJobResponse, Unit]
  ): Request[DescribeEdgePackagingJobResponse, AWSError] = js.native
  
  /**
    * Returns the description of an endpoint.
    */
  def describeEndpoint(): Request[DescribeEndpointOutput, AWSError] = js.native
  def describeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Returns the description of an endpoint.
    */
  def describeEndpoint(params: DescribeEndpointInput): Request[DescribeEndpointOutput, AWSError] = js.native
  def describeEndpoint(
    params: DescribeEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  
  /**
    * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
    */
  def describeEndpointConfig(): Request[DescribeEndpointConfigOutput, AWSError] = js.native
  def describeEndpointConfig(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointConfigOutput, Unit]): Request[DescribeEndpointConfigOutput, AWSError] = js.native
  /**
    * Returns the description of an endpoint configuration created using the CreateEndpointConfig API.
    */
  def describeEndpointConfig(params: DescribeEndpointConfigInput): Request[DescribeEndpointConfigOutput, AWSError] = js.native
  def describeEndpointConfig(
    params: DescribeEndpointConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointConfigOutput, Unit]
  ): Request[DescribeEndpointConfigOutput, AWSError] = js.native
  
  /**
    * Provides a list of an experiment's properties.
    */
  def describeExperiment(): Request[DescribeExperimentResponse, AWSError] = js.native
  def describeExperiment(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExperimentResponse, Unit]): Request[DescribeExperimentResponse, AWSError] = js.native
  /**
    * Provides a list of an experiment's properties.
    */
  def describeExperiment(params: DescribeExperimentRequest): Request[DescribeExperimentResponse, AWSError] = js.native
  def describeExperiment(
    params: DescribeExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExperimentResponse, Unit]
  ): Request[DescribeExperimentResponse, AWSError] = js.native
  
  /**
    * Use this operation to describe a FeatureGroup. The response includes information on the creation time, FeatureGroup name, the unique identifier for each FeatureGroup, and more.
    */
  def describeFeatureGroup(): Request[DescribeFeatureGroupResponse, AWSError] = js.native
  def describeFeatureGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFeatureGroupResponse, Unit]): Request[DescribeFeatureGroupResponse, AWSError] = js.native
  /**
    * Use this operation to describe a FeatureGroup. The response includes information on the creation time, FeatureGroup name, the unique identifier for each FeatureGroup, and more.
    */
  def describeFeatureGroup(params: DescribeFeatureGroupRequest): Request[DescribeFeatureGroupResponse, AWSError] = js.native
  def describeFeatureGroup(
    params: DescribeFeatureGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFeatureGroupResponse, Unit]
  ): Request[DescribeFeatureGroupResponse, AWSError] = js.native
  
  /**
    * Shows the metadata for a feature within a feature group.
    */
  def describeFeatureMetadata(): Request[DescribeFeatureMetadataResponse, AWSError] = js.native
  def describeFeatureMetadata(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFeatureMetadataResponse, Unit]): Request[DescribeFeatureMetadataResponse, AWSError] = js.native
  /**
    * Shows the metadata for a feature within a feature group.
    */
  def describeFeatureMetadata(params: DescribeFeatureMetadataRequest): Request[DescribeFeatureMetadataResponse, AWSError] = js.native
  def describeFeatureMetadata(
    params: DescribeFeatureMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFeatureMetadataResponse, Unit]
  ): Request[DescribeFeatureMetadataResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified flow definition.
    */
  def describeFlowDefinition(): Request[DescribeFlowDefinitionResponse, AWSError] = js.native
  def describeFlowDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowDefinitionResponse, Unit]): Request[DescribeFlowDefinitionResponse, AWSError] = js.native
  /**
    * Returns information about the specified flow definition.
    */
  def describeFlowDefinition(params: DescribeFlowDefinitionRequest): Request[DescribeFlowDefinitionResponse, AWSError] = js.native
  def describeFlowDefinition(
    params: DescribeFlowDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowDefinitionResponse, Unit]
  ): Request[DescribeFlowDefinitionResponse, AWSError] = js.native
  
  /**
    * Returns information about the requested human task user interface (worker task template).
    */
  def describeHumanTaskUi(): Request[DescribeHumanTaskUiResponse, AWSError] = js.native
  def describeHumanTaskUi(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHumanTaskUiResponse, Unit]): Request[DescribeHumanTaskUiResponse, AWSError] = js.native
  /**
    * Returns information about the requested human task user interface (worker task template).
    */
  def describeHumanTaskUi(params: DescribeHumanTaskUiRequest): Request[DescribeHumanTaskUiResponse, AWSError] = js.native
  def describeHumanTaskUi(
    params: DescribeHumanTaskUiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHumanTaskUiResponse, Unit]
  ): Request[DescribeHumanTaskUiResponse, AWSError] = js.native
  
  /**
    * Gets a description of a hyperparameter tuning job.
    */
  def describeHyperParameterTuningJob(): Request[DescribeHyperParameterTuningJobResponse, AWSError] = js.native
  def describeHyperParameterTuningJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHyperParameterTuningJobResponse, Unit]
  ): Request[DescribeHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Gets a description of a hyperparameter tuning job.
    */
  def describeHyperParameterTuningJob(params: DescribeHyperParameterTuningJobRequest): Request[DescribeHyperParameterTuningJobResponse, AWSError] = js.native
  def describeHyperParameterTuningJob(
    params: DescribeHyperParameterTuningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHyperParameterTuningJobResponse, Unit]
  ): Request[DescribeHyperParameterTuningJobResponse, AWSError] = js.native
  
  /**
    * Describes a SageMaker image.
    */
  def describeImage(): Request[DescribeImageResponse, AWSError] = js.native
  def describeImage(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageResponse, Unit]): Request[DescribeImageResponse, AWSError] = js.native
  /**
    * Describes a SageMaker image.
    */
  def describeImage(params: DescribeImageRequest): Request[DescribeImageResponse, AWSError] = js.native
  def describeImage(
    params: DescribeImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageResponse, Unit]
  ): Request[DescribeImageResponse, AWSError] = js.native
  
  /**
    * Describes a version of a SageMaker image.
    */
  def describeImageVersion(): Request[DescribeImageVersionResponse, AWSError] = js.native
  def describeImageVersion(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageVersionResponse, Unit]): Request[DescribeImageVersionResponse, AWSError] = js.native
  /**
    * Describes a version of a SageMaker image.
    */
  def describeImageVersion(params: DescribeImageVersionRequest): Request[DescribeImageVersionResponse, AWSError] = js.native
  def describeImageVersion(
    params: DescribeImageVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageVersionResponse, Unit]
  ): Request[DescribeImageVersionResponse, AWSError] = js.native
  
  /**
    * Provides the results of the Inference Recommender job. One or more recommendation jobs are returned.
    */
  def describeInferenceRecommendationsJob(): Request[DescribeInferenceRecommendationsJobResponse, AWSError] = js.native
  def describeInferenceRecommendationsJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInferenceRecommendationsJobResponse, Unit]
  ): Request[DescribeInferenceRecommendationsJobResponse, AWSError] = js.native
  /**
    * Provides the results of the Inference Recommender job. One or more recommendation jobs are returned.
    */
  def describeInferenceRecommendationsJob(params: DescribeInferenceRecommendationsJobRequest): Request[DescribeInferenceRecommendationsJobResponse, AWSError] = js.native
  def describeInferenceRecommendationsJob(
    params: DescribeInferenceRecommendationsJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInferenceRecommendationsJobResponse, Unit]
  ): Request[DescribeInferenceRecommendationsJobResponse, AWSError] = js.native
  
  /**
    * Gets information about a labeling job.
    */
  def describeLabelingJob(): Request[DescribeLabelingJobResponse, AWSError] = js.native
  def describeLabelingJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLabelingJobResponse, Unit]): Request[DescribeLabelingJobResponse, AWSError] = js.native
  /**
    * Gets information about a labeling job.
    */
  def describeLabelingJob(params: DescribeLabelingJobRequest): Request[DescribeLabelingJobResponse, AWSError] = js.native
  def describeLabelingJob(
    params: DescribeLabelingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLabelingJobResponse, Unit]
  ): Request[DescribeLabelingJobResponse, AWSError] = js.native
  
  /**
    * Provides a list of properties for the requested lineage group. For more information, see  Cross-Account Lineage Tracking  in the Amazon SageMaker Developer Guide.
    */
  def describeLineageGroup(): Request[DescribeLineageGroupResponse, AWSError] = js.native
  def describeLineageGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLineageGroupResponse, Unit]): Request[DescribeLineageGroupResponse, AWSError] = js.native
  /**
    * Provides a list of properties for the requested lineage group. For more information, see  Cross-Account Lineage Tracking  in the Amazon SageMaker Developer Guide.
    */
  def describeLineageGroup(params: DescribeLineageGroupRequest): Request[DescribeLineageGroupResponse, AWSError] = js.native
  def describeLineageGroup(
    params: DescribeLineageGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLineageGroupResponse, Unit]
  ): Request[DescribeLineageGroupResponse, AWSError] = js.native
  
  /**
    * Describes a model that you created using the CreateModel API.
    */
  def describeModel(): Request[DescribeModelOutput, AWSError] = js.native
  def describeModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelOutput, Unit]): Request[DescribeModelOutput, AWSError] = js.native
  /**
    * Describes a model that you created using the CreateModel API.
    */
  def describeModel(params: DescribeModelInput): Request[DescribeModelOutput, AWSError] = js.native
  def describeModel(
    params: DescribeModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelOutput, Unit]
  ): Request[DescribeModelOutput, AWSError] = js.native
  
  /**
    * Returns a description of a model bias job definition.
    */
  def describeModelBiasJobDefinition(): Request[DescribeModelBiasJobDefinitionResponse, AWSError] = js.native
  def describeModelBiasJobDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelBiasJobDefinitionResponse, Unit]
  ): Request[DescribeModelBiasJobDefinitionResponse, AWSError] = js.native
  /**
    * Returns a description of a model bias job definition.
    */
  def describeModelBiasJobDefinition(params: DescribeModelBiasJobDefinitionRequest): Request[DescribeModelBiasJobDefinitionResponse, AWSError] = js.native
  def describeModelBiasJobDefinition(
    params: DescribeModelBiasJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelBiasJobDefinitionResponse, Unit]
  ): Request[DescribeModelBiasJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Returns a description of a model explainability job definition.
    */
  def describeModelExplainabilityJobDefinition(): Request[DescribeModelExplainabilityJobDefinitionResponse, AWSError] = js.native
  def describeModelExplainabilityJobDefinition(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeModelExplainabilityJobDefinitionResponse, 
      Unit
    ]
  ): Request[DescribeModelExplainabilityJobDefinitionResponse, AWSError] = js.native
  /**
    * Returns a description of a model explainability job definition.
    */
  def describeModelExplainabilityJobDefinition(params: DescribeModelExplainabilityJobDefinitionRequest): Request[DescribeModelExplainabilityJobDefinitionResponse, AWSError] = js.native
  def describeModelExplainabilityJobDefinition(
    params: DescribeModelExplainabilityJobDefinitionRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeModelExplainabilityJobDefinitionResponse, 
      Unit
    ]
  ): Request[DescribeModelExplainabilityJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Returns a description of the specified model package, which is used to create SageMaker models or list them on Amazon Web Services Marketplace. To create models in SageMaker, buyers can subscribe to model packages listed on Amazon Web Services Marketplace.
    */
  def describeModelPackage(): Request[DescribeModelPackageOutput, AWSError] = js.native
  def describeModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackageOutput, Unit]): Request[DescribeModelPackageOutput, AWSError] = js.native
  /**
    * Returns a description of the specified model package, which is used to create SageMaker models or list them on Amazon Web Services Marketplace. To create models in SageMaker, buyers can subscribe to model packages listed on Amazon Web Services Marketplace.
    */
  def describeModelPackage(params: DescribeModelPackageInput): Request[DescribeModelPackageOutput, AWSError] = js.native
  def describeModelPackage(
    params: DescribeModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackageOutput, Unit]
  ): Request[DescribeModelPackageOutput, AWSError] = js.native
  
  /**
    * Gets a description for the specified model group.
    */
  def describeModelPackageGroup(): Request[DescribeModelPackageGroupOutput, AWSError] = js.native
  def describeModelPackageGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackageGroupOutput, Unit]): Request[DescribeModelPackageGroupOutput, AWSError] = js.native
  /**
    * Gets a description for the specified model group.
    */
  def describeModelPackageGroup(params: DescribeModelPackageGroupInput): Request[DescribeModelPackageGroupOutput, AWSError] = js.native
  def describeModelPackageGroup(
    params: DescribeModelPackageGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackageGroupOutput, Unit]
  ): Request[DescribeModelPackageGroupOutput, AWSError] = js.native
  
  /**
    * Returns a description of a model quality job definition.
    */
  def describeModelQualityJobDefinition(): Request[DescribeModelQualityJobDefinitionResponse, AWSError] = js.native
  def describeModelQualityJobDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelQualityJobDefinitionResponse, Unit]
  ): Request[DescribeModelQualityJobDefinitionResponse, AWSError] = js.native
  /**
    * Returns a description of a model quality job definition.
    */
  def describeModelQualityJobDefinition(params: DescribeModelQualityJobDefinitionRequest): Request[DescribeModelQualityJobDefinitionResponse, AWSError] = js.native
  def describeModelQualityJobDefinition(
    params: DescribeModelQualityJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelQualityJobDefinitionResponse, Unit]
  ): Request[DescribeModelQualityJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Describes the schedule for a monitoring job.
    */
  def describeMonitoringSchedule(): Request[DescribeMonitoringScheduleResponse, AWSError] = js.native
  def describeMonitoringSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMonitoringScheduleResponse, Unit]): Request[DescribeMonitoringScheduleResponse, AWSError] = js.native
  /**
    * Describes the schedule for a monitoring job.
    */
  def describeMonitoringSchedule(params: DescribeMonitoringScheduleRequest): Request[DescribeMonitoringScheduleResponse, AWSError] = js.native
  def describeMonitoringSchedule(
    params: DescribeMonitoringScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMonitoringScheduleResponse, Unit]
  ): Request[DescribeMonitoringScheduleResponse, AWSError] = js.native
  
  /**
    * Returns information about a notebook instance.
    */
  def describeNotebookInstance(): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  def describeNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Returns information about a notebook instance.
    */
  def describeNotebookInstance(params: DescribeNotebookInstanceInput): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  def describeNotebookInstance(
    params: DescribeNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  
  /**
    * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def describeNotebookInstanceLifecycleConfig(): Request[DescribeNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def describeNotebookInstanceLifecycleConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[DescribeNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Returns a description of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  def describeNotebookInstanceLifecycleConfig(params: DescribeNotebookInstanceLifecycleConfigInput): Request[DescribeNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def describeNotebookInstanceLifecycleConfig(
    params: DescribeNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[DescribeNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  
  /**
    * Describes the details of a pipeline.
    */
  def describePipeline(): Request[DescribePipelineResponse, AWSError] = js.native
  def describePipeline(callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelineResponse, Unit]): Request[DescribePipelineResponse, AWSError] = js.native
  /**
    * Describes the details of a pipeline.
    */
  def describePipeline(params: DescribePipelineRequest): Request[DescribePipelineResponse, AWSError] = js.native
  def describePipeline(
    params: DescribePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelineResponse, Unit]
  ): Request[DescribePipelineResponse, AWSError] = js.native
  
  /**
    * Describes the details of an execution's pipeline definition.
    */
  def describePipelineDefinitionForExecution(): Request[DescribePipelineDefinitionForExecutionResponse, AWSError] = js.native
  def describePipelineDefinitionForExecution(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelineDefinitionForExecutionResponse, Unit]
  ): Request[DescribePipelineDefinitionForExecutionResponse, AWSError] = js.native
  /**
    * Describes the details of an execution's pipeline definition.
    */
  def describePipelineDefinitionForExecution(params: DescribePipelineDefinitionForExecutionRequest): Request[DescribePipelineDefinitionForExecutionResponse, AWSError] = js.native
  def describePipelineDefinitionForExecution(
    params: DescribePipelineDefinitionForExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelineDefinitionForExecutionResponse, Unit]
  ): Request[DescribePipelineDefinitionForExecutionResponse, AWSError] = js.native
  
  /**
    * Describes the details of a pipeline execution.
    */
  def describePipelineExecution(): Request[DescribePipelineExecutionResponse, AWSError] = js.native
  def describePipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelineExecutionResponse, Unit]): Request[DescribePipelineExecutionResponse, AWSError] = js.native
  /**
    * Describes the details of a pipeline execution.
    */
  def describePipelineExecution(params: DescribePipelineExecutionRequest): Request[DescribePipelineExecutionResponse, AWSError] = js.native
  def describePipelineExecution(
    params: DescribePipelineExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelineExecutionResponse, Unit]
  ): Request[DescribePipelineExecutionResponse, AWSError] = js.native
  
  /**
    * Returns a description of a processing job.
    */
  def describeProcessingJob(): Request[DescribeProcessingJobResponse, AWSError] = js.native
  def describeProcessingJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProcessingJobResponse, Unit]): Request[DescribeProcessingJobResponse, AWSError] = js.native
  /**
    * Returns a description of a processing job.
    */
  def describeProcessingJob(params: DescribeProcessingJobRequest): Request[DescribeProcessingJobResponse, AWSError] = js.native
  def describeProcessingJob(
    params: DescribeProcessingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProcessingJobResponse, Unit]
  ): Request[DescribeProcessingJobResponse, AWSError] = js.native
  
  /**
    * Describes the details of a project.
    */
  def describeProject(): Request[DescribeProjectOutput, AWSError] = js.native
  def describeProject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectOutput, Unit]): Request[DescribeProjectOutput, AWSError] = js.native
  /**
    * Describes the details of a project.
    */
  def describeProject(params: DescribeProjectInput): Request[DescribeProjectOutput, AWSError] = js.native
  def describeProject(
    params: DescribeProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectOutput, Unit]
  ): Request[DescribeProjectOutput, AWSError] = js.native
  
  /**
    * Describes the Studio Lifecycle Configuration.
    */
  def describeStudioLifecycleConfig(): Request[DescribeStudioLifecycleConfigResponse, AWSError] = js.native
  def describeStudioLifecycleConfig(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStudioLifecycleConfigResponse, Unit]): Request[DescribeStudioLifecycleConfigResponse, AWSError] = js.native
  /**
    * Describes the Studio Lifecycle Configuration.
    */
  def describeStudioLifecycleConfig(params: DescribeStudioLifecycleConfigRequest): Request[DescribeStudioLifecycleConfigResponse, AWSError] = js.native
  def describeStudioLifecycleConfig(
    params: DescribeStudioLifecycleConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStudioLifecycleConfigResponse, Unit]
  ): Request[DescribeStudioLifecycleConfigResponse, AWSError] = js.native
  
  /**
    * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the Amazon Web Services Marketplace.
    */
  def describeSubscribedWorkteam(): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  def describeSubscribedWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscribedWorkteamResponse, Unit]): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  /**
    * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the Amazon Web Services Marketplace.
    */
  def describeSubscribedWorkteam(params: DescribeSubscribedWorkteamRequest): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  def describeSubscribedWorkteam(
    params: DescribeSubscribedWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscribedWorkteamResponse, Unit]
  ): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  
  /**
    * Returns information about a training job.  Some of the attributes below only appear if the training job successfully starts. If the training job fails, TrainingJobStatus is Failed and, depending on the FailureReason, attributes like TrainingStartTime, TrainingTimeInSeconds, TrainingEndTime, and BillableTimeInSeconds may not be present in the response.
    */
  def describeTrainingJob(): Request[DescribeTrainingJobResponse, AWSError] = js.native
  def describeTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]): Request[DescribeTrainingJobResponse, AWSError] = js.native
  /**
    * Returns information about a training job.  Some of the attributes below only appear if the training job successfully starts. If the training job fails, TrainingJobStatus is Failed and, depending on the FailureReason, attributes like TrainingStartTime, TrainingTimeInSeconds, TrainingEndTime, and BillableTimeInSeconds may not be present in the response.
    */
  def describeTrainingJob(params: DescribeTrainingJobRequest): Request[DescribeTrainingJobResponse, AWSError] = js.native
  def describeTrainingJob(
    params: DescribeTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]
  ): Request[DescribeTrainingJobResponse, AWSError] = js.native
  
  /**
    * Returns information about a transform job.
    */
  def describeTransformJob(): Request[DescribeTransformJobResponse, AWSError] = js.native
  def describeTransformJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransformJobResponse, Unit]): Request[DescribeTransformJobResponse, AWSError] = js.native
  /**
    * Returns information about a transform job.
    */
  def describeTransformJob(params: DescribeTransformJobRequest): Request[DescribeTransformJobResponse, AWSError] = js.native
  def describeTransformJob(
    params: DescribeTransformJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransformJobResponse, Unit]
  ): Request[DescribeTransformJobResponse, AWSError] = js.native
  
  /**
    * Provides a list of a trial's properties.
    */
  def describeTrial(): Request[DescribeTrialResponse, AWSError] = js.native
  def describeTrial(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrialResponse, Unit]): Request[DescribeTrialResponse, AWSError] = js.native
  /**
    * Provides a list of a trial's properties.
    */
  def describeTrial(params: DescribeTrialRequest): Request[DescribeTrialResponse, AWSError] = js.native
  def describeTrial(
    params: DescribeTrialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrialResponse, Unit]
  ): Request[DescribeTrialResponse, AWSError] = js.native
  
  /**
    * Provides a list of a trials component's properties.
    */
  def describeTrialComponent(): Request[DescribeTrialComponentResponse, AWSError] = js.native
  def describeTrialComponent(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrialComponentResponse, Unit]): Request[DescribeTrialComponentResponse, AWSError] = js.native
  /**
    * Provides a list of a trials component's properties.
    */
  def describeTrialComponent(params: DescribeTrialComponentRequest): Request[DescribeTrialComponentResponse, AWSError] = js.native
  def describeTrialComponent(
    params: DescribeTrialComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrialComponentResponse, Unit]
  ): Request[DescribeTrialComponentResponse, AWSError] = js.native
  
  /**
    * Describes a user profile. For more information, see CreateUserProfile.
    */
  def describeUserProfile(): Request[DescribeUserProfileResponse, AWSError] = js.native
  def describeUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserProfileResponse, Unit]): Request[DescribeUserProfileResponse, AWSError] = js.native
  /**
    * Describes a user profile. For more information, see CreateUserProfile.
    */
  def describeUserProfile(params: DescribeUserProfileRequest): Request[DescribeUserProfileResponse, AWSError] = js.native
  def describeUserProfile(
    params: DescribeUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserProfileResponse, Unit]
  ): Request[DescribeUserProfileResponse, AWSError] = js.native
  
  /**
    * Lists private workforce information, including workforce name, Amazon Resource Name (ARN), and, if applicable, allowed IP address ranges (CIDRs). Allowable IP address ranges are the IP addresses that workers can use to access tasks.   This operation applies only to private workforces. 
    */
  def describeWorkforce(): Request[DescribeWorkforceResponse, AWSError] = js.native
  def describeWorkforce(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkforceResponse, Unit]): Request[DescribeWorkforceResponse, AWSError] = js.native
  /**
    * Lists private workforce information, including workforce name, Amazon Resource Name (ARN), and, if applicable, allowed IP address ranges (CIDRs). Allowable IP address ranges are the IP addresses that workers can use to access tasks.   This operation applies only to private workforces. 
    */
  def describeWorkforce(params: DescribeWorkforceRequest): Request[DescribeWorkforceResponse, AWSError] = js.native
  def describeWorkforce(
    params: DescribeWorkforceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkforceResponse, Unit]
  ): Request[DescribeWorkforceResponse, AWSError] = js.native
  
  /**
    * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
    */
  def describeWorkteam(): Request[DescribeWorkteamResponse, AWSError] = js.native
  def describeWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkteamResponse, Unit]): Request[DescribeWorkteamResponse, AWSError] = js.native
  /**
    * Gets information about a specific work team. You can see information such as the create date, the last updated date, membership information, and the work team's Amazon Resource Name (ARN).
    */
  def describeWorkteam(params: DescribeWorkteamRequest): Request[DescribeWorkteamResponse, AWSError] = js.native
  def describeWorkteam(
    params: DescribeWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkteamResponse, Unit]
  ): Request[DescribeWorkteamResponse, AWSError] = js.native
  
  /**
    * Disables using Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
    */
  def disableSagemakerServicecatalogPortfolio(): Request[DisableSagemakerServicecatalogPortfolioOutput, AWSError] = js.native
  def disableSagemakerServicecatalogPortfolio(
    callback: js.Function2[/* err */ AWSError, /* data */ DisableSagemakerServicecatalogPortfolioOutput, Unit]
  ): Request[DisableSagemakerServicecatalogPortfolioOutput, AWSError] = js.native
  /**
    * Disables using Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
    */
  def disableSagemakerServicecatalogPortfolio(params: DisableSagemakerServicecatalogPortfolioInput): Request[DisableSagemakerServicecatalogPortfolioOutput, AWSError] = js.native
  def disableSagemakerServicecatalogPortfolio(
    params: DisableSagemakerServicecatalogPortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableSagemakerServicecatalogPortfolioOutput, Unit]
  ): Request[DisableSagemakerServicecatalogPortfolioOutput, AWSError] = js.native
  
  /**
    * Disassociates a trial component from a trial. This doesn't effect other trials the component is associated with. Before you can delete a component, you must disassociate the component from all trials it is associated with. To associate a trial component with a trial, call the AssociateTrialComponent API. To get a list of the trials a component is associated with, use the Search API. Specify ExperimentTrialComponent for the Resource parameter. The list appears in the response under Results.TrialComponent.Parents.
    */
  def disassociateTrialComponent(): Request[DisassociateTrialComponentResponse, AWSError] = js.native
  def disassociateTrialComponent(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTrialComponentResponse, Unit]): Request[DisassociateTrialComponentResponse, AWSError] = js.native
  /**
    * Disassociates a trial component from a trial. This doesn't effect other trials the component is associated with. Before you can delete a component, you must disassociate the component from all trials it is associated with. To associate a trial component with a trial, call the AssociateTrialComponent API. To get a list of the trials a component is associated with, use the Search API. Specify ExperimentTrialComponent for the Resource parameter. The list appears in the response under Results.TrialComponent.Parents.
    */
  def disassociateTrialComponent(params: DisassociateTrialComponentRequest): Request[DisassociateTrialComponentResponse, AWSError] = js.native
  def disassociateTrialComponent(
    params: DisassociateTrialComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTrialComponentResponse, Unit]
  ): Request[DisassociateTrialComponentResponse, AWSError] = js.native
  
  /**
    * Enables using Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
    */
  def enableSagemakerServicecatalogPortfolio(): Request[EnableSagemakerServicecatalogPortfolioOutput, AWSError] = js.native
  def enableSagemakerServicecatalogPortfolio(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSagemakerServicecatalogPortfolioOutput, Unit]
  ): Request[EnableSagemakerServicecatalogPortfolioOutput, AWSError] = js.native
  /**
    * Enables using Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
    */
  def enableSagemakerServicecatalogPortfolio(params: EnableSagemakerServicecatalogPortfolioInput): Request[EnableSagemakerServicecatalogPortfolioOutput, AWSError] = js.native
  def enableSagemakerServicecatalogPortfolio(
    params: EnableSagemakerServicecatalogPortfolioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSagemakerServicecatalogPortfolioOutput, Unit]
  ): Request[EnableSagemakerServicecatalogPortfolioOutput, AWSError] = js.native
  
  /**
    * Describes a fleet.
    */
  def getDeviceFleetReport(): Request[GetDeviceFleetReportResponse, AWSError] = js.native
  def getDeviceFleetReport(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceFleetReportResponse, Unit]): Request[GetDeviceFleetReportResponse, AWSError] = js.native
  /**
    * Describes a fleet.
    */
  def getDeviceFleetReport(params: GetDeviceFleetReportRequest): Request[GetDeviceFleetReportResponse, AWSError] = js.native
  def getDeviceFleetReport(
    params: GetDeviceFleetReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceFleetReportResponse, Unit]
  ): Request[GetDeviceFleetReportResponse, AWSError] = js.native
  
  /**
    * The resource policy for the lineage group.
    */
  def getLineageGroupPolicy(): Request[GetLineageGroupPolicyResponse, AWSError] = js.native
  def getLineageGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetLineageGroupPolicyResponse, Unit]): Request[GetLineageGroupPolicyResponse, AWSError] = js.native
  /**
    * The resource policy for the lineage group.
    */
  def getLineageGroupPolicy(params: GetLineageGroupPolicyRequest): Request[GetLineageGroupPolicyResponse, AWSError] = js.native
  def getLineageGroupPolicy(
    params: GetLineageGroupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLineageGroupPolicyResponse, Unit]
  ): Request[GetLineageGroupPolicyResponse, AWSError] = js.native
  
  /**
    * Gets a resource policy that manages access for a model group. For information about resource policies, see Identity-based policies and resource-based policies in the Amazon Web Services Identity and Access Management User Guide..
    */
  def getModelPackageGroupPolicy(): Request[GetModelPackageGroupPolicyOutput, AWSError] = js.native
  def getModelPackageGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetModelPackageGroupPolicyOutput, Unit]): Request[GetModelPackageGroupPolicyOutput, AWSError] = js.native
  /**
    * Gets a resource policy that manages access for a model group. For information about resource policies, see Identity-based policies and resource-based policies in the Amazon Web Services Identity and Access Management User Guide..
    */
  def getModelPackageGroupPolicy(params: GetModelPackageGroupPolicyInput): Request[GetModelPackageGroupPolicyOutput, AWSError] = js.native
  def getModelPackageGroupPolicy(
    params: GetModelPackageGroupPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelPackageGroupPolicyOutput, Unit]
  ): Request[GetModelPackageGroupPolicyOutput, AWSError] = js.native
  
  /**
    * Gets the status of Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
    */
  def getSagemakerServicecatalogPortfolioStatus(): Request[GetSagemakerServicecatalogPortfolioStatusOutput, AWSError] = js.native
  def getSagemakerServicecatalogPortfolioStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ GetSagemakerServicecatalogPortfolioStatusOutput, Unit]
  ): Request[GetSagemakerServicecatalogPortfolioStatusOutput, AWSError] = js.native
  /**
    * Gets the status of Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
    */
  def getSagemakerServicecatalogPortfolioStatus(params: GetSagemakerServicecatalogPortfolioStatusInput): Request[GetSagemakerServicecatalogPortfolioStatusOutput, AWSError] = js.native
  def getSagemakerServicecatalogPortfolioStatus(
    params: GetSagemakerServicecatalogPortfolioStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSagemakerServicecatalogPortfolioStatusOutput, Unit]
  ): Request[GetSagemakerServicecatalogPortfolioStatusOutput, AWSError] = js.native
  
  /**
    * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of possible matches for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
    */
  def getSearchSuggestions(): Request[GetSearchSuggestionsResponse, AWSError] = js.native
  def getSearchSuggestions(callback: js.Function2[/* err */ AWSError, /* data */ GetSearchSuggestionsResponse, Unit]): Request[GetSearchSuggestionsResponse, AWSError] = js.native
  /**
    * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of possible matches for the property name to use in Search queries. Provides suggestions for HyperParameters, Tags, and Metrics.
    */
  def getSearchSuggestions(params: GetSearchSuggestionsRequest): Request[GetSearchSuggestionsResponse, AWSError] = js.native
  def getSearchSuggestions(
    params: GetSearchSuggestionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSearchSuggestionsResponse, Unit]
  ): Request[GetSearchSuggestionsResponse, AWSError] = js.native
  
  /**
    * Lists the actions in your account and their properties.
    */
  def listActions(): Request[ListActionsResponse, AWSError] = js.native
  def listActions(callback: js.Function2[/* err */ AWSError, /* data */ ListActionsResponse, Unit]): Request[ListActionsResponse, AWSError] = js.native
  /**
    * Lists the actions in your account and their properties.
    */
  def listActions(params: ListActionsRequest): Request[ListActionsResponse, AWSError] = js.native
  def listActions(
    params: ListActionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListActionsResponse, Unit]
  ): Request[ListActionsResponse, AWSError] = js.native
  
  /**
    * Lists the machine learning algorithms that have been created.
    */
  def listAlgorithms(): Request[ListAlgorithmsOutput, AWSError] = js.native
  def listAlgorithms(callback: js.Function2[/* err */ AWSError, /* data */ ListAlgorithmsOutput, Unit]): Request[ListAlgorithmsOutput, AWSError] = js.native
  /**
    * Lists the machine learning algorithms that have been created.
    */
  def listAlgorithms(params: ListAlgorithmsInput): Request[ListAlgorithmsOutput, AWSError] = js.native
  def listAlgorithms(
    params: ListAlgorithmsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlgorithmsOutput, Unit]
  ): Request[ListAlgorithmsOutput, AWSError] = js.native
  
  /**
    * Lists the AppImageConfigs in your account and their properties. The list can be filtered by creation time or modified time, and whether the AppImageConfig name contains a specified string.
    */
  def listAppImageConfigs(): Request[ListAppImageConfigsResponse, AWSError] = js.native
  def listAppImageConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListAppImageConfigsResponse, Unit]): Request[ListAppImageConfigsResponse, AWSError] = js.native
  /**
    * Lists the AppImageConfigs in your account and their properties. The list can be filtered by creation time or modified time, and whether the AppImageConfig name contains a specified string.
    */
  def listAppImageConfigs(params: ListAppImageConfigsRequest): Request[ListAppImageConfigsResponse, AWSError] = js.native
  def listAppImageConfigs(
    params: ListAppImageConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppImageConfigsResponse, Unit]
  ): Request[ListAppImageConfigsResponse, AWSError] = js.native
  
  /**
    * Lists apps.
    */
  def listApps(): Request[ListAppsResponse, AWSError] = js.native
  def listApps(callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResponse, Unit]): Request[ListAppsResponse, AWSError] = js.native
  /**
    * Lists apps.
    */
  def listApps(params: ListAppsRequest): Request[ListAppsResponse, AWSError] = js.native
  def listApps(
    params: ListAppsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResponse, Unit]
  ): Request[ListAppsResponse, AWSError] = js.native
  
  /**
    * Lists the artifacts in your account and their properties.
    */
  def listArtifacts(): Request[ListArtifactsResponse, AWSError] = js.native
  def listArtifacts(callback: js.Function2[/* err */ AWSError, /* data */ ListArtifactsResponse, Unit]): Request[ListArtifactsResponse, AWSError] = js.native
  /**
    * Lists the artifacts in your account and their properties.
    */
  def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResponse, AWSError] = js.native
  def listArtifacts(
    params: ListArtifactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListArtifactsResponse, Unit]
  ): Request[ListArtifactsResponse, AWSError] = js.native
  
  /**
    * Lists the associations in your account and their properties.
    */
  def listAssociations(): Request[ListAssociationsResponse, AWSError] = js.native
  def listAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociationsResponse, Unit]): Request[ListAssociationsResponse, AWSError] = js.native
  /**
    * Lists the associations in your account and their properties.
    */
  def listAssociations(params: ListAssociationsRequest): Request[ListAssociationsResponse, AWSError] = js.native
  def listAssociations(
    params: ListAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociationsResponse, Unit]
  ): Request[ListAssociationsResponse, AWSError] = js.native
  
  /**
    * Request a list of jobs.
    */
  def listAutoMLJobs(): Request[ListAutoMLJobsResponse, AWSError] = js.native
  def listAutoMLJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListAutoMLJobsResponse, Unit]): Request[ListAutoMLJobsResponse, AWSError] = js.native
  /**
    * Request a list of jobs.
    */
  def listAutoMLJobs(params: ListAutoMLJobsRequest): Request[ListAutoMLJobsResponse, AWSError] = js.native
  def listAutoMLJobs(
    params: ListAutoMLJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAutoMLJobsResponse, Unit]
  ): Request[ListAutoMLJobsResponse, AWSError] = js.native
  
  /**
    * List the candidates created for the job.
    */
  def listCandidatesForAutoMLJob(): Request[ListCandidatesForAutoMLJobResponse, AWSError] = js.native
  def listCandidatesForAutoMLJob(callback: js.Function2[/* err */ AWSError, /* data */ ListCandidatesForAutoMLJobResponse, Unit]): Request[ListCandidatesForAutoMLJobResponse, AWSError] = js.native
  /**
    * List the candidates created for the job.
    */
  def listCandidatesForAutoMLJob(params: ListCandidatesForAutoMLJobRequest): Request[ListCandidatesForAutoMLJobResponse, AWSError] = js.native
  def listCandidatesForAutoMLJob(
    params: ListCandidatesForAutoMLJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCandidatesForAutoMLJobResponse, Unit]
  ): Request[ListCandidatesForAutoMLJobResponse, AWSError] = js.native
  
  /**
    * Gets a list of the Git repositories in your account.
    */
  def listCodeRepositories(): Request[ListCodeRepositoriesOutput, AWSError] = js.native
  def listCodeRepositories(callback: js.Function2[/* err */ AWSError, /* data */ ListCodeRepositoriesOutput, Unit]): Request[ListCodeRepositoriesOutput, AWSError] = js.native
  /**
    * Gets a list of the Git repositories in your account.
    */
  def listCodeRepositories(params: ListCodeRepositoriesInput): Request[ListCodeRepositoriesOutput, AWSError] = js.native
  def listCodeRepositories(
    params: ListCodeRepositoriesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCodeRepositoriesOutput, Unit]
  ): Request[ListCodeRepositoriesOutput, AWSError] = js.native
  
  /**
    * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
    */
  def listCompilationJobs(): Request[ListCompilationJobsResponse, AWSError] = js.native
  def listCompilationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListCompilationJobsResponse, Unit]): Request[ListCompilationJobsResponse, AWSError] = js.native
  /**
    * Lists model compilation jobs that satisfy various filters. To create a model compilation job, use CreateCompilationJob. To get information about a particular model compilation job you have created, use DescribeCompilationJob.
    */
  def listCompilationJobs(params: ListCompilationJobsRequest): Request[ListCompilationJobsResponse, AWSError] = js.native
  def listCompilationJobs(
    params: ListCompilationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCompilationJobsResponse, Unit]
  ): Request[ListCompilationJobsResponse, AWSError] = js.native
  
  /**
    * Lists the contexts in your account and their properties.
    */
  def listContexts(): Request[ListContextsResponse, AWSError] = js.native
  def listContexts(callback: js.Function2[/* err */ AWSError, /* data */ ListContextsResponse, Unit]): Request[ListContextsResponse, AWSError] = js.native
  /**
    * Lists the contexts in your account and their properties.
    */
  def listContexts(params: ListContextsRequest): Request[ListContextsResponse, AWSError] = js.native
  def listContexts(
    params: ListContextsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContextsResponse, Unit]
  ): Request[ListContextsResponse, AWSError] = js.native
  
  /**
    * Lists the data quality job definitions in your account.
    */
  def listDataQualityJobDefinitions(): Request[ListDataQualityJobDefinitionsResponse, AWSError] = js.native
  def listDataQualityJobDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListDataQualityJobDefinitionsResponse, Unit]): Request[ListDataQualityJobDefinitionsResponse, AWSError] = js.native
  /**
    * Lists the data quality job definitions in your account.
    */
  def listDataQualityJobDefinitions(params: ListDataQualityJobDefinitionsRequest): Request[ListDataQualityJobDefinitionsResponse, AWSError] = js.native
  def listDataQualityJobDefinitions(
    params: ListDataQualityJobDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataQualityJobDefinitionsResponse, Unit]
  ): Request[ListDataQualityJobDefinitionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of devices in the fleet.
    */
  def listDeviceFleets(): Request[ListDeviceFleetsResponse, AWSError] = js.native
  def listDeviceFleets(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceFleetsResponse, Unit]): Request[ListDeviceFleetsResponse, AWSError] = js.native
  /**
    * Returns a list of devices in the fleet.
    */
  def listDeviceFleets(params: ListDeviceFleetsRequest): Request[ListDeviceFleetsResponse, AWSError] = js.native
  def listDeviceFleets(
    params: ListDeviceFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceFleetsResponse, Unit]
  ): Request[ListDeviceFleetsResponse, AWSError] = js.native
  
  /**
    * A list of devices.
    */
  def listDevices(): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]): Request[ListDevicesResponse, AWSError] = js.native
  /**
    * A list of devices.
    */
  def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]
  ): Request[ListDevicesResponse, AWSError] = js.native
  
  /**
    * Lists the domains.
    */
  def listDomains(): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]): Request[ListDomainsResponse, AWSError] = js.native
  /**
    * Lists the domains.
    */
  def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(
    params: ListDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]
  ): Request[ListDomainsResponse, AWSError] = js.native
  
  /**
    * Lists all edge deployment plans.
    */
  def listEdgeDeploymentPlans(): Request[ListEdgeDeploymentPlansResponse, AWSError] = js.native
  def listEdgeDeploymentPlans(callback: js.Function2[/* err */ AWSError, /* data */ ListEdgeDeploymentPlansResponse, Unit]): Request[ListEdgeDeploymentPlansResponse, AWSError] = js.native
  /**
    * Lists all edge deployment plans.
    */
  def listEdgeDeploymentPlans(params: ListEdgeDeploymentPlansRequest): Request[ListEdgeDeploymentPlansResponse, AWSError] = js.native
  def listEdgeDeploymentPlans(
    params: ListEdgeDeploymentPlansRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEdgeDeploymentPlansResponse, Unit]
  ): Request[ListEdgeDeploymentPlansResponse, AWSError] = js.native
  
  /**
    * Returns a list of edge packaging jobs.
    */
  def listEdgePackagingJobs(): Request[ListEdgePackagingJobsResponse, AWSError] = js.native
  def listEdgePackagingJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListEdgePackagingJobsResponse, Unit]): Request[ListEdgePackagingJobsResponse, AWSError] = js.native
  /**
    * Returns a list of edge packaging jobs.
    */
  def listEdgePackagingJobs(params: ListEdgePackagingJobsRequest): Request[ListEdgePackagingJobsResponse, AWSError] = js.native
  def listEdgePackagingJobs(
    params: ListEdgePackagingJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEdgePackagingJobsResponse, Unit]
  ): Request[ListEdgePackagingJobsResponse, AWSError] = js.native
  
  /**
    * Lists endpoint configurations.
    */
  def listEndpointConfigs(): Request[ListEndpointConfigsOutput, AWSError] = js.native
  def listEndpointConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointConfigsOutput, Unit]): Request[ListEndpointConfigsOutput, AWSError] = js.native
  /**
    * Lists endpoint configurations.
    */
  def listEndpointConfigs(params: ListEndpointConfigsInput): Request[ListEndpointConfigsOutput, AWSError] = js.native
  def listEndpointConfigs(
    params: ListEndpointConfigsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointConfigsOutput, Unit]
  ): Request[ListEndpointConfigsOutput, AWSError] = js.native
  
  /**
    * Lists endpoints.
    */
  def listEndpoints(): Request[ListEndpointsOutput, AWSError] = js.native
  def listEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsOutput, Unit]): Request[ListEndpointsOutput, AWSError] = js.native
  /**
    * Lists endpoints.
    */
  def listEndpoints(params: ListEndpointsInput): Request[ListEndpointsOutput, AWSError] = js.native
  def listEndpoints(
    params: ListEndpointsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsOutput, Unit]
  ): Request[ListEndpointsOutput, AWSError] = js.native
  
  /**
    * Lists all the experiments in your account. The list can be filtered to show only experiments that were created in a specific time range. The list can be sorted by experiment name or creation time.
    */
  def listExperiments(): Request[ListExperimentsResponse, AWSError] = js.native
  def listExperiments(callback: js.Function2[/* err */ AWSError, /* data */ ListExperimentsResponse, Unit]): Request[ListExperimentsResponse, AWSError] = js.native
  /**
    * Lists all the experiments in your account. The list can be filtered to show only experiments that were created in a specific time range. The list can be sorted by experiment name or creation time.
    */
  def listExperiments(params: ListExperimentsRequest): Request[ListExperimentsResponse, AWSError] = js.native
  def listExperiments(
    params: ListExperimentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExperimentsResponse, Unit]
  ): Request[ListExperimentsResponse, AWSError] = js.native
  
  /**
    * List FeatureGroups based on given filter and order.
    */
  def listFeatureGroups(): Request[ListFeatureGroupsResponse, AWSError] = js.native
  def listFeatureGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListFeatureGroupsResponse, Unit]): Request[ListFeatureGroupsResponse, AWSError] = js.native
  /**
    * List FeatureGroups based on given filter and order.
    */
  def listFeatureGroups(params: ListFeatureGroupsRequest): Request[ListFeatureGroupsResponse, AWSError] = js.native
  def listFeatureGroups(
    params: ListFeatureGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFeatureGroupsResponse, Unit]
  ): Request[ListFeatureGroupsResponse, AWSError] = js.native
  
  /**
    * Returns information about the flow definitions in your account.
    */
  def listFlowDefinitions(): Request[ListFlowDefinitionsResponse, AWSError] = js.native
  def listFlowDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListFlowDefinitionsResponse, Unit]): Request[ListFlowDefinitionsResponse, AWSError] = js.native
  /**
    * Returns information about the flow definitions in your account.
    */
  def listFlowDefinitions(params: ListFlowDefinitionsRequest): Request[ListFlowDefinitionsResponse, AWSError] = js.native
  def listFlowDefinitions(
    params: ListFlowDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFlowDefinitionsResponse, Unit]
  ): Request[ListFlowDefinitionsResponse, AWSError] = js.native
  
  /**
    * Returns information about the human task user interfaces in your account.
    */
  def listHumanTaskUis(): Request[ListHumanTaskUisResponse, AWSError] = js.native
  def listHumanTaskUis(callback: js.Function2[/* err */ AWSError, /* data */ ListHumanTaskUisResponse, Unit]): Request[ListHumanTaskUisResponse, AWSError] = js.native
  /**
    * Returns information about the human task user interfaces in your account.
    */
  def listHumanTaskUis(params: ListHumanTaskUisRequest): Request[ListHumanTaskUisResponse, AWSError] = js.native
  def listHumanTaskUis(
    params: ListHumanTaskUisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHumanTaskUisResponse, Unit]
  ): Request[ListHumanTaskUisResponse, AWSError] = js.native
  
  /**
    * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
    */
  def listHyperParameterTuningJobs(): Request[ListHyperParameterTuningJobsResponse, AWSError] = js.native
  def listHyperParameterTuningJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListHyperParameterTuningJobsResponse, Unit]): Request[ListHyperParameterTuningJobsResponse, AWSError] = js.native
  /**
    * Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs launched in your account.
    */
  def listHyperParameterTuningJobs(params: ListHyperParameterTuningJobsRequest): Request[ListHyperParameterTuningJobsResponse, AWSError] = js.native
  def listHyperParameterTuningJobs(
    params: ListHyperParameterTuningJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHyperParameterTuningJobsResponse, Unit]
  ): Request[ListHyperParameterTuningJobsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a specified image and their properties. The list can be filtered by creation time or modified time.
    */
  def listImageVersions(): Request[ListImageVersionsResponse, AWSError] = js.native
  def listImageVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListImageVersionsResponse, Unit]): Request[ListImageVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a specified image and their properties. The list can be filtered by creation time or modified time.
    */
  def listImageVersions(params: ListImageVersionsRequest): Request[ListImageVersionsResponse, AWSError] = js.native
  def listImageVersions(
    params: ListImageVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImageVersionsResponse, Unit]
  ): Request[ListImageVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the images in your account and their properties. The list can be filtered by creation time or modified time, and whether the image name contains a specified string.
    */
  def listImages(): Request[ListImagesResponse, AWSError] = js.native
  def listImages(callback: js.Function2[/* err */ AWSError, /* data */ ListImagesResponse, Unit]): Request[ListImagesResponse, AWSError] = js.native
  /**
    * Lists the images in your account and their properties. The list can be filtered by creation time or modified time, and whether the image name contains a specified string.
    */
  def listImages(params: ListImagesRequest): Request[ListImagesResponse, AWSError] = js.native
  def listImages(
    params: ListImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImagesResponse, Unit]
  ): Request[ListImagesResponse, AWSError] = js.native
  
  /**
    * Lists recommendation jobs that satisfy various filters.
    */
  def listInferenceRecommendationsJobs(): Request[ListInferenceRecommendationsJobsResponse, AWSError] = js.native
  def listInferenceRecommendationsJobs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListInferenceRecommendationsJobsResponse, Unit]
  ): Request[ListInferenceRecommendationsJobsResponse, AWSError] = js.native
  /**
    * Lists recommendation jobs that satisfy various filters.
    */
  def listInferenceRecommendationsJobs(params: ListInferenceRecommendationsJobsRequest): Request[ListInferenceRecommendationsJobsResponse, AWSError] = js.native
  def listInferenceRecommendationsJobs(
    params: ListInferenceRecommendationsJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInferenceRecommendationsJobsResponse, Unit]
  ): Request[ListInferenceRecommendationsJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of labeling jobs.
    */
  def listLabelingJobs(): Request[ListLabelingJobsResponse, AWSError] = js.native
  def listLabelingJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListLabelingJobsResponse, Unit]): Request[ListLabelingJobsResponse, AWSError] = js.native
  /**
    * Gets a list of labeling jobs.
    */
  def listLabelingJobs(params: ListLabelingJobsRequest): Request[ListLabelingJobsResponse, AWSError] = js.native
  def listLabelingJobs(
    params: ListLabelingJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLabelingJobsResponse, Unit]
  ): Request[ListLabelingJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of labeling jobs assigned to a specified work team.
    */
  def listLabelingJobsForWorkteam(): Request[ListLabelingJobsForWorkteamResponse, AWSError] = js.native
  def listLabelingJobsForWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ ListLabelingJobsForWorkteamResponse, Unit]): Request[ListLabelingJobsForWorkteamResponse, AWSError] = js.native
  /**
    * Gets a list of labeling jobs assigned to a specified work team.
    */
  def listLabelingJobsForWorkteam(params: ListLabelingJobsForWorkteamRequest): Request[ListLabelingJobsForWorkteamResponse, AWSError] = js.native
  def listLabelingJobsForWorkteam(
    params: ListLabelingJobsForWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLabelingJobsForWorkteamResponse, Unit]
  ): Request[ListLabelingJobsForWorkteamResponse, AWSError] = js.native
  
  /**
    * A list of lineage groups shared with your Amazon Web Services account. For more information, see  Cross-Account Lineage Tracking  in the Amazon SageMaker Developer Guide.
    */
  def listLineageGroups(): Request[ListLineageGroupsResponse, AWSError] = js.native
  def listLineageGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListLineageGroupsResponse, Unit]): Request[ListLineageGroupsResponse, AWSError] = js.native
  /**
    * A list of lineage groups shared with your Amazon Web Services account. For more information, see  Cross-Account Lineage Tracking  in the Amazon SageMaker Developer Guide.
    */
  def listLineageGroups(params: ListLineageGroupsRequest): Request[ListLineageGroupsResponse, AWSError] = js.native
  def listLineageGroups(
    params: ListLineageGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLineageGroupsResponse, Unit]
  ): Request[ListLineageGroupsResponse, AWSError] = js.native
  
  /**
    * Lists model bias jobs definitions that satisfy various filters.
    */
  def listModelBiasJobDefinitions(): Request[ListModelBiasJobDefinitionsResponse, AWSError] = js.native
  def listModelBiasJobDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListModelBiasJobDefinitionsResponse, Unit]): Request[ListModelBiasJobDefinitionsResponse, AWSError] = js.native
  /**
    * Lists model bias jobs definitions that satisfy various filters.
    */
  def listModelBiasJobDefinitions(params: ListModelBiasJobDefinitionsRequest): Request[ListModelBiasJobDefinitionsResponse, AWSError] = js.native
  def listModelBiasJobDefinitions(
    params: ListModelBiasJobDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelBiasJobDefinitionsResponse, Unit]
  ): Request[ListModelBiasJobDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists model explainability job definitions that satisfy various filters.
    */
  def listModelExplainabilityJobDefinitions(): Request[ListModelExplainabilityJobDefinitionsResponse, AWSError] = js.native
  def listModelExplainabilityJobDefinitions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelExplainabilityJobDefinitionsResponse, Unit]
  ): Request[ListModelExplainabilityJobDefinitionsResponse, AWSError] = js.native
  /**
    * Lists model explainability job definitions that satisfy various filters.
    */
  def listModelExplainabilityJobDefinitions(params: ListModelExplainabilityJobDefinitionsRequest): Request[ListModelExplainabilityJobDefinitionsResponse, AWSError] = js.native
  def listModelExplainabilityJobDefinitions(
    params: ListModelExplainabilityJobDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelExplainabilityJobDefinitionsResponse, Unit]
  ): Request[ListModelExplainabilityJobDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists the domain, framework, task, and model name of standard machine learning models found in common model zoos.
    */
  def listModelMetadata(): Request[ListModelMetadataResponse, AWSError] = js.native
  def listModelMetadata(callback: js.Function2[/* err */ AWSError, /* data */ ListModelMetadataResponse, Unit]): Request[ListModelMetadataResponse, AWSError] = js.native
  /**
    * Lists the domain, framework, task, and model name of standard machine learning models found in common model zoos.
    */
  def listModelMetadata(params: ListModelMetadataRequest): Request[ListModelMetadataResponse, AWSError] = js.native
  def listModelMetadata(
    params: ListModelMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelMetadataResponse, Unit]
  ): Request[ListModelMetadataResponse, AWSError] = js.native
  
  /**
    * Gets a list of the model groups in your Amazon Web Services account.
    */
  def listModelPackageGroups(): Request[ListModelPackageGroupsOutput, AWSError] = js.native
  def listModelPackageGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListModelPackageGroupsOutput, Unit]): Request[ListModelPackageGroupsOutput, AWSError] = js.native
  /**
    * Gets a list of the model groups in your Amazon Web Services account.
    */
  def listModelPackageGroups(params: ListModelPackageGroupsInput): Request[ListModelPackageGroupsOutput, AWSError] = js.native
  def listModelPackageGroups(
    params: ListModelPackageGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelPackageGroupsOutput, Unit]
  ): Request[ListModelPackageGroupsOutput, AWSError] = js.native
  
  /**
    * Lists the model packages that have been created.
    */
  def listModelPackages(): Request[ListModelPackagesOutput, AWSError] = js.native
  def listModelPackages(callback: js.Function2[/* err */ AWSError, /* data */ ListModelPackagesOutput, Unit]): Request[ListModelPackagesOutput, AWSError] = js.native
  /**
    * Lists the model packages that have been created.
    */
  def listModelPackages(params: ListModelPackagesInput): Request[ListModelPackagesOutput, AWSError] = js.native
  def listModelPackages(
    params: ListModelPackagesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelPackagesOutput, Unit]
  ): Request[ListModelPackagesOutput, AWSError] = js.native
  
  /**
    * Gets a list of model quality monitoring job definitions in your account.
    */
  def listModelQualityJobDefinitions(): Request[ListModelQualityJobDefinitionsResponse, AWSError] = js.native
  def listModelQualityJobDefinitions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelQualityJobDefinitionsResponse, Unit]
  ): Request[ListModelQualityJobDefinitionsResponse, AWSError] = js.native
  /**
    * Gets a list of model quality monitoring job definitions in your account.
    */
  def listModelQualityJobDefinitions(params: ListModelQualityJobDefinitionsRequest): Request[ListModelQualityJobDefinitionsResponse, AWSError] = js.native
  def listModelQualityJobDefinitions(
    params: ListModelQualityJobDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelQualityJobDefinitionsResponse, Unit]
  ): Request[ListModelQualityJobDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists models created with the CreateModel API.
    */
  def listModels(): Request[ListModelsOutput, AWSError] = js.native
  def listModels(callback: js.Function2[/* err */ AWSError, /* data */ ListModelsOutput, Unit]): Request[ListModelsOutput, AWSError] = js.native
  /**
    * Lists models created with the CreateModel API.
    */
  def listModels(params: ListModelsInput): Request[ListModelsOutput, AWSError] = js.native
  def listModels(
    params: ListModelsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelsOutput, Unit]
  ): Request[ListModelsOutput, AWSError] = js.native
  
  /**
    * Returns list of all monitoring job executions.
    */
  def listMonitoringExecutions(): Request[ListMonitoringExecutionsResponse, AWSError] = js.native
  def listMonitoringExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListMonitoringExecutionsResponse, Unit]): Request[ListMonitoringExecutionsResponse, AWSError] = js.native
  /**
    * Returns list of all monitoring job executions.
    */
  def listMonitoringExecutions(params: ListMonitoringExecutionsRequest): Request[ListMonitoringExecutionsResponse, AWSError] = js.native
  def listMonitoringExecutions(
    params: ListMonitoringExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMonitoringExecutionsResponse, Unit]
  ): Request[ListMonitoringExecutionsResponse, AWSError] = js.native
  
  /**
    * Returns list of all monitoring schedules.
    */
  def listMonitoringSchedules(): Request[ListMonitoringSchedulesResponse, AWSError] = js.native
  def listMonitoringSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListMonitoringSchedulesResponse, Unit]): Request[ListMonitoringSchedulesResponse, AWSError] = js.native
  /**
    * Returns list of all monitoring schedules.
    */
  def listMonitoringSchedules(params: ListMonitoringSchedulesRequest): Request[ListMonitoringSchedulesResponse, AWSError] = js.native
  def listMonitoringSchedules(
    params: ListMonitoringSchedulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMonitoringSchedulesResponse, Unit]
  ): Request[ListMonitoringSchedulesResponse, AWSError] = js.native
  
  /**
    * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def listNotebookInstanceLifecycleConfigs(): Request[ListNotebookInstanceLifecycleConfigsOutput, AWSError] = js.native
  def listNotebookInstanceLifecycleConfigs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstanceLifecycleConfigsOutput, Unit]
  ): Request[ListNotebookInstanceLifecycleConfigsOutput, AWSError] = js.native
  /**
    * Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def listNotebookInstanceLifecycleConfigs(params: ListNotebookInstanceLifecycleConfigsInput): Request[ListNotebookInstanceLifecycleConfigsOutput, AWSError] = js.native
  def listNotebookInstanceLifecycleConfigs(
    params: ListNotebookInstanceLifecycleConfigsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstanceLifecycleConfigsOutput, Unit]
  ): Request[ListNotebookInstanceLifecycleConfigsOutput, AWSError] = js.native
  
  /**
    * Returns a list of the SageMaker notebook instances in the requester's account in an Amazon Web Services Region. 
    */
  def listNotebookInstances(): Request[ListNotebookInstancesOutput, AWSError] = js.native
  def listNotebookInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstancesOutput, Unit]): Request[ListNotebookInstancesOutput, AWSError] = js.native
  /**
    * Returns a list of the SageMaker notebook instances in the requester's account in an Amazon Web Services Region. 
    */
  def listNotebookInstances(params: ListNotebookInstancesInput): Request[ListNotebookInstancesOutput, AWSError] = js.native
  def listNotebookInstances(
    params: ListNotebookInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstancesOutput, Unit]
  ): Request[ListNotebookInstancesOutput, AWSError] = js.native
  
  /**
    * Gets a list of PipeLineExecutionStep objects.
    */
  def listPipelineExecutionSteps(): Request[ListPipelineExecutionStepsResponse, AWSError] = js.native
  def listPipelineExecutionSteps(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineExecutionStepsResponse, Unit]): Request[ListPipelineExecutionStepsResponse, AWSError] = js.native
  /**
    * Gets a list of PipeLineExecutionStep objects.
    */
  def listPipelineExecutionSteps(params: ListPipelineExecutionStepsRequest): Request[ListPipelineExecutionStepsResponse, AWSError] = js.native
  def listPipelineExecutionSteps(
    params: ListPipelineExecutionStepsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineExecutionStepsResponse, Unit]
  ): Request[ListPipelineExecutionStepsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the pipeline executions.
    */
  def listPipelineExecutions(): Request[ListPipelineExecutionsResponse, AWSError] = js.native
  def listPipelineExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineExecutionsResponse, Unit]): Request[ListPipelineExecutionsResponse, AWSError] = js.native
  /**
    * Gets a list of the pipeline executions.
    */
  def listPipelineExecutions(params: ListPipelineExecutionsRequest): Request[ListPipelineExecutionsResponse, AWSError] = js.native
  def listPipelineExecutions(
    params: ListPipelineExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineExecutionsResponse, Unit]
  ): Request[ListPipelineExecutionsResponse, AWSError] = js.native
  
  /**
    * Gets a list of parameters for a pipeline execution.
    */
  def listPipelineParametersForExecution(): Request[ListPipelineParametersForExecutionResponse, AWSError] = js.native
  def listPipelineParametersForExecution(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineParametersForExecutionResponse, Unit]
  ): Request[ListPipelineParametersForExecutionResponse, AWSError] = js.native
  /**
    * Gets a list of parameters for a pipeline execution.
    */
  def listPipelineParametersForExecution(params: ListPipelineParametersForExecutionRequest): Request[ListPipelineParametersForExecutionResponse, AWSError] = js.native
  def listPipelineParametersForExecution(
    params: ListPipelineParametersForExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineParametersForExecutionResponse, Unit]
  ): Request[ListPipelineParametersForExecutionResponse, AWSError] = js.native
  
  /**
    * Gets a list of pipelines.
    */
  def listPipelines(): Request[ListPipelinesResponse, AWSError] = js.native
  def listPipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesResponse, Unit]): Request[ListPipelinesResponse, AWSError] = js.native
  /**
    * Gets a list of pipelines.
    */
  def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse, AWSError] = js.native
  def listPipelines(
    params: ListPipelinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesResponse, Unit]
  ): Request[ListPipelinesResponse, AWSError] = js.native
  
  /**
    * Lists processing jobs that satisfy various filters.
    */
  def listProcessingJobs(): Request[ListProcessingJobsResponse, AWSError] = js.native
  def listProcessingJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListProcessingJobsResponse, Unit]): Request[ListProcessingJobsResponse, AWSError] = js.native
  /**
    * Lists processing jobs that satisfy various filters.
    */
  def listProcessingJobs(params: ListProcessingJobsRequest): Request[ListProcessingJobsResponse, AWSError] = js.native
  def listProcessingJobs(
    params: ListProcessingJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProcessingJobsResponse, Unit]
  ): Request[ListProcessingJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the projects in an Amazon Web Services account.
    */
  def listProjects(): Request[ListProjectsOutput, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsOutput, Unit]): Request[ListProjectsOutput, AWSError] = js.native
  /**
    * Gets a list of the projects in an Amazon Web Services account.
    */
  def listProjects(params: ListProjectsInput): Request[ListProjectsOutput, AWSError] = js.native
  def listProjects(
    params: ListProjectsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsOutput, Unit]
  ): Request[ListProjectsOutput, AWSError] = js.native
  
  /**
    * Lists devices allocated to the stage, containing detailed device information and deployment status.
    */
  def listStageDevices(): Request[ListStageDevicesResponse, AWSError] = js.native
  def listStageDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListStageDevicesResponse, Unit]): Request[ListStageDevicesResponse, AWSError] = js.native
  /**
    * Lists devices allocated to the stage, containing detailed device information and deployment status.
    */
  def listStageDevices(params: ListStageDevicesRequest): Request[ListStageDevicesResponse, AWSError] = js.native
  def listStageDevices(
    params: ListStageDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStageDevicesResponse, Unit]
  ): Request[ListStageDevicesResponse, AWSError] = js.native
  
  /**
    * Lists the Studio Lifecycle Configurations in your Amazon Web Services Account.
    */
  def listStudioLifecycleConfigs(): Request[ListStudioLifecycleConfigsResponse, AWSError] = js.native
  def listStudioLifecycleConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListStudioLifecycleConfigsResponse, Unit]): Request[ListStudioLifecycleConfigsResponse, AWSError] = js.native
  /**
    * Lists the Studio Lifecycle Configurations in your Amazon Web Services Account.
    */
  def listStudioLifecycleConfigs(params: ListStudioLifecycleConfigsRequest): Request[ListStudioLifecycleConfigsResponse, AWSError] = js.native
  def listStudioLifecycleConfigs(
    params: ListStudioLifecycleConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStudioLifecycleConfigsResponse, Unit]
  ): Request[ListStudioLifecycleConfigsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the work teams that you are subscribed to in the Amazon Web Services Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listSubscribedWorkteams(): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  def listSubscribedWorkteams(callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribedWorkteamsResponse, Unit]): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  /**
    * Gets a list of the work teams that you are subscribed to in the Amazon Web Services Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  def listSubscribedWorkteams(
    params: ListSubscribedWorkteamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribedWorkteamsResponse, Unit]
  ): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  
  /**
    * Returns the tags for the specified SageMaker resource.
    */
  def listTags(): Request[ListTagsOutput, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  /**
    * Returns the tags for the specified SageMaker resource.
    */
  def listTags(params: ListTagsInput): Request[ListTagsOutput, AWSError] = js.native
  def listTags(params: ListTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  
  /**
    * Lists training jobs.  When StatusEquals and MaxResults are set at the same time, the MaxResults number of training jobs are first retrieved ignoring the StatusEquals parameter and then they are filtered by the StatusEquals parameter, which is returned as a response. For example, if ListTrainingJobs is invoked with the following parameters:  { ... MaxResults: 100, StatusEquals: InProgress ... }  First, 100 trainings jobs with any status, including those other than InProgress, are selected (sorted according to the creation time, from the most current to the oldest). Next, those with a status of InProgress are returned. You can quickly test the API using the following Amazon Web Services CLI code.  aws sagemaker list-training-jobs --max-results 100 --status-equals InProgress  
    */
  def listTrainingJobs(): Request[ListTrainingJobsResponse, AWSError] = js.native
  def listTrainingJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTrainingJobsResponse, Unit]): Request[ListTrainingJobsResponse, AWSError] = js.native
  /**
    * Lists training jobs.  When StatusEquals and MaxResults are set at the same time, the MaxResults number of training jobs are first retrieved ignoring the StatusEquals parameter and then they are filtered by the StatusEquals parameter, which is returned as a response. For example, if ListTrainingJobs is invoked with the following parameters:  { ... MaxResults: 100, StatusEquals: InProgress ... }  First, 100 trainings jobs with any status, including those other than InProgress, are selected (sorted according to the creation time, from the most current to the oldest). Next, those with a status of InProgress are returned. You can quickly test the API using the following Amazon Web Services CLI code.  aws sagemaker list-training-jobs --max-results 100 --status-equals InProgress  
    */
  def listTrainingJobs(params: ListTrainingJobsRequest): Request[ListTrainingJobsResponse, AWSError] = js.native
  def listTrainingJobs(
    params: ListTrainingJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrainingJobsResponse, Unit]
  ): Request[ListTrainingJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
    */
  def listTrainingJobsForHyperParameterTuningJob(): Request[ListTrainingJobsForHyperParameterTuningJobResponse, AWSError] = js.native
  def listTrainingJobsForHyperParameterTuningJob(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListTrainingJobsForHyperParameterTuningJobResponse, 
      Unit
    ]
  ): Request[ListTrainingJobsForHyperParameterTuningJobResponse, AWSError] = js.native
  /**
    * Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job launched.
    */
  def listTrainingJobsForHyperParameterTuningJob(params: ListTrainingJobsForHyperParameterTuningJobRequest): Request[ListTrainingJobsForHyperParameterTuningJobResponse, AWSError] = js.native
  def listTrainingJobsForHyperParameterTuningJob(
    params: ListTrainingJobsForHyperParameterTuningJobRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListTrainingJobsForHyperParameterTuningJobResponse, 
      Unit
    ]
  ): Request[ListTrainingJobsForHyperParameterTuningJobResponse, AWSError] = js.native
  
  /**
    * Lists transform jobs.
    */
  def listTransformJobs(): Request[ListTransformJobsResponse, AWSError] = js.native
  def listTransformJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTransformJobsResponse, Unit]): Request[ListTransformJobsResponse, AWSError] = js.native
  /**
    * Lists transform jobs.
    */
  def listTransformJobs(params: ListTransformJobsRequest): Request[ListTransformJobsResponse, AWSError] = js.native
  def listTransformJobs(
    params: ListTransformJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTransformJobsResponse, Unit]
  ): Request[ListTransformJobsResponse, AWSError] = js.native
  
  /**
    * Lists the trial components in your account. You can sort the list by trial component name or creation time. You can filter the list to show only components that were created in a specific time range. You can also filter on one of the following:    ExperimentName     SourceArn     TrialName   
    */
  def listTrialComponents(): Request[ListTrialComponentsResponse, AWSError] = js.native
  def listTrialComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListTrialComponentsResponse, Unit]): Request[ListTrialComponentsResponse, AWSError] = js.native
  /**
    * Lists the trial components in your account. You can sort the list by trial component name or creation time. You can filter the list to show only components that were created in a specific time range. You can also filter on one of the following:    ExperimentName     SourceArn     TrialName   
    */
  def listTrialComponents(params: ListTrialComponentsRequest): Request[ListTrialComponentsResponse, AWSError] = js.native
  def listTrialComponents(
    params: ListTrialComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrialComponentsResponse, Unit]
  ): Request[ListTrialComponentsResponse, AWSError] = js.native
  
  /**
    * Lists the trials in your account. Specify an experiment name to limit the list to the trials that are part of that experiment. Specify a trial component name to limit the list to the trials that associated with that trial component. The list can be filtered to show only trials that were created in a specific time range. The list can be sorted by trial name or creation time.
    */
  def listTrials(): Request[ListTrialsResponse, AWSError] = js.native
  def listTrials(callback: js.Function2[/* err */ AWSError, /* data */ ListTrialsResponse, Unit]): Request[ListTrialsResponse, AWSError] = js.native
  /**
    * Lists the trials in your account. Specify an experiment name to limit the list to the trials that are part of that experiment. Specify a trial component name to limit the list to the trials that associated with that trial component. The list can be filtered to show only trials that were created in a specific time range. The list can be sorted by trial name or creation time.
    */
  def listTrials(params: ListTrialsRequest): Request[ListTrialsResponse, AWSError] = js.native
  def listTrials(
    params: ListTrialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrialsResponse, Unit]
  ): Request[ListTrialsResponse, AWSError] = js.native
  
  /**
    * Lists user profiles.
    */
  def listUserProfiles(): Request[ListUserProfilesResponse, AWSError] = js.native
  def listUserProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListUserProfilesResponse, Unit]): Request[ListUserProfilesResponse, AWSError] = js.native
  /**
    * Lists user profiles.
    */
  def listUserProfiles(params: ListUserProfilesRequest): Request[ListUserProfilesResponse, AWSError] = js.native
  def listUserProfiles(
    params: ListUserProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserProfilesResponse, Unit]
  ): Request[ListUserProfilesResponse, AWSError] = js.native
  
  /**
    * Use this operation to list all private and vendor workforces in an Amazon Web Services Region. Note that you can only have one private workforce per Amazon Web Services Region.
    */
  def listWorkforces(): Request[ListWorkforcesResponse, AWSError] = js.native
  def listWorkforces(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkforcesResponse, Unit]): Request[ListWorkforcesResponse, AWSError] = js.native
  /**
    * Use this operation to list all private and vendor workforces in an Amazon Web Services Region. Note that you can only have one private workforce per Amazon Web Services Region.
    */
  def listWorkforces(params: ListWorkforcesRequest): Request[ListWorkforcesResponse, AWSError] = js.native
  def listWorkforces(
    params: ListWorkforcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkforcesResponse, Unit]
  ): Request[ListWorkforcesResponse, AWSError] = js.native
  
  /**
    * Gets a list of private work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listWorkteams(): Request[ListWorkteamsResponse, AWSError] = js.native
  def listWorkteams(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkteamsResponse, Unit]): Request[ListWorkteamsResponse, AWSError] = js.native
  /**
    * Gets a list of private work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listWorkteams(params: ListWorkteamsRequest): Request[ListWorkteamsResponse, AWSError] = js.native
  def listWorkteams(
    params: ListWorkteamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkteamsResponse, Unit]
  ): Request[ListWorkteamsResponse, AWSError] = js.native
  
  /**
    * Adds a resouce policy to control access to a model group. For information about resoure policies, see Identity-based policies and resource-based policies in the Amazon Web Services Identity and Access Management User Guide..
    */
  def putModelPackageGroupPolicy(): Request[PutModelPackageGroupPolicyOutput, AWSError] = js.native
  def putModelPackageGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutModelPackageGroupPolicyOutput, Unit]): Request[PutModelPackageGroupPolicyOutput, AWSError] = js.native
  /**
    * Adds a resouce policy to control access to a model group. For information about resoure policies, see Identity-based policies and resource-based policies in the Amazon Web Services Identity and Access Management User Guide..
    */
  def putModelPackageGroupPolicy(params: PutModelPackageGroupPolicyInput): Request[PutModelPackageGroupPolicyOutput, AWSError] = js.native
  def putModelPackageGroupPolicy(
    params: PutModelPackageGroupPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutModelPackageGroupPolicyOutput, Unit]
  ): Request[PutModelPackageGroupPolicyOutput, AWSError] = js.native
  
  /**
    * Use this action to inspect your lineage and discover relationships between entities. For more information, see  Querying Lineage Entities in the Amazon SageMaker Developer Guide.
    */
  def queryLineage(): Request[QueryLineageResponse, AWSError] = js.native
  def queryLineage(callback: js.Function2[/* err */ AWSError, /* data */ QueryLineageResponse, Unit]): Request[QueryLineageResponse, AWSError] = js.native
  /**
    * Use this action to inspect your lineage and discover relationships between entities. For more information, see  Querying Lineage Entities in the Amazon SageMaker Developer Guide.
    */
  def queryLineage(params: QueryLineageRequest): Request[QueryLineageResponse, AWSError] = js.native
  def queryLineage(
    params: QueryLineageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ QueryLineageResponse, Unit]
  ): Request[QueryLineageResponse, AWSError] = js.native
  
  /**
    * Register devices.
    */
  def registerDevices(): Request[js.Object, AWSError] = js.native
  def registerDevices(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Register devices.
    */
  def registerDevices(params: RegisterDevicesRequest): Request[js.Object, AWSError] = js.native
  def registerDevices(
    params: RegisterDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Renders the UI template so that you can preview the worker's experience. 
    */
  def renderUiTemplate(): Request[RenderUiTemplateResponse, AWSError] = js.native
  def renderUiTemplate(callback: js.Function2[/* err */ AWSError, /* data */ RenderUiTemplateResponse, Unit]): Request[RenderUiTemplateResponse, AWSError] = js.native
  /**
    * Renders the UI template so that you can preview the worker's experience. 
    */
  def renderUiTemplate(params: RenderUiTemplateRequest): Request[RenderUiTemplateResponse, AWSError] = js.native
  def renderUiTemplate(
    params: RenderUiTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RenderUiTemplateResponse, Unit]
  ): Request[RenderUiTemplateResponse, AWSError] = js.native
  
  /**
    * Retry the execution of the pipeline.
    */
  def retryPipelineExecution(): Request[RetryPipelineExecutionResponse, AWSError] = js.native
  def retryPipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ RetryPipelineExecutionResponse, Unit]): Request[RetryPipelineExecutionResponse, AWSError] = js.native
  /**
    * Retry the execution of the pipeline.
    */
  def retryPipelineExecution(params: RetryPipelineExecutionRequest): Request[RetryPipelineExecutionResponse, AWSError] = js.native
  def retryPipelineExecution(
    params: RetryPipelineExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RetryPipelineExecutionResponse, Unit]
  ): Request[RetryPipelineExecutionResponse, AWSError] = js.native
  
  /**
    * Finds Amazon SageMaker resources that match a search query. Matching resources are returned as a list of SearchRecord objects in the response. You can sort the search results by any resource property in a ascending or descending order. You can query against the following value types: numeric, text, Boolean, and timestamp.
    */
  def search(): Request[SearchResponse, AWSError] = js.native
  def search(callback: js.Function2[/* err */ AWSError, /* data */ SearchResponse, Unit]): Request[SearchResponse, AWSError] = js.native
  /**
    * Finds Amazon SageMaker resources that match a search query. Matching resources are returned as a list of SearchRecord objects in the response. You can sort the search results by any resource property in a ascending or descending order. You can query against the following value types: numeric, text, Boolean, and timestamp.
    */
  def search(params: SearchRequest): Request[SearchResponse, AWSError] = js.native
  def search(params: SearchRequest, callback: js.Function2[/* err */ AWSError, /* data */ SearchResponse, Unit]): Request[SearchResponse, AWSError] = js.native
  
  /**
    * Notifies the pipeline that the execution of a callback step failed, along with a message describing why. When a callback step is run, the pipeline generates a callback token and includes the token in a message sent to Amazon Simple Queue Service (Amazon SQS).
    */
  def sendPipelineExecutionStepFailure(): Request[SendPipelineExecutionStepFailureResponse, AWSError] = js.native
  def sendPipelineExecutionStepFailure(
    callback: js.Function2[/* err */ AWSError, /* data */ SendPipelineExecutionStepFailureResponse, Unit]
  ): Request[SendPipelineExecutionStepFailureResponse, AWSError] = js.native
  /**
    * Notifies the pipeline that the execution of a callback step failed, along with a message describing why. When a callback step is run, the pipeline generates a callback token and includes the token in a message sent to Amazon Simple Queue Service (Amazon SQS).
    */
  def sendPipelineExecutionStepFailure(params: SendPipelineExecutionStepFailureRequest): Request[SendPipelineExecutionStepFailureResponse, AWSError] = js.native
  def sendPipelineExecutionStepFailure(
    params: SendPipelineExecutionStepFailureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendPipelineExecutionStepFailureResponse, Unit]
  ): Request[SendPipelineExecutionStepFailureResponse, AWSError] = js.native
  
  /**
    * Notifies the pipeline that the execution of a callback step succeeded and provides a list of the step's output parameters. When a callback step is run, the pipeline generates a callback token and includes the token in a message sent to Amazon Simple Queue Service (Amazon SQS).
    */
  def sendPipelineExecutionStepSuccess(): Request[SendPipelineExecutionStepSuccessResponse, AWSError] = js.native
  def sendPipelineExecutionStepSuccess(
    callback: js.Function2[/* err */ AWSError, /* data */ SendPipelineExecutionStepSuccessResponse, Unit]
  ): Request[SendPipelineExecutionStepSuccessResponse, AWSError] = js.native
  /**
    * Notifies the pipeline that the execution of a callback step succeeded and provides a list of the step's output parameters. When a callback step is run, the pipeline generates a callback token and includes the token in a message sent to Amazon Simple Queue Service (Amazon SQS).
    */
  def sendPipelineExecutionStepSuccess(params: SendPipelineExecutionStepSuccessRequest): Request[SendPipelineExecutionStepSuccessResponse, AWSError] = js.native
  def sendPipelineExecutionStepSuccess(
    params: SendPipelineExecutionStepSuccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendPipelineExecutionStepSuccessResponse, Unit]
  ): Request[SendPipelineExecutionStepSuccessResponse, AWSError] = js.native
  
  /**
    * Starts a stage in an edge deployment plan.
    */
  def startEdgeDeploymentStage(): Request[js.Object, AWSError] = js.native
  def startEdgeDeploymentStage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts a stage in an edge deployment plan.
    */
  def startEdgeDeploymentStage(params: StartEdgeDeploymentStageRequest): Request[js.Object, AWSError] = js.native
  def startEdgeDeploymentStage(
    params: StartEdgeDeploymentStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a previously stopped monitoring schedule.  By default, when you successfully create a new schedule, the status of a monitoring schedule is scheduled. 
    */
  def startMonitoringSchedule(): Request[js.Object, AWSError] = js.native
  def startMonitoringSchedule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts a previously stopped monitoring schedule.  By default, when you successfully create a new schedule, the status of a monitoring schedule is scheduled. 
    */
  def startMonitoringSchedule(params: StartMonitoringScheduleRequest): Request[js.Object, AWSError] = js.native
  def startMonitoringSchedule(
    params: StartMonitoringScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
    */
  def startNotebookInstance(): Request[js.Object, AWSError] = js.native
  def startNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
    */
  def startNotebookInstance(params: StartNotebookInstanceInput): Request[js.Object, AWSError] = js.native
  def startNotebookInstance(
    params: StartNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a pipeline execution.
    */
  def startPipelineExecution(): Request[StartPipelineExecutionResponse, AWSError] = js.native
  def startPipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartPipelineExecutionResponse, Unit]): Request[StartPipelineExecutionResponse, AWSError] = js.native
  /**
    * Starts a pipeline execution.
    */
  def startPipelineExecution(params: StartPipelineExecutionRequest): Request[StartPipelineExecutionResponse, AWSError] = js.native
  def startPipelineExecution(
    params: StartPipelineExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPipelineExecutionResponse, Unit]
  ): Request[StartPipelineExecutionResponse, AWSError] = js.native
  
  /**
    * A method for forcing the termination of a running job.
    */
  def stopAutoMLJob(): Request[js.Object, AWSError] = js.native
  def stopAutoMLJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * A method for forcing the termination of a running job.
    */
  def stopAutoMLJob(params: StopAutoMLJobRequest): Request[js.Object, AWSError] = js.native
  def stopAutoMLJob(
    params: StopAutoMLJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn't stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
    */
  def stopCompilationJob(): Request[js.Object, AWSError] = js.native
  def stopCompilationJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a model compilation job.  To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If the job hasn't stopped, it sends the SIGKILL signal. When it receives a StopCompilationJob request, Amazon SageMaker changes the CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped. 
    */
  def stopCompilationJob(params: StopCompilationJobRequest): Request[js.Object, AWSError] = js.native
  def stopCompilationJob(
    params: StopCompilationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a stage in an edge deployment plan.
    */
  def stopEdgeDeploymentStage(): Request[js.Object, AWSError] = js.native
  def stopEdgeDeploymentStage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a stage in an edge deployment plan.
    */
  def stopEdgeDeploymentStage(params: StopEdgeDeploymentStageRequest): Request[js.Object, AWSError] = js.native
  def stopEdgeDeploymentStage(
    params: StopEdgeDeploymentStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Request to stop an edge packaging job.
    */
  def stopEdgePackagingJob(): Request[js.Object, AWSError] = js.native
  def stopEdgePackagingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Request to stop an edge packaging job.
    */
  def stopEdgePackagingJob(params: StopEdgePackagingJobRequest): Request[js.Object, AWSError] = js.native
  def stopEdgePackagingJob(
    params: StopEdgePackagingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
    */
  def stopHyperParameterTuningJob(): Request[js.Object, AWSError] = js.native
  def stopHyperParameterTuningJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched. All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning job moves to the Stopped state, it releases all reserved resources for the tuning job.
    */
  def stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest): Request[js.Object, AWSError] = js.native
  def stopHyperParameterTuningJob(
    params: StopHyperParameterTuningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops an Inference Recommender job.
    */
  def stopInferenceRecommendationsJob(): Request[js.Object, AWSError] = js.native
  def stopInferenceRecommendationsJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops an Inference Recommender job.
    */
  def stopInferenceRecommendationsJob(params: StopInferenceRecommendationsJobRequest): Request[js.Object, AWSError] = js.native
  def stopInferenceRecommendationsJob(
    params: StopInferenceRecommendationsJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
    */
  def stopLabelingJob(): Request[js.Object, AWSError] = js.native
  def stopLabelingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is stopped are placed in the Amazon S3 output bucket.
    */
  def stopLabelingJob(params: StopLabelingJobRequest): Request[js.Object, AWSError] = js.native
  def stopLabelingJob(
    params: StopLabelingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a previously started monitoring schedule.
    */
  def stopMonitoringSchedule(): Request[js.Object, AWSError] = js.native
  def stopMonitoringSchedule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a previously started monitoring schedule.
    */
  def stopMonitoringSchedule(params: StopMonitoringScheduleRequest): Request[js.Object, AWSError] = js.native
  def stopMonitoringSchedule(
    params: StopMonitoringScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Terminates the ML compute instance. Before terminating the instance, SageMaker disconnects the ML storage volume from it. SageMaker preserves the ML storage volume. SageMaker stops charging you for the ML compute instance when you call StopNotebookInstance. To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
    */
  def stopNotebookInstance(): Request[js.Object, AWSError] = js.native
  def stopNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Terminates the ML compute instance. Before terminating the instance, SageMaker disconnects the ML storage volume from it. SageMaker preserves the ML storage volume. SageMaker stops charging you for the ML compute instance when you call StopNotebookInstance. To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
    */
  def stopNotebookInstance(params: StopNotebookInstanceInput): Request[js.Object, AWSError] = js.native
  def stopNotebookInstance(
    params: StopNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a pipeline execution.  Callback Step  A pipeline execution won't stop while a callback step is running. When you call StopPipelineExecution on a pipeline execution with a running callback step, SageMaker Pipelines sends an additional Amazon SQS message to the specified SQS queue. The body of the SQS message contains a "Status" field which is set to "Stopping". You should add logic to your Amazon SQS message consumer to take any needed action (for example, resource cleanup) upon receipt of the message followed by a call to SendPipelineExecutionStepSuccess or SendPipelineExecutionStepFailure. Only when SageMaker Pipelines receives one of these calls will it stop the pipeline execution.  Lambda Step  A pipeline execution can't be stopped while a lambda step is running because the Lambda function invoked by the lambda step can't be stopped. If you attempt to stop the execution while the Lambda function is running, the pipeline waits for the Lambda function to finish or until the timeout is hit, whichever occurs first, and then stops. If the Lambda function finishes, the pipeline execution status is Stopped. If the timeout is hit the pipeline execution status is Failed.
    */
  def stopPipelineExecution(): Request[StopPipelineExecutionResponse, AWSError] = js.native
  def stopPipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ StopPipelineExecutionResponse, Unit]): Request[StopPipelineExecutionResponse, AWSError] = js.native
  /**
    * Stops a pipeline execution.  Callback Step  A pipeline execution won't stop while a callback step is running. When you call StopPipelineExecution on a pipeline execution with a running callback step, SageMaker Pipelines sends an additional Amazon SQS message to the specified SQS queue. The body of the SQS message contains a "Status" field which is set to "Stopping". You should add logic to your Amazon SQS message consumer to take any needed action (for example, resource cleanup) upon receipt of the message followed by a call to SendPipelineExecutionStepSuccess or SendPipelineExecutionStepFailure. Only when SageMaker Pipelines receives one of these calls will it stop the pipeline execution.  Lambda Step  A pipeline execution can't be stopped while a lambda step is running because the Lambda function invoked by the lambda step can't be stopped. If you attempt to stop the execution while the Lambda function is running, the pipeline waits for the Lambda function to finish or until the timeout is hit, whichever occurs first, and then stops. If the Lambda function finishes, the pipeline execution status is Stopped. If the timeout is hit the pipeline execution status is Failed.
    */
  def stopPipelineExecution(params: StopPipelineExecutionRequest): Request[StopPipelineExecutionResponse, AWSError] = js.native
  def stopPipelineExecution(
    params: StopPipelineExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopPipelineExecutionResponse, Unit]
  ): Request[StopPipelineExecutionResponse, AWSError] = js.native
  
  /**
    * Stops a processing job.
    */
  def stopProcessingJob(): Request[js.Object, AWSError] = js.native
  def stopProcessingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a processing job.
    */
  def stopProcessingJob(params: StopProcessingJobRequest): Request[js.Object, AWSError] = js.native
  def stopProcessingJob(
    params: StopProcessingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a training job. To stop a job, SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  When it receives a StopTrainingJob request, SageMaker changes the status of the job to Stopping. After SageMaker stops the job, it sets the status to Stopped.
    */
  def stopTrainingJob(): Request[js.Object, AWSError] = js.native
  def stopTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a training job. To stop a job, SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  When it receives a StopTrainingJob request, SageMaker changes the status of the job to Stopping. After SageMaker stops the job, it sets the status to Stopped.
    */
  def stopTrainingJob(params: StopTrainingJobRequest): Request[js.Object, AWSError] = js.native
  def stopTrainingJob(
    params: StopTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a batch transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a batch transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
    */
  def stopTransformJob(): Request[js.Object, AWSError] = js.native
  def stopTransformJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a batch transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a batch transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
    */
  def stopTransformJob(params: StopTransformJobRequest): Request[js.Object, AWSError] = js.native
  def stopTransformJob(
    params: StopTransformJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an action.
    */
  def updateAction(): Request[UpdateActionResponse, AWSError] = js.native
  def updateAction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionResponse, Unit]): Request[UpdateActionResponse, AWSError] = js.native
  /**
    * Updates an action.
    */
  def updateAction(params: UpdateActionRequest): Request[UpdateActionResponse, AWSError] = js.native
  def updateAction(
    params: UpdateActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionResponse, Unit]
  ): Request[UpdateActionResponse, AWSError] = js.native
  
  /**
    * Updates the properties of an AppImageConfig.
    */
  def updateAppImageConfig(): Request[UpdateAppImageConfigResponse, AWSError] = js.native
  def updateAppImageConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppImageConfigResponse, Unit]): Request[UpdateAppImageConfigResponse, AWSError] = js.native
  /**
    * Updates the properties of an AppImageConfig.
    */
  def updateAppImageConfig(params: UpdateAppImageConfigRequest): Request[UpdateAppImageConfigResponse, AWSError] = js.native
  def updateAppImageConfig(
    params: UpdateAppImageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppImageConfigResponse, Unit]
  ): Request[UpdateAppImageConfigResponse, AWSError] = js.native
  
  /**
    * Updates an artifact.
    */
  def updateArtifact(): Request[UpdateArtifactResponse, AWSError] = js.native
  def updateArtifact(callback: js.Function2[/* err */ AWSError, /* data */ UpdateArtifactResponse, Unit]): Request[UpdateArtifactResponse, AWSError] = js.native
  /**
    * Updates an artifact.
    */
  def updateArtifact(params: UpdateArtifactRequest): Request[UpdateArtifactResponse, AWSError] = js.native
  def updateArtifact(
    params: UpdateArtifactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateArtifactResponse, Unit]
  ): Request[UpdateArtifactResponse, AWSError] = js.native
  
  /**
    * Updates the specified Git repository with the specified values.
    */
  def updateCodeRepository(): Request[UpdateCodeRepositoryOutput, AWSError] = js.native
  def updateCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCodeRepositoryOutput, Unit]): Request[UpdateCodeRepositoryOutput, AWSError] = js.native
  /**
    * Updates the specified Git repository with the specified values.
    */
  def updateCodeRepository(params: UpdateCodeRepositoryInput): Request[UpdateCodeRepositoryOutput, AWSError] = js.native
  def updateCodeRepository(
    params: UpdateCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCodeRepositoryOutput, Unit]
  ): Request[UpdateCodeRepositoryOutput, AWSError] = js.native
  
  /**
    * Updates a context.
    */
  def updateContext(): Request[UpdateContextResponse, AWSError] = js.native
  def updateContext(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContextResponse, Unit]): Request[UpdateContextResponse, AWSError] = js.native
  /**
    * Updates a context.
    */
  def updateContext(params: UpdateContextRequest): Request[UpdateContextResponse, AWSError] = js.native
  def updateContext(
    params: UpdateContextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContextResponse, Unit]
  ): Request[UpdateContextResponse, AWSError] = js.native
  
  /**
    * Updates a fleet of devices.
    */
  def updateDeviceFleet(): Request[js.Object, AWSError] = js.native
  def updateDeviceFleet(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a fleet of devices.
    */
  def updateDeviceFleet(params: UpdateDeviceFleetRequest): Request[js.Object, AWSError] = js.native
  def updateDeviceFleet(
    params: UpdateDeviceFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates one or more devices in a fleet.
    */
  def updateDevices(): Request[js.Object, AWSError] = js.native
  def updateDevices(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates one or more devices in a fleet.
    */
  def updateDevices(params: UpdateDevicesRequest): Request[js.Object, AWSError] = js.native
  def updateDevices(
    params: UpdateDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the default settings for new user profiles in the domain.
    */
  def updateDomain(): Request[UpdateDomainResponse, AWSError] = js.native
  def updateDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainResponse, Unit]): Request[UpdateDomainResponse, AWSError] = js.native
  /**
    * Updates the default settings for new user profiles in the domain.
    */
  def updateDomain(params: UpdateDomainRequest): Request[UpdateDomainResponse, AWSError] = js.native
  def updateDomain(
    params: UpdateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainResponse, Unit]
  ): Request[UpdateDomainResponse, AWSError] = js.native
  
  /**
    * Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig. If you delete the EndpointConfig of an endpoint that is active or being created or updated you may lose visibility into the instance type the endpoint is using. The endpoint must be deleted in order to stop incurring charges. 
    */
  def updateEndpoint(): Request[UpdateEndpointOutput, AWSError] = js.native
  def updateEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointOutput, Unit]): Request[UpdateEndpointOutput, AWSError] = js.native
  /**
    * Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig. If you delete the EndpointConfig of an endpoint that is active or being created or updated you may lose visibility into the instance type the endpoint is using. The endpoint must be deleted in order to stop incurring charges. 
    */
  def updateEndpoint(params: UpdateEndpointInput): Request[UpdateEndpointOutput, AWSError] = js.native
  def updateEndpoint(
    params: UpdateEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointOutput, Unit]
  ): Request[UpdateEndpointOutput, AWSError] = js.native
  
  /**
    * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
    */
  def updateEndpointWeightsAndCapacities(): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  def updateEndpointWeightsAndCapacities(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointWeightsAndCapacitiesOutput, Unit]
  ): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  /**
    * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
    */
  def updateEndpointWeightsAndCapacities(params: UpdateEndpointWeightsAndCapacitiesInput): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  def updateEndpointWeightsAndCapacities(
    params: UpdateEndpointWeightsAndCapacitiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointWeightsAndCapacitiesOutput, Unit]
  ): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  
  /**
    * Adds, updates, or removes the description of an experiment. Updates the display name of an experiment.
    */
  def updateExperiment(): Request[UpdateExperimentResponse, AWSError] = js.native
  def updateExperiment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateExperimentResponse, Unit]): Request[UpdateExperimentResponse, AWSError] = js.native
  /**
    * Adds, updates, or removes the description of an experiment. Updates the display name of an experiment.
    */
  def updateExperiment(params: UpdateExperimentRequest): Request[UpdateExperimentResponse, AWSError] = js.native
  def updateExperiment(
    params: UpdateExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateExperimentResponse, Unit]
  ): Request[UpdateExperimentResponse, AWSError] = js.native
  
  /**
    * Updates the feature group.
    */
  def updateFeatureGroup(): Request[UpdateFeatureGroupResponse, AWSError] = js.native
  def updateFeatureGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFeatureGroupResponse, Unit]): Request[UpdateFeatureGroupResponse, AWSError] = js.native
  /**
    * Updates the feature group.
    */
  def updateFeatureGroup(params: UpdateFeatureGroupRequest): Request[UpdateFeatureGroupResponse, AWSError] = js.native
  def updateFeatureGroup(
    params: UpdateFeatureGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFeatureGroupResponse, Unit]
  ): Request[UpdateFeatureGroupResponse, AWSError] = js.native
  
  /**
    * Updates the description and parameters of the feature group.
    */
  def updateFeatureMetadata(): Request[js.Object, AWSError] = js.native
  def updateFeatureMetadata(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the description and parameters of the feature group.
    */
  def updateFeatureMetadata(params: UpdateFeatureMetadataRequest): Request[js.Object, AWSError] = js.native
  def updateFeatureMetadata(
    params: UpdateFeatureMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the properties of a SageMaker image. To change the image's tags, use the AddTags and DeleteTags APIs.
    */
  def updateImage(): Request[UpdateImageResponse, AWSError] = js.native
  def updateImage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateImageResponse, Unit]): Request[UpdateImageResponse, AWSError] = js.native
  /**
    * Updates the properties of a SageMaker image. To change the image's tags, use the AddTags and DeleteTags APIs.
    */
  def updateImage(params: UpdateImageRequest): Request[UpdateImageResponse, AWSError] = js.native
  def updateImage(
    params: UpdateImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateImageResponse, Unit]
  ): Request[UpdateImageResponse, AWSError] = js.native
  
  /**
    * Updates a versioned model.
    */
  def updateModelPackage(): Request[UpdateModelPackageOutput, AWSError] = js.native
  def updateModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelPackageOutput, Unit]): Request[UpdateModelPackageOutput, AWSError] = js.native
  /**
    * Updates a versioned model.
    */
  def updateModelPackage(params: UpdateModelPackageInput): Request[UpdateModelPackageOutput, AWSError] = js.native
  def updateModelPackage(
    params: UpdateModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelPackageOutput, Unit]
  ): Request[UpdateModelPackageOutput, AWSError] = js.native
  
  /**
    * Updates a previously created schedule.
    */
  def updateMonitoringSchedule(): Request[UpdateMonitoringScheduleResponse, AWSError] = js.native
  def updateMonitoringSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMonitoringScheduleResponse, Unit]): Request[UpdateMonitoringScheduleResponse, AWSError] = js.native
  /**
    * Updates a previously created schedule.
    */
  def updateMonitoringSchedule(params: UpdateMonitoringScheduleRequest): Request[UpdateMonitoringScheduleResponse, AWSError] = js.native
  def updateMonitoringSchedule(
    params: UpdateMonitoringScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMonitoringScheduleResponse, Unit]
  ): Request[UpdateMonitoringScheduleResponse, AWSError] = js.native
  
  /**
    * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements.
    */
  def updateNotebookInstance(): Request[UpdateNotebookInstanceOutput, AWSError] = js.native
  def updateNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookInstanceOutput, Unit]): Request[UpdateNotebookInstanceOutput, AWSError] = js.native
  /**
    * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance used for your notebook instance to accommodate changes in your workload requirements.
    */
  def updateNotebookInstance(params: UpdateNotebookInstanceInput): Request[UpdateNotebookInstanceOutput, AWSError] = js.native
  def updateNotebookInstance(
    params: UpdateNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookInstanceOutput, Unit]
  ): Request[UpdateNotebookInstanceOutput, AWSError] = js.native
  
  /**
    * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def updateNotebookInstanceLifecycleConfig(): Request[UpdateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def updateNotebookInstanceLifecycleConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[UpdateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  /**
    * Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig API.
    */
  def updateNotebookInstanceLifecycleConfig(params: UpdateNotebookInstanceLifecycleConfigInput): Request[UpdateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  def updateNotebookInstanceLifecycleConfig(
    params: UpdateNotebookInstanceLifecycleConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookInstanceLifecycleConfigOutput, Unit]
  ): Request[UpdateNotebookInstanceLifecycleConfigOutput, AWSError] = js.native
  
  /**
    * Updates a pipeline.
    */
  def updatePipeline(): Request[UpdatePipelineResponse, AWSError] = js.native
  def updatePipeline(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineResponse, Unit]): Request[UpdatePipelineResponse, AWSError] = js.native
  /**
    * Updates a pipeline.
    */
  def updatePipeline(params: UpdatePipelineRequest): Request[UpdatePipelineResponse, AWSError] = js.native
  def updatePipeline(
    params: UpdatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineResponse, Unit]
  ): Request[UpdatePipelineResponse, AWSError] = js.native
  
  /**
    * Updates a pipeline execution.
    */
  def updatePipelineExecution(): Request[UpdatePipelineExecutionResponse, AWSError] = js.native
  def updatePipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineExecutionResponse, Unit]): Request[UpdatePipelineExecutionResponse, AWSError] = js.native
  /**
    * Updates a pipeline execution.
    */
  def updatePipelineExecution(params: UpdatePipelineExecutionRequest): Request[UpdatePipelineExecutionResponse, AWSError] = js.native
  def updatePipelineExecution(
    params: UpdatePipelineExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineExecutionResponse, Unit]
  ): Request[UpdatePipelineExecutionResponse, AWSError] = js.native
  
  /**
    * Updates a machine learning (ML) project that is created from a template that sets up an ML pipeline from training to deploying an approved model.  You must not update a project that is in use. If you update the ServiceCatalogProvisioningUpdateDetails of a project that is active or being created, or updated, you may lose resources already created by the project. 
    */
  def updateProject(): Request[UpdateProjectOutput, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectOutput, Unit]): Request[UpdateProjectOutput, AWSError] = js.native
  /**
    * Updates a machine learning (ML) project that is created from a template that sets up an ML pipeline from training to deploying an approved model.  You must not update a project that is in use. If you update the ServiceCatalogProvisioningUpdateDetails of a project that is active or being created, or updated, you may lose resources already created by the project. 
    */
  def updateProject(params: UpdateProjectInput): Request[UpdateProjectOutput, AWSError] = js.native
  def updateProject(
    params: UpdateProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectOutput, Unit]
  ): Request[UpdateProjectOutput, AWSError] = js.native
  
  /**
    * Update a model training job to request a new Debugger profiling configuration.
    */
  def updateTrainingJob(): Request[UpdateTrainingJobResponse, AWSError] = js.native
  def updateTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrainingJobResponse, Unit]): Request[UpdateTrainingJobResponse, AWSError] = js.native
  /**
    * Update a model training job to request a new Debugger profiling configuration.
    */
  def updateTrainingJob(params: UpdateTrainingJobRequest): Request[UpdateTrainingJobResponse, AWSError] = js.native
  def updateTrainingJob(
    params: UpdateTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrainingJobResponse, Unit]
  ): Request[UpdateTrainingJobResponse, AWSError] = js.native
  
  /**
    * Updates the display name of a trial.
    */
  def updateTrial(): Request[UpdateTrialResponse, AWSError] = js.native
  def updateTrial(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrialResponse, Unit]): Request[UpdateTrialResponse, AWSError] = js.native
  /**
    * Updates the display name of a trial.
    */
  def updateTrial(params: UpdateTrialRequest): Request[UpdateTrialResponse, AWSError] = js.native
  def updateTrial(
    params: UpdateTrialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrialResponse, Unit]
  ): Request[UpdateTrialResponse, AWSError] = js.native
  
  /**
    * Updates one or more properties of a trial component.
    */
  def updateTrialComponent(): Request[UpdateTrialComponentResponse, AWSError] = js.native
  def updateTrialComponent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrialComponentResponse, Unit]): Request[UpdateTrialComponentResponse, AWSError] = js.native
  /**
    * Updates one or more properties of a trial component.
    */
  def updateTrialComponent(params: UpdateTrialComponentRequest): Request[UpdateTrialComponentResponse, AWSError] = js.native
  def updateTrialComponent(
    params: UpdateTrialComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrialComponentResponse, Unit]
  ): Request[UpdateTrialComponentResponse, AWSError] = js.native
  
  /**
    * Updates a user profile.
    */
  def updateUserProfile(): Request[UpdateUserProfileResponse, AWSError] = js.native
  def updateUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserProfileResponse, Unit]): Request[UpdateUserProfileResponse, AWSError] = js.native
  /**
    * Updates a user profile.
    */
  def updateUserProfile(params: UpdateUserProfileRequest): Request[UpdateUserProfileResponse, AWSError] = js.native
  def updateUserProfile(
    params: UpdateUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserProfileResponse, Unit]
  ): Request[UpdateUserProfileResponse, AWSError] = js.native
  
  /**
    * Use this operation to update your workforce. You can use this operation to require that workers use specific IP addresses to work on tasks and to update your OpenID Connect (OIDC) Identity Provider (IdP) workforce configuration. The worker portal is now supported in VPC and public internet.  Use SourceIpConfig to restrict worker access to tasks to a specific range of IP addresses. You specify allowed IP addresses by creating a list of up to ten CIDRs. By default, a workforce isn't restricted to specific IP addresses. If you specify a range of IP addresses, workers who attempt to access tasks using any IP address outside the specified range are denied and get a Not Found error message on the worker portal. To restrict access to all the workers in public internet, add the SourceIpConfig CIDR value as "0.0.0.0/0".  Amazon SageMaker does not support Source Ip restriction for worker portals in VPC.  Use OidcConfig to update the configuration of a workforce created using your own OIDC IdP.   You can only update your OIDC IdP configuration when there are no work teams associated with your workforce. You can delete work teams using the operation.  After restricting access to a range of IP addresses or updating your OIDC IdP configuration with this operation, you can view details about your update workforce using the operation.  This operation only applies to private workforces. 
    */
  def updateWorkforce(): Request[UpdateWorkforceResponse, AWSError] = js.native
  def updateWorkforce(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkforceResponse, Unit]): Request[UpdateWorkforceResponse, AWSError] = js.native
  /**
    * Use this operation to update your workforce. You can use this operation to require that workers use specific IP addresses to work on tasks and to update your OpenID Connect (OIDC) Identity Provider (IdP) workforce configuration. The worker portal is now supported in VPC and public internet.  Use SourceIpConfig to restrict worker access to tasks to a specific range of IP addresses. You specify allowed IP addresses by creating a list of up to ten CIDRs. By default, a workforce isn't restricted to specific IP addresses. If you specify a range of IP addresses, workers who attempt to access tasks using any IP address outside the specified range are denied and get a Not Found error message on the worker portal. To restrict access to all the workers in public internet, add the SourceIpConfig CIDR value as "0.0.0.0/0".  Amazon SageMaker does not support Source Ip restriction for worker portals in VPC.  Use OidcConfig to update the configuration of a workforce created using your own OIDC IdP.   You can only update your OIDC IdP configuration when there are no work teams associated with your workforce. You can delete work teams using the operation.  After restricting access to a range of IP addresses or updating your OIDC IdP configuration with this operation, you can view details about your update workforce using the operation.  This operation only applies to private workforces. 
    */
  def updateWorkforce(params: UpdateWorkforceRequest): Request[UpdateWorkforceResponse, AWSError] = js.native
  def updateWorkforce(
    params: UpdateWorkforceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkforceResponse, Unit]
  ): Request[UpdateWorkforceResponse, AWSError] = js.native
  
  /**
    * Updates an existing work team with new member definitions or description.
    */
  def updateWorkteam(): Request[UpdateWorkteamResponse, AWSError] = js.native
  def updateWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkteamResponse, Unit]): Request[UpdateWorkteamResponse, AWSError] = js.native
  /**
    * Updates an existing work team with new member definitions or description.
    */
  def updateWorkteam(params: UpdateWorkteamRequest): Request[UpdateWorkteamResponse, AWSError] = js.native
  def updateWorkteam(
    params: UpdateWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkteamResponse, Unit]
  ): Request[UpdateWorkteamResponse, AWSError] = js.native
  
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: endpointDeleted): Request[DescribeEndpointOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: endpointDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: endpointDeleted, params: DescribeEndpointInputwait): Request[DescribeEndpointOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: endpointDeleted,
    params: DescribeEndpointInputwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_endpointInService(state: endpointInService): Request[DescribeEndpointOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: endpointInService,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Waits for the endpointInService state by periodically calling the underlying SageMaker.describeEndpointoperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_endpointInService(state: endpointInService, params: DescribeEndpointInputwait): Request[DescribeEndpointOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointInService(
    state: endpointInService,
    params: DescribeEndpointInputwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointOutput, Unit]
  ): Request[DescribeEndpointOutput, AWSError] = js.native
  /**
    * Waits for the imageCreated state by periodically calling the underlying SageMaker.describeImageoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageCreated(state: imageCreated): Request[DescribeImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageCreated(
    state: imageCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageResponse, Unit]
  ): Request[DescribeImageResponse, AWSError] = js.native
  /**
    * Waits for the imageCreated state by periodically calling the underlying SageMaker.describeImageoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageCreated(state: imageCreated, params: DescribeImageRequestwaite): Request[DescribeImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageCreated(
    state: imageCreated,
    params: DescribeImageRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageResponse, Unit]
  ): Request[DescribeImageResponse, AWSError] = js.native
  /**
    * Waits for the imageDeleted state by periodically calling the underlying SageMaker.describeImageoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageDeleted(state: imageDeleted_): Request[DescribeImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageDeleted(
    state: imageDeleted_,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageResponse, Unit]
  ): Request[DescribeImageResponse, AWSError] = js.native
  /**
    * Waits for the imageDeleted state by periodically calling the underlying SageMaker.describeImageoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageDeleted(state: imageDeleted_, params: DescribeImageRequestwaite): Request[DescribeImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageDeleted(
    state: imageDeleted_,
    params: DescribeImageRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageResponse, Unit]
  ): Request[DescribeImageResponse, AWSError] = js.native
  /**
    * Waits for the imageUpdated state by periodically calling the underlying SageMaker.describeImageoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageUpdated(state: imageUpdated): Request[DescribeImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageUpdated(
    state: imageUpdated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageResponse, Unit]
  ): Request[DescribeImageResponse, AWSError] = js.native
  /**
    * Waits for the imageUpdated state by periodically calling the underlying SageMaker.describeImageoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageUpdated(state: imageUpdated, params: DescribeImageRequestwaite): Request[DescribeImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageUpdated(
    state: imageUpdated,
    params: DescribeImageRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageResponse, Unit]
  ): Request[DescribeImageResponse, AWSError] = js.native
  /**
    * Waits for the imageVersionCreated state by periodically calling the underlying SageMaker.describeImageVersionoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageVersionCreated(state: imageVersionCreated): Request[DescribeImageVersionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageVersionCreated(
    state: imageVersionCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageVersionResponse, Unit]
  ): Request[DescribeImageVersionResponse, AWSError] = js.native
  /**
    * Waits for the imageVersionCreated state by periodically calling the underlying SageMaker.describeImageVersionoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageVersionCreated(state: imageVersionCreated, params: DescribeImageVersionReque): Request[DescribeImageVersionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageVersionCreated(
    state: imageVersionCreated,
    params: DescribeImageVersionReque,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageVersionResponse, Unit]
  ): Request[DescribeImageVersionResponse, AWSError] = js.native
  /**
    * Waits for the imageVersionDeleted state by periodically calling the underlying SageMaker.describeImageVersionoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageVersionDeleted(state: imageVersionDeleted): Request[DescribeImageVersionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageVersionDeleted(
    state: imageVersionDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageVersionResponse, Unit]
  ): Request[DescribeImageVersionResponse, AWSError] = js.native
  /**
    * Waits for the imageVersionDeleted state by periodically calling the underlying SageMaker.describeImageVersionoperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_imageVersionDeleted(state: imageVersionDeleted, params: DescribeImageVersionReque): Request[DescribeImageVersionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageVersionDeleted(
    state: imageVersionDeleted,
    params: DescribeImageVersionReque,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageVersionResponse, Unit]
  ): Request[DescribeImageVersionResponse, AWSError] = js.native
  /**
    * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(state: notebookInstanceDeleted): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: notebookInstanceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceDeleted state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(state: notebookInstanceDeleted, params: DescribeNotebookInstanceI): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceDeleted(
    state: notebookInstanceDeleted,
    params: DescribeNotebookInstanceI,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(state: notebookInstanceInService): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: notebookInstanceInService,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceInService state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(state: notebookInstanceInService, params: DescribeNotebookInstanceI): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceInService(
    state: notebookInstanceInService,
    params: DescribeNotebookInstanceI,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(state: notebookInstanceStopped): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: notebookInstanceStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the notebookInstanceStopped state by periodically calling the underlying SageMaker.describeNotebookInstanceoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(state: notebookInstanceStopped, params: DescribeNotebookInstanceI): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_notebookInstanceStopped(
    state: notebookInstanceStopped,
    params: DescribeNotebookInstanceI,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookInstanceOutput, Unit]
  ): Request[DescribeNotebookInstanceOutput, AWSError] = js.native
  /**
    * Waits for the processingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeProcessingJoboperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_processingJobCompletedOrStopped(state: processingJobCompletedOrStopped): Request[DescribeProcessingJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_processingJobCompletedOrStopped(
    state: processingJobCompletedOrStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProcessingJobResponse, Unit]
  ): Request[DescribeProcessingJobResponse, AWSError] = js.native
  /**
    * Waits for the processingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeProcessingJoboperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_processingJobCompletedOrStopped(state: processingJobCompletedOrStopped, params: DescribeProcessingJobRequ): Request[DescribeProcessingJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_processingJobCompletedOrStopped(
    state: processingJobCompletedOrStopped,
    params: DescribeProcessingJobRequ,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProcessingJobResponse, Unit]
  ): Request[DescribeProcessingJobResponse, AWSError] = js.native
  /**
    * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
    */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(state: trainingJobCompletedOrStopped): Request[DescribeTrainingJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: trainingJobCompletedOrStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]
  ): Request[DescribeTrainingJobResponse, AWSError] = js.native
  /**
    * Waits for the trainingJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTrainingJoboperation every 120 seconds (at most 180 times).
    */
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(state: trainingJobCompletedOrStopped, params: DescribeTrainingJobReques): Request[DescribeTrainingJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_trainingJobCompletedOrStopped(
    state: trainingJobCompletedOrStopped,
    params: DescribeTrainingJobReques,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]
  ): Request[DescribeTrainingJobResponse, AWSError] = js.native
  /**
    * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(state: transformJobCompletedOrStopped): Request[DescribeTransformJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: transformJobCompletedOrStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransformJobResponse, Unit]
  ): Request[DescribeTransformJobResponse, AWSError] = js.native
  /**
    * Waits for the transformJobCompletedOrStopped state by periodically calling the underlying SageMaker.describeTransformJoboperation every 60 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(state: transformJobCompletedOrStopped, params: DescribeTransformJobReque): Request[DescribeTransformJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_transformJobCompletedOrStopped(
    state: transformJobCompletedOrStopped,
    params: DescribeTransformJobReque,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransformJobResponse, Unit]
  ): Request[DescribeTransformJobResponse, AWSError] = js.native
}
