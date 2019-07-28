package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringValidator extends IPropertyValidator {
  def isAcceptable(s: String): Boolean
}

object IStringValidator {
  @scala.inline
  def apply(isAcceptable: String => Boolean, customMessage: IErrorCustomMessage = null, tagName: String = null): IStringValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable))
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IStringValidator]
  }
}

