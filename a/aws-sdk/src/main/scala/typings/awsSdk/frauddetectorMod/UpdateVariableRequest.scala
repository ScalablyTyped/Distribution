package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVariableRequest extends js.Object {
  /**
    * The new default value of the variable.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The new description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the variable.
    */
  var name: String = js.native
  /**
    * The variable type.
    */
  var variableType: js.UndefOr[String] = js.native
}

object UpdateVariableRequest {
  @scala.inline
  def apply(name: String, defaultValue: String = null, description: String = null, variableType: String = null): UpdateVariableRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (variableType != null) __obj.updateDynamic("variableType")(variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVariableRequest]
  }
}

