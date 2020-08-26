package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderableTask extends js.Object {
  /**
    * A JSON object that contains values for the variables defined in the template. It is made available to the template under the substitution variable task.input. For example, if you define a variable task.input.text in your template, you can supply the variable in the JSON object as "text": "sample text".
    */
  var Input: TaskInput = js.native
}

object RenderableTask {
  @scala.inline
  def apply(Input: TaskInput): RenderableTask = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderableTask]
  }
  @scala.inline
  implicit class RenderableTaskOps[Self <: RenderableTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInput(value: TaskInput): Self = this.set("Input", value.asInstanceOf[js.Any])
  }
  
}

