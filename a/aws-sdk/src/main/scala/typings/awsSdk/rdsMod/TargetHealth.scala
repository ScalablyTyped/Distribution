package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHealth extends js.Object {
  /**
    * A description of the health of the RDS Proxy target. If the State is AVAILABLE, a description is not included.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The reason for the current health State of the RDS Proxy target.
    */
  var Reason: js.UndefOr[TargetHealthReason] = js.native
  /**
    * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical lifecycle example for the states of an RDS Proxy target:   registering &gt; unavailable &gt; available &gt; unavailable &gt; available 
    */
  var State: js.UndefOr[TargetState] = js.native
}

object TargetHealth {
  @scala.inline
  def apply(Description: String = null, Reason: TargetHealthReason = null, State: TargetState = null): TargetHealth = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetHealth]
  }
}

