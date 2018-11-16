package typings
package businessDashRulesDashEngineLib.nodeDashValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "MinLengthValidator")
@js.native
class MinLengthValidator ()
  extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.IStringValidator {
  def this(MinLength: scala.Double) = this()
  var MinLength: scala.Double = js.native
  @JSName("tagName")
  var tagName_MinLengthValidator: java.lang.String = js.native
  /* CompleteClass */
  override def isAcceptable(s: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): scala.Boolean = js.native
}

