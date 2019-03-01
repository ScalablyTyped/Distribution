package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringValidator extends IPropertyValidator {
  def isAcceptable(s: java.lang.String): scala.Boolean
}

object IStringValidator {
  @scala.inline
  def apply(
    isAcceptable: js.Function1[java.lang.String, scala.Boolean],
    customMessage: IErrorCustomMessage = null,
    tagName: java.lang.String = null
  ): IStringValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAcceptable")(isAcceptable)
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IStringValidator]
  }
}

