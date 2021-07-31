package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServerGroupAutoScalingPolicy extends StObject {
  
  /**
    * Length of time, in seconds, it takes for a new instance to start new game server processes and register with GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up, because it avoids prematurely starting new instances. 
    */
  var EstimatedInstanceWarmup: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to create a target-based policy that tracks the GameLift FleetIQ metric "PercentUtilizedGameServers" and specifies a target value for the metric. As player usage changes, the policy triggers to adjust the game server group capacity so that the metric returns to the target value. 
    */
  var TargetTrackingConfiguration: typings.awsSdk.gameliftMod.TargetTrackingConfiguration
}
object GameServerGroupAutoScalingPolicy {
  
  @scala.inline
  def apply(TargetTrackingConfiguration: TargetTrackingConfiguration): GameServerGroupAutoScalingPolicy = {
    val __obj = js.Dynamic.literal(TargetTrackingConfiguration = TargetTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameServerGroupAutoScalingPolicy]
  }
  
  @scala.inline
  implicit class GameServerGroupAutoScalingPolicyMutableBuilder[Self <: GameServerGroupAutoScalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedInstanceWarmup(value: PositiveInteger): Self = StObject.set(x, "EstimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedInstanceWarmupUndefined: Self = StObject.set(x, "EstimatedInstanceWarmup", js.undefined)
    
    @scala.inline
    def setTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = StObject.set(x, "TargetTrackingConfiguration", value.asInstanceOf[js.Any])
  }
}
