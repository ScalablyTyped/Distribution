package typings.cssElementQueries

import typings.cssElementQueries.anon.Height
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeSensorMod {
  
  @JSImport("css-element-queries/src/ResizeSensor", JSImport.Default)
  @js.native
  class default protected () extends ResizeSensor {
    def this(element: js.Array[Element], callback: ResizeSensorCallback) = this()
    /**
      * Creates a new resize sensor on given elements. The provided callback is called max 1 times per requestAnimationFrame and
      * is called initially.
      */
    def this(element: Element, callback: ResizeSensorCallback) = this()
  }
  /* static members */
  object default {
    
    @JSImport("css-element-queries/src/ResizeSensor", "default.detach")
    @js.native
    def detach(element: js.Array[Element]): Unit = js.native
    @JSImport("css-element-queries/src/ResizeSensor", "default.detach")
    @js.native
    def detach(element: js.Array[Element], callback: ResizeSensorCallback): Unit = js.native
    /**
      * Removes the resize sensor, and stops listening to resize events.
      */
    @JSImport("css-element-queries/src/ResizeSensor", "default.detach")
    @js.native
    def detach(element: Element): Unit = js.native
    @JSImport("css-element-queries/src/ResizeSensor", "default.detach")
    @js.native
    def detach(element: Element, callback: ResizeSensorCallback): Unit = js.native
    
    @JSImport("css-element-queries/src/ResizeSensor", "default.reset")
    @js.native
    def reset(element: js.Array[Element]): Unit = js.native
    /**
      * Resets the resize sensors, so for the next element resize is correctly detected. This is rare cases necessary
      * when the resize sensor isn't initialised correctly or is in a broken state due to DOM modifications.
      */
    @JSImport("css-element-queries/src/ResizeSensor", "default.reset")
    @js.native
    def reset(element: Element): Unit = js.native
  }
  
  @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor")
  @js.native
  class ResizeSensor protected () extends StObject {
    def this(element: js.Array[Element], callback: ResizeSensorCallback) = this()
    /**
      * Creates a new resize sensor on given elements. The provided callback is called max 1 times per requestAnimationFrame and
      * is called initially.
      */
    def this(element: Element, callback: ResizeSensorCallback) = this()
    
    /**
      * Removes the resize sensor, and stops listening to resize events.
      */
    def detach(): Unit = js.native
    def detach(callback: ResizeSensorCallback): Unit = js.native
    
    /**
      * Resets the resize sensors, so for the next element resize is correctly detected. This is rare cases necessary
      * when the resize sensor isn't initialised correctly or is in a broken state due to DOM modifications.
      */
    def reset(): Unit = js.native
  }
  /* static members */
  object ResizeSensor {
    
    @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor.detach")
    @js.native
    def detach(element: js.Array[Element]): Unit = js.native
    @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor.detach")
    @js.native
    def detach(element: js.Array[Element], callback: ResizeSensorCallback): Unit = js.native
    /**
      * Removes the resize sensor, and stops listening to resize events.
      */
    @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor.detach")
    @js.native
    def detach(element: Element): Unit = js.native
    @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor.detach")
    @js.native
    def detach(element: Element, callback: ResizeSensorCallback): Unit = js.native
    
    @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor.reset")
    @js.native
    def reset(element: js.Array[Element]): Unit = js.native
    /**
      * Resets the resize sensors, so for the next element resize is correctly detected. This is rare cases necessary
      * when the resize sensor isn't initialised correctly or is in a broken state due to DOM modifications.
      */
    @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor.reset")
    @js.native
    def reset(element: Element): Unit = js.native
  }
  
  type ResizeSensorCallback = js.Function1[/* size */ Height, Unit]
}
