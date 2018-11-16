package typings
package businessDashRulesDashEngineLib.nodeDashValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "RangeValidator")
@js.native
class RangeValidator ()
  extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.IPropertyValidator {
  def this(Range: js.Array[scala.Double]) = this()
  var Max: scala.Double = js.native
  var Min: scala.Double = js.native
  var Range: js.Array[scala.Double] = js.native
  @JSName("tagName")
  var tagName_RangeValidator: java.lang.String = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): scala.Boolean = js.native
}

