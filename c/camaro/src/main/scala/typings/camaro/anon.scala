package typings.camaro

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IndentSize extends StObject {
    
    var indentSize: Double
  }
  object IndentSize {
    
    inline def apply(indentSize: Double): IndentSize = {
      val __obj = js.Dynamic.literal(indentSize = indentSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndentSize]
    }
    
    extension [Self <: IndentSize](x: Self) {
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    }
  }
}
