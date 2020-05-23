package typings.awsSdk.sagemakerMod

import typings.awsSdk.anon.DescribeEndpointInputwait
import typings.awsSdk.anon.DescribeNotebookInstanceI
import typings.awsSdk.anon.DescribeProcessingJobRequ
import typings.awsSdk.anon.DescribeTrainingJobReques
import typings.awsSdk.anon.DescribeTransformJobReque
import typings.awsSdk.awsSdkStrings.endpointDeleted
import typings.awsSdk.awsSdkStrings.endpointInService
import typings.awsSdk.awsSdkStrings.notebookInstanceDeleted
import typings.awsSdk.awsSdkStrings.notebookInstanceInService
import typings.awsSdk.awsSdkStrings.notebookInstanceStopped
import typings.awsSdk.awsSdkStrings.processingJobCompletedOrStopped
import typings.awsSdk.awsSdkStrings.trainingJobCompletedOrStopped
import typings.awsSdk.awsSdkStrings.transformJobCompletedOrStopped
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SageMaker extends Service {
  @JSName("config")
  var config_SageMaker: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
    */
  def addTags(): Request[AddTagsOutput, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see For more information, see AWS Tagging Strategies.  Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you first create the tuning job by specifying them in the Tags parameter of CreateHyperParameterTuningJob  
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
    * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
    */
  def createAlgorithm(): Request[CreateAlgorithmOutput, AWSError] = js.native
  def createAlgorithm(callback: js.Function2[/* err */ AWSError, /* data */ CreateAlgorithmOutput, Unit]): Request[CreateAlgorithmOutput, AWSError] = js.native
  /**
    * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
    */
  def createAlgorithm(params: CreateAlgorithmInput): Request[CreateAlgorithmOutput, AWSError] = js.native
  def createAlgorithm(
    params: CreateAlgorithmInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAlgorithmOutput, Unit]
  ): Request[CreateAlgorithmOutput, AWSError] = js.native
  /**
    * Creates a running App for the specified UserProfile. Supported Apps are JupyterServer, KernelGateway, and TensorBoard. This operation is automatically invoked by Amazon SageMaker Studio upon access to the associated Studio Domain, and when new kernel configurations are selected by the user. A user may have multiple Apps active simultaneously. Apps will automatically terminate and be deleted when stopped from within Studio, or when the DeleteApp API is manually called. UserProfiles are limited to 5 concurrently running Apps at a time.
    */
  def createApp(): Request[CreateAppResponse, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]): Request[CreateAppResponse, AWSError] = js.native
  /**
    * Creates a running App for the specified UserProfile. Supported Apps are JupyterServer, KernelGateway, and TensorBoard. This operation is automatically invoked by Amazon SageMaker Studio upon access to the associated Studio Domain, and when new kernel configurations are selected by the user. A user may have multiple Apps active simultaneously. Apps will automatically terminate and be deleted when stopped from within Studio, or when the DeleteApp API is manually called. UserProfiles are limited to 5 concurrently running Apps at a time.
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResponse, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]
  ): Request[CreateAppResponse, AWSError] = js.native
  /**
    * Creates an AutoPilot job. After you run an AutoPilot job, you can find the best performing model by calling , and then deploy that model by following the steps described in Step 6.1: Deploy the Model to Amazon SageMaker Hosting Services. For information about how to use AutoPilot, see Use AutoPilot to Automate Model Development.
    */
  def createAutoMLJob(): Request[CreateAutoMLJobResponse, AWSError] = js.native
  def createAutoMLJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateAutoMLJobResponse, Unit]): Request[CreateAutoMLJobResponse, AWSError] = js.native
  /**
    * Creates an AutoPilot job. After you run an AutoPilot job, you can find the best performing model by calling , and then deploy that model by following the steps described in Step 6.1: Deploy the Model to Amazon SageMaker Hosting Services. For information about how to use AutoPilot, see Use AutoPilot to Automate Model Development.
    */
  def createAutoMLJob(params: CreateAutoMLJobRequest): Request[CreateAutoMLJobResponse, AWSError] = js.native
  def createAutoMLJob(
    params: CreateAutoMLJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAutoMLJobResponse, Unit]
  ): Request[CreateAutoMLJobResponse, AWSError] = js.native
  /**
    * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other Git repository.
    */
  def createCodeRepository(): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  def createCodeRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateCodeRepositoryOutput, Unit]): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  /**
    * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it persists independently from the lifecycle of any notebook instances it is associated with. The repository can be hosted either in AWS CodeCommit or in any other Git repository.
    */
  def createCodeRepository(params: CreateCodeRepositoryInput): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  def createCodeRepository(
    params: CreateCodeRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCodeRepositoryOutput, Unit]
  ): Request[CreateCodeRepositoryOutput, AWSError] = js.native
  /**
    * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def createCompilationJob(): Request[CreateCompilationJobResponse, AWSError] = js.native
  def createCompilationJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateCompilationJobResponse, Unit]): Request[CreateCompilationJobResponse, AWSError] = js.native
  /**
    * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource. In the request body, you provide the following:   A name for the compilation job    Information about the input model artifacts    The output location for the compiled model and the device (target) that the model runs on     The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job    You can also provide a Tag to track the model compilation job's resource use and costs. The response body contains the CompilationJobArn for the compiled job. To stop a model compilation job, use StopCompilationJob. To get information about a particular model compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use ListCompilationJobs.
    */
  def createCompilationJob(params: CreateCompilationJobRequest): Request[CreateCompilationJobResponse, AWSError] = js.native
  def createCompilationJob(
    params: CreateCompilationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCompilationJobResponse, Unit]
  ): Request[CreateCompilationJobResponse, AWSError] = js.native
  /**
    * Creates a Domain for Amazon SageMaker Studio, which can be accessed by end-users in a web browser. A Domain has an associated directory, list of authorized users, and a variety of security, application, policies, and Amazon Virtual Private Cloud configurations. An AWS account is limited to one Domain, per region. Users within a domain can share notebook files and other artifacts with each other. When a Domain is created, an Amazon Elastic File System (EFS) is also created for use by all of the users within the Domain. Each user receives a private home directory within the EFS for notebooks, Git repositories, and data files. 
    */
  def createDomain(): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates a Domain for Amazon SageMaker Studio, which can be accessed by end-users in a web browser. A Domain has an associated directory, list of authorized users, and a variety of security, application, policies, and Amazon Virtual Private Cloud configurations. An AWS account is limited to one Domain, per region. Users within a domain can share notebook files and other artifacts with each other. When a Domain is created, an Amazon Elastic File System (EFS) is also created for use by all of the users within the Domain. Each user receives a private home directory within the EFS for notebooks, Git repositories, and data files. 
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]
  ): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.   Use this API to deploy models using Amazon SageMaker hosting services.  For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).    You must not delete an EndpointConfig that is in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig.  The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.
    */
  def createEndpoint(): Request[CreateEndpointOutput, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointOutput, Unit]): Request[CreateEndpointOutput, AWSError] = js.native
  /**
    * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig API.   Use this API to deploy models using Amazon SageMaker hosting services.  For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).    You must not delete an EndpointConfig that is in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig.  The endpoint name must be unique within an AWS Region in your AWS account.  When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute instances), and deploys the model(s) on them.  When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API. If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.
    */
  def createEndpoint(params: CreateEndpointInput): Request[CreateEndpointOutput, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointOutput, Unit]
  ): Request[CreateEndpointOutput, AWSError] = js.native
  /**
    * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define a ProductionVariant, for each model that you want to deploy. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B.  For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)). 
    */
  def createEndpointConfig(): Request[CreateEndpointConfigOutput, AWSError] = js.native
  def createEndpointConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointConfigOutput, Unit]): Request[CreateEndpointConfigOutput, AWSError] = js.native
  /**
    * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the configuration, you identify one or more models, created using the CreateModel API, to deploy and the resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.   Use this API if you want to use Amazon SageMaker hosting services to deploy models into production.   In the request, you define a ProductionVariant, for each model that you want to deploy. Each ProductionVariant parameter also describes the resources that you want Amazon SageMaker to provision. This includes the number and type of ML compute instances to deploy.  If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model A, and one-third to model B.  For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)). 
    */
  def createEndpointConfig(params: CreateEndpointConfigInput): Request[CreateEndpointConfigOutput, AWSError] = js.native
  def createEndpointConfig(
    params: CreateEndpointConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointConfigOutput, Unit]
  ): Request[CreateEndpointConfigOutput, AWSError] = js.native
  /**
    * Creates an Amazon SageMaker experiment. An experiment is a collection of trials that are observed, compared and evaluated as a group. A trial is a set of steps, called trial components, that produce a machine learning model. The goal of an experiment is to determine the components that produce the best model. Multiple trials are performed, each one isolating and measuring the impact of a change to one or more inputs, while keeping the remaining inputs constant. When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to experiments, trials, trial components and then use the Search API to search for the tags. To add a description to an experiment, specify the optional Description parameter. To add a description later, or to change the description, call the UpdateExperiment API. To get a list of all your experiments, call the ListExperiments API. To view an experiment's properties, call the DescribeExperiment API. To get a list of all the trials associated with an experiment, call the ListTrials API. To create a trial call the CreateTrial API.
    */
  def createExperiment(): Request[CreateExperimentResponse, AWSError] = js.native
  def createExperiment(callback: js.Function2[/* err */ AWSError, /* data */ CreateExperimentResponse, Unit]): Request[CreateExperimentResponse, AWSError] = js.native
  /**
    * Creates an Amazon SageMaker experiment. An experiment is a collection of trials that are observed, compared and evaluated as a group. A trial is a set of steps, called trial components, that produce a machine learning model. The goal of an experiment is to determine the components that produce the best model. Multiple trials are performed, each one isolating and measuring the impact of a change to one or more inputs, while keeping the remaining inputs constant. When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to experiments, trials, trial components and then use the Search API to search for the tags. To add a description to an experiment, specify the optional Description parameter. To add a description later, or to change the description, call the UpdateExperiment API. To get a list of all your experiments, call the ListExperiments API. To view an experiment's properties, call the DescribeExperiment API. To get a list of all the trials associated with an experiment, call the ListTrials API. To create a trial call the CreateTrial API.
    */
  def createExperiment(params: CreateExperimentRequest): Request[CreateExperimentResponse, AWSError] = js.native
  def createExperiment(
    params: CreateExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExperimentResponse, Unit]
  ): Request[CreateExperimentResponse, AWSError] = js.native
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
    * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models. You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when want the data to stay within your organization or when a specific set of skills is required.   One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.    The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. For more information, see Using Automated Data Labeling. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
    */
  def createLabelingJob(): Request[CreateLabelingJobResponse, AWSError] = js.native
  def createLabelingJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelingJobResponse, Unit]): Request[CreateLabelingJobResponse, AWSError] = js.native
  /**
    * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to train machine learning models. You can select your workforce from one of three providers:   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private workforce when want the data to stay within your organization or when a specific set of skills is required.   One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.    The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data or data that has been stripped of any personally identifiable information.   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a human. Automated data labeling uses active learning to determine if a data object can be labeled by machine or if it needs to be sent to a human worker. For more information, see Using Automated Data Labeling. The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that describes the location of each object. For more information, see Using Input and Output Data. The output can be used as the manifest file for another labeling job or as training data for your machine learning models.
    */
  def createLabelingJob(params: CreateLabelingJobRequest): Request[CreateLabelingJobResponse, AWSError] = js.native
  def createLabelingJob(
    params: CreateLabelingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelingJobResponse, Unit]
  ): Request[CreateLabelingJobResponse, AWSError] = js.native
  /**
    * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the Docker image that contains inference code, artifacts (from prior training), and a custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
    */
  def createModel(): Request[CreateModelOutput, AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelOutput, Unit]): Request[CreateModelOutput, AWSError] = js.native
  /**
    * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the primary container, you specify the Docker image that contains inference code, artifacts (from prior training), and a custom environment map that the inference code uses when you deploy the model for predictions. Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job. To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers that you defined for the model in the hosting environment.  For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).  To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location. In the CreateModel request, you must define a container with the PrimaryContainer parameter. In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also use the IAM role to manage permissions the inference code needs. For example, if the inference code access any other AWS resources, you grant necessary permissions via this role.
    */
  def createModel(params: CreateModelInput): Request[CreateModelOutput, AWSError] = js.native
  def createModel(
    params: CreateModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelOutput, Unit]
  ): Request[CreateModelOutput, AWSError] = js.native
  /**
    * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker. To create a model package by specifying a Docker container that contains your inference code and the Amazon S3 location of your model artifacts, provide values for InferenceSpecification. To create a model from an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for SourceAlgorithmSpecification.
    */
  def createModelPackage(): Request[CreateModelPackageOutput, AWSError] = js.native
  def createModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelPackageOutput, Unit]): Request[CreateModelPackageOutput, AWSError] = js.native
  /**
    * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker. To create a model package by specifying a Docker container that contains your inference code and the Amazon S3 location of your model artifacts, provide values for InferenceSpecification. To create a model from an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for SourceAlgorithmSpecification.
    */
  def createModelPackage(params: CreateModelPackageInput): Request[CreateModelPackageOutput, AWSError] = js.native
  def createModelPackage(
    params: CreateModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelPackageOutput, Unit]
  ): Request[CreateModelPackageOutput, AWSError] = js.native
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
    * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). You can't change the name of a notebook instance after you create it. After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
    */
  def createNotebookInstance(): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  def createNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookInstanceOutput, Unit]): Request[CreateNotebookInstanceOutput, AWSError] = js.native
  /**
    * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.  In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run. Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model training, and attaches an ML storage volume to the notebook instance.  Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker with a specific algorithm or with a machine learning framework.  After receiving the request, Amazon SageMaker does the following:   Creates a network interface in the Amazon SageMaker VPC.   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC, which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon SageMaker attaches the security group that you specified in the request to the network interface that it creates in your VPC.   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security groups allow it.   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). You can't change the name of a notebook instance after you create it. After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter notebooks. For example, you can write code to explore a dataset that you can use for model training, train a model, host models by creating Amazon SageMaker endpoints, and validate hosted models.  For more information, see How It Works. 
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
    * Creates a URL for a specified UserProfile in a Domain. When accessed in a web browser, the user will be automatically signed in to Amazon SageMaker Studio, and granted access to all of the Apps and files associated with that Amazon Elastic File System (EFS). This operation can only be called when AuthMode equals IAM. 
    */
  def createPresignedDomainUrl(): Request[CreatePresignedDomainUrlResponse, AWSError] = js.native
  def createPresignedDomainUrl(callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedDomainUrlResponse, Unit]): Request[CreatePresignedDomainUrlResponse, AWSError] = js.native
  /**
    * Creates a URL for a specified UserProfile in a Domain. When accessed in a web browser, the user will be automatically signed in to Amazon SageMaker Studio, and granted access to all of the Apps and files associated with that Amazon Elastic File System (EFS). This operation can only be called when AuthMode equals IAM. 
    */
  def createPresignedDomainUrl(params: CreatePresignedDomainUrlRequest): Request[CreatePresignedDomainUrlResponse, AWSError] = js.native
  def createPresignedDomainUrl(
    params: CreatePresignedDomainUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedDomainUrlResponse, Unit]
  ): Request[CreatePresignedDomainUrlResponse, AWSError] = js.native
  /**
    * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the notebook instance.For example, you can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.  The URL that you get from a call to CreatePresignedNotebookInstanceUrl is valid only for 5 minutes. If you try to use the URL after the 5-minute limit expires, you are directed to the AWS console sign-in page. 
    */
  def createPresignedNotebookInstanceUrl(): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  def createPresignedNotebookInstanceUrl(
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedNotebookInstanceUrlOutput, Unit]
  ): Request[CreatePresignedNotebookInstanceUrlOutput, AWSError] = js.native
  /**
    * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the page. IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that attempts to connect to the notebook instance.For example, you can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. Use the NotIpAddress condition operator and the aws:SourceIP condition context key to specify the list of IP addresses that you want to have access to the notebook instance. For more information, see Limit Access to a Notebook Instance by IP Address.  The URL that you get from a call to CreatePresignedNotebookInstanceUrl is valid only for 5 minutes. If you try to use the URL after the 5-minute limit expires, you are directed to the AWS console sign-in page. 
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
    * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to enable the estimation of model parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3, EFS, or FSx location where it is stored.    OutputDataConfig - Identifies the Amazon S3 bucket where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     EnableManagedSpotTraining - Optimize the cost of training machine learning models by up to 80% by using Amazon EC2 Spot instances. For more information, see Managed Spot Training.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - To help cap training costs, use MaxRuntimeInSeconds to set a time limit for training. Use MaxWaitTimeInSeconds to specify how long you are willing to wait for a managed spot training job to complete.     For more information about Amazon SageMaker, see How It Works. 
    */
  def createTrainingJob(): Request[CreateTrainingJobResponse, AWSError] = js.native
  def createTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrainingJobResponse, Unit]): Request[CreateTrainingJobResponse, AWSError] = js.native
  /**
    * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an Amazon S3 location that you specify.  If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon SageMaker, provided that you know how to use them for inferences.  In the request body, you provide the following:     AlgorithmSpecification - Identifies the training algorithm to use.     HyperParameters - Specify these algorithm-specific parameters to enable the estimation of model parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.     InputDataConfig - Describes the training dataset and the Amazon S3, EFS, or FSx location where it is stored.    OutputDataConfig - Identifies the Amazon S3 bucket where you want Amazon SageMaker to save the results of model training.      ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy for model training. In distributed training, you specify more than one instance.     EnableManagedSpotTraining - Optimize the cost of training machine learning models by up to 80% by using Amazon EC2 Spot instances. For more information, see Managed Spot Training.     RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete model training.     StoppingCondition - To help cap training costs, use MaxRuntimeInSeconds to set a time limit for training. Use MaxWaitTimeInSeconds to specify how long you are willing to wait for a managed spot training job to complete.     For more information about Amazon SageMaker, see How It Works. 
    */
  def createTrainingJob(params: CreateTrainingJobRequest): Request[CreateTrainingJobResponse, AWSError] = js.native
  def createTrainingJob(
    params: CreateTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrainingJobResponse, Unit]
  ): Request[CreateTrainingJobResponse, AWSError] = js.native
  /**
    * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.   For more information about how batch transformation works, see Batch Transform.
    */
  def createTransformJob(): Request[CreateTransformJobResponse, AWSError] = js.native
  def createTransformJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateTransformJobResponse, Unit]): Request[CreateTransformJobResponse, AWSError] = js.native
  /**
    * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these results to an Amazon S3 location that you specify. To perform batch transformations, you create a transform job and use the data that you have readily available. In the request body, you provide the following:    TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an AWS account.    ModelName - Identifies the model to use. ModelName must be the name of an existing Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see CreateModel.    TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is stored.    TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.    TransformResources - Identifies the ML compute instances for the transform job.   For more information about how batch transformation works, see Batch Transform.
    */
  def createTransformJob(params: CreateTransformJobRequest): Request[CreateTransformJobResponse, AWSError] = js.native
  def createTransformJob(
    params: CreateTransformJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransformJobResponse, Unit]
  ): Request[CreateTransformJobResponse, AWSError] = js.native
  /**
    * Creates an Amazon SageMaker trial. A trial is a set of steps called trial components that produce a machine learning model. A trial is part of a single Amazon SageMaker experiment. When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to a trial and then use the Search API to search for the tags. To get a list of all your trials, call the ListTrials API. To view a trial's properties, call the DescribeTrial API. To create a trial component, call the CreateTrialComponent API.
    */
  def createTrial(): Request[CreateTrialResponse, AWSError] = js.native
  def createTrial(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrialResponse, Unit]): Request[CreateTrialResponse, AWSError] = js.native
  /**
    * Creates an Amazon SageMaker trial. A trial is a set of steps called trial components that produce a machine learning model. A trial is part of a single Amazon SageMaker experiment. When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to a trial and then use the Search API to search for the tags. To get a list of all your trials, call the ListTrials API. To view a trial's properties, call the DescribeTrial API. To create a trial component, call the CreateTrialComponent API.
    */
  def createTrial(params: CreateTrialRequest): Request[CreateTrialResponse, AWSError] = js.native
  def createTrial(
    params: CreateTrialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrialResponse, Unit]
  ): Request[CreateTrialResponse, AWSError] = js.native
  /**
    * Creates a trial component, which is a stage of a machine learning trial. A trial is composed of one or more trial components. A trial component can be used in multiple trials. Trial components include pre-processing jobs, training jobs, and batch transform jobs. When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to a trial component and then use the Search API to search for the tags.   CreateTrialComponent can only be invoked from within an Amazon SageMaker managed environment. This includes Amazon SageMaker training jobs, processing jobs, transform jobs, and Amazon SageMaker notebooks. A call to CreateTrialComponent from outside one of these environments results in an error. 
    */
  def createTrialComponent(): Request[CreateTrialComponentResponse, AWSError] = js.native
  def createTrialComponent(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrialComponentResponse, Unit]): Request[CreateTrialComponentResponse, AWSError] = js.native
  /**
    * Creates a trial component, which is a stage of a machine learning trial. A trial is composed of one or more trial components. A trial component can be used in multiple trials. Trial components include pre-processing jobs, training jobs, and batch transform jobs. When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must use the logging APIs provided by the SDK. You can add tags to a trial component and then use the Search API to search for the tags.   CreateTrialComponent can only be invoked from within an Amazon SageMaker managed environment. This includes Amazon SageMaker training jobs, processing jobs, transform jobs, and Amazon SageMaker notebooks. A call to CreateTrialComponent from outside one of these environments results in an error. 
    */
  def createTrialComponent(params: CreateTrialComponentRequest): Request[CreateTrialComponentResponse, AWSError] = js.native
  def createTrialComponent(
    params: CreateTrialComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrialComponentResponse, Unit]
  ): Request[CreateTrialComponentResponse, AWSError] = js.native
  /**
    * Creates a user profile. A user profile represents a single user within a Domain, and is the main way to reference a "person" for the purposes of sharing, reporting and other user-oriented features. This entity is created during on-boarding to Amazon SageMaker Studio. If an administrator invites a person by email or imports them from SSO, a UserProfile is automatically created.   This entity is the primary holder of settings for an individual user and, through the domain, has a reference to the user's private Amazon Elastic File System (EFS) home directory. 
    */
  def createUserProfile(): Request[CreateUserProfileResponse, AWSError] = js.native
  def createUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserProfileResponse, Unit]): Request[CreateUserProfileResponse, AWSError] = js.native
  /**
    * Creates a user profile. A user profile represents a single user within a Domain, and is the main way to reference a "person" for the purposes of sharing, reporting and other user-oriented features. This entity is created during on-boarding to Amazon SageMaker Studio. If an administrator invites a person by email or imports them from SSO, a UserProfile is automatically created.   This entity is the primary holder of settings for an individual user and, through the domain, has a reference to the user's private Amazon Elastic File System (EFS) home directory. 
    */
  def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResponse, AWSError] = js.native
  def createUserProfile(
    params: CreateUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserProfileResponse, Unit]
  ): Request[CreateUserProfileResponse, AWSError] = js.native
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
    * Used to delete a domain. Use with caution. If RetentionPolicy is set to Delete, all of the members of the domain will lose access to their EFS volume, including data, notebooks, and other artifacts. 
    */
  def deleteDomain(): Request[js.Object, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Used to delete a domain. Use with caution. If RetentionPolicy is set to Delete, all of the members of the domain will lose access to their EFS volume, including data, notebooks, and other artifacts. 
    */
  def deleteDomain(params: DeleteDomainRequest): Request[js.Object, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
    */
  def deleteEndpoint(): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was created.  Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use the RevokeGrant API call.
    */
  def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
    */
  def deleteEndpointConfig(): Request[js.Object, AWSError] = js.native
  def deleteEndpointConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified configuration. It does not delete endpoints created using the configuration. 
    */
  def deleteEndpointConfig(params: DeleteEndpointConfigInput): Request[js.Object, AWSError] = js.native
  def deleteEndpointConfig(
    params: DeleteEndpointConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon SageMaker experiment. All trials associated with the experiment must be deleted first. Use the ListTrials API to get a list of the trials associated with the experiment.
    */
  def deleteExperiment(): Request[DeleteExperimentResponse, AWSError] = js.native
  def deleteExperiment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperimentResponse, Unit]): Request[DeleteExperimentResponse, AWSError] = js.native
  /**
    * Deletes an Amazon SageMaker experiment. All trials associated with the experiment must be deleted first. Use the ListTrials API to get a list of the trials associated with the experiment.
    */
  def deleteExperiment(params: DeleteExperimentRequest): Request[DeleteExperimentResponse, AWSError] = js.native
  def deleteExperiment(
    params: DeleteExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperimentResponse, Unit]
  ): Request[DeleteExperimentResponse, AWSError] = js.native
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
    * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
    */
  def deleteModel(): Request[js.Object, AWSError] = js.native
  def deleteModel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon SageMaker when you called the CreateModel API. It does not delete model artifacts, inference code, or the IAM role that you specified when creating the model. 
    */
  def deleteModel(params: DeleteModelInput): Request[js.Object, AWSError] = js.native
  def deleteModel(params: DeleteModelInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
    */
  def deleteModelPackage(): Request[js.Object, AWSError] = js.native
  def deleteModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model package. A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
    */
  def deleteModelPackage(params: DeleteModelPackageInput): Request[js.Object, AWSError] = js.native
  def deleteModelPackage(
    params: DeleteModelPackageInput,
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
    *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
    */
  def deleteNotebookInstance(): Request[js.Object, AWSError] = js.native
  def deleteNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the StopNotebookInstance API.   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance, and deletes the ML storage volume and the network interface associated with the notebook instance.  
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
    * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
    */
  def deleteTags(): Request[DeleteTagsOutput, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsOutput, Unit]): Request[DeleteTagsOutput, AWSError] = js.native
  /**
    * Deletes the specified tags from an Amazon SageMaker resource. To list a resource's tags, use the ListTags API.   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from training jobs that the hyperparameter tuning job launched before you called this API. 
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
    * Deletes a user profile.
    */
  def deleteUserProfile(): Request[js.Object, AWSError] = js.native
  def deleteUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user profile.
    */
  def deleteUserProfile(params: DeleteUserProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteUserProfile(
    params: DeleteUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
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
    * Returns information about an Amazon SageMaker job.
    */
  def describeAutoMLJob(): Request[DescribeAutoMLJobResponse, AWSError] = js.native
  def describeAutoMLJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutoMLJobResponse, Unit]): Request[DescribeAutoMLJobResponse, AWSError] = js.native
  /**
    * Returns information about an Amazon SageMaker job.
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
    * The desciption of the domain.
    */
  def describeDomain(): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]): Request[DescribeDomainResponse, AWSError] = js.native
  /**
    * The desciption of the domain.
    */
  def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(
    params: DescribeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]
  ): Request[DescribeDomainResponse, AWSError] = js.native
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
    * Returns information about the requested human task user interface.
    */
  def describeHumanTaskUi(): Request[DescribeHumanTaskUiResponse, AWSError] = js.native
  def describeHumanTaskUi(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHumanTaskUiResponse, Unit]): Request[DescribeHumanTaskUiResponse, AWSError] = js.native
  /**
    * Returns information about the requested human task user interface.
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
    * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list them on AWS Marketplace. To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
    */
  def describeModelPackage(): Request[DescribeModelPackageOutput, AWSError] = js.native
  def describeModelPackage(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackageOutput, Unit]): Request[DescribeModelPackageOutput, AWSError] = js.native
  /**
    * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list them on AWS Marketplace. To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
    */
  def describeModelPackage(params: DescribeModelPackageInput): Request[DescribeModelPackageOutput, AWSError] = js.native
  def describeModelPackage(
    params: DescribeModelPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelPackageOutput, Unit]
  ): Request[DescribeModelPackageOutput, AWSError] = js.native
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
    * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
    */
  def describeSubscribedWorkteam(): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  def describeSubscribedWorkteam(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscribedWorkteamResponse, Unit]): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  /**
    * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor in the AWS Marketplace.
    */
  def describeSubscribedWorkteam(params: DescribeSubscribedWorkteamRequest): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  def describeSubscribedWorkteam(
    params: DescribeSubscribedWorkteamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscribedWorkteamResponse, Unit]
  ): Request[DescribeSubscribedWorkteamResponse, AWSError] = js.native
  /**
    * Returns information about a training job.
    */
  def describeTrainingJob(): Request[DescribeTrainingJobResponse, AWSError] = js.native
  def describeTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrainingJobResponse, Unit]): Request[DescribeTrainingJobResponse, AWSError] = js.native
  /**
    * Returns information about a training job.
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
    * Describes the user profile.
    */
  def describeUserProfile(): Request[DescribeUserProfileResponse, AWSError] = js.native
  def describeUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserProfileResponse, Unit]): Request[DescribeUserProfileResponse, AWSError] = js.native
  /**
    * Describes the user profile.
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
    * List the Candidates created for the job.
    */
  def listCandidatesForAutoMLJob(): Request[ListCandidatesForAutoMLJobResponse, AWSError] = js.native
  def listCandidatesForAutoMLJob(callback: js.Function2[/* err */ AWSError, /* data */ ListCandidatesForAutoMLJobResponse, Unit]): Request[ListCandidatesForAutoMLJobResponse, AWSError] = js.native
  /**
    * List the Candidates created for the job.
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
    * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
    */
  def listNotebookInstances(): Request[ListNotebookInstancesOutput, AWSError] = js.native
  def listNotebookInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstancesOutput, Unit]): Request[ListNotebookInstancesOutput, AWSError] = js.native
  /**
    * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region. 
    */
  def listNotebookInstances(params: ListNotebookInstancesInput): Request[ListNotebookInstancesOutput, AWSError] = js.native
  def listNotebookInstances(
    params: ListNotebookInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookInstancesOutput, Unit]
  ): Request[ListNotebookInstancesOutput, AWSError] = js.native
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
    * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listSubscribedWorkteams(): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  def listSubscribedWorkteams(callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribedWorkteamsResponse, Unit]): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  /**
    * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  def listSubscribedWorkteams(
    params: ListSubscribedWorkteamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribedWorkteamsResponse, Unit]
  ): Request[ListSubscribedWorkteamsResponse, AWSError] = js.native
  /**
    * Returns the tags for the specified Amazon SageMaker resource.
    */
  def listTags(): Request[ListTagsOutput, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  /**
    * Returns the tags for the specified Amazon SageMaker resource.
    */
  def listTags(params: ListTagsInput): Request[ListTagsOutput, AWSError] = js.native
  def listTags(params: ListTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  /**
    * Lists training jobs.
    */
  def listTrainingJobs(): Request[ListTrainingJobsResponse, AWSError] = js.native
  def listTrainingJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTrainingJobsResponse, Unit]): Request[ListTrainingJobsResponse, AWSError] = js.native
  /**
    * Lists training jobs.
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
    * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listWorkteams(): Request[ListWorkteamsResponse, AWSError] = js.native
  def listWorkteams(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkteamsResponse, Unit]): Request[ListWorkteamsResponse, AWSError] = js.native
  /**
    * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the filter specified in the NameContains parameter.
    */
  def listWorkteams(params: ListWorkteamsRequest): Request[ListWorkteamsResponse, AWSError] = js.native
  def listWorkteams(
    params: ListWorkteamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkteamsResponse, Unit]
  ): Request[ListWorkteamsResponse, AWSError] = js.native
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
    * Starts a previously stopped monitoring schedule.  New monitoring schedules are immediately started after creation. 
    */
  def startMonitoringSchedule(): Request[js.Object, AWSError] = js.native
  def startMonitoringSchedule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts a previously stopped monitoring schedule.  New monitoring schedules are immediately started after creation. 
    */
  def startMonitoringSchedule(params: StartMonitoringScheduleRequest): Request[js.Object, AWSError] = js.native
  def startMonitoringSchedule(
    params: StartMonitoringScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
    */
  def startNotebookInstance(): Request[js.Object, AWSError] = js.native
  def startNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume. After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to InService. A notebook instance's status must be InService before you can connect to your Jupyter notebook. 
    */
  def startNotebookInstance(params: StartNotebookInstanceInput): Request[js.Object, AWSError] = js.native
  def startNotebookInstance(
    params: StartNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
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
    * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML compute instance when you call StopNotebookInstance. To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
    */
  def stopNotebookInstance(): Request[js.Object, AWSError] = js.native
  def stopNotebookInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML compute instance when you call StopNotebookInstance. To access data on the ML storage volume for a notebook instance that has been terminated, call the StartNotebookInstance API. StartNotebookInstance launches another ML compute instance, configures it, and attaches the preserved ML storage volume so you can continue your work. 
    */
  def stopNotebookInstance(params: StopNotebookInstanceInput): Request[js.Object, AWSError] = js.native
  def stopNotebookInstance(
    params: StopNotebookInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
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
    * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
    */
  def stopTrainingJob(): Request[js.Object, AWSError] = js.native
  def stopTrainingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of the training is not lost.  When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.
    */
  def stopTrainingJob(params: StopTrainingJobRequest): Request[js.Object, AWSError] = js.native
  def stopTrainingJob(
    params: StopTrainingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
    */
  def stopTransformJob(): Request[js.Object, AWSError] = js.native
  def stopTransformJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a transform job. When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
    */
  def stopTransformJob(params: StopTransformJobRequest): Request[js.Object, AWSError] = js.native
  def stopTransformJob(
    params: StopTransformJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
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
    * Updates a domain. Changes will impact all of the people in the domain.
    */
  def updateDomain(): Request[UpdateDomainResponse, AWSError] = js.native
  def updateDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainResponse, Unit]): Request[UpdateDomainResponse, AWSError] = js.native
  /**
    * Updates a domain. Changes will impact all of the people in the domain.
    */
  def updateDomain(params: UpdateDomainRequest): Request[UpdateDomainResponse, AWSError] = js.native
  def updateDomain(
    params: UpdateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainResponse, Unit]
  ): Request[UpdateDomainResponse, AWSError] = js.native
  /**
    * Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig. 
    */
  def updateEndpoint(): Request[UpdateEndpointOutput, AWSError] = js.native
  def updateEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointOutput, Unit]): Request[UpdateEndpointOutput, AWSError] = js.native
  /**
    * Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint, and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is no availability loss).  When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.   You must not delete an EndpointConfig in use by an endpoint that is live or while the UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To update an endpoint, you must create a new EndpointConfig. 
    */
  def updateEndpoint(params: UpdateEndpointInput): Request[UpdateEndpointOutput, AWSError] = js.native
  def updateEndpoint(
    params: UpdateEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointOutput, Unit]
  ): Request[UpdateEndpointOutput, AWSError] = js.native
  /**
    * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
    */
  def updateEndpointWeightsAndCapacities(): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  def updateEndpointWeightsAndCapacities(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointWeightsAndCapacitiesOutput, Unit]
  ): Request[UpdateEndpointWeightsAndCapacitiesOutput, AWSError] = js.native
  /**
    * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to Updating. After updating the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API. 
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
    * Restricts access to tasks assigned to workers in the specified workforce to those within specific ranges of IP addresses. You specify allowed IP addresses by creating a list of up to four CIDRs. By default, a workforce isn't restricted to specific IP addresses. If you specify a range of IP addresses, workers who attempt to access tasks using any IP address outside the specified range are denied access and get a Not Found error message on the worker portal. After restricting access with this operation, you can see the allowed IP values for a private workforce with the operation.  This operation applies only to private workforces. 
    */
  def updateWorkforce(): Request[UpdateWorkforceResponse, AWSError] = js.native
  def updateWorkforce(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkforceResponse, Unit]): Request[UpdateWorkforceResponse, AWSError] = js.native
  /**
    * Restricts access to tasks assigned to workers in the specified workforce to those within specific ranges of IP addresses. You specify allowed IP addresses by creating a list of up to four CIDRs. By default, a workforce isn't restricted to specific IP addresses. If you specify a range of IP addresses, workers who attempt to access tasks using any IP address outside the specified range are denied access and get a Not Found error message on the worker portal. After restricting access with this operation, you can see the allowed IP values for a private workforce with the operation.  This operation applies only to private workforces. 
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

