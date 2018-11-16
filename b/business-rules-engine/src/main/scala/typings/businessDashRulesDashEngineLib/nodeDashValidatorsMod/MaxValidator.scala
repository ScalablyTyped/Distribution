package typings
package businessDashRulesDashEngineLib.nodeDashValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "MaxValidator")
@js.native
class MaxValidator ()
  extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.IPropertyValidator {
  def this(Max: scala.Double) = this()
  var Max: scala.Double = js.native
  @JSName("tagName")
  var tagName_MaxValidator: java.lang.String = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): scala.Boolean = js.native
}

