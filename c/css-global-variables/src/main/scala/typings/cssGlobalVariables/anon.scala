package typings.cssGlobalVariables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Autoprefix extends StObject {
    
    var autoprefix: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var normalize: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
  }
  object Autoprefix {
    
    inline def apply(): Autoprefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Autoprefix]
    }
    
    extension [Self <: Autoprefix](x: Self) {
      
      inline def setAutoprefix(value: Boolean): Self = StObject.set(x, "autoprefix", value.asInstanceOf[js.Any])
      
      inline def setAutoprefixUndefined: Self = StObject.set(x, "autoprefix", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setNormalize(value: /* name */ String => String): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
}
