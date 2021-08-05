package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingAutoScalingGroupDetails extends StObject {
  
  /**
    * Indicates when the auto scaling group was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of an EC2 instance that has come into service.
    */
  var HealthCheckGracePeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The service to use for the health checks.
    */
  var HealthCheckType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of load balancers associated with the group.
    */
  var LoadBalancerNames: js.UndefOr[StringList] = js.undefined
}
object AwsAutoScalingAutoScalingGroupDetails {
  
  inline def apply(): AwsAutoScalingAutoScalingGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupDetails]
  }
  
  extension [Self <: AwsAutoScalingAutoScalingGroupDetails](x: Self) {
    
    inline def setCreatedTime(value: NonEmptyString): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setHealthCheckGracePeriod(value: Integer): Self = StObject.set(x, "HealthCheckGracePeriod", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckGracePeriodUndefined: Self = StObject.set(x, "HealthCheckGracePeriod", js.undefined)
    
    inline def setHealthCheckType(value: NonEmptyString): Self = StObject.set(x, "HealthCheckType", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckTypeUndefined: Self = StObject.set(x, "HealthCheckType", js.undefined)
    
    inline def setLaunchConfigurationName(value: NonEmptyString): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationNameUndefined: Self = StObject.set(x, "LaunchConfigurationName", js.undefined)
    
    inline def setLoadBalancerNames(value: StringList): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNamesUndefined: Self = StObject.set(x, "LoadBalancerNames", js.undefined)
    
    inline def setLoadBalancerNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value :_*))
  }
}
