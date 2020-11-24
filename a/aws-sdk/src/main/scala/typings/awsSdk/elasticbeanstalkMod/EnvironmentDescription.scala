package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentDescription extends js.Object {
  
  /**
    * Indicates if there is an in-progress environment configuration update or application version deployment that you can cancel.  true: There is an update in progress.   false: There are no updates currently in progress. 
    */
  var AbortableOperationInProgress: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.AbortableOperationInProgress] = js.native
  
  /**
    * The name of the application associated with this environment.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * The URL to the CNAME for this environment.
    */
  var CNAME: js.UndefOr[DNSCname] = js.native
  
  /**
    * The creation date for this environment.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.native
  
  /**
    * The last modified date for this environment.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.native
  
  /**
    * Describes this environment.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  
  /**
    * For load-balanced, autoscaling environments, the URL to the LoadBalancer. For single-instance environments, the IP address of the instance.
    */
  var EndpointURL: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EndpointURL] = js.native
  
  /**
    * The environment's Amazon Resource Name (ARN), which can be used in other API requests that require an ARN.
    */
  var EnvironmentArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentArn] = js.native
  
  /**
    * The ID of this environment.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  
  /**
    * A list of links to other environments in the same group.
    */
  var EnvironmentLinks: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentLinks] = js.native
  
  /**
    * The name of this environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  
  /**
    * Describes the health status of the environment. AWS Elastic Beanstalk indicates the failure levels for a running environment:    Red: Indicates the environment is not responsive. Occurs when three or more consecutive failures occur for an environment.    Yellow: Indicates that something is wrong. Occurs when two consecutive failures occur for an environment.    Green: Indicates the environment is healthy and fully functional.    Grey: Default health for a new environment. The environment is not fully launched and health checks have not started or health checks are suspended during an UpdateEnvironment or RestartEnvironment request.    Default: Grey 
    */
  var Health: js.UndefOr[EnvironmentHealth] = js.native
  
  /**
    * Returns the health status of the application running in your environment. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[EnvironmentHealthStatus] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the environment's operations role. For more information, see Operations roles in the AWS Elastic Beanstalk Developer Guide.
    */
  var OperationsRole: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.OperationsRole] = js.native
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  
  /**
    * The description of the AWS resources used by this environment.
    */
  var Resources: js.UndefOr[EnvironmentResourcesDescription] = js.native
  
  /**
    *  The name of the SolutionStack deployed with this environment. 
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  
  /**
    * The current operational status of the environment:    Launching: Environment is in the process of initial deployment.    Updating: Environment is in the process of updating its configuration settings or application version.    Ready: Environment is available to have an action performed on it, such as update or terminate.    Terminating: Environment is in the shut-down process.    Terminated: Environment is not running.  
    */
  var Status: js.UndefOr[EnvironmentStatus] = js.native
  
  /**
    * The name of the configuration template used to originally launch this environment.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
  
  /**
    * Describes the current tier of this environment.
    */
  var Tier: js.UndefOr[EnvironmentTier] = js.native
  
  /**
    * The application version deployed in this environment.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}
object EnvironmentDescription {
  
  @scala.inline
  def apply(): EnvironmentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDescription]
  }
  
  @scala.inline
  implicit class EnvironmentDescriptionOps[Self <: EnvironmentDescription] (val x: Self) extends AnyVal {
    
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
    def setAbortableOperationInProgress(value: AbortableOperationInProgress): Self = this.set("AbortableOperationInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortableOperationInProgress: Self = this.set("AbortableOperationInProgress", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    
    @scala.inline
    def setCNAME(value: DNSCname): Self = this.set("CNAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCNAME: Self = this.set("CNAME", js.undefined)
    
    @scala.inline
    def setDateCreated(value: CreationDate): Self = this.set("DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCreated: Self = this.set("DateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: UpdateDate): Self = this.set("DateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateUpdated: Self = this.set("DateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEndpointURL(value: EndpointURL): Self = this.set("EndpointURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointURL: Self = this.set("EndpointURL", js.undefined)
    
    @scala.inline
    def setEnvironmentArn(value: EnvironmentArn): Self = this.set("EnvironmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentArn: Self = this.set("EnvironmentArn", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentId: Self = this.set("EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentLinksVarargs(value: EnvironmentLink*): Self = this.set("EnvironmentLinks", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentLinks(value: EnvironmentLinks): Self = this.set("EnvironmentLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentLinks: Self = this.set("EnvironmentLinks", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    
    @scala.inline
    def setHealth(value: EnvironmentHealth): Self = this.set("Health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealth: Self = this.set("Health", js.undefined)
    
    @scala.inline
    def setHealthStatus(value: EnvironmentHealthStatus): Self = this.set("HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthStatus: Self = this.set("HealthStatus", js.undefined)
    
    @scala.inline
    def setOperationsRole(value: OperationsRole): Self = this.set("OperationsRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationsRole: Self = this.set("OperationsRole", js.undefined)
    
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = this.set("PlatformArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformArn: Self = this.set("PlatformArn", js.undefined)
    
    @scala.inline
    def setResources(value: EnvironmentResourcesDescription): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = this.set("SolutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionStackName: Self = this.set("SolutionStackName", js.undefined)
    
    @scala.inline
    def setStatus(value: EnvironmentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
    
    @scala.inline
    def setTier(value: EnvironmentTier): Self = this.set("Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionLabel: Self = this.set("VersionLabel", js.undefined)
  }
}
