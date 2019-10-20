package typings.camundaDashExternalDashTaskDashClientDashJs.camundaDashExternalDashTaskDashClientDashJsMod

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
    val __obj = js.Dynamic.literal(value = value, valueInfo = valueInfo)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TypedValue]
  }
}

