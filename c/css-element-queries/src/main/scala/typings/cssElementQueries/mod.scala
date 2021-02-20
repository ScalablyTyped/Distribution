package typings.cssElementQueries

import typings.cssElementQueries.resizeSensorMod.ResizeSensorCallback
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-element-queries", "ElementQueries")
  @js.native
  class ElementQueries ()
    extends typings.cssElementQueries.elementQueriesMod.ElementQueries
  /* static members */
  object ElementQueries {
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    @JSImport("css-element-queries", "ElementQueries.init")
    @js.native
    def init(): Unit = js.native
    
    /**
      * Attaches to DOMLoadContent
      */
    @JSImport("css-element-queries", "ElementQueries.listen")
    @js.native
    def listen(): Unit = js.native
  }
  
  @JSImport("css-element-queries", "ResizeSensor")
  @js.native
  class ResizeSensor protected ()
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
    
    @JSImport("css-element-queries", "ResizeSensor.detach")
    @js.native
    def detach(element: js.Array[Element]): Unit = js.native
    @JSImport("css-element-queries", "ResizeSensor.detach")
    @js.native
    def detach(element: js.Array[Element], callback: ResizeSensorCallback): Unit = js.native
    /**
      * Removes the resize sensor, and stops listening to resize events.
      */
    @JSImport("css-element-queries", "ResizeSensor.detach")
    @js.native
    def detach(element: Element): Unit = js.native
    @JSImport("css-element-queries", "ResizeSensor.detach")
    @js.native
    def detach(element: Element, callback: ResizeSensorCallback): Unit = js.native
    
    @JSImport("css-element-queries", "ResizeSensor.reset")
    @js.native
    def reset(element: js.Array[Element]): Unit = js.native
    /**
      * Resets the resize sensors, so for the next element resize is correctly detected. This is rare cases necessary
      * when the resize sensor isn't initialised correctly or is in a broken state due to DOM modifications.
      */
    @JSImport("css-element-queries", "ResizeSensor.reset")
    @js.native
    def reset(element: Element): Unit = js.native
  }
}
