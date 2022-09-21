package typings.commitlintTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIgnoredMod {
  
  trait IsIgnoredOptions extends StObject {
    
    var defaults: js.UndefOr[Boolean] = js.undefined
    
    var ignores: js.UndefOr[js.Array[Matcher]] = js.undefined
  }
  object IsIgnoredOptions {
    
    inline def apply(): IsIgnoredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsIgnoredOptions]
    }
    
    extension [Self <: IsIgnoredOptions](x: Self) {
      
      inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setIgnores(value: js.Array[Matcher]): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIgnoresUndefined: Self = StObject.set(x, "ignores", js.undefined)
      
      inline def setIgnoresVarargs(value: Matcher*): Self = StObject.set(x, "ignores", js.Array(value*))
    }
  }
  
  type Matcher = js.Function1[/* commit */ String, Boolean]
}
