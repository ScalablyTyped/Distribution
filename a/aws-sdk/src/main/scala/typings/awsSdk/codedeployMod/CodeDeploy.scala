package typings.awsSdk.codedeployMod

import typings.awsSdk.anon.GetDeploymentInputwaiterW
import typings.awsSdk.awsSdkStrings.deploymentSuccessful
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeDeploy extends Service {
  
  /**
    * Adds tags to on-premises instances.
    */
  def addTagsToOnPremisesInstances(): Request[js.Object, AWSError] = js.native
  def addTagsToOnPremisesInstances(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to on-premises instances.
    */
  def addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput): Request[js.Object, AWSError] = js.native
  def addTagsToOnPremisesInstances(
    params: AddTagsToOnPremisesInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets information about one or more application revisions. The maximum number of application revisions that can be returned is 25.
    */
  def batchGetApplicationRevisions(): Request[BatchGetApplicationRevisionsOutput, AWSError] = js.native
  def batchGetApplicationRevisions(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetApplicationRevisionsOutput, Unit]): Request[BatchGetApplicationRevisionsOutput, AWSError] = js.native
  /**
    * Gets information about one or more application revisions. The maximum number of application revisions that can be returned is 25.
    */
  def batchGetApplicationRevisions(params: BatchGetApplicationRevisionsInput): Request[BatchGetApplicationRevisionsOutput, AWSError] = js.native
  def batchGetApplicationRevisions(
    params: BatchGetApplicationRevisionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetApplicationRevisionsOutput, Unit]
  ): Request[BatchGetApplicationRevisionsOutput, AWSError] = js.native
  
  /**
    * Gets information about one or more applications. The maximum number of applications that can be returned is 100.
    */
  def batchGetApplications(): Request[BatchGetApplicationsOutput, AWSError] = js.native
  def batchGetApplications(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetApplicationsOutput, Unit]): Request[BatchGetApplicationsOutput, AWSError] = js.native
  /**
    * Gets information about one or more applications. The maximum number of applications that can be returned is 100.
    */
  def batchGetApplications(params: BatchGetApplicationsInput): Request[BatchGetApplicationsOutput, AWSError] = js.native
  def batchGetApplications(
    params: BatchGetApplicationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetApplicationsOutput, Unit]
  ): Request[BatchGetApplicationsOutput, AWSError] = js.native
  
  /**
    * Gets information about one or more deployment groups.
    */
  def batchGetDeploymentGroups(): Request[BatchGetDeploymentGroupsOutput, AWSError] = js.native
  def batchGetDeploymentGroups(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDeploymentGroupsOutput, Unit]): Request[BatchGetDeploymentGroupsOutput, AWSError] = js.native
  /**
    * Gets information about one or more deployment groups.
    */
  def batchGetDeploymentGroups(params: BatchGetDeploymentGroupsInput): Request[BatchGetDeploymentGroupsOutput, AWSError] = js.native
  def batchGetDeploymentGroups(
    params: BatchGetDeploymentGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDeploymentGroupsOutput, Unit]
  ): Request[BatchGetDeploymentGroupsOutput, AWSError] = js.native
  
  /**
    *   This method works, but is deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of one or more instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. The maximum number of instances that can be returned is 25.
    */
  def batchGetDeploymentInstances(): Request[BatchGetDeploymentInstancesOutput, AWSError] = js.native
  def batchGetDeploymentInstances(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDeploymentInstancesOutput, Unit]): Request[BatchGetDeploymentInstancesOutput, AWSError] = js.native
  /**
    *   This method works, but is deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of one or more instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. The maximum number of instances that can be returned is 25.
    */
  def batchGetDeploymentInstances(params: BatchGetDeploymentInstancesInput): Request[BatchGetDeploymentInstancesOutput, AWSError] = js.native
  def batchGetDeploymentInstances(
    params: BatchGetDeploymentInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDeploymentInstancesOutput, Unit]
  ): Request[BatchGetDeploymentInstancesOutput, AWSError] = js.native
  
  /**
    *  Returns an array of one or more targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances. The maximum number of targets that can be returned is 25.  The type of targets returned depends on the deployment's compute platform or deployment method:     EC2/On-premises: Information about EC2 instance targets.     AWS Lambda: Information about Lambda functions targets.     Amazon ECS: Information about Amazon ECS service targets.     CloudFormation: Information about targets of blue/green deployments initiated by a CloudFormation stack update.  
    */
  def batchGetDeploymentTargets(): Request[BatchGetDeploymentTargetsOutput, AWSError] = js.native
  def batchGetDeploymentTargets(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDeploymentTargetsOutput, Unit]): Request[BatchGetDeploymentTargetsOutput, AWSError] = js.native
  /**
    *  Returns an array of one or more targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances. The maximum number of targets that can be returned is 25.  The type of targets returned depends on the deployment's compute platform or deployment method:     EC2/On-premises: Information about EC2 instance targets.     AWS Lambda: Information about Lambda functions targets.     Amazon ECS: Information about Amazon ECS service targets.     CloudFormation: Information about targets of blue/green deployments initiated by a CloudFormation stack update.  
    */
  def batchGetDeploymentTargets(params: BatchGetDeploymentTargetsInput): Request[BatchGetDeploymentTargetsOutput, AWSError] = js.native
  def batchGetDeploymentTargets(
    params: BatchGetDeploymentTargetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDeploymentTargetsOutput, Unit]
  ): Request[BatchGetDeploymentTargetsOutput, AWSError] = js.native
  
  /**
    * Gets information about one or more deployments. The maximum number of deployments that can be returned is 25.
    */
  def batchGetDeployments(): Request[BatchGetDeploymentsOutput, AWSError] = js.native
  def batchGetDeployments(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDeploymentsOutput, Unit]): Request[BatchGetDeploymentsOutput, AWSError] = js.native
  /**
    * Gets information about one or more deployments. The maximum number of deployments that can be returned is 25.
    */
  def batchGetDeployments(params: BatchGetDeploymentsInput): Request[BatchGetDeploymentsOutput, AWSError] = js.native
  def batchGetDeployments(
    params: BatchGetDeploymentsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDeploymentsOutput, Unit]
  ): Request[BatchGetDeploymentsOutput, AWSError] = js.native
  
  /**
    * Gets information about one or more on-premises instances. The maximum number of on-premises instances that can be returned is 25.
    */
  def batchGetOnPremisesInstances(): Request[BatchGetOnPremisesInstancesOutput, AWSError] = js.native
  def batchGetOnPremisesInstances(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetOnPremisesInstancesOutput, Unit]): Request[BatchGetOnPremisesInstancesOutput, AWSError] = js.native
  /**
    * Gets information about one or more on-premises instances. The maximum number of on-premises instances that can be returned is 25.
    */
  def batchGetOnPremisesInstances(params: BatchGetOnPremisesInstancesInput): Request[BatchGetOnPremisesInstancesOutput, AWSError] = js.native
  def batchGetOnPremisesInstances(
    params: BatchGetOnPremisesInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetOnPremisesInstancesOutput, Unit]
  ): Request[BatchGetOnPremisesInstancesOutput, AWSError] = js.native
  
  @JSName("config")
  var config_CodeDeploy: ConfigBase with ClientConfiguration = js.native
  
  /**
    * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
    */
  def continueDeployment(): Request[js.Object, AWSError] = js.native
  def continueDeployment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
    */
  def continueDeployment(params: ContinueDeploymentInput): Request[js.Object, AWSError] = js.native
  def continueDeployment(
    params: ContinueDeploymentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates an application.
    */
  def createApplication(): Request[CreateApplicationOutput, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationOutput, Unit]): Request[CreateApplicationOutput, AWSError] = js.native
  /**
    * Creates an application.
    */
  def createApplication(params: CreateApplicationInput): Request[CreateApplicationOutput, AWSError] = js.native
  def createApplication(
    params: CreateApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationOutput, Unit]
  ): Request[CreateApplicationOutput, AWSError] = js.native
  
  /**
    * Deploys an application revision through the specified deployment group.
    */
  def createDeployment(): Request[CreateDeploymentOutput, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentOutput, Unit]): Request[CreateDeploymentOutput, AWSError] = js.native
  /**
    * Deploys an application revision through the specified deployment group.
    */
  def createDeployment(params: CreateDeploymentInput): Request[CreateDeploymentOutput, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentOutput, Unit]
  ): Request[CreateDeploymentOutput, AWSError] = js.native
  
  /**
    *  Creates a deployment configuration. 
    */
  def createDeploymentConfig(): Request[CreateDeploymentConfigOutput, AWSError] = js.native
  def createDeploymentConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentConfigOutput, Unit]): Request[CreateDeploymentConfigOutput, AWSError] = js.native
  /**
    *  Creates a deployment configuration. 
    */
  def createDeploymentConfig(params: CreateDeploymentConfigInput): Request[CreateDeploymentConfigOutput, AWSError] = js.native
  def createDeploymentConfig(
    params: CreateDeploymentConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentConfigOutput, Unit]
  ): Request[CreateDeploymentConfigOutput, AWSError] = js.native
  
  /**
    * Creates a deployment group to which application revisions are deployed.
    */
  def createDeploymentGroup(): Request[CreateDeploymentGroupOutput, AWSError] = js.native
  def createDeploymentGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentGroupOutput, Unit]): Request[CreateDeploymentGroupOutput, AWSError] = js.native
  /**
    * Creates a deployment group to which application revisions are deployed.
    */
  def createDeploymentGroup(params: CreateDeploymentGroupInput): Request[CreateDeploymentGroupOutput, AWSError] = js.native
  def createDeploymentGroup(
    params: CreateDeploymentGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentGroupOutput, Unit]
  ): Request[CreateDeploymentGroupOutput, AWSError] = js.native
  
  /**
    * Deletes an application.
    */
  def deleteApplication(): Request[js.Object, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an application.
    */
  def deleteApplication(params: DeleteApplicationInput): Request[js.Object, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
    */
  def deleteDeploymentConfig(): Request[js.Object, AWSError] = js.native
  def deleteDeploymentConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
    */
  def deleteDeploymentConfig(params: DeleteDeploymentConfigInput): Request[js.Object, AWSError] = js.native
  def deleteDeploymentConfig(
    params: DeleteDeploymentConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a deployment group.
    */
  def deleteDeploymentGroup(): Request[DeleteDeploymentGroupOutput, AWSError] = js.native
  def deleteDeploymentGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeploymentGroupOutput, Unit]): Request[DeleteDeploymentGroupOutput, AWSError] = js.native
  /**
    * Deletes a deployment group.
    */
  def deleteDeploymentGroup(params: DeleteDeploymentGroupInput): Request[DeleteDeploymentGroupOutput, AWSError] = js.native
  def deleteDeploymentGroup(
    params: DeleteDeploymentGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeploymentGroupOutput, Unit]
  ): Request[DeleteDeploymentGroupOutput, AWSError] = js.native
  
  /**
    * Deletes a GitHub account connection.
    */
  def deleteGitHubAccountToken(): Request[DeleteGitHubAccountTokenOutput, AWSError] = js.native
  def deleteGitHubAccountToken(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGitHubAccountTokenOutput, Unit]): Request[DeleteGitHubAccountTokenOutput, AWSError] = js.native
  /**
    * Deletes a GitHub account connection.
    */
  def deleteGitHubAccountToken(params: DeleteGitHubAccountTokenInput): Request[DeleteGitHubAccountTokenOutput, AWSError] = js.native
  def deleteGitHubAccountToken(
    params: DeleteGitHubAccountTokenInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGitHubAccountTokenOutput, Unit]
  ): Request[DeleteGitHubAccountTokenOutput, AWSError] = js.native
  
  /**
    * Deletes resources linked to an external ID.
    */
  def deleteResourcesByExternalId(): Request[DeleteResourcesByExternalIdOutput, AWSError] = js.native
  def deleteResourcesByExternalId(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcesByExternalIdOutput, Unit]): Request[DeleteResourcesByExternalIdOutput, AWSError] = js.native
  /**
    * Deletes resources linked to an external ID.
    */
  def deleteResourcesByExternalId(params: DeleteResourcesByExternalIdInput): Request[DeleteResourcesByExternalIdOutput, AWSError] = js.native
  def deleteResourcesByExternalId(
    params: DeleteResourcesByExternalIdInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcesByExternalIdOutput, Unit]
  ): Request[DeleteResourcesByExternalIdOutput, AWSError] = js.native
  
  /**
    * Deregisters an on-premises instance.
    */
  def deregisterOnPremisesInstance(): Request[js.Object, AWSError] = js.native
  def deregisterOnPremisesInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters an on-premises instance.
    */
  def deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput): Request[js.Object, AWSError] = js.native
  def deregisterOnPremisesInstance(
    params: DeregisterOnPremisesInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets information about an application.
    */
  def getApplication(): Request[GetApplicationOutput, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationOutput, Unit]): Request[GetApplicationOutput, AWSError] = js.native
  /**
    * Gets information about an application.
    */
  def getApplication(params: GetApplicationInput): Request[GetApplicationOutput, AWSError] = js.native
  def getApplication(
    params: GetApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationOutput, Unit]
  ): Request[GetApplicationOutput, AWSError] = js.native
  
  /**
    * Gets information about an application revision.
    */
  def getApplicationRevision(): Request[GetApplicationRevisionOutput, AWSError] = js.native
  def getApplicationRevision(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationRevisionOutput, Unit]): Request[GetApplicationRevisionOutput, AWSError] = js.native
  /**
    * Gets information about an application revision.
    */
  def getApplicationRevision(params: GetApplicationRevisionInput): Request[GetApplicationRevisionOutput, AWSError] = js.native
  def getApplicationRevision(
    params: GetApplicationRevisionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationRevisionOutput, Unit]
  ): Request[GetApplicationRevisionOutput, AWSError] = js.native
  
  /**
    * Gets information about a deployment.   The content property of the appSpecContent object in the returned revision is always null. Use GetApplicationRevision and the sha256 property of the returned appSpecContent object to get the content of the deployment’s AppSpec file.  
    */
  def getDeployment(): Request[GetDeploymentOutput, AWSError] = js.native
  def getDeployment(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentOutput, Unit]): Request[GetDeploymentOutput, AWSError] = js.native
  /**
    * Gets information about a deployment.   The content property of the appSpecContent object in the returned revision is always null. Use GetApplicationRevision and the sha256 property of the returned appSpecContent object to get the content of the deployment’s AppSpec file.  
    */
  def getDeployment(params: GetDeploymentInput): Request[GetDeploymentOutput, AWSError] = js.native
  def getDeployment(
    params: GetDeploymentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentOutput, Unit]
  ): Request[GetDeploymentOutput, AWSError] = js.native
  
  /**
    * Gets information about a deployment configuration.
    */
  def getDeploymentConfig(): Request[GetDeploymentConfigOutput, AWSError] = js.native
  def getDeploymentConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentConfigOutput, Unit]): Request[GetDeploymentConfigOutput, AWSError] = js.native
  /**
    * Gets information about a deployment configuration.
    */
  def getDeploymentConfig(params: GetDeploymentConfigInput): Request[GetDeploymentConfigOutput, AWSError] = js.native
  def getDeploymentConfig(
    params: GetDeploymentConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentConfigOutput, Unit]
  ): Request[GetDeploymentConfigOutput, AWSError] = js.native
  
  /**
    * Gets information about a deployment group.
    */
  def getDeploymentGroup(): Request[GetDeploymentGroupOutput, AWSError] = js.native
  def getDeploymentGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentGroupOutput, Unit]): Request[GetDeploymentGroupOutput, AWSError] = js.native
  /**
    * Gets information about a deployment group.
    */
  def getDeploymentGroup(params: GetDeploymentGroupInput): Request[GetDeploymentGroupOutput, AWSError] = js.native
  def getDeploymentGroup(
    params: GetDeploymentGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentGroupOutput, Unit]
  ): Request[GetDeploymentGroupOutput, AWSError] = js.native
  
  /**
    * Gets information about an instance as part of a deployment.
    */
  def getDeploymentInstance(): Request[GetDeploymentInstanceOutput, AWSError] = js.native
  def getDeploymentInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentInstanceOutput, Unit]): Request[GetDeploymentInstanceOutput, AWSError] = js.native
  /**
    * Gets information about an instance as part of a deployment.
    */
  def getDeploymentInstance(params: GetDeploymentInstanceInput): Request[GetDeploymentInstanceOutput, AWSError] = js.native
  def getDeploymentInstance(
    params: GetDeploymentInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentInstanceOutput, Unit]
  ): Request[GetDeploymentInstanceOutput, AWSError] = js.native
  
  /**
    *  Returns information about a deployment target. 
    */
  def getDeploymentTarget(): Request[GetDeploymentTargetOutput, AWSError] = js.native
  def getDeploymentTarget(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentTargetOutput, Unit]): Request[GetDeploymentTargetOutput, AWSError] = js.native
  /**
    *  Returns information about a deployment target. 
    */
  def getDeploymentTarget(params: GetDeploymentTargetInput): Request[GetDeploymentTargetOutput, AWSError] = js.native
  def getDeploymentTarget(
    params: GetDeploymentTargetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentTargetOutput, Unit]
  ): Request[GetDeploymentTargetOutput, AWSError] = js.native
  
  /**
    *  Gets information about an on-premises instance. 
    */
  def getOnPremisesInstance(): Request[GetOnPremisesInstanceOutput, AWSError] = js.native
  def getOnPremisesInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetOnPremisesInstanceOutput, Unit]): Request[GetOnPremisesInstanceOutput, AWSError] = js.native
  /**
    *  Gets information about an on-premises instance. 
    */
  def getOnPremisesInstance(params: GetOnPremisesInstanceInput): Request[GetOnPremisesInstanceOutput, AWSError] = js.native
  def getOnPremisesInstance(
    params: GetOnPremisesInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOnPremisesInstanceOutput, Unit]
  ): Request[GetOnPremisesInstanceOutput, AWSError] = js.native
  
  /**
    * Lists information about revisions for an application.
    */
  def listApplicationRevisions(): Request[ListApplicationRevisionsOutput, AWSError] = js.native
  def listApplicationRevisions(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationRevisionsOutput, Unit]): Request[ListApplicationRevisionsOutput, AWSError] = js.native
  /**
    * Lists information about revisions for an application.
    */
  def listApplicationRevisions(params: ListApplicationRevisionsInput): Request[ListApplicationRevisionsOutput, AWSError] = js.native
  def listApplicationRevisions(
    params: ListApplicationRevisionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationRevisionsOutput, Unit]
  ): Request[ListApplicationRevisionsOutput, AWSError] = js.native
  
  /**
    * Lists the applications registered with the IAM user or AWS account.
    */
  def listApplications(): Request[ListApplicationsOutput, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsOutput, Unit]): Request[ListApplicationsOutput, AWSError] = js.native
  /**
    * Lists the applications registered with the IAM user or AWS account.
    */
  def listApplications(params: ListApplicationsInput): Request[ListApplicationsOutput, AWSError] = js.native
  def listApplications(
    params: ListApplicationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsOutput, Unit]
  ): Request[ListApplicationsOutput, AWSError] = js.native
  
  /**
    * Lists the deployment configurations with the IAM user or AWS account.
    */
  def listDeploymentConfigs(): Request[ListDeploymentConfigsOutput, AWSError] = js.native
  def listDeploymentConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentConfigsOutput, Unit]): Request[ListDeploymentConfigsOutput, AWSError] = js.native
  /**
    * Lists the deployment configurations with the IAM user or AWS account.
    */
  def listDeploymentConfigs(params: ListDeploymentConfigsInput): Request[ListDeploymentConfigsOutput, AWSError] = js.native
  def listDeploymentConfigs(
    params: ListDeploymentConfigsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentConfigsOutput, Unit]
  ): Request[ListDeploymentConfigsOutput, AWSError] = js.native
  
  /**
    * Lists the deployment groups for an application registered with the IAM user or AWS account.
    */
  def listDeploymentGroups(): Request[ListDeploymentGroupsOutput, AWSError] = js.native
  def listDeploymentGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentGroupsOutput, Unit]): Request[ListDeploymentGroupsOutput, AWSError] = js.native
  /**
    * Lists the deployment groups for an application registered with the IAM user or AWS account.
    */
  def listDeploymentGroups(params: ListDeploymentGroupsInput): Request[ListDeploymentGroupsOutput, AWSError] = js.native
  def listDeploymentGroups(
    params: ListDeploymentGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentGroupsOutput, Unit]
  ): Request[ListDeploymentGroupsOutput, AWSError] = js.native
  
  /**
    *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the IAM user or AWS account. 
    */
  def listDeploymentInstances(): Request[ListDeploymentInstancesOutput, AWSError] = js.native
  def listDeploymentInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentInstancesOutput, Unit]): Request[ListDeploymentInstancesOutput, AWSError] = js.native
  /**
    *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the IAM user or AWS account. 
    */
  def listDeploymentInstances(params: ListDeploymentInstancesInput): Request[ListDeploymentInstancesOutput, AWSError] = js.native
  def listDeploymentInstances(
    params: ListDeploymentInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentInstancesOutput, Unit]
  ): Request[ListDeploymentInstancesOutput, AWSError] = js.native
  
  /**
    *  Returns an array of target IDs that are associated a deployment. 
    */
  def listDeploymentTargets(): Request[ListDeploymentTargetsOutput, AWSError] = js.native
  def listDeploymentTargets(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentTargetsOutput, Unit]): Request[ListDeploymentTargetsOutput, AWSError] = js.native
  /**
    *  Returns an array of target IDs that are associated a deployment. 
    */
  def listDeploymentTargets(params: ListDeploymentTargetsInput): Request[ListDeploymentTargetsOutput, AWSError] = js.native
  def listDeploymentTargets(
    params: ListDeploymentTargetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentTargetsOutput, Unit]
  ): Request[ListDeploymentTargetsOutput, AWSError] = js.native
  
  /**
    * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
    */
  def listDeployments(): Request[ListDeploymentsOutput, AWSError] = js.native
  def listDeployments(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentsOutput, Unit]): Request[ListDeploymentsOutput, AWSError] = js.native
  /**
    * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
    */
  def listDeployments(params: ListDeploymentsInput): Request[ListDeploymentsOutput, AWSError] = js.native
  def listDeployments(
    params: ListDeploymentsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentsOutput, Unit]
  ): Request[ListDeploymentsOutput, AWSError] = js.native
  
  /**
    * Lists the names of stored connections to GitHub accounts.
    */
  def listGitHubAccountTokenNames(): Request[ListGitHubAccountTokenNamesOutput, AWSError] = js.native
  def listGitHubAccountTokenNames(callback: js.Function2[/* err */ AWSError, /* data */ ListGitHubAccountTokenNamesOutput, Unit]): Request[ListGitHubAccountTokenNamesOutput, AWSError] = js.native
  /**
    * Lists the names of stored connections to GitHub accounts.
    */
  def listGitHubAccountTokenNames(params: ListGitHubAccountTokenNamesInput): Request[ListGitHubAccountTokenNamesOutput, AWSError] = js.native
  def listGitHubAccountTokenNames(
    params: ListGitHubAccountTokenNamesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGitHubAccountTokenNamesOutput, Unit]
  ): Request[ListGitHubAccountTokenNamesOutput, AWSError] = js.native
  
  /**
    * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
    */
  def listOnPremisesInstances(): Request[ListOnPremisesInstancesOutput, AWSError] = js.native
  def listOnPremisesInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListOnPremisesInstancesOutput, Unit]): Request[ListOnPremisesInstancesOutput, AWSError] = js.native
  /**
    * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
    */
  def listOnPremisesInstances(params: ListOnPremisesInstancesInput): Request[ListOnPremisesInstancesOutput, AWSError] = js.native
  def listOnPremisesInstances(
    params: ListOnPremisesInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOnPremisesInstancesOutput, Unit]
  ): Request[ListOnPremisesInstancesOutput, AWSError] = js.native
  
  /**
    *  Returns a list of tags for the resource identified by a specified Amazon Resource Name (ARN). Tags are used to organize and categorize your CodeDeploy resources. 
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    *  Returns a list of tags for the resource identified by a specified Amazon Resource Name (ARN). Tags are used to organize and categorize your CodeDeploy resources. 
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    *  Sets the result of a Lambda validation function. The function validates lifecycle hooks during a deployment that uses the AWS Lambda or Amazon ECS compute platform. For AWS Lambda deployments, the available lifecycle hooks are BeforeAllowTraffic and AfterAllowTraffic. For Amazon ECS deployments, the available lifecycle hooks are BeforeInstall, AfterInstall, AfterAllowTestTraffic, BeforeAllowTraffic, and AfterAllowTraffic. Lambda validation functions return Succeeded or Failed. For more information, see AppSpec 'hooks' Section for an AWS Lambda Deployment  and AppSpec 'hooks' Section for an Amazon ECS Deployment.
    */
  def putLifecycleEventHookExecutionStatus(): Request[PutLifecycleEventHookExecutionStatusOutput, AWSError] = js.native
  def putLifecycleEventHookExecutionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ PutLifecycleEventHookExecutionStatusOutput, Unit]
  ): Request[PutLifecycleEventHookExecutionStatusOutput, AWSError] = js.native
  /**
    *  Sets the result of a Lambda validation function. The function validates lifecycle hooks during a deployment that uses the AWS Lambda or Amazon ECS compute platform. For AWS Lambda deployments, the available lifecycle hooks are BeforeAllowTraffic and AfterAllowTraffic. For Amazon ECS deployments, the available lifecycle hooks are BeforeInstall, AfterInstall, AfterAllowTestTraffic, BeforeAllowTraffic, and AfterAllowTraffic. Lambda validation functions return Succeeded or Failed. For more information, see AppSpec 'hooks' Section for an AWS Lambda Deployment  and AppSpec 'hooks' Section for an Amazon ECS Deployment.
    */
  def putLifecycleEventHookExecutionStatus(params: PutLifecycleEventHookExecutionStatusInput): Request[PutLifecycleEventHookExecutionStatusOutput, AWSError] = js.native
  def putLifecycleEventHookExecutionStatus(
    params: PutLifecycleEventHookExecutionStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLifecycleEventHookExecutionStatusOutput, Unit]
  ): Request[PutLifecycleEventHookExecutionStatusOutput, AWSError] = js.native
  
  /**
    * Registers with AWS CodeDeploy a revision for the specified application.
    */
  def registerApplicationRevision(): Request[js.Object, AWSError] = js.native
  def registerApplicationRevision(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Registers with AWS CodeDeploy a revision for the specified application.
    */
  def registerApplicationRevision(params: RegisterApplicationRevisionInput): Request[js.Object, AWSError] = js.native
  def registerApplicationRevision(
    params: RegisterApplicationRevisionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
    */
  def registerOnPremisesInstance(): Request[js.Object, AWSError] = js.native
  def registerOnPremisesInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
    */
  def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput): Request[js.Object, AWSError] = js.native
  def registerOnPremisesInstance(
    params: RegisterOnPremisesInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes one or more tags from one or more on-premises instances.
    */
  def removeTagsFromOnPremisesInstances(): Request[js.Object, AWSError] = js.native
  def removeTagsFromOnPremisesInstances(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes one or more tags from one or more on-premises instances.
    */
  def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput): Request[js.Object, AWSError] = js.native
  def removeTagsFromOnPremisesInstances(
    params: RemoveTagsFromOnPremisesInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is complete.
    */
  def skipWaitTimeForInstanceTermination(): Request[js.Object, AWSError] = js.native
  def skipWaitTimeForInstanceTermination(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is complete.
    */
  def skipWaitTimeForInstanceTermination(params: SkipWaitTimeForInstanceTerminationInput): Request[js.Object, AWSError] = js.native
  def skipWaitTimeForInstanceTermination(
    params: SkipWaitTimeForInstanceTerminationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Attempts to stop an ongoing deployment.
    */
  def stopDeployment(): Request[StopDeploymentOutput, AWSError] = js.native
  def stopDeployment(callback: js.Function2[/* err */ AWSError, /* data */ StopDeploymentOutput, Unit]): Request[StopDeploymentOutput, AWSError] = js.native
  /**
    * Attempts to stop an ongoing deployment.
    */
  def stopDeployment(params: StopDeploymentInput): Request[StopDeploymentOutput, AWSError] = js.native
  def stopDeployment(
    params: StopDeploymentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDeploymentOutput, Unit]
  ): Request[StopDeploymentOutput, AWSError] = js.native
  
  /**
    *  Associates the list of tags in the input Tags parameter with the resource identified by the ResourceArn input parameter. 
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    *  Associates the list of tags in the input Tags parameter with the resource identified by the ResourceArn input parameter. 
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    *  Disassociates a resource from a list of tags. The resource is identified by the ResourceArn input parameter. The tags are identified by the list of keys in the TagKeys input parameter. 
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    *  Disassociates a resource from a list of tags. The resource is identified by the ResourceArn input parameter. The tags are identified by the list of keys in the TagKeys input parameter. 
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Changes the name of an application.
    */
  def updateApplication(): Request[js.Object, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the name of an application.
    */
  def updateApplication(params: UpdateApplicationInput): Request[js.Object, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes information about a deployment group.
    */
  def updateDeploymentGroup(): Request[UpdateDeploymentGroupOutput, AWSError] = js.native
  def updateDeploymentGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeploymentGroupOutput, Unit]): Request[UpdateDeploymentGroupOutput, AWSError] = js.native
  /**
    * Changes information about a deployment group.
    */
  def updateDeploymentGroup(params: UpdateDeploymentGroupInput): Request[UpdateDeploymentGroupOutput, AWSError] = js.native
  def updateDeploymentGroup(
    params: UpdateDeploymentGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeploymentGroupOutput, Unit]
  ): Request[UpdateDeploymentGroupOutput, AWSError] = js.native
  
  /**
    * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(state: deploymentSuccessful): Request[GetDeploymentOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: deploymentSuccessful,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentOutput, Unit]
  ): Request[GetDeploymentOutput, AWSError] = js.native
  /**
    * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(state: deploymentSuccessful, params: GetDeploymentInputwaiterW): Request[GetDeploymentOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: deploymentSuccessful,
    params: GetDeploymentInputwaiterW,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentOutput, Unit]
  ): Request[GetDeploymentOutput, AWSError] = js.native
}
