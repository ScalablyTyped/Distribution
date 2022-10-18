package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscPerformanceMonitorMod {
  
  @JSImport("babylonjs/Misc/performanceMonitor", "PerformanceMonitor")
  @js.native
  /**
    * constructor
    * @param frameSampleSize The number of samples required to saturate the sliding window
    */
  open class PerformanceMonitor () extends StObject {
    def this(frameSampleSize: Double) = this()
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _lastFrameTimeMs: Any = js.native
    
    /* private */ var _rollingFrameTime: Any = js.native
    
    /**
      * Returns the average framerate in frames per second over the sliding window (or the subset of frames sampled so far)
      */
    def averageFPS: Double = js.native
    
    /**
      * Returns the average frame time in milliseconds over the sliding window (or the subset of frames sampled so far)
      */
    def averageFrameTime: Double = js.native
    
    /**
      * Returns the variance frame time in milliseconds over the sliding window (or the subset of frames sampled so far)
      */
    def averageFrameTimeVariance: Double = js.native
    
    /**
      * Disables contributions to the sliding window sample set
      * Samples will not be interpolated over the disabled period
      */
    def disable(): Unit = js.native
    
    /**
      * Enables contributions to the sliding window sample set
      */
    def enable(): Unit = js.native
    
    /**
      * Returns the average framerate in frames per second using the most recent frame time
      */
    def instantaneousFPS: Double = js.native
    
    /**
      * Returns the frame time of the most recent frame
      */
    def instantaneousFrameTime: Double = js.native
    
    /**
      * Returns true if sampling is enabled
      */
    def isEnabled: Boolean = js.native
    
    /**
      * Returns true if enough samples have been taken to completely fill the sliding window
      */
    def isSaturated: Boolean = js.native
    
    /**
      * Resets performance monitor
      */
    def reset(): Unit = js.native
    
    /**
      * Samples current frame
      * @param timeMs A timestamp in milliseconds of the current frame to compare with other frames
      */
    def sampleFrame(): Unit = js.native
    def sampleFrame(timeMs: Double): Unit = js.native
  }
  
  @JSImport("babylonjs/Misc/performanceMonitor", "RollingAverage")
  @js.native
  open class RollingAverage protected () extends StObject {
    /**
      * constructor
      * @param length The number of samples required to saturate the sliding window
      */
    def this(length: Double) = this()
    
    /* protected */ var _m2: Double = js.native
    
    /* protected */ var _pos: Double = js.native
    
    /* protected */ var _sampleCount: Double = js.native
    
    /* protected */ var _samples: js.Array[Double] = js.native
    
    /**
      * Wraps a value around the sample range boundaries
      * @param i Position in sample range, for example if the sample length is 5, and i is -3, then 2 will be returned.
      * @returns Wrapped position in sample range
      */
    /* protected */ def _wrapPosition(i: Double): Double = js.native
    
    /**
      * Adds a sample to the sample set
      * @param v The sample value
      */
    def add(v: Double): Unit = js.native
    
    /**
      * Current average
      */
    var average: Double = js.native
    
    /**
      * Returns previously added values or null if outside of history or outside the sliding window domain
      * @param i Index in history. For example, pass 0 for the most recent value and 1 for the value before that
      * @returns Value previously recorded with add() or null if outside of range
      */
    def history(i: Double): Double = js.native
    
    /**
      * Returns true if enough samples have been taken to completely fill the sliding window
      * @returns true if sample-set saturated
      */
    def isSaturated(): Boolean = js.native
    
    /**
      * Resets the rolling average (equivalent to 0 samples taken so far)
      */
    def reset(): Unit = js.native
    
    /**
      * Current variance
      */
    var variance: Double = js.native
  }
}
