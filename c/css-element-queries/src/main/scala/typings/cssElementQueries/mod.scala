package typings.cssElementQueries

import typings.cssElementQueries.resizeSensorMod.ResizeSensorCallback
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-element-queries", "ElementQueries")
  @js.native
  open class ElementQueries ()
    extends typings.cssElementQueries.elementQueriesMod.ElementQueries
  /* static members */
  object ElementQueries {
    
    @JSImport("css-element-queries", "ElementQueries")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    
    /**
      * Attaches to DOMLoadContent
      */
    inline def listen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[Unit]
  }
  
  @JSImport("css-element-queries", "ResizeSensor")
  @js.native
  open class ResizeSensor protected ()
    extends typings.cssElementQueries.resizeSensorMod.ResizeSensor {
    def this(element: js.Array[Element], callback: ResizeSensorCallback) = this()
    /**
      * Creates a new resize sensor on given elements. The provided callback is called max 1 times per requestAnimationFrame and
      * is called initially.
      */
    def this(element: Element, callback: ResizeSensorCallback) = this()
  }
  /* static members */
  object ResizeSensor {
    
    @JSImport("css-element-queries", "ResizeSensor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def detach(element: js.Array[Element]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def detach(element: js.Array[Element], callback: ResizeSensorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Removes the resize sensor, and stops listening to resize events.
      */
    inline def detach(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def detach(element: Element, callback: ResizeSensorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def reset(element: js.Array[Element]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      * Resets the resize sensors, so for the next element resize is correctly detected. This is rare cases necessary
      * when the resize sensor isn't initialised correctly or is in a broken state due to DOM modifications.
      */
    inline def reset(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
