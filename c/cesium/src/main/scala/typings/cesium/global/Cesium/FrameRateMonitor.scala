package typings.cesium.global.Cesium

import typings.cesium.anon.MinimumFrameRateAfterWarmup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.FrameRateMonitor")
@js.native
class FrameRateMonitor ()
  extends typings.cesium.mod.FrameRateMonitor {
  def this(options: MinimumFrameRateAfterWarmup) = this()
}
object FrameRateMonitor {
  
  @JSGlobal("Cesium.FrameRateMonitor")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.FrameRateMonitor.defaultSettings")
  @js.native
  def defaultSettings: js.Any = js.native
  inline def defaultSettings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSettings")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def fromScene(scene: typings.cesium.mod.Scene): typings.cesium.mod.FrameRateMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScene")(scene.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.FrameRateMonitor]
}
