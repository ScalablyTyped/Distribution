package typings.csstoolsPostcssFontFormatKeywords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Preserve extends StObject {
    
    var preserve: Boolean
  }
  object Preserve {
    
    inline def apply(preserve: Boolean): Preserve = {
      val __obj = js.Dynamic.literal(preserve = preserve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Preserve]
    }
    
    extension [Self <: Preserve](x: Self) {
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    }
  }
}
