package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerState extends js.Object {
  /**
    * The state code. The initial state of the load balancer is provisioning. After the load balancer is fully set up and ready to route traffic, its state is active. If the load balancer could not be set up, its state is failed. 
    */
  var Code: js.UndefOr[NonEmptyString] = js.native
  /**
    * A description of the state.
    */
  var Reason: js.UndefOr[NonEmptyString] = js.native
}

object LoadBalancerState {
  @scala.inline
  def apply(Code: NonEmptyString = null, Reason: NonEmptyString = null): LoadBalancerState = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerState]
  }
}

