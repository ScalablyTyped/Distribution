package typings.awsSdk.elasticbeanstalkMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticBeanstalk extends Service {
  @JSName("config")
  var config_ElasticBeanstalk: ConfigBase with ClientConfiguration = js.native
  /**
    * Cancels in-progress environment configuration update or application version deployment.
    */
  def abortEnvironmentUpdate(): Request[js.Object, AWSError] = js.native
  def abortEnvironmentUpdate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels in-progress environment configuration update or application version deployment.
    */
  def abortEnvironmentUpdate(params: AbortEnvironmentUpdateMessage): Request[js.Object, AWSError] = js.native
  def abortEnvironmentUpdate(
    params: AbortEnvironmentUpdateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Applies a scheduled managed action immediately. A managed action can be applied only if its status is Scheduled. Get the status and action ID of a managed action with DescribeEnvironmentManagedActions.
    */
  def applyEnvironmentManagedAction(): Request[ApplyEnvironmentManagedActionResult, AWSError] = js.native
  def applyEnvironmentManagedAction(callback: js.Function2[/* err */ AWSError, /* data */ ApplyEnvironmentManagedActionResult, Unit]): Request[ApplyEnvironmentManagedActionResult, AWSError] = js.native
  /**
    * Applies a scheduled managed action immediately. A managed action can be applied only if its status is Scheduled. Get the status and action ID of a managed action with DescribeEnvironmentManagedActions.
    */
  def applyEnvironmentManagedAction(params: ApplyEnvironmentManagedActionRequest): Request[ApplyEnvironmentManagedActionResult, AWSError] = js.native
  def applyEnvironmentManagedAction(
    params: ApplyEnvironmentManagedActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplyEnvironmentManagedActionResult, Unit]
  ): Request[ApplyEnvironmentManagedActionResult, AWSError] = js.native
  /**
    * Checks if the specified CNAME is available.
    */
  def checkDNSAvailability(): Request[CheckDNSAvailabilityResultMessage, AWSError] = js.native
  def checkDNSAvailability(callback: js.Function2[/* err */ AWSError, /* data */ CheckDNSAvailabilityResultMessage, Unit]): Request[CheckDNSAvailabilityResultMessage, AWSError] = js.native
  /**
    * Checks if the specified CNAME is available.
    */
  def checkDNSAvailability(params: CheckDNSAvailabilityMessage): Request[CheckDNSAvailabilityResultMessage, AWSError] = js.native
  def checkDNSAvailability(
    params: CheckDNSAvailabilityMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CheckDNSAvailabilityResultMessage, Unit]
  ): Request[CheckDNSAvailabilityResultMessage, AWSError] = js.native
  /**
    * Create or update a group of environments that each run a separate component of a single application. Takes a list of version labels that specify application source bundles for each of the environments to create or update. The name of each environment and other required information must be included in the source bundles in an environment manifest named env.yaml. See Compose Environments for details.
    */
  def composeEnvironments(): Request[EnvironmentDescriptionsMessage, AWSError] = js.native
  def composeEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescriptionsMessage, Unit]): Request[EnvironmentDescriptionsMessage, AWSError] = js.native
  /**
    * Create or update a group of environments that each run a separate component of a single application. Takes a list of version labels that specify application source bundles for each of the environments to create or update. The name of each environment and other required information must be included in the source bundles in an environment manifest named env.yaml. See Compose Environments for details.
    */
  def composeEnvironments(params: ComposeEnvironmentsMessage): Request[EnvironmentDescriptionsMessage, AWSError] = js.native
  def composeEnvironments(
    params: ComposeEnvironmentsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescriptionsMessage, Unit]
  ): Request[EnvironmentDescriptionsMessage, AWSError] = js.native
  /**
    * Creates an application that has one configuration template named default and no application versions.
    */
  def createApplication(): Request[ApplicationDescriptionMessage, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ ApplicationDescriptionMessage, Unit]): Request[ApplicationDescriptionMessage, AWSError] = js.native
  /**
    * Creates an application that has one configuration template named default and no application versions.
    */
  def createApplication(params: CreateApplicationMessage): Request[ApplicationDescriptionMessage, AWSError] = js.native
  def createApplication(
    params: CreateApplicationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplicationDescriptionMessage, Unit]
  ): Request[ApplicationDescriptionMessage, AWSError] = js.native
  /**
    * Creates an application version for the specified application. You can create an application version from a source bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows: Specify a commit in an AWS CodeCommit repository with SourceBuildInformation. Specify a build in an AWS CodeBuild with SourceBuildInformation and BuildConfiguration. Specify a source bundle in S3 with SourceBundle  Omit both SourceBuildInformation and SourceBundle to use the default sample application.  After you create an application version with a specified Amazon S3 bucket and key location, you can't change that Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an environment from the application version. 
    */
  def createApplicationVersion(): Request[ApplicationVersionDescriptionMessage, AWSError] = js.native
  def createApplicationVersion(callback: js.Function2[/* err */ AWSError, /* data */ ApplicationVersionDescriptionMessage, Unit]): Request[ApplicationVersionDescriptionMessage, AWSError] = js.native
  /**
    * Creates an application version for the specified application. You can create an application version from a source bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows: Specify a commit in an AWS CodeCommit repository with SourceBuildInformation. Specify a build in an AWS CodeBuild with SourceBuildInformation and BuildConfiguration. Specify a source bundle in S3 with SourceBundle  Omit both SourceBuildInformation and SourceBundle to use the default sample application.  After you create an application version with a specified Amazon S3 bucket and key location, you can't change that Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an environment from the application version. 
    */
  def createApplicationVersion(params: CreateApplicationVersionMessage): Request[ApplicationVersionDescriptionMessage, AWSError] = js.native
  def createApplicationVersion(
    params: CreateApplicationVersionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplicationVersionDescriptionMessage, Unit]
  ): Request[ApplicationVersionDescriptionMessage, AWSError] = js.native
  /**
    * Creates an AWS Elastic Beanstalk configuration template, associated with a specific Elastic Beanstalk application. You define application configuration settings in a configuration template. You can then use the configuration template to deploy different versions of the application with the same configuration settings. Templates aren't associated with any environment. The EnvironmentName response element is always null. Related Topics    DescribeConfigurationOptions     DescribeConfigurationSettings     ListAvailableSolutionStacks   
    */
  def createConfigurationTemplate(): Request[ConfigurationSettingsDescription, AWSError] = js.native
  def createConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationSettingsDescription, Unit]): Request[ConfigurationSettingsDescription, AWSError] = js.native
  /**
    * Creates an AWS Elastic Beanstalk configuration template, associated with a specific Elastic Beanstalk application. You define application configuration settings in a configuration template. You can then use the configuration template to deploy different versions of the application with the same configuration settings. Templates aren't associated with any environment. The EnvironmentName response element is always null. Related Topics    DescribeConfigurationOptions     DescribeConfigurationSettings     ListAvailableSolutionStacks   
    */
  def createConfigurationTemplate(params: CreateConfigurationTemplateMessage): Request[ConfigurationSettingsDescription, AWSError] = js.native
  def createConfigurationTemplate(
    params: CreateConfigurationTemplateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationSettingsDescription, Unit]
  ): Request[ConfigurationSettingsDescription, AWSError] = js.native
  /**
    * Launches an AWS Elastic Beanstalk environment for the specified application using the specified configuration.
    */
  def createEnvironment(): Request[EnvironmentDescription, AWSError] = js.native
  def createEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescription, Unit]): Request[EnvironmentDescription, AWSError] = js.native
  /**
    * Launches an AWS Elastic Beanstalk environment for the specified application using the specified configuration.
    */
  def createEnvironment(params: CreateEnvironmentMessage): Request[EnvironmentDescription, AWSError] = js.native
  def createEnvironment(
    params: CreateEnvironmentMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescription, Unit]
  ): Request[EnvironmentDescription, AWSError] = js.native
  /**
    * Create a new version of your custom platform.
    */
  def createPlatformVersion(): Request[CreatePlatformVersionResult, AWSError] = js.native
  def createPlatformVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreatePlatformVersionResult, Unit]): Request[CreatePlatformVersionResult, AWSError] = js.native
  /**
    * Create a new version of your custom platform.
    */
  def createPlatformVersion(params: CreatePlatformVersionRequest): Request[CreatePlatformVersionResult, AWSError] = js.native
  def createPlatformVersion(
    params: CreatePlatformVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePlatformVersionResult, Unit]
  ): Request[CreatePlatformVersionResult, AWSError] = js.native
  /**
    * Creates a bucket in Amazon S3 to store application versions, logs, and other files used by Elastic Beanstalk environments. The Elastic Beanstalk console and EB CLI call this API the first time you create an environment in a region. If the storage location already exists, CreateStorageLocation still returns the bucket name but does not create a new bucket.
    */
  def createStorageLocation(): Request[CreateStorageLocationResultMessage, AWSError] = js.native
  def createStorageLocation(callback: js.Function2[/* err */ AWSError, /* data */ CreateStorageLocationResultMessage, Unit]): Request[CreateStorageLocationResultMessage, AWSError] = js.native
  /**
    * Deletes the specified application along with all associated versions and configurations. The application versions will not be deleted from your Amazon S3 bucket.  You cannot delete an application that has a running environment. 
    */
  def deleteApplication(): Request[js.Object, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified application along with all associated versions and configurations. The application versions will not be deleted from your Amazon S3 bucket.  You cannot delete an application that has a running environment. 
    */
  def deleteApplication(params: DeleteApplicationMessage): Request[js.Object, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified version from the specified application.  You cannot delete an application version that is associated with a running environment. 
    */
  def deleteApplicationVersion(): Request[js.Object, AWSError] = js.native
  def deleteApplicationVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified version from the specified application.  You cannot delete an application version that is associated with a running environment. 
    */
  def deleteApplicationVersion(params: DeleteApplicationVersionMessage): Request[js.Object, AWSError] = js.native
  def deleteApplicationVersion(
    params: DeleteApplicationVersionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified configuration template.  When you launch an environment using a configuration template, the environment gets a copy of the template. You can delete or modify the environment's copy of the template without affecting the running environment. 
    */
  def deleteConfigurationTemplate(): Request[js.Object, AWSError] = js.native
  def deleteConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified configuration template.  When you launch an environment using a configuration template, the environment gets a copy of the template. You can delete or modify the environment's copy of the template without affecting the running environment. 
    */
  def deleteConfigurationTemplate(params: DeleteConfigurationTemplateMessage): Request[js.Object, AWSError] = js.native
  def deleteConfigurationTemplate(
    params: DeleteConfigurationTemplateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the draft configuration associated with the running environment. Updating a running environment with any configuration changes creates a draft configuration set. You can get the draft configuration using DescribeConfigurationSettings while the update is in progress or if the update fails. The DeploymentStatus for the draft configuration indicates whether the deployment is in process or has failed. The draft configuration remains in existence until it is deleted with this action.
    */
  def deleteEnvironmentConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteEnvironmentConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the draft configuration associated with the running environment. Updating a running environment with any configuration changes creates a draft configuration set. You can get the draft configuration using DescribeConfigurationSettings while the update is in progress or if the update fails. The DeploymentStatus for the draft configuration indicates whether the deployment is in process or has failed. The draft configuration remains in existence until it is deleted with this action.
    */
  def deleteEnvironmentConfiguration(params: DeleteEnvironmentConfigurationMessage): Request[js.Object, AWSError] = js.native
  def deleteEnvironmentConfiguration(
    params: DeleteEnvironmentConfigurationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified version of a custom platform.
    */
  def deletePlatformVersion(): Request[DeletePlatformVersionResult, AWSError] = js.native
  def deletePlatformVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeletePlatformVersionResult, Unit]): Request[DeletePlatformVersionResult, AWSError] = js.native
  /**
    * Deletes the specified version of a custom platform.
    */
  def deletePlatformVersion(params: DeletePlatformVersionRequest): Request[DeletePlatformVersionResult, AWSError] = js.native
  def deletePlatformVersion(
    params: DeletePlatformVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePlatformVersionResult, Unit]
  ): Request[DeletePlatformVersionResult, AWSError] = js.native
  /**
    * Returns attributes related to AWS Elastic Beanstalk that are associated with the calling AWS account. The result currently has one set of attributes—resource quotas.
    */
  def describeAccountAttributes(): Request[DescribeAccountAttributesResult, AWSError] = js.native
  def describeAccountAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResult, Unit]): Request[DescribeAccountAttributesResult, AWSError] = js.native
  /**
    * Retrieve a list of application versions.
    */
  def describeApplicationVersions(): Request[ApplicationVersionDescriptionsMessage, AWSError] = js.native
  def describeApplicationVersions(callback: js.Function2[/* err */ AWSError, /* data */ ApplicationVersionDescriptionsMessage, Unit]): Request[ApplicationVersionDescriptionsMessage, AWSError] = js.native
  /**
    * Retrieve a list of application versions.
    */
  def describeApplicationVersions(params: DescribeApplicationVersionsMessage): Request[ApplicationVersionDescriptionsMessage, AWSError] = js.native
  def describeApplicationVersions(
    params: DescribeApplicationVersionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplicationVersionDescriptionsMessage, Unit]
  ): Request[ApplicationVersionDescriptionsMessage, AWSError] = js.native
  /**
    * Returns the descriptions of existing applications.
    */
  def describeApplications(): Request[ApplicationDescriptionsMessage, AWSError] = js.native
  def describeApplications(callback: js.Function2[/* err */ AWSError, /* data */ ApplicationDescriptionsMessage, Unit]): Request[ApplicationDescriptionsMessage, AWSError] = js.native
  /**
    * Returns the descriptions of existing applications.
    */
  def describeApplications(params: DescribeApplicationsMessage): Request[ApplicationDescriptionsMessage, AWSError] = js.native
  def describeApplications(
    params: DescribeApplicationsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplicationDescriptionsMessage, Unit]
  ): Request[ApplicationDescriptionsMessage, AWSError] = js.native
  /**
    * Describes the configuration options that are used in a particular configuration template or environment, or that a specified solution stack defines. The description includes the values the options, their default values, and an indication of the required action on a running environment if an option value is changed.
    */
  def describeConfigurationOptions(): Request[ConfigurationOptionsDescription, AWSError] = js.native
  def describeConfigurationOptions(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationOptionsDescription, Unit]): Request[ConfigurationOptionsDescription, AWSError] = js.native
  /**
    * Describes the configuration options that are used in a particular configuration template or environment, or that a specified solution stack defines. The description includes the values the options, their default values, and an indication of the required action on a running environment if an option value is changed.
    */
  def describeConfigurationOptions(params: DescribeConfigurationOptionsMessage): Request[ConfigurationOptionsDescription, AWSError] = js.native
  def describeConfigurationOptions(
    params: DescribeConfigurationOptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationOptionsDescription, Unit]
  ): Request[ConfigurationOptionsDescription, AWSError] = js.native
  /**
    * Returns a description of the settings for the specified configuration set, that is, either a configuration template or the configuration set associated with a running environment. When describing the settings for the configuration set associated with a running environment, it is possible to receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft configuration of an environment that is either in the process of deployment or that failed to deploy. Related Topics    DeleteEnvironmentConfiguration   
    */
  def describeConfigurationSettings(): Request[ConfigurationSettingsDescriptions, AWSError] = js.native
  def describeConfigurationSettings(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationSettingsDescriptions, Unit]): Request[ConfigurationSettingsDescriptions, AWSError] = js.native
  /**
    * Returns a description of the settings for the specified configuration set, that is, either a configuration template or the configuration set associated with a running environment. When describing the settings for the configuration set associated with a running environment, it is possible to receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft configuration of an environment that is either in the process of deployment or that failed to deploy. Related Topics    DeleteEnvironmentConfiguration   
    */
  def describeConfigurationSettings(params: DescribeConfigurationSettingsMessage): Request[ConfigurationSettingsDescriptions, AWSError] = js.native
  def describeConfigurationSettings(
    params: DescribeConfigurationSettingsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationSettingsDescriptions, Unit]
  ): Request[ConfigurationSettingsDescriptions, AWSError] = js.native
  /**
    * Returns information about the overall health of the specified environment. The DescribeEnvironmentHealth operation is only available with AWS Elastic Beanstalk Enhanced Health.
    */
  def describeEnvironmentHealth(): Request[DescribeEnvironmentHealthResult, AWSError] = js.native
  def describeEnvironmentHealth(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentHealthResult, Unit]): Request[DescribeEnvironmentHealthResult, AWSError] = js.native
  /**
    * Returns information about the overall health of the specified environment. The DescribeEnvironmentHealth operation is only available with AWS Elastic Beanstalk Enhanced Health.
    */
  def describeEnvironmentHealth(params: DescribeEnvironmentHealthRequest): Request[DescribeEnvironmentHealthResult, AWSError] = js.native
  def describeEnvironmentHealth(
    params: DescribeEnvironmentHealthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentHealthResult, Unit]
  ): Request[DescribeEnvironmentHealthResult, AWSError] = js.native
  /**
    * Lists an environment's completed and failed managed actions.
    */
  def describeEnvironmentManagedActionHistory(): Request[DescribeEnvironmentManagedActionHistoryResult, AWSError] = js.native
  def describeEnvironmentManagedActionHistory(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentManagedActionHistoryResult, Unit]
  ): Request[DescribeEnvironmentManagedActionHistoryResult, AWSError] = js.native
  /**
    * Lists an environment's completed and failed managed actions.
    */
  def describeEnvironmentManagedActionHistory(params: DescribeEnvironmentManagedActionHistoryRequest): Request[DescribeEnvironmentManagedActionHistoryResult, AWSError] = js.native
  def describeEnvironmentManagedActionHistory(
    params: DescribeEnvironmentManagedActionHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentManagedActionHistoryResult, Unit]
  ): Request[DescribeEnvironmentManagedActionHistoryResult, AWSError] = js.native
  /**
    * Lists an environment's upcoming and in-progress managed actions.
    */
  def describeEnvironmentManagedActions(): Request[DescribeEnvironmentManagedActionsResult, AWSError] = js.native
  def describeEnvironmentManagedActions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentManagedActionsResult, Unit]
  ): Request[DescribeEnvironmentManagedActionsResult, AWSError] = js.native
  /**
    * Lists an environment's upcoming and in-progress managed actions.
    */
  def describeEnvironmentManagedActions(params: DescribeEnvironmentManagedActionsRequest): Request[DescribeEnvironmentManagedActionsResult, AWSError] = js.native
  def describeEnvironmentManagedActions(
    params: DescribeEnvironmentManagedActionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentManagedActionsResult, Unit]
  ): Request[DescribeEnvironmentManagedActionsResult, AWSError] = js.native
  /**
    * Returns AWS resources for this environment.
    */
  def describeEnvironmentResources(): Request[EnvironmentResourceDescriptionsMessage, AWSError] = js.native
  def describeEnvironmentResources(
    callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentResourceDescriptionsMessage, Unit]
  ): Request[EnvironmentResourceDescriptionsMessage, AWSError] = js.native
  /**
    * Returns AWS resources for this environment.
    */
  def describeEnvironmentResources(params: DescribeEnvironmentResourcesMessage): Request[EnvironmentResourceDescriptionsMessage, AWSError] = js.native
  def describeEnvironmentResources(
    params: DescribeEnvironmentResourcesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentResourceDescriptionsMessage, Unit]
  ): Request[EnvironmentResourceDescriptionsMessage, AWSError] = js.native
  /**
    * Returns descriptions for existing environments.
    */
  def describeEnvironments(): Request[EnvironmentDescriptionsMessage, AWSError] = js.native
  def describeEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescriptionsMessage, Unit]): Request[EnvironmentDescriptionsMessage, AWSError] = js.native
  /**
    * Returns descriptions for existing environments.
    */
  def describeEnvironments(params: DescribeEnvironmentsMessage): Request[EnvironmentDescriptionsMessage, AWSError] = js.native
  def describeEnvironments(
    params: DescribeEnvironmentsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescriptionsMessage, Unit]
  ): Request[EnvironmentDescriptionsMessage, AWSError] = js.native
  /**
    * Returns list of event descriptions matching criteria up to the last 6 weeks.  This action returns the most recent 1,000 events from the specified NextToken. 
    */
  def describeEvents(): Request[EventDescriptionsMessage, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ EventDescriptionsMessage, Unit]): Request[EventDescriptionsMessage, AWSError] = js.native
  /**
    * Returns list of event descriptions matching criteria up to the last 6 weeks.  This action returns the most recent 1,000 events from the specified NextToken. 
    */
  def describeEvents(params: DescribeEventsMessage): Request[EventDescriptionsMessage, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventDescriptionsMessage, Unit]
  ): Request[EventDescriptionsMessage, AWSError] = js.native
  /**
    * Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation requires enhanced health reporting.
    */
  def describeInstancesHealth(): Request[DescribeInstancesHealthResult, AWSError] = js.native
  def describeInstancesHealth(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesHealthResult, Unit]): Request[DescribeInstancesHealthResult, AWSError] = js.native
  /**
    * Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation requires enhanced health reporting.
    */
  def describeInstancesHealth(params: DescribeInstancesHealthRequest): Request[DescribeInstancesHealthResult, AWSError] = js.native
  def describeInstancesHealth(
    params: DescribeInstancesHealthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesHealthResult, Unit]
  ): Request[DescribeInstancesHealthResult, AWSError] = js.native
  /**
    * Describes a platform version. Provides full details. Compare to ListPlatformVersions, which provides summary information about a list of platform versions. For definitions of platform version and other platform-related terms, see AWS Elastic Beanstalk Platforms Glossary.
    */
  def describePlatformVersion(): Request[DescribePlatformVersionResult, AWSError] = js.native
  def describePlatformVersion(callback: js.Function2[/* err */ AWSError, /* data */ DescribePlatformVersionResult, Unit]): Request[DescribePlatformVersionResult, AWSError] = js.native
  /**
    * Describes a platform version. Provides full details. Compare to ListPlatformVersions, which provides summary information about a list of platform versions. For definitions of platform version and other platform-related terms, see AWS Elastic Beanstalk Platforms Glossary.
    */
  def describePlatformVersion(params: DescribePlatformVersionRequest): Request[DescribePlatformVersionResult, AWSError] = js.native
  def describePlatformVersion(
    params: DescribePlatformVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePlatformVersionResult, Unit]
  ): Request[DescribePlatformVersionResult, AWSError] = js.native
  /**
    * Returns a list of the available solution stack names, with the public version first and then in reverse chronological order.
    */
  def listAvailableSolutionStacks(): Request[ListAvailableSolutionStacksResultMessage, AWSError] = js.native
  def listAvailableSolutionStacks(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableSolutionStacksResultMessage, Unit]
  ): Request[ListAvailableSolutionStacksResultMessage, AWSError] = js.native
  /**
    * Lists the platform branches available for your account in an AWS Region. Provides summary information about each platform branch. For definitions of platform branch and other platform-related terms, see AWS Elastic Beanstalk Platforms Glossary.
    */
  def listPlatformBranches(): Request[ListPlatformBranchesResult, AWSError] = js.native
  def listPlatformBranches(callback: js.Function2[/* err */ AWSError, /* data */ ListPlatformBranchesResult, Unit]): Request[ListPlatformBranchesResult, AWSError] = js.native
  /**
    * Lists the platform branches available for your account in an AWS Region. Provides summary information about each platform branch. For definitions of platform branch and other platform-related terms, see AWS Elastic Beanstalk Platforms Glossary.
    */
  def listPlatformBranches(params: ListPlatformBranchesRequest): Request[ListPlatformBranchesResult, AWSError] = js.native
  def listPlatformBranches(
    params: ListPlatformBranchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlatformBranchesResult, Unit]
  ): Request[ListPlatformBranchesResult, AWSError] = js.native
  /**
    * Lists the platform versions available for your account in an AWS Region. Provides summary information about each platform version. Compare to DescribePlatformVersion, which provides full details about a single platform version. For definitions of platform version and other platform-related terms, see AWS Elastic Beanstalk Platforms Glossary.
    */
  def listPlatformVersions(): Request[ListPlatformVersionsResult, AWSError] = js.native
  def listPlatformVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListPlatformVersionsResult, Unit]): Request[ListPlatformVersionsResult, AWSError] = js.native
  /**
    * Lists the platform versions available for your account in an AWS Region. Provides summary information about each platform version. Compare to DescribePlatformVersion, which provides full details about a single platform version. For definitions of platform version and other platform-related terms, see AWS Elastic Beanstalk Platforms Glossary.
    */
  def listPlatformVersions(params: ListPlatformVersionsRequest): Request[ListPlatformVersionsResult, AWSError] = js.native
  def listPlatformVersions(
    params: ListPlatformVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlatformVersionsResult, Unit]
  ): Request[ListPlatformVersionsResult, AWSError] = js.native
  /**
    * Return the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value pairs. Elastic Beanstalk supports tagging of all of its resources. For details about resource tagging, see Tagging Application Resources.
    */
  def listTagsForResource(): Request[ResourceTagsDescriptionMessage, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ResourceTagsDescriptionMessage, Unit]): Request[ResourceTagsDescriptionMessage, AWSError] = js.native
  /**
    * Return the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value pairs. Elastic Beanstalk supports tagging of all of its resources. For details about resource tagging, see Tagging Application Resources.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): Request[ResourceTagsDescriptionMessage, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ResourceTagsDescriptionMessage, Unit]
  ): Request[ResourceTagsDescriptionMessage, AWSError] = js.native
  /**
    * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a specified environment and forces a restart.
    */
  def rebuildEnvironment(): Request[js.Object, AWSError] = js.native
  def rebuildEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a specified environment and forces a restart.
    */
  def rebuildEnvironment(params: RebuildEnvironmentMessage): Request[js.Object, AWSError] = js.native
  def rebuildEnvironment(
    params: RebuildEnvironmentMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Initiates a request to compile the specified type of information of the deployed environment.  Setting the InfoType to tail compiles the last lines from the application server log files of every Amazon EC2 instance in your environment.   Setting the InfoType to bundle compresses the application server log files for every Amazon EC2 instance into a .zip file. Legacy and .NET containers do not support bundle logs.   Use RetrieveEnvironmentInfo to obtain the set of logs.  Related Topics    RetrieveEnvironmentInfo   
    */
  def requestEnvironmentInfo(): Request[js.Object, AWSError] = js.native
  def requestEnvironmentInfo(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Initiates a request to compile the specified type of information of the deployed environment.  Setting the InfoType to tail compiles the last lines from the application server log files of every Amazon EC2 instance in your environment.   Setting the InfoType to bundle compresses the application server log files for every Amazon EC2 instance into a .zip file. Legacy and .NET containers do not support bundle logs.   Use RetrieveEnvironmentInfo to obtain the set of logs.  Related Topics    RetrieveEnvironmentInfo   
    */
  def requestEnvironmentInfo(params: RequestEnvironmentInfoMessage): Request[js.Object, AWSError] = js.native
  def requestEnvironmentInfo(
    params: RequestEnvironmentInfoMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Causes the environment to restart the application container server running on each Amazon EC2 instance.
    */
  def restartAppServer(): Request[js.Object, AWSError] = js.native
  def restartAppServer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Causes the environment to restart the application container server running on each Amazon EC2 instance.
    */
  def restartAppServer(params: RestartAppServerMessage): Request[js.Object, AWSError] = js.native
  def restartAppServer(
    params: RestartAppServerMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Retrieves the compiled information from a RequestEnvironmentInfo request. Related Topics    RequestEnvironmentInfo   
    */
  def retrieveEnvironmentInfo(): Request[RetrieveEnvironmentInfoResultMessage, AWSError] = js.native
  def retrieveEnvironmentInfo(callback: js.Function2[/* err */ AWSError, /* data */ RetrieveEnvironmentInfoResultMessage, Unit]): Request[RetrieveEnvironmentInfoResultMessage, AWSError] = js.native
  /**
    * Retrieves the compiled information from a RequestEnvironmentInfo request. Related Topics    RequestEnvironmentInfo   
    */
  def retrieveEnvironmentInfo(params: RetrieveEnvironmentInfoMessage): Request[RetrieveEnvironmentInfoResultMessage, AWSError] = js.native
  def retrieveEnvironmentInfo(
    params: RetrieveEnvironmentInfoMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RetrieveEnvironmentInfoResultMessage, Unit]
  ): Request[RetrieveEnvironmentInfoResultMessage, AWSError] = js.native
  /**
    * Swaps the CNAMEs of two environments.
    */
  def swapEnvironmentCNAMEs(): Request[js.Object, AWSError] = js.native
  def swapEnvironmentCNAMEs(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Swaps the CNAMEs of two environments.
    */
  def swapEnvironmentCNAMEs(params: SwapEnvironmentCNAMEsMessage): Request[js.Object, AWSError] = js.native
  def swapEnvironmentCNAMEs(
    params: SwapEnvironmentCNAMEsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Terminates the specified environment.
    */
  def terminateEnvironment(): Request[EnvironmentDescription, AWSError] = js.native
  def terminateEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescription, Unit]): Request[EnvironmentDescription, AWSError] = js.native
  /**
    * Terminates the specified environment.
    */
  def terminateEnvironment(params: TerminateEnvironmentMessage): Request[EnvironmentDescription, AWSError] = js.native
  def terminateEnvironment(
    params: TerminateEnvironmentMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescription, Unit]
  ): Request[EnvironmentDescription, AWSError] = js.native
  /**
    * Updates the specified application to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear these properties, specify an empty string. 
    */
  def updateApplication(): Request[ApplicationDescriptionMessage, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ ApplicationDescriptionMessage, Unit]): Request[ApplicationDescriptionMessage, AWSError] = js.native
  /**
    * Updates the specified application to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear these properties, specify an empty string. 
    */
  def updateApplication(params: UpdateApplicationMessage): Request[ApplicationDescriptionMessage, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplicationDescriptionMessage, Unit]
  ): Request[ApplicationDescriptionMessage, AWSError] = js.native
  /**
    * Modifies lifecycle settings for an application.
    */
  def updateApplicationResourceLifecycle(): Request[ApplicationResourceLifecycleDescriptionMessage, AWSError] = js.native
  def updateApplicationResourceLifecycle(
    callback: js.Function2[/* err */ AWSError, /* data */ ApplicationResourceLifecycleDescriptionMessage, Unit]
  ): Request[ApplicationResourceLifecycleDescriptionMessage, AWSError] = js.native
  /**
    * Modifies lifecycle settings for an application.
    */
  def updateApplicationResourceLifecycle(params: UpdateApplicationResourceLifecycleMessage): Request[ApplicationResourceLifecycleDescriptionMessage, AWSError] = js.native
  def updateApplicationResourceLifecycle(
    params: UpdateApplicationResourceLifecycleMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplicationResourceLifecycleDescriptionMessage, Unit]
  ): Request[ApplicationResourceLifecycleDescriptionMessage, AWSError] = js.native
  /**
    * Updates the specified application version to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear properties, specify an empty string. 
    */
  def updateApplicationVersion(): Request[ApplicationVersionDescriptionMessage, AWSError] = js.native
  def updateApplicationVersion(callback: js.Function2[/* err */ AWSError, /* data */ ApplicationVersionDescriptionMessage, Unit]): Request[ApplicationVersionDescriptionMessage, AWSError] = js.native
  /**
    * Updates the specified application version to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear properties, specify an empty string. 
    */
  def updateApplicationVersion(params: UpdateApplicationVersionMessage): Request[ApplicationVersionDescriptionMessage, AWSError] = js.native
  def updateApplicationVersion(
    params: UpdateApplicationVersionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplicationVersionDescriptionMessage, Unit]
  ): Request[ApplicationVersionDescriptionMessage, AWSError] = js.native
  /**
    * Updates the specified configuration template to have the specified properties or configuration option values.  If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear such properties, specify an empty string.  Related Topics    DescribeConfigurationOptions   
    */
  def updateConfigurationTemplate(): Request[ConfigurationSettingsDescription, AWSError] = js.native
  def updateConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationSettingsDescription, Unit]): Request[ConfigurationSettingsDescription, AWSError] = js.native
  /**
    * Updates the specified configuration template to have the specified properties or configuration option values.  If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear such properties, specify an empty string.  Related Topics    DescribeConfigurationOptions   
    */
  def updateConfigurationTemplate(params: UpdateConfigurationTemplateMessage): Request[ConfigurationSettingsDescription, AWSError] = js.native
  def updateConfigurationTemplate(
    params: UpdateConfigurationTemplateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationSettingsDescription, Unit]
  ): Request[ConfigurationSettingsDescription, AWSError] = js.native
  /**
    * Updates the environment description, deploys a new application version, updates the configuration settings to an entirely new configuration template, or updates select configuration option values in the running environment.  Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an InvalidParameterCombination error.   When updating the configuration settings to a new template or individual settings, a draft configuration is created and DescribeConfigurationSettings for this environment returns two setting descriptions with different DeploymentStatus values. 
    */
  def updateEnvironment(): Request[EnvironmentDescription, AWSError] = js.native
  def updateEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescription, Unit]): Request[EnvironmentDescription, AWSError] = js.native
  /**
    * Updates the environment description, deploys a new application version, updates the configuration settings to an entirely new configuration template, or updates select configuration option values in the running environment.  Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an InvalidParameterCombination error.   When updating the configuration settings to a new template or individual settings, a draft configuration is created and DescribeConfigurationSettings for this environment returns two setting descriptions with different DeploymentStatus values. 
    */
  def updateEnvironment(params: UpdateEnvironmentMessage): Request[EnvironmentDescription, AWSError] = js.native
  def updateEnvironment(
    params: UpdateEnvironmentMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EnvironmentDescription, Unit]
  ): Request[EnvironmentDescription, AWSError] = js.native
  /**
    * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed: TagsToAdd for tags to add or update, and TagsToRemove. Elastic Beanstalk supports tagging of all of its resources. For details about resource tagging, see Tagging Application Resources. If you create a custom IAM user policy to control permission to this operation, specify one of the following two virtual actions (or both) instead of the API operation name:  elasticbeanstalk:AddTags  Controls permission to call UpdateTagsForResource and pass a list of tags to add in the TagsToAdd parameter.  elasticbeanstalk:RemoveTags  Controls permission to call UpdateTagsForResource and pass a list of tag keys to remove in the TagsToRemove parameter.   For details about creating a custom user policy, see Creating a Custom User Policy.
    */
  def updateTagsForResource(): Request[js.Object, AWSError] = js.native
  def updateTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed: TagsToAdd for tags to add or update, and TagsToRemove. Elastic Beanstalk supports tagging of all of its resources. For details about resource tagging, see Tagging Application Resources. If you create a custom IAM user policy to control permission to this operation, specify one of the following two virtual actions (or both) instead of the API operation name:  elasticbeanstalk:AddTags  Controls permission to call UpdateTagsForResource and pass a list of tags to add in the TagsToAdd parameter.  elasticbeanstalk:RemoveTags  Controls permission to call UpdateTagsForResource and pass a list of tag keys to remove in the TagsToRemove parameter.   For details about creating a custom user policy, see Creating a Custom User Policy.
    */
  def updateTagsForResource(params: UpdateTagsForResourceMessage): Request[js.Object, AWSError] = js.native
  def updateTagsForResource(
    params: UpdateTagsForResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Takes a set of configuration settings and either a configuration template or environment, and determines whether those values are valid. This action returns a list of messages indicating any errors or warnings associated with the selection of option values.
    */
  def validateConfigurationSettings(): Request[ConfigurationSettingsValidationMessages, AWSError] = js.native
  def validateConfigurationSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationSettingsValidationMessages, Unit]
  ): Request[ConfigurationSettingsValidationMessages, AWSError] = js.native
  /**
    * Takes a set of configuration settings and either a configuration template or environment, and determines whether those values are valid. This action returns a list of messages indicating any errors or warnings associated with the selection of option values.
    */
  def validateConfigurationSettings(params: ValidateConfigurationSettingsMessage): Request[ConfigurationSettingsValidationMessages, AWSError] = js.native
  def validateConfigurationSettings(
    params: ValidateConfigurationSettingsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationSettingsValidationMessages, Unit]
  ): Request[ConfigurationSettingsValidationMessages, AWSError] = js.native
}

