package typings
package businessDashRulesDashEngineLib.nodeDashValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "PatternValidator")
@js.native
class PatternValidator ()
  extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.IStringValidator {
  def this(Pattern: java.lang.String) = this()
  var Pattern: java.lang.String = js.native
  @JSName("tagName")
  var tagName_PatternValidator: java.lang.String = js.native
  /* CompleteClass */
  override def isAcceptable(s: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): scala.Boolean = js.native
}

