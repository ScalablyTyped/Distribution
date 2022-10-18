package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscPerfCounterMod {
  
  @JSImport("babylonjs/Misc/perfCounter", "PerfCounter")
  @js.native
  /**
    * Creates a new counter
    */
  open class PerfCounter () extends StObject {
    
    /* private */ var _average: Any = js.native
    
    /* private */ var _current: Any = js.native
    
    /* private */ var _fetchResult: Any = js.native
    
    /* private */ var _lastSecAccumulated: Any = js.native
    
    /* private */ var _lastSecAverage: Any = js.native
    
    /* private */ var _lastSecTime: Any = js.native
    
    /* private */ var _lastSecValueCount: Any = js.native
    
    /* private */ var _max: Any = js.native
    
    /* private */ var _min: Any = js.native
    
    /* private */ var _startMonitoringTime: Any = js.native
    
    /* private */ var _totalAccumulated: Any = js.native
    
    /* private */ var _totalValueCount: Any = js.native
    
    /**
      * Call this method to monitor a count of something (e.g. mesh drawn in viewport count)
      * @param newCount the count value to add to the monitored count
      * @param fetchResult true when it's the last time in the frame you add to the counter and you wish to update the statistics properties (min/max/average), false if you only want to update statistics.
      */
    def addCount(newCount: Double, fetchResult: Boolean): Unit = js.native
    
    /**
      * Returns the average value since the performance counter is running
      */
    def average: Double = js.native
    
    /**
      * Start monitoring this performance counter
      */
    def beginMonitoring(): Unit = js.native
    
    /**
      * Gets the total value count
      */
    def count: Double = js.native
    
    /**
      * Returns the current value
      */
    def current: Double = js.native
    
    /**
      * Compute the time lapsed since the previous beginMonitoring() call.
      * @param newFrame true by default to fetch the result and monitor a new frame, if false the time monitored will be added to the current frame counter
      */
    def endMonitoring(): Unit = js.native
    def endMonitoring(newFrame: Boolean): Unit = js.native
    
    /**
      * Call this method to start monitoring a new frame.
      * This scenario is typically used when you accumulate monitoring time many times for a single frame, you call this method at the start of the frame, then beginMonitoring to start recording and endMonitoring(false) to accumulated the recorded time to the PerfCounter or addCount() to accumulate a monitored count.
      */
    def fetchNewFrame(): Unit = js.native
    
    /**
      * Returns the average value of the last second the counter was monitored
      */
    def lastSecAverage: Double = js.native
    
    /**
      * Returns the biggest value ever
      */
    def max: Double = js.native
    
    /**
      * Returns the smallest value ever
      */
    def min: Double = js.native
    
    /**
      * Gets the accumulated total
      */
    def total: Double = js.native
  }
  /* static members */
  object PerfCounter {
    
    @JSImport("babylonjs/Misc/perfCounter", "PerfCounter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets a global boolean to turn on and off all the counters
      */
    @JSImport("babylonjs/Misc/perfCounter", "PerfCounter.Enabled")
    @js.native
    def Enabled: Boolean = js.native
    inline def Enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(x.asInstanceOf[js.Any])
  }
}
