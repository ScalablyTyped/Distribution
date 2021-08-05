package typings.burns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exclude extends StObject {
    
    var exclude: js.UndefOr[js.Any] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: js.Any): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    }
  }
}
