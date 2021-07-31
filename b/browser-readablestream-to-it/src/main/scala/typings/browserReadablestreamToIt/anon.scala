package typings.browserReadablestreamToIt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PreventCancel extends StObject {
    
    var preventCancel: js.UndefOr[Boolean] = js.undefined
  }
  object PreventCancel {
    
    @scala.inline
    def apply(): PreventCancel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreventCancel]
    }
    
    @scala.inline
    implicit class PreventCancelMutableBuilder[Self <: PreventCancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreventCancel(value: Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
    }
  }
}
