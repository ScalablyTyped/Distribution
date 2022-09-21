package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticBeanstalkEnvironmentDetails extends StObject {
  
  /**
    * The name of the application that is associated with the environment.
    */
  var ApplicationName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The URL to the CNAME for this environment.
    */
  var Cname: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The creation date for this environment.
    */
  var DateCreated: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date when this environment was last modified.
    */
  var DateUpdated: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For load-balanced, autoscaling environments, the URL to the load balancer. For single-instance environments, the IP address of the instance.
    */
  var EndpointUrl: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the environment.
    */
  var EnvironmentArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the environment.
    */
  var EnvironmentId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Links to other environments in the same group.
    */
  var EnvironmentLinks: js.UndefOr[AwsElasticBeanstalkEnvironmentEnvironmentLinks] = js.undefined
  
  /**
    * The name of the environment.
    */
  var EnvironmentName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The configuration setting for the environment.
    */
  var OptionSettings: js.UndefOr[AwsElasticBeanstalkEnvironmentOptionSettings] = js.undefined
  
  /**
    * The ARN of the platform version for the environment.
    */
  var PlatformArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the solution stack that is deployed with the environment.
    */
  var SolutionStackName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current operational status of the environment. Valid values are as follows:    Aborting     Launching     LinkingFrom     LinkingTo     Ready     Terminated     Terminating     Updating   
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The tier of the environment.
    */
  var Tier: js.UndefOr[AwsElasticBeanstalkEnvironmentTier] = js.undefined
  
  /**
    * The application version of the environment.
    */
  var VersionLabel: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElasticBeanstalkEnvironmentDetails {
  
  inline def apply(): AwsElasticBeanstalkEnvironmentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticBeanstalkEnvironmentDetails]
  }
  
  extension [Self <: AwsElasticBeanstalkEnvironmentDetails](x: Self) {
    
    inline def setApplicationName(value: NonEmptyString): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    inline def setCname(value: NonEmptyString): Self = StObject.set(x, "Cname", value.asInstanceOf[js.Any])
    
    inline def setCnameUndefined: Self = StObject.set(x, "Cname", js.undefined)
    
    inline def setDateCreated(value: NonEmptyString): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateUpdated(value: NonEmptyString): Self = StObject.set(x, "DateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdatedUndefined: Self = StObject.set(x, "DateUpdated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndpointUrl(value: NonEmptyString): Self = StObject.set(x, "EndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setEndpointUrlUndefined: Self = StObject.set(x, "EndpointUrl", js.undefined)
    
    inline def setEnvironmentArn(value: NonEmptyString): Self = StObject.set(x, "EnvironmentArn", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentArnUndefined: Self = StObject.set(x, "EnvironmentArn", js.undefined)
    
    inline def setEnvironmentId(value: NonEmptyString): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setEnvironmentLinks(value: AwsElasticBeanstalkEnvironmentEnvironmentLinks): Self = StObject.set(x, "EnvironmentLinks", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentLinksUndefined: Self = StObject.set(x, "EnvironmentLinks", js.undefined)
    
    inline def setEnvironmentLinksVarargs(value: AwsElasticBeanstalkEnvironmentEnvironmentLink*): Self = StObject.set(x, "EnvironmentLinks", js.Array(value*))
    
    inline def setEnvironmentName(value: NonEmptyString): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setOptionSettings(value: AwsElasticBeanstalkEnvironmentOptionSettings): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    inline def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    inline def setOptionSettingsVarargs(value: AwsElasticBeanstalkEnvironmentOptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value*))
    
    inline def setPlatformArn(value: NonEmptyString): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    inline def setSolutionStackName(value: NonEmptyString): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    inline def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTier(value: AwsElasticBeanstalkEnvironmentTier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    inline def setVersionLabel(value: NonEmptyString): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    inline def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
