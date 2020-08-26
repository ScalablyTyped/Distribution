package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  /**
    * The name of the variable.
    */
  var name: VariableName = js.native
  /**
    * The current value of the variable.
    */
  var value: VariableValue = js.native
}

object Variable {
  @scala.inline
  def apply(name: VariableName, value: VariableValue): Variable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
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
    def setName(value: VariableName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: VariableValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

