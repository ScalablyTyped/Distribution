package typings.datatablesNetKeytable

import typings.datatablesNetKeytable.DataTables.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Disable extends StObject {
    
    /*
      * Disable KeyTable's interactions (mouse and keyboard)
      */
    def disable(): Api = js.native
    
    /*
      * Enable or disable KeyTable's interactions (mouse and keyboard)
      */
    def enable(): Api = js.native
  }
  object Disable {
    
    @scala.inline
    def apply(disable: () => Api, enable: () => Api): Disable = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[Disable]
    }
    
    @scala.inline
    implicit class DisableMutableBuilder[Self <: Disable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Api): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Api): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
}
