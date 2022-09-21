package typings.dargs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait _empty extends StObject {
    
    var `--`: js.UndefOr[js.Array[String]] = js.undefined
    
    @JSName("_")
    var _underscore: js.UndefOr[js.Array[String]] = js.undefined
  }
  object _empty {
    
    inline def apply(): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def `set--`(value: js.Array[String]): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
      
      inline def `set--Undefined`: Self = StObject.set(x, "--", js.undefined)
      
      inline def `set--Varargs`(value: String*): Self = StObject.set(x, "--", js.Array(value*))
      
      inline def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreUndefined: Self = StObject.set(x, "_", js.undefined)
      
      inline def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value*))
    }
  }
}
