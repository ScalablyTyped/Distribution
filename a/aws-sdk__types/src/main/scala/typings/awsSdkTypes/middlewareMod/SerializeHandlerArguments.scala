package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeHandlerArguments[Input /* <: js.Object */, Stream] extends HandlerArguments[Input] {
  /**
    * The user input serialized as an HTTP request.
    *
    * During the build phase of the execution of a middleware stack, a built
    * HTTP request may or may not be available.
    */
  var request: js.UndefOr[HttpRequest[Stream]] = js.native
}

object SerializeHandlerArguments {
  @scala.inline
  def apply[/* <: js.Object */ Input, Stream](input: Input): SerializeHandlerArguments[Input, Stream] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeHandlerArguments[Input, Stream]]
  }
  @scala.inline
  implicit class SerializeHandlerArgumentsOps[Self <: SerializeHandlerArguments[_, _], /* <: js.Object */ Input, Stream] (val x: Self with (SerializeHandlerArguments[Input, Stream])) extends AnyVal {
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
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
  
}

