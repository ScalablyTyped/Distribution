package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IStringValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "MaxLengthValidator")
@js.native
class MaxLengthValidator () extends IStringValidator {
  def this(MaxLength: Double) = this()
  var MaxLength: Double = js.native
  @JSName("tagName")
  var tagName_MaxLengthValidator: String = js.native
  /* CompleteClass */
  override def isAcceptable(s: String): Boolean = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Boolean = js.native
}

