package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVariableAction extends js.Object {
  /**
    * The new value of the variable.
    */
  var value: VariableValue = js.native
  /**
    * The name of the variable.
    */
  var variableName: VariableName = js.native
}

object SetVariableAction {
  @scala.inline
  def apply(value: VariableValue, variableName: VariableName): SetVariableAction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetVariableAction]
  }
}

