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
}

