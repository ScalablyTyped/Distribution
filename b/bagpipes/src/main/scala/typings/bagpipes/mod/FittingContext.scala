package typings.bagpipes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FittingContext
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * The input defined in the fitting definition
    * (string, number, object, array)
    */
  var input: js.Any = js.native
  /** Output to be delivered to the next fitting or client */
  var output: js.Any = js.native
}

object FittingContext {
  @scala.inline
  def apply(input: js.Any, output: js.Any): FittingContext = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[FittingContext]
  }
  @scala.inline
  implicit class FittingContextOps[Self <: FittingContext] (val x: Self) extends AnyVal {
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
    def setInput(value: js.Any): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: js.Any): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

