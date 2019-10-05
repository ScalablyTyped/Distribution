package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  var isAsync: Boolean
  var tagName: js.UndefOr[String] = js.undefined
  def isAcceptable(s: js.Any): Promise[Boolean]
}

object IAsyncPropertyValidator {
  @scala.inline
  def apply(
    isAcceptable: js.Any => Promise[Boolean],
    isAsync: Boolean,
    customMessage: (/* config */ js.Any, /* args */ js.Any) => String = null,
    tagName: String = null
  ): IAsyncPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync)
    if (customMessage != null) __obj.updateDynamic("customMessage")(js.Any.fromFunction2(customMessage))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IAsyncPropertyValidator]
  }
}

