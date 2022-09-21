package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComputePressureData extends StObject {
  
  /**
    * The cpu speed which will be a number between 0.0 and 1.0.
    */
  var cpuSpeed: Double
  
  /**
    * The cpu utilization which will be a number between 0.0 and 1.0.
    */
  var cpuUtilization: Double
}
object IComputePressureData {
  
  inline def apply(cpuSpeed: Double, cpuUtilization: Double): IComputePressureData = {
    val __obj = js.Dynamic.literal(cpuSpeed = cpuSpeed.asInstanceOf[js.Any], cpuUtilization = cpuUtilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComputePressureData]
  }
  
  extension [Self <: IComputePressureData](x: Self) {
    
    inline def setCpuSpeed(value: Double): Self = StObject.set(x, "cpuSpeed", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilization(value: Double): Self = StObject.set(x, "cpuUtilization", value.asInstanceOf[js.Any])
  }
}
