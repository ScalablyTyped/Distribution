package typings.cesium

import typings.cesium.anon.MinimumFrameRateAfterWarmup
import typings.cesium.mod.FrameRateMonitor
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneFrameRateMonitorMod {
  
  @JSImport("cesium/Source/Scene/FrameRateMonitor", JSImport.Default)
  @js.native
  open class default () extends FrameRateMonitor {
    def this(options: MinimumFrameRateAfterWarmup) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/FrameRateMonitor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default frame rate monitoring settings.  These settings are used when {@link FrameRateMonitor.fromScene}
      * needs to create a new frame rate monitor, and for any settings that are not passed to the
      * {@link FrameRateMonitor} constructor.
      */
    @JSImport("cesium/Source/Scene/FrameRateMonitor", "default.defaultSettings")
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
}
