package typings.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.native
  var tagName: js.UndefOr[String] = js.native
  def isAcceptable(s: js.Any): Boolean = js.native
}

object IPropertyValidator {
  @scala.inline
  def apply(isAcceptable: js.Any => Boolean): IPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable))
    __obj.asInstanceOf[IPropertyValidator]
  }
  @scala.inline
  implicit class IPropertyValidatorOps[Self <: IPropertyValidator] (val x: Self) extends AnyVal {
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
    def setIsAcceptable(value: js.Any => Boolean): Self = this.set("isAcceptable", js.Any.fromFunction1(value))
    @scala.inline
    def setCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = this.set("customMessage", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomMessage: Self = this.set("customMessage", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
  
}

