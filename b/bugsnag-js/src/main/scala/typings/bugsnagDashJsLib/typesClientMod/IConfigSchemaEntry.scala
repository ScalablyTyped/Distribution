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
  def apply(
    defaultValue: js.Function0[js.Any],
    message: java.lang.String,
    validate: js.Function1[js.Any, scala.Boolean]
  ): IConfigSchemaEntry = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, message = message, validate = validate)
  
    __obj.asInstanceOf[IConfigSchemaEntry]
  }
}

