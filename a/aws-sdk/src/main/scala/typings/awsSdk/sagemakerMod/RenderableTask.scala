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
}

