package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComputePressureThresholds extends StObject {
  
  /**
    * Thresholds to make buckets out of for the cpu speed, the average between the start and end points of a threshold will be returned to the callback.
    * 0.5 represents base speed.
    */
  var cpuSpeedThresholds: js.Array[Double]
  
  /**
    * Thresholds to make buckets out of for the cpu utilization, the average between the start and end points of a threshold will be returned to the callback.
    */
  var cpuUtilizationThresholds: js.Array[Double]
}
object IComputePressureThresholds {
  
  inline def apply(cpuSpeedThresholds: js.Array[Double], cpuUtilizationThresholds: js.Array[Double]): IComputePressureThresholds = {
    val __obj = js.Dynamic.literal(cpuSpeedThresholds = cpuSpeedThresholds.asInstanceOf[js.Any], cpuUtilizationThresholds = cpuUtilizationThresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComputePressureThresholds]
  }
  
  extension [Self <: IComputePressureThresholds](x: Self) {
    
    inline def setCpuSpeedThresholds(value: js.Array[Double]): Self = StObject.set(x, "cpuSpeedThresholds", value.asInstanceOf[js.Any])
    
    inline def setCpuSpeedThresholdsVarargs(value: Double*): Self = StObject.set(x, "cpuSpeedThresholds", js.Array(value*))
    
    inline def setCpuUtilizationThresholds(value: js.Array[Double]): Self = StObject.set(x, "cpuUtilizationThresholds", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationThresholdsVarargs(value: Double*): Self = StObject.set(x, "cpuUtilizationThresholds", js.Array(value*))
  }
}
