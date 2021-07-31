package typings.cacheManager

import typings.cacheManager.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create extends StObject {
    
    def create(args: js.Any*): Store
  }
  object Create {
    
    @scala.inline
    def apply(create: /* repeated */ js.Any => Store): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: /* repeated */ js.Any => Store): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
}
