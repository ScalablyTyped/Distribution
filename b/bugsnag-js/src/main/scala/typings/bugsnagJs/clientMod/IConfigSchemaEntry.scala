package typings.bugsnagJs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigSchemaEntry extends js.Object {
  var message: String
  def defaultValue(): js.Any
  def validate(`val`: js.Any): Boolean
}

object IConfigSchemaEntry {
  @scala.inline
  def apply(defaultValue: () => js.Any, message: String, validate: js.Any => Boolean): IConfigSchemaEntry = {
    val __obj = js.Dynamic.literal(defaultValue = js.Any.fromFunction0(defaultValue), message = message.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[IConfigSchemaEntry]
  }
}

