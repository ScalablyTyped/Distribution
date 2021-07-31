package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializeHandlerArguments[Input /* <: js.Object */]
  extends StObject
     with InitializeHandlerArguments[Input] {
  
  /**
    * The user input serialized as a request object. The request object is unknown,
    * so you cannot modify it directly. When work with request, you need to guard its
    * type to e.g. HttpRequest with 'instanceof' operand
    *
    * During the build phase of the execution of a middleware stack, a built
    * request may or may not be available.
    */
  var request: js.UndefOr[js.Any] = js.undefined
}
object SerializeHandlerArguments {
  
  @scala.inline
  def apply[Input /* <: js.Object */](input: Input): SerializeHandlerArguments[Input] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeHandlerArguments[Input]]
  }
  
  @scala.inline
  implicit class SerializeHandlerArgumentsMutableBuilder[Self <: SerializeHandlerArguments[?], Input /* <: js.Object */] (val x: Self & SerializeHandlerArguments[Input]) extends AnyVal {
    
    @scala.inline
    def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
