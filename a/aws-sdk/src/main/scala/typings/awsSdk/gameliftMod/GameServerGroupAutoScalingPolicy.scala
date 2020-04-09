package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameServerGroupAutoScalingPolicy extends js.Object {
  /**
    * Length of time, in seconds, it takes for a new instance to start new game server processes and register with GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up, because it avoids prematurely starting new instances 
    */
  var EstimatedInstanceWarmup: js.UndefOr[PositiveInteger] = js.native
  /**
    * Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to create a target-based policy that tracks the GameLift FleetIQ metric "PercentUtilizedGameServers" and specifies a target value for the metric. As player usage changes, the policy triggers to adjust the game server group capacity so that the metric returns to the target value. 
    */
  var TargetTrackingConfiguration: typings.awsSdk.gameliftMod.TargetTrackingConfiguration = js.native
}

object GameServerGroupAutoScalingPolicy {
  @scala.inline
  def apply(
    TargetTrackingConfiguration: TargetTrackingConfiguration,
    EstimatedInstanceWarmup: Int | scala.Double = null
  ): GameServerGroupAutoScalingPolicy = {
    val __obj = js.Dynamic.literal(TargetTrackingConfiguration = TargetTrackingConfiguration.asInstanceOf[js.Any])
    if (EstimatedInstanceWarmup != null) __obj.updateDynamic("EstimatedInstanceWarmup")(EstimatedInstanceWarmup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameServerGroupAutoScalingPolicy]
  }
}

