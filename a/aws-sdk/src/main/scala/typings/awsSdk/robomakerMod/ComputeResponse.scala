package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeResponse extends StObject {
  
  /**
    * Compute type response information for the simulation job.
    */
  var computeType: js.UndefOr[ComputeType] = js.undefined
  
  /**
    * Compute GPU unit limit for the simulation job. It is the same as the number of GPUs allocated to the SimulationJob.
    */
  var gpuUnitLimit: js.UndefOr[GPUUnit] = js.undefined
  
  /**
    * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume up to the maximum value provided. The default is 15. 
    */
  var simulationUnitLimit: js.UndefOr[SimulationUnit] = js.undefined
}
object ComputeResponse {
  
  inline def apply(): ComputeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeResponse]
  }
  
  extension [Self <: ComputeResponse](x: Self) {
    
    inline def setComputeType(value: ComputeType): Self = StObject.set(x, "computeType", value.asInstanceOf[js.Any])
    
    inline def setComputeTypeUndefined: Self = StObject.set(x, "computeType", js.undefined)
    
    inline def setGpuUnitLimit(value: GPUUnit): Self = StObject.set(x, "gpuUnitLimit", value.asInstanceOf[js.Any])
    
    inline def setGpuUnitLimitUndefined: Self = StObject.set(x, "gpuUnitLimit", js.undefined)
    
    inline def setSimulationUnitLimit(value: SimulationUnit): Self = StObject.set(x, "simulationUnitLimit", value.asInstanceOf[js.Any])
    
    inline def setSimulationUnitLimitUndefined: Self = StObject.set(x, "simulationUnitLimit", js.undefined)
  }
}
