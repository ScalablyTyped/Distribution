package typings.cesium

import typings.cesium.mod.ScreenSpaceEventHandler
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenSpaceEventHandlerMod {
  
  @JSImport("cesium/Source/Core/ScreenSpaceEventHandler", JSImport.Default)
  @js.native
  open class default () extends ScreenSpaceEventHandler {
    def this(element: HTMLCanvasElement) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/ScreenSpaceEventHandler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The amount of time, in milliseconds, that mouse events will be disabled after
      * receiving any touch events, such that any emulated mouse events will be ignored.
      */
    @JSImport("cesium/Source/Core/ScreenSpaceEventHandler", "default.mouseEmulationIgnoreMilliseconds")
    @js.native
    def mouseEmulationIgnoreMilliseconds: Double = js.native
    inline def mouseEmulationIgnoreMilliseconds_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseEmulationIgnoreMilliseconds")(x.asInstanceOf[js.Any])
    
    /**
      * The amount of time, in milliseconds, before a touch on the screen becomes a
      * touch and hold.
      */
    @JSImport("cesium/Source/Core/ScreenSpaceEventHandler", "default.touchHoldDelayMilliseconds")
    @js.native
    def touchHoldDelayMilliseconds: Double = js.native
    inline def touchHoldDelayMilliseconds_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchHoldDelayMilliseconds")(x.asInstanceOf[js.Any])
  }
}
