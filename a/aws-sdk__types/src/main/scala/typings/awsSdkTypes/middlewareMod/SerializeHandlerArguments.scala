package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializeHandlerArguments[Input /* <: js.Object */] extends InitializeHandlerArguments[Input] {
  
  /**
    * The user input serialized as a request object. The request object is unknown,
    * so you cannot modify it directly. When work with request, you need to guard its
    * type to e.g. HttpRequest with 'instanceof' operand
    *
    * During the build phase of the execution of a middleware stack, a built
    * request may or may not be available.
    */
  var request: js.UndefOr[js.Any] = js.native
}
object SerializeHandlerArguments {
  
  @scala.inline
  def apply[Input /* <: js.Object */](input: Input): SerializeHandlerArguments[Input] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeHandlerArguments[Input]]
  }
  
  @scala.inline
  implicit class SerializeHandlerArgumentsOps[Self <: SerializeHandlerArguments[_], Input /* <: js.Object */] (val x: Self with SerializeHandlerArguments[Input]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
