package typings.cssElementQueries

import typings.cssElementQueries.resizeSensorMod.ResizeSensorCallback
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-element-queries", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class ElementQueries ()
    extends typings.cssElementQueries.elementQueriesMod.ElementQueries
  /* static members */
  @js.native
  object ElementQueries extends js.Object {
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    def init(): Unit = js.native
    
    /**
      * Attaches to DOMLoadContent
      */
    def listen(): Unit = js.native
  }
  
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
  @js.native
  object ResizeSensor extends js.Object {
    
    def detach(element: js.Array[Element]): Unit = js.native
    def detach(element: js.Array[Element], callback: ResizeSensorCallback): Unit = js.native
    /**
      * Removes the resize sensor, and stops listening to resize events.
      */
    def detach(element: Element): Unit = js.native
    def detach(element: Element, callback: ResizeSensorCallback): Unit = js.native
    
    def reset(element: js.Array[Element]): Unit = js.native
    /**
      * Resets the resize sensors, so for the next element resize is correctly detected. This is rare cases necessary
      * when the resize sensor isn't initialised correctly or is in a broken state due to DOM modifications.
      */
    def reset(element: Element): Unit = js.native
  }
}
