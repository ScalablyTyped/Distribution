package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IPropertyValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "RangeValidator")
@js.native
class RangeValidator () extends IPropertyValidator {
  def this(Range: js.Array[Double]) = this()
  var Max: Double = js.native
  var Min: Double = js.native
  var Range: js.Array[Double] = js.native
  @JSName("tagName")
  var tagName_RangeValidator: String = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Boolean = js.native
}

