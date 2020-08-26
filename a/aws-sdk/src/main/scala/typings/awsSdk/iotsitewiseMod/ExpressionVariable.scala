package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionVariable extends js.Object {
  /**
    * The friendly name of the variable to be used in the expression.
    */
  var name: VariableName = js.native
  /**
    * The variable that identifies an asset property from which to use values.
    */
  var value: VariableValue = js.native
}

object ExpressionVariable {
  @scala.inline
  def apply(name: VariableName, value: VariableValue): ExpressionVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionVariable]
  }
  @scala.inline
  implicit class ExpressionVariableOps[Self <: ExpressionVariable] (val x: Self) extends AnyVal {
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

