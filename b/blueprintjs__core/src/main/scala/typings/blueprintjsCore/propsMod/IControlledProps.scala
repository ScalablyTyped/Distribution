package typings.blueprintjsCore.propsMod

import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControlledProps extends js.Object {
  /** Initial value of the input, for uncontrolled usage. */
  var defaultValue: js.UndefOr[String] = js.native
  /** Change event handler. Use `event.target.value` for new value. */
  var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  /** Form value of the input, for controlled usage. */
  var value: js.UndefOr[String] = js.native
}

object IControlledProps {
  @scala.inline
  def apply(): IControlledProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IControlledProps]
  }
  @scala.inline
  implicit class IControlledPropsOps[Self <: IControlledProps] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setOnChange(value: FormEvent[HTMLElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

