package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalizeHandlerArguments[Input /* <: js.Object */, Stream] extends HandlerArguments[Input] {
  /**
    * The user input serialized as an HTTP request.
    */
  var request: HttpRequest[Stream] = js.native
}

object FinalizeHandlerArguments {
  @scala.inline
  def apply[/* <: js.Object */ Input, Stream](input: Input, request: HttpRequest[Stream]): FinalizeHandlerArguments[Input, Stream] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeHandlerArguments[Input, Stream]]
  }
  @scala.inline
  implicit class FinalizeHandlerArgumentsOps[Self <: FinalizeHandlerArguments[_, _], /* <: js.Object */ Input, Stream] (val x: Self with (FinalizeHandlerArguments[Input, Stream])) extends AnyVal {
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
    def setRequest(value: HttpRequest[Stream]): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

