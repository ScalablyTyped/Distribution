package typings
package businessDashRulesDashEngineLib.nodeDashValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "MinValidator")
@js.native
class MinValidator ()
  extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.IPropertyValidator {
  def this(Min: scala.Double) = this()
  var Min: scala.Double = js.native
  @JSName("tagName")
  var tagName_MinValidator: java.lang.String = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): scala.Boolean = js.native
}

