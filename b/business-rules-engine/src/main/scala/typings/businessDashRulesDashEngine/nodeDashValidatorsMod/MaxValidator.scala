package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IPropertyValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "MaxValidator")
@js.native
class MaxValidator () extends IPropertyValidator {
  def this(Max: Double) = this()
  var Max: Double = js.native
  @JSName("tagName")
  var tagName_MaxValidator: String = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Boolean = js.native
}

