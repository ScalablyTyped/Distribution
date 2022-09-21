package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInformation extends StObject {
  
  /**
    * The description of the event.
    */
  var EventDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The event.  error events:    iamFleetRoleInvalid - The EC2 Fleet or Spot Fleet does not have the required permissions either to launch or terminate an instance.    allLaunchSpecsTemporarilyBlacklisted - None of the configurations are valid, and several attempts to launch instances have failed. For more information, see the description of the event.    spotInstanceCountLimitExceeded - You've reached the limit on the number of Spot Instances that you can launch.    spotFleetRequestConfigurationInvalid - The configuration is not valid. For more information, see the description of the event.    fleetRequestChange events:    active - The EC2 Fleet or Spot Fleet request has been validated and Amazon EC2 is attempting to maintain the target number of running instances.    deleted (EC2 Fleet) / cancelled (Spot Fleet) - The EC2 Fleet is deleted or the Spot Fleet request is canceled and has no running instances. The EC2 Fleet or Spot Fleet will be deleted two days after its instances are terminated.    deleted_running (EC2 Fleet) / cancelled_running (Spot Fleet) - The EC2 Fleet is deleted or the Spot Fleet request is canceled and does not launch additional instances. Its existing instances continue to run until they are interrupted or terminated. The request remains in this state until all instances are interrupted or terminated.    deleted_terminating (EC2 Fleet) / cancelled_terminating (Spot Fleet) - The EC2 Fleet is deleted or the Spot Fleet request is canceled and its instances are terminating. The request remains in this state until all instances are terminated.    expired - The EC2 Fleet or Spot Fleet request has expired. If the request was created with TerminateInstancesWithExpiration set, a subsequent terminated event indicates that the instances are terminated.    modify_in_progress - The EC2 Fleet or Spot Fleet request is being modified. The request remains in this state until the modification is fully processed.    modify_succeeded - The EC2 Fleet or Spot Fleet request was modified.    submitted - The EC2 Fleet or Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch the target number of instances.    progress - The EC2 Fleet or Spot Fleet request is in the process of being fulfilled.    instanceChange events:    launched - A new instance was launched.    terminated - An instance was terminated by the user.    termination_notified - An instance termination notification was sent when a Spot Instance was terminated by Amazon EC2 during scale-down, when the target capacity of the fleet was modified down, for example, from a target capacity of 4 to a target capacity of 3.    Information events:    fleetProgressHalted - The price in every launch specification is not valid because it is below the Spot price (all the launch specifications have produced launchSpecUnusable events). A launch specification might become valid if the Spot price changes.    launchSpecTemporarilyBlacklisted - The configuration is not valid and several attempts to launch instances have failed. For more information, see the description of the event.    launchSpecUnusable - The price in a launch specification is not valid because it is below the Spot price.    registerWithLoadBalancersFailed - An attempt to register instances with load balancers failed. For more information, see the description of the event.  
    */
  var EventSubType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance. This information is available only for instanceChange events.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object EventInformation {
  
  inline def apply(): EventInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInformation]
  }
  
  extension [Self <: EventInformation](x: Self) {
    
    inline def setEventDescription(value: String): Self = StObject.set(x, "EventDescription", value.asInstanceOf[js.Any])
    
    inline def setEventDescriptionUndefined: Self = StObject.set(x, "EventDescription", js.undefined)
    
    inline def setEventSubType(value: String): Self = StObject.set(x, "EventSubType", value.asInstanceOf[js.Any])
    
    inline def setEventSubTypeUndefined: Self = StObject.set(x, "EventSubType", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
