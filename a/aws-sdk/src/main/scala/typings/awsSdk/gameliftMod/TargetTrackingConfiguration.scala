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
  @scala.inline
  implicit class TargetTrackingConfigurationOps[Self <: TargetTrackingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetValue(value: NonNegativeDouble): Self = this.set("TargetValue", value.asInstanceOf[js.Any])
  }
  
}

