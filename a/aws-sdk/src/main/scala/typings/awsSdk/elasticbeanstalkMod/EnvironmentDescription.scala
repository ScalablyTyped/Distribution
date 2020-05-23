package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AbortableOperationInProgress: js.UndefOr[AbortableOperationInProgress] = js.undefined,
    ApplicationName: ApplicationName = null,
    CNAME: DNSCname = null,
    DateCreated: CreationDate = null,
    DateUpdated: UpdateDate = null,
    Description: Description = null,
    EndpointURL: EndpointURL = null,
    EnvironmentArn: EnvironmentArn = null,
    EnvironmentId: EnvironmentId = null,
    EnvironmentLinks: EnvironmentLinks = null,
    EnvironmentName: EnvironmentName = null,
    Health: EnvironmentHealth = null,
    HealthStatus: EnvironmentHealthStatus = null,
    PlatformArn: PlatformArn = null,
    Resources: EnvironmentResourcesDescription = null,
    SolutionStackName: SolutionStackName = null,
    Status: EnvironmentStatus = null,
    TemplateName: ConfigurationTemplateName = null,
    Tier: EnvironmentTier = null,
    VersionLabel: VersionLabel = null
  ): EnvironmentDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AbortableOperationInProgress)) __obj.updateDynamic("AbortableOperationInProgress")(AbortableOperationInProgress.get.asInstanceOf[js.Any])
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName.asInstanceOf[js.Any])
    if (CNAME != null) __obj.updateDynamic("CNAME")(CNAME.asInstanceOf[js.Any])
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated.asInstanceOf[js.Any])
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EndpointURL != null) __obj.updateDynamic("EndpointURL")(EndpointURL.asInstanceOf[js.Any])
    if (EnvironmentArn != null) __obj.updateDynamic("EnvironmentArn")(EnvironmentArn.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (EnvironmentLinks != null) __obj.updateDynamic("EnvironmentLinks")(EnvironmentLinks.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (Health != null) __obj.updateDynamic("Health")(Health.asInstanceOf[js.Any])
    if (HealthStatus != null) __obj.updateDynamic("HealthStatus")(HealthStatus.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentDescription]
  }
}

