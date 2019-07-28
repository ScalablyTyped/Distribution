package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IStringValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "PatternValidator")
@js.native
class PatternValidator () extends IStringValidator {
  def this(Pattern: String) = this()
  var Pattern: String = js.native
  @JSName("tagName")
  var tagName_PatternValidator: String = js.native
  /* CompleteClass */
  override def isAcceptable(s: String): Boolean = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Boolean = js.native
}

