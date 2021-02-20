package typings.camundaExternalTaskClientJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error extends StObject {
    
    def error(text: String): Unit = js.native
    
    def success(text: String): Unit = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: String => Unit, success: String => Unit): Error = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccess(value: String => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    }
  }
}
