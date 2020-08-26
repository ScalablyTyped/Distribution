package typings.braintreeWeb.hostedFieldsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedFieldsHostedFieldsFieldData extends js.Object {
  var container: HTMLElement = js.native
  var isEmpty: Boolean = js.native
  var isFocused: Boolean = js.native
  var isPotentiallyValid: Boolean = js.native
  var isValid: Boolean = js.native
}

object HostedFieldsHostedFieldsFieldData {
  @scala.inline
  def apply(
    container: HTMLElement,
    isEmpty: Boolean,
    isFocused: Boolean,
    isPotentiallyValid: Boolean,
    isValid: Boolean
  ): HostedFieldsHostedFieldsFieldData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsHostedFieldsFieldData]
  }
  @scala.inline
  implicit class HostedFieldsHostedFieldsFieldDataOps[Self <: HostedFieldsHostedFieldsFieldData] (val x: Self) extends AnyVal {
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPotentiallyValid(value: Boolean): Self = this.set("isPotentiallyValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
  }
  
}

