package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compute extends StObject {
  
  /**
    * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume up to the maximim value provided. The default is 15. 
    */
  var simulationUnitLimit: js.UndefOr[SimulationUnit] = js.undefined
}
object Compute {
  
  @scala.inline
  def apply(): Compute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compute]
  }
  
  @scala.inline
  implicit class ComputeMutableBuilder[Self <: Compute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSimulationUnitLimit(value: SimulationUnit): Self = StObject.set(x, "simulationUnitLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationUnitLimitUndefined: Self = StObject.set(x, "simulationUnitLimit", js.undefined)
  }
}
