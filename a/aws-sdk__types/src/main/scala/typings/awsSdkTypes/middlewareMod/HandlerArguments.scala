package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerArguments[Input /* <: js.Object */] extends js.Object {
  /**
    * User input to a command. Reflects the userland representation of the
    * union of data types the command can effectively handle.
    */
  var input: Input = js.native
}

object HandlerArguments {
  @scala.inline
  def apply[/* <: js.Object */ Input](input: Input): HandlerArguments[Input] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerArguments[Input]]
  }
  @scala.inline
  implicit class HandlerArgumentsOps[Self <: HandlerArguments[_], /* <: js.Object */ Input] (val x: Self with HandlerArguments[Input]) extends AnyVal {
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
    def setInput(value: Input): Self = this.set("input", value.asInstanceOf[js.Any])
  }
  
}

