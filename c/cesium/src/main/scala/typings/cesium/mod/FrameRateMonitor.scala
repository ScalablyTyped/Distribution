package typings.cesium.mod

import typings.cesium.anon.MinimumFrameRateAfterWarmup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "FrameRateMonitor")
@js.native
class FrameRateMonitor () extends StObject {
  def this(options: MinimumFrameRateAfterWarmup) = this()
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var lastFramesPerSecond: Double = js.native
  
  var lowFrameRate: Event[js.Array[_]] = js.native
  
  var minimumFrameRateAfterWarmup: Double = js.native
  
  var minimumFrameRateDuringWarmup: Double = js.native
  
  var nominalFrameRate: Event[js.Array[_]] = js.native
  
  def pause(): Unit = js.native
  
  var quietPeriod: Double = js.native
  
  var samplingWindow: Double = js.native
  
  var scene: Scene = js.native
  
  def unpause(): Unit = js.native
  
  var warmupPeriod: Double = js.native
}
object FrameRateMonitor {
  
  @JSImport("cesium", "FrameRateMonitor")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "FrameRateMonitor.defaultSettings")
  @js.native
  def defaultSettings: js.Any = js.native
  @scala.inline
  def defaultSettings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSettings")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "FrameRateMonitor.fromScene")
  @js.native
  def fromScene(scene: Scene): FrameRateMonitor = js.native
}
