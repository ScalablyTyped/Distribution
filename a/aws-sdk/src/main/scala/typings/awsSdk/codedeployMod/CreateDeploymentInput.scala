package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentInput extends js.Object {
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  
  /**
    * Configuration information for an automatic rollback that is added when a deployment is created.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account. If not specified, the value configured in the deployment group is used as the default. If the deployment group does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by default.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  
  /**
    * The name of the deployment group.
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  
  /**
    * A comment about the deployment.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't part of the previous successful deployment. The fileExistsBehavior parameter takes any of the following values:   DISALLOW: The deployment fails. This is also the default behavior if no option is specified.   OVERWRITE: The version of the file from the application revision currently being deployed replaces the version already on the instance.   RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.  
    */
  var fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.native
  
  /**
    *  If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an instance fails, then the deployment continues to the next deployment lifecycle event. For example, if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.   If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.   During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run successfully, the deployment can fail.   If the cause of the failure is a script from the last successful deployment that will never run successfully, create a new deployment and use ignoreApplicationStopFailures to specify that the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored. 
    */
  var ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.native
  
  /**
    *  The type and location of the revision to deploy. 
    */
  var revision: js.UndefOr[RevisionLocation] = js.native
  
  /**
    *  Information about the instances that belong to the replacement environment in a blue/green deployment. 
    */
  var targetInstances: js.UndefOr[TargetInstances] = js.native
  
  /**
    *  Indicates whether to deploy to all instances or only to instances that are not running the latest application revision. 
    */
  var updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.native
}
object CreateDeploymentInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName): CreateDeploymentInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentInput]
  }
  
  @scala.inline
  implicit class CreateDeploymentInputOps[Self <: CreateDeploymentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = this.set("autoRollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRollbackConfiguration: Self = this.set("autoRollbackConfiguration", js.undefined)
    
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = this.set("deploymentConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentConfigName: Self = this.set("deploymentConfigName", js.undefined)
    
    @scala.inline
    def setDeploymentGroupName(value: DeploymentGroupName): Self = this.set("deploymentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentGroupName: Self = this.set("deploymentGroupName", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFileExistsBehavior(value: FileExistsBehavior): Self = this.set("fileExistsBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExistsBehavior: Self = this.set("fileExistsBehavior", js.undefined)
    
    @scala.inline
    def setIgnoreApplicationStopFailures(value: Boolean): Self = this.set("ignoreApplicationStopFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreApplicationStopFailures: Self = this.set("ignoreApplicationStopFailures", js.undefined)
    
    @scala.inline
    def setRevision(value: RevisionLocation): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    
    @scala.inline
    def setTargetInstances(value: TargetInstances): Self = this.set("targetInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetInstances: Self = this.set("targetInstances", js.undefined)
    
    @scala.inline
    def setUpdateOutdatedInstancesOnly(value: Boolean): Self = this.set("updateOutdatedInstancesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOutdatedInstancesOnly: Self = this.set("updateOutdatedInstancesOnly", js.undefined)
  }
}
