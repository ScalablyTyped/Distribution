package typings.convertSourceMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Multiline extends StObject {
    
    var multiline: js.UndefOr[Boolean] = js.undefined
  }
  object Multiline {
    
    inline def apply(): Multiline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multiline]
    }
    
    extension [Self <: Multiline](x: Self) {
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    }
  }
}
