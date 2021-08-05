package typings.datatablesNetKeytable

import typings.datatablesNetKeytable.DataTables.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Disable extends StObject {
    
    /*
      * Disable KeyTable's interactions (mouse and keyboard)
      */
    def disable(): Api
    
    /*
      * Enable or disable KeyTable's interactions (mouse and keyboard)
      */
    def enable(): Api
  }
  object Disable {
    
    inline def apply(disable: () => Api, enable: () => Api): Disable = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[Disable]
    }
    
    extension [Self <: Disable](x: Self) {
      
      inline def setDisable(value: () => Api): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Api): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
}
