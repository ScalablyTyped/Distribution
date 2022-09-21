package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceMonitor extends StObject {
  
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
