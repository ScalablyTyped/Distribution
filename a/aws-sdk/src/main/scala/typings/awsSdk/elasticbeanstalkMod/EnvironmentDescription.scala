package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentDescription extends StObject {
  
  /**
    * Indicates if there is an in-progress environment configuration update or application version deployment that you can cancel.  true: There is an update in progress.   false: There are no updates currently in progress. 
    */
  var AbortableOperationInProgress: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.AbortableOperationInProgress] = js.undefined
  
  /**
    * The name of the application associated with this environment.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.undefined
  
  /**
    * The URL to the CNAME for this environment.
    */
  var CNAME: js.UndefOr[DNSCname] = js.undefined
  
  /**
    * The creation date for this environment.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.undefined
  
  /**
    * The last modified date for this environment.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
  
  /**
    * Describes this environment.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.undefined
  
  /**
    * For load-balanced, autoscaling environments, the URL to the LoadBalancer. For single-instance environments, the IP address of the instance.
    */
  var EndpointURL: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EndpointURL] = js.undefined
  
  /**
    * The environment's Amazon Resource Name (ARN), which can be used in other API requests that require an ARN.
    */
  var EnvironmentArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentArn] = js.undefined
  
  /**
    * The ID of this environment.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.undefined
  
  /**
    * A list of links to other environments in the same group.
    */
  var EnvironmentLinks: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentLinks] = js.undefined
  
  /**
    * The name of this environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * Describes the health status of the environment. AWS Elastic Beanstalk indicates the failure levels for a running environment:    Red: Indicates the environment is not responsive. Occurs when three or more consecutive failures occur for an environment.    Yellow: Indicates that something is wrong. Occurs when two consecutive failures occur for an environment.    Green: Indicates the environment is healthy and fully functional.    Grey: Default health for a new environment. The environment is not fully launched and health checks have not started or health checks are suspended during an UpdateEnvironment or RestartEnvironment request.    Default: Grey 
    */
  var Health: js.UndefOr[EnvironmentHealth] = js.undefined
  
  /**
    * Returns the health status of the application running in your environment. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[EnvironmentHealthStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the environment's operations role. For more information, see Operations roles in the AWS Elastic Beanstalk Developer Guide.
    */
  var OperationsRole: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.OperationsRole] = js.undefined
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.undefined
  
  /**
    * The description of the AWS resources used by this environment.
    */
  var Resources: js.UndefOr[EnvironmentResourcesDescription] = js.undefined
  
  /**
    *  The name of the SolutionStack deployed with this environment. 
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.undefined
  
  /**
    * The current operational status of the environment:    Launching: Environment is in the process of initial deployment.    Updating: Environment is in the process of updating its configuration settings or application version.    Ready: Environment is available to have an action performed on it, such as update or terminate.    Terminating: Environment is in the shut-down process.    Terminated: Environment is not running.  
    */
  var Status: js.UndefOr[EnvironmentStatus] = js.undefined
  
  /**
    * The name of the configuration template used to originally launch this environment.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  
  /**
    * Describes the current tier of this environment.
    */
  var Tier: js.UndefOr[EnvironmentTier] = js.undefined
  
  /**
    * The application version deployed in this environment.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabel] = js.undefined
}
object EnvironmentDescription {
  
  @scala.inline
  def apply(): EnvironmentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDescription]
  }
  
  @scala.inline
  implicit class EnvironmentDescriptionMutableBuilder[Self <: EnvironmentDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortableOperationInProgress(value: AbortableOperationInProgress): Self = StObject.set(x, "AbortableOperationInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortableOperationInProgressUndefined: Self = StObject.set(x, "AbortableOperationInProgress", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    @scala.inline
    def setCNAME(value: DNSCname): Self = StObject.set(x, "CNAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCNAMEUndefined: Self = StObject.set(x, "CNAME", js.undefined)
    
    @scala.inline
    def setDateCreated(value: CreationDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: UpdateDate): Self = StObject.set(x, "DateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdatedUndefined: Self = StObject.set(x, "DateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEndpointURL(value: EndpointURL): Self = StObject.set(x, "EndpointURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointURLUndefined: Self = StObject.set(x, "EndpointURL", js.undefined)
    
    @scala.inline
    def setEnvironmentArn(value: EnvironmentArn): Self = StObject.set(x, "EnvironmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentArnUndefined: Self = StObject.set(x, "EnvironmentArn", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentLinks(value: EnvironmentLinks): Self = StObject.set(x, "EnvironmentLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentLinksUndefined: Self = StObject.set(x, "EnvironmentLinks", js.undefined)
    
    @scala.inline
    def setEnvironmentLinksVarargs(value: EnvironmentLink*): Self = StObject.set(x, "EnvironmentLinks", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setHealth(value: EnvironmentHealth): Self = StObject.set(x, "Health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatus(value: EnvironmentHealthStatus): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    @scala.inline
    def setHealthUndefined: Self = StObject.set(x, "Health", js.undefined)
    
    @scala.inline
    def setOperationsRole(value: OperationsRole): Self = StObject.set(x, "OperationsRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsRoleUndefined: Self = StObject.set(x, "OperationsRole", js.undefined)
    
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    @scala.inline
    def setResources(value: EnvironmentResourcesDescription): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
    
    @scala.inline
    def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
    
    @scala.inline
    def setTier(value: EnvironmentTier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
