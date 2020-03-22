package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureAgentRequest extends js.Object {
  /**
    * 
    */
  var fleetInstanceId: js.UndefOr[FleetInstanceId] = js.native
  /**
    * 
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object ConfigureAgentRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName, fleetInstanceId: FleetInstanceId = null): ConfigureAgentRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    if (fleetInstanceId != null) __obj.updateDynamic("fleetInstanceId")(fleetInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAgentRequest]
  }
}

