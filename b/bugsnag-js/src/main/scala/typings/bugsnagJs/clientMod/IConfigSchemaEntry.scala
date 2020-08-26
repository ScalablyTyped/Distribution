package typings.bugsnagJs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigSchemaEntry extends js.Object {
  var message: String = js.native
  def defaultValue(): js.Any = js.native
  def validate(`val`: js.Any): Boolean = js.native
}

object IConfigSchemaEntry {
  @scala.inline
  def apply(defaultValue: () => js.Any, message: String, validate: js.Any => Boolean): IConfigSchemaEntry = {
    val __obj = js.Dynamic.literal(defaultValue = js.Any.fromFunction0(defaultValue), message = message.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[IConfigSchemaEntry]
  }
  @scala.inline
  implicit class IConfigSchemaEntryOps[Self <: IConfigSchemaEntry] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: () => js.Any): Self = this.set("defaultValue", js.Any.fromFunction0(value))
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: js.Any => Boolean): Self = this.set("validate", js.Any.fromFunction1(value))
  }
  
}

