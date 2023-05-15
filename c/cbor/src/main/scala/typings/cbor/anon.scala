package typings.cbor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Indefinite extends StObject {
    
    var indefinite: js.UndefOr[Boolean] = js.undefined
  }
  object Indefinite {
    
    inline def apply(): Indefinite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indefinite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Indefinite] (val x: Self) extends AnyVal {
      
      inline def setIndefinite(value: Boolean): Self = StObject.set(x, "indefinite", value.asInstanceOf[js.Any])
      
      inline def setIndefiniteUndefined: Self = StObject.set(x, "indefinite", js.undefined)
    }
  }
}
