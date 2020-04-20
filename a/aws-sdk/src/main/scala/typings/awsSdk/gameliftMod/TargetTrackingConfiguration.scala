package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTrackingConfiguration extends js.Object {
  /**
    * Desired value to use with a game server group target-based scaling policy. 
    */
  var TargetValue: NonNegativeDouble = js.native
}

object TargetTrackingConfiguration {
  @scala.inline
  def apply(TargetValue: NonNegativeDouble): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
}

