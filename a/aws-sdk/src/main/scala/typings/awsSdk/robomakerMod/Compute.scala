package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compute extends js.Object {
  
  /**
    * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume up to the maximim value provided. The default is 15. 
    */
  var simulationUnitLimit: js.UndefOr[SimulationUnit] = js.native
}
object Compute {
  
  @scala.inline
  def apply(): Compute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compute]
  }
  
  @scala.inline
  implicit class ComputeOps[Self <: Compute] (val x: Self) extends AnyVal {
    
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
    def setSimulationUnitLimit(value: SimulationUnit): Self = this.set("simulationUnitLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulationUnitLimit: Self = this.set("simulationUnitLimit", js.undefined)
  }
}
