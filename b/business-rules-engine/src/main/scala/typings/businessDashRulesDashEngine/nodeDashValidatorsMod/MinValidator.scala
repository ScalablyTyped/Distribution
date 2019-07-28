package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IPropertyValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "MinValidator")
@js.native
class MinValidator () extends IPropertyValidator {
  def this(Min: Double) = this()
  var Min: Double = js.native
  @JSName("tagName")
  var tagName_MinValidator: String = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Boolean = js.native
}

