package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerArguments[Input /* <: js.Object */] extends js.Object {
  /**
    * User input to a command. Reflects the userland representation of the
    * union of data types the command can effectively handle.
    */
  var input: Input
}

object HandlerArguments {
  @scala.inline
  def apply[Input /* <: js.Object */](input: Input): HandlerArguments[Input] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerArguments[Input]]
  }
}

