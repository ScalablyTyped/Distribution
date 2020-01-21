package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
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
  def apply(
    Description: Description = null,
    InstanceId: InstanceId = null,
    ReasonCode: ReasonCode = null,
    State: State = null
  ): InstanceState = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (ReasonCode != null) __obj.updateDynamic("ReasonCode")(ReasonCode.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceState]
  }
}

