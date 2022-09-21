package typings.colorette

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait UseColor extends StObject {
    
    var useColor: Boolean
  }
  object UseColor {
    
    inline def apply(useColor: Boolean): UseColor = {
      val __obj = js.Dynamic.literal(useColor = useColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseColor]
    }
    
    extension [Self <: UseColor](x: Self) {
      
      inline def setUseColor(value: Boolean): Self = StObject.set(x, "useColor", value.asInstanceOf[js.Any])
    }
  }
}
