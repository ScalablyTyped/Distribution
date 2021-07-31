package typings.camaro

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IndentSize extends StObject {
    
    var indentSize: Double
  }
  object IndentSize {
    
    @scala.inline
    def apply(indentSize: Double): IndentSize = {
      val __obj = js.Dynamic.literal(indentSize = indentSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndentSize]
    }
    
    @scala.inline
    implicit class IndentSizeMutableBuilder[Self <: IndentSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    }
  }
}
