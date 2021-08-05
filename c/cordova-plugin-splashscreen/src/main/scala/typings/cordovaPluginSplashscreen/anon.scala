package typings.cordovaPluginSplashscreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hide extends StObject {
    
    /** Dismiss the splash screen. */
    def hide(): Unit
    
    /** Displays the splash screen. */
    def show(): Unit
  }
  object Hide {
    
    inline def apply(hide: () => Unit, show: () => Unit): Hide = {
      val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[Hide]
    }
    
    extension [Self <: Hide](x: Self) {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
}
