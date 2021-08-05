package typings.bootstrap

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("bootstrap/js/dist/button", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Button {
    def this(element: Element) = this()
    
    /**
      * Destroys an element's button.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Toggles push state. Gives the button the appearance that it has been activated.
      */
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  trait Button extends StObject {
    
    /**
      * Destroys an element's button.
      */
    def dispose(): Unit
    
    /**
      * Toggles push state. Gives the button the appearance that it has been activated.
      */
    def toggle(): Unit
  }
  object Button {
    
    inline def apply(dispose: () => Unit, toggle: () => Unit): Button = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[Button]
    }
    
    extension [Self <: Button](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
