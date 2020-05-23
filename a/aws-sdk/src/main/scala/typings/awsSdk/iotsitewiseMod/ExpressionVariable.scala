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
}

