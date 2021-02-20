package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceState extends StObject {
  
  /**
    * A description of the instance state. This string can contain one or more of the following messages.    N/A     A transient error occurred. Please try again later.     Instance has failed at least the UnhealthyThreshold number of health checks consecutively.     Instance has not passed the configured HealthyThreshold number of health checks consecutively.     Instance registration is still in progress.     Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.     Instance is not currently registered with the LoadBalancer.     Instance deregistration currently in progress.     Disable Availability Zone is currently in progress.     Instance is in pending state.     Instance is in stopped state.     Instance is in terminated state.   
    */
  var Description: js.UndefOr[typings.awsSdk.elbMod.Description] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.elbMod.InstanceId] = js.native
  
  /**
    * Information about the cause of OutOfService instances. Specifically, whether the cause is Elastic Load Balancing or the instance. Valid values: ELB | Instance | N/A 
    */
  var ReasonCode: js.UndefOr[typings.awsSdk.elbMod.ReasonCode] = js.native
  
  /**
    * The current state of the instance. Valid values: InService | OutOfService | Unknown 
    */
  var State: js.UndefOr[typings.awsSdk.elbMod.State] = js.native
}
object InstanceState {
  
  @scala.inline
  def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  
  @scala.inline
  implicit class InstanceStateMutableBuilder[Self <: InstanceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setReasonCode(value: ReasonCode): Self = StObject.set(x, "ReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "ReasonCode", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
