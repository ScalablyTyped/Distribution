package typings.atAwsDashSdkTypes.buildMiddlewareMod

import typings.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalizeHandlerArguments[Input /* <: js.Object */, Stream] extends HandlerArguments[Input] {
  /**
    * The user input serialized as an HTTP request.
    */
  var request: HttpRequest[Stream]
}

object FinalizeHandlerArguments {
  @scala.inline
  def apply[Input /* <: js.Object */, Stream](input: Input, request: HttpRequest[Stream]): FinalizeHandlerArguments[Input, Stream] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FinalizeHandlerArguments[Input, Stream]]
  }
}

