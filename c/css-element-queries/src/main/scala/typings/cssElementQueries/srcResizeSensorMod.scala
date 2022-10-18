package typings.cssElementQueries

import typings.cssElementQueries.anon.Height
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcResizeSensorMod {
  
  @JSImport("css-element-queries/src/ResizeSensor", JSImport.Default)
  @js.native
  open class default protected () extends ResizeSensor {
    def this(element: js.Array[Element], callback: ResizeSensorCallback) = this()
    /**
      * Creates a new resize sensor on given elements. The provided callback is called max 1 times per requestAnimationFrame and
      * is called initially.
      */
    def this(element: Element, callback: ResizeSensorCallback) = this()
  }
  /* static members */
  object default {
    
    @JSImport("css-element-queries/src/ResizeSensor", JSImport.Default)
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
  
  @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor")
  @js.native
  open class ResizeSensor protected () extends StObject {
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
    
    @JSImport("css-element-queries/src/ResizeSensor", "ResizeSensor")
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
  
  type ResizeSensorCallback = js.Function1[/* size */ Height, Unit]
}
