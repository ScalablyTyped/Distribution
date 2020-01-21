package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHealthDescription extends js.Object {
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  /**
    * The description of the target.
    */
  var Target: js.UndefOr[TargetDescription] = js.native
  /**
    * The health information for the target.
    */
  var TargetHealth: js.UndefOr[typings.awsSdk.elbv2Mod.TargetHealth] = js.native
}

object TargetHealthDescription {
  @scala.inline
  def apply(
    HealthCheckPort: HealthCheckPort = null,
    Target: TargetDescription = null,
    TargetHealth: TargetHealth = null
  ): TargetHealthDescription = {
    val __obj = js.Dynamic.literal()
    if (HealthCheckPort != null) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    if (TargetHealth != null) __obj.updateDynamic("TargetHealth")(TargetHealth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetHealthDescription]
  }
}

