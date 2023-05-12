package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fullscreen {
  
  @JSImport("@cesium/engine", "Fullscreen")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The name of the event on the document that is fired when fullscreen is
    * entered or exited.  This event name is intended for use with addEventListener.
    * In your event handler, to determine if the browser is in fullscreen mode or not,
    * use {@link Fullscreen#fullscreen}.
    */
  @JSImport("@cesium/engine", "Fullscreen.changeEventName")
  @js.native
  val changeEventName: String = js.native
  
  /**
    * The element that is currently fullscreen, if any.  To simply check if the
    * browser is in fullscreen mode or not, use {@link Fullscreen#fullscreen}.
    */
  @JSImport("@cesium/engine", "Fullscreen.element")
  @js.native
  val element: Any = js.native
  
  /**
    * Determine whether the browser will allow an element to be made fullscreen, or not.
    * For example, by default, iframes cannot go fullscreen unless the containing page
    * adds an "allowfullscreen" attribute (or prefixed equivalent).
    */
  @JSImport("@cesium/engine", "Fullscreen.enabled")
  @js.native
  val enabled: Boolean = js.native
  
  /**
    * The name of the event that is fired when a fullscreen error
    * occurs.  This event name is intended for use with addEventListener.
    */
  @JSImport("@cesium/engine", "Fullscreen.errorEventName")
  @js.native
  val errorEventName: String = js.native
  
  /**
    * Asynchronously exits fullscreen mode.  If the browser is not currently
    * in fullscreen, or if fullscreen mode is not supported by the browser, does nothing.
    */
  inline def exitFullscreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exitFullscreen")().asInstanceOf[Unit]
  
  /**
    * Determines if the browser is currently in fullscreen mode.
    */
  @JSImport("@cesium/engine", "Fullscreen.fullscreen")
  @js.native
  val fullscreen: Boolean = js.native
  
  /**
    * Asynchronously requests the browser to enter fullscreen mode on the given element.
    * If fullscreen mode is not supported by the browser, does nothing.
    * @example
    * // Put the entire page into fullscreen.
    * Cesium.Fullscreen.requestFullscreen(document.body)
    *
    * // Place only the Cesium canvas into fullscreen.
    * Cesium.Fullscreen.requestFullscreen(scene.canvas)
    * @param element - The HTML element which will be placed into fullscreen mode.
    * @param [vrDevice] - The HMDVRDevice device.
    */
  inline def requestFullscreen(element: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFullscreen")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def requestFullscreen(element: Any, vrDevice: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestFullscreen")(element.asInstanceOf[js.Any], vrDevice.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Detects whether the browser supports the standard fullscreen API.
    * @returns <code>true</code> if the browser supports the standard fullscreen API,
    * <code>false</code> otherwise.
    */
  inline def supportsFullscreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsFullscreen")().asInstanceOf[Boolean]
}
