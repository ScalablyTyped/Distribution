package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncStringPropertyValidator extends IAsyncPropertyValidator {
  def isAcceptable(s: java.lang.String): qLib.qMod.QNs.Promise[scala.Boolean]
}

object IAsyncStringPropertyValidator {
  @scala.inline
  def apply(
    isAcceptable: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[scala.Boolean]],
    isAsync: scala.Boolean,
    customMessage: IErrorCustomMessage = null,
    tagName: java.lang.String = null
  ): IAsyncStringPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = isAcceptable, isAsync = isAsync)
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IAsyncStringPropertyValidator]
  }
}

