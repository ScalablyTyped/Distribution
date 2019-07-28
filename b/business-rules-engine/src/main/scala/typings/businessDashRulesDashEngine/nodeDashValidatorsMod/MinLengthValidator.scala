package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IStringValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "MinLengthValidator")
@js.native
class MinLengthValidator () extends IStringValidator {
  def this(MinLength: Double) = this()
  var MinLength: Double = js.native
  @JSName("tagName")
  var tagName_MinLengthValidator: String = js.native
  /* CompleteClass */
  override def isAcceptable(s: String): Boolean = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Boolean = js.native
}

