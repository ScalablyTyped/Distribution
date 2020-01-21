package typings.businessRulesEngine.mod

import typings.q.mod.Promise
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
    customMessage: (/* config */ js.Any, /* args */ js.Any) => String = null,
    tagName: String = null
  ): IAsyncStringPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync.asInstanceOf[js.Any])
    if (customMessage != null) __obj.updateDynamic("customMessage")(js.Any.fromFunction2(customMessage))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncStringPropertyValidator]
  }
}

