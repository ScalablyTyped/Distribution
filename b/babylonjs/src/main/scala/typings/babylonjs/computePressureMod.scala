package typings.babylonjs

import typings.babylonjs.babylonjsStrings.cpu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computePressureMod {
  
  @JSImport("babylonjs/Misc/computePressure", "ComputePressureObserverWrapper")
  @js.native
  open class ComputePressureObserverWrapper protected () extends StObject {
    /**
      * A compute pressure observer will call this callback, whenever these thresholds are met.
      * @param callback The callback that is called whenever thresholds are met.
      * @param thresholds An object containing the thresholds used to decide what value to to return for each update property (average of start and end of a threshold boundary).
      */
    def this(
      callback: js.Function1[/* update */ IComputePressureData, Unit],
      thresholds: IComputePressureThresholds
    ) = this()
    
    /* private */ var _observer: Any = js.native
    
    /**
      * Method that must be called to begin observing changes, and triggering callbacks.
      * @param source defines the source to observe
      */
    def observe(source: IComputePressureSource): Unit = js.native
    
    /**
      * Method that must be called to stop observing changes and triggering callbacks (cleanup function).
      * @param source defines the source to unobserve
      */
    def unobserve(source: IComputePressureSource): Unit = js.native
  }
  
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
  
  type IComputePressureSource = cpu
  
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
}
