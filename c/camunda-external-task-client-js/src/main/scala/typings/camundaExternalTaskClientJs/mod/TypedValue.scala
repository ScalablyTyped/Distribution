package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedValue extends js.Object {
  var `type`: String
  var value: Value
  var valueInfo: js.Object
}

object TypedValue {
  @scala.inline
  def apply(`type`: String, value: Value, valueInfo: js.Object): TypedValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueInfo = valueInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedValue]
  }
}

