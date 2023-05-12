package typings.chaiSorted

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Descending extends StObject {
    
    var descending: Boolean
  }
  object Descending {
    
    inline def apply(descending: Boolean): Descending = {
      val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descending]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Descending] (val x: Self) extends AnyVal {
      
      inline def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    }
  }
}
