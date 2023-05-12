package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.MinimumFrameRateAfterWarmup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "FrameRateMonitor")
@js.native
open class FrameRateMonitor () extends StObject {
  def this(options: MinimumFrameRateAfterWarmup) = this()
  
  /**
    * Unsubscribes this instance from all events it is listening to.
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the most recently computed average frames-per-second over the last <code>samplingWindow</code>.
    * This property may be undefined if the frame rate has not been computed.
    */
  var lastFramesPerSecond: Double = js.native
  
  /**
    * Gets the event that is raised when a low frame rate is detected.  The function will be passed
    * the {@link Scene} instance as its first parameter and the average number of frames per second
    * over the sampling window as its second parameter.
    */
  var lowFrameRate: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the minimum frames-per-second that are required for acceptable performance after
    * the end of the warmup period.  If the frame rate averages less than this during any <code>samplingWindow</code> after the <code>warmupPeriod</code>, the
    * <code>lowFrameRate</code> event will be raised and the page will redirect to the <code>redirectOnLowFrameRateUrl</code>, if any.
    */
  var minimumFrameRateAfterWarmup: Double = js.native
  
  /**
    * Gets or sets the minimum frames-per-second that are required for acceptable performance during
    * the warmup period.  If the frame rate averages less than this during any <code>samplingWindow</code> during the <code>warmupPeriod</code>, the
    * <code>lowFrameRate</code> event will be raised and the page will redirect to the <code>redirectOnLowFrameRateUrl</code>, if any.
    */
  var minimumFrameRateDuringWarmup: Double = js.native
  
  /**
    * Gets the event that is raised when the frame rate returns to a normal level after having been low.
    * The function will be passed the {@link Scene} instance as its first parameter and the average
    * number of frames per second over the sampling window as its second parameter.
    */
  var nominalFrameRate: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Pauses monitoring of the frame rate.  To resume monitoring, {@link FrameRateMonitor#unpause}
    * must be called once for each time this function is called.
    */
  def pause(): Unit = js.native
  
  /**
    * Gets or sets the length of time to wait at startup and each time the page becomes visible (i.e. when the user
    * switches back to the tab) before starting to measure performance, in seconds.
    */
  var quietPeriod: Double = js.native
  
  /**
    * Gets or sets the length of the sliding window over which to compute the average frame rate, in seconds.
    */
  var samplingWindow: Double = js.native
  
  /**
    * Gets the {@link Scene} instance for which to monitor performance.
    */
  var scene: Scene = js.native
  
  /**
    * Resumes monitoring of the frame rate.  If {@link FrameRateMonitor#pause} was called
    * multiple times, this function must be called the same number of times in order to
    * actually resume monitoring.
    */
  def unpause(): Unit = js.native
  
  /**
    * Gets or sets the length of the warmup period, in seconds.  During the warmup period, a separate
    * (usually lower) frame rate is required.
    */
  var warmupPeriod: Double = js.native
}
/* static members */
object FrameRateMonitor {
  
  @JSImport("@cesium/engine", "FrameRateMonitor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default frame rate monitoring settings.  These settings are used when {@link FrameRateMonitor.fromScene}
    * needs to create a new frame rate monitor, and for any settings that are not passed to the
    * {@link FrameRateMonitor} constructor.
    */
  @JSImport("@cesium/engine", "FrameRateMonitor.defaultSettings")
  @js.native
  def defaultSettings: Any = js.native
  inline def defaultSettings_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSettings")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the {@link FrameRateMonitor} for a given scene.  If the scene does not yet have
    * a {@link FrameRateMonitor}, one is created with the {@link FrameRateMonitor.defaultSettings}.
    * @param scene - The scene for which to get the {@link FrameRateMonitor}.
    * @returns The scene's {@link FrameRateMonitor}.
    */
  inline def fromScene(scene: Scene): FrameRateMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScene")(scene.asInstanceOf[js.Any]).asInstanceOf[FrameRateMonitor]
}
