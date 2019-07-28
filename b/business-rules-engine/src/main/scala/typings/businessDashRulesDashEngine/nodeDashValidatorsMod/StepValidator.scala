package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IPropertyValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "StepValidator")
@js.native
class StepValidator () extends IPropertyValidator {
  def this(Step: String) = this()
  var Step: String = js.native
  @JSName("tagName")
  var tagName_StepValidator: String = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Boolean = js.native
}

