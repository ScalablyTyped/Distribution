package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeHandlerArguments[Input /* <: js.Object */, Stream] extends HandlerArguments[Input] {
  /**
    * The user input serialized as an HTTP request.
    *
    * During the build phase of the execution of a middleware stack, a built
    * HTTP request may or may not be available.
    */
  var request: js.UndefOr[HttpRequest[Stream]] = js.undefined
}

object SerializeHandlerArguments {
  @scala.inline
  def apply[/* <: js.Object */ Input, Stream](input: Input, request: HttpRequest[Stream] = null): SerializeHandlerArguments[Input, Stream] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeHandlerArguments[Input, Stream]]
  }
}

