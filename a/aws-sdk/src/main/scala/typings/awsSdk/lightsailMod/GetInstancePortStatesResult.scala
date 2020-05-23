package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancePortStatesResult extends js.Object {
  /**
    * An array of objects that describe the firewall port states for the specified instance.
    */
  var portStates: js.UndefOr[InstancePortStateList] = js.native
}

object GetInstancePortStatesResult {
  @scala.inline
  def apply(portStates: InstancePortStateList = null): GetInstancePortStatesResult = {
    val __obj = js.Dynamic.literal()
    if (portStates != null) __obj.updateDynamic("portStates")(portStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancePortStatesResult]
  }
}

