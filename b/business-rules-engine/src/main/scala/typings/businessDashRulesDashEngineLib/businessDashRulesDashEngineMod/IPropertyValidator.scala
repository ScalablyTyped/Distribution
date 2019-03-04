package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  def isAcceptable(s: js.Any): scala.Boolean
}

object IPropertyValidator {
  @scala.inline
  def apply(
    isAcceptable: js.Function1[js.Any, scala.Boolean],
    customMessage: IErrorCustomMessage = null,
    tagName: java.lang.String = null
  ): IPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = isAcceptable)
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IPropertyValidator]
  }
}

