package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeResponse extends js.Object {
  /**
    * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume up to the maximim value provided. 
    */
  var simulationUnitLimit: js.UndefOr[SimulationUnit] = js.native
}

object ComputeResponse {
  @scala.inline
  def apply(simulationUnitLimit: Int | Double = null): ComputeResponse = {
    val __obj = js.Dynamic.literal()
    if (simulationUnitLimit != null) __obj.updateDynamic("simulationUnitLimit")(simulationUnitLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeResponse]
  }
}

