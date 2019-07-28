package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  def isAcceptable(s: js.Any): Boolean
}

object IPropertyValidator {
  @scala.inline
  def apply(isAcceptable: js.Any => Boolean, customMessage: IErrorCustomMessage = null, tagName: String = null): IPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable))
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IPropertyValidator]
  }
}

