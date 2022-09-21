package typings.cssom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: Any
  }
  object Error {
    
    inline def apply(error: Any): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expression extends StObject {
    
    var expression: String
    
    var idx: Double
  }
  object Expression {
    
    inline def apply(expression: String, idx: Double): Expression = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    extension [Self <: Expression](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    }
  }
}
