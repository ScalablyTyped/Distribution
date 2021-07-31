package typings.cssom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.Any
  }
  object Error {
    
    @scala.inline
    def apply(error: js.Any): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expression extends StObject {
    
    var expression: String
    
    var idx: Double
  }
  object Expression {
    
    @scala.inline
    def apply(expression: String, idx: Double): Expression = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    @scala.inline
    implicit class ExpressionMutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    }
  }
}
