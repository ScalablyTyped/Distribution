package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncStringPropertyValidator extends IAsyncPropertyValidator {
  def isAcceptable(s: String): Promise[Boolean]
}

object IAsyncStringPropertyValidator {
  @scala.inline
  def apply(
    isAcceptable: String => Promise[Boolean],
    isAsync: Boolean,
    customMessage: IErrorCustomMessage = null,
    tagName: String = null
  ): IAsyncStringPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync)
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IAsyncStringPropertyValidator]
  }
}

