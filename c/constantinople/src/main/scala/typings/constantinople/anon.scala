package typings.constantinople

import typings.constantinople.constantinopleBooleans.`false`
import typings.constantinople.constantinopleBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Constant extends StObject {
    
    var constant: `true`
    
    var result: js.Any
  }
  object Constant {
    
    @scala.inline
    def apply(result: js.Any): Constant = {
      val __obj = js.Dynamic.literal(constant = true, result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constant]
    }
    
    @scala.inline
    implicit class ConstantMutableBuilder[Self <: Constant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstant(value: `true`): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var constant: `false`
    
    var result: js.UndefOr[Unit] = js.undefined
  }
  object Result {
    
    @scala.inline
    def apply(): Result = {
      val __obj = js.Dynamic.literal(constant = false)
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstant(value: `false`): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Unit): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
