package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigSchemaEntry extends js.Object {
  var message: java.lang.String
  def defaultValue(): js.Any
  def validate(`val`: js.Any): scala.Boolean
}

object IConfigSchemaEntry {
  @scala.inline
  def apply(defaultValue: () => js.Any, message: java.lang.String, validate: js.Any => scala.Boolean): IConfigSchemaEntry = {
    val __obj = js.Dynamic.literal(defaultValue = js.Any.fromFunction0(defaultValue), message = message, validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[IConfigSchemaEntry]
  }
}

