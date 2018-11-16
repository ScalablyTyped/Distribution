package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAsyncPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  var isAsync: scala.Boolean
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  def isAcceptable(s: js.Any): qLib.qMod.QNs.Promise[scala.Boolean]
}

