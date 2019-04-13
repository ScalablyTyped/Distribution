package typings
package businessDashRulesDashEngineLib.nodeDashValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "ContainsValidator")
@js.native
class ContainsValidator protected ()
  extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.IAsyncPropertyValidator {
  def this(Options: qLib.qMod.Promise[js.Array[_]]) = this()
  var Options: qLib.qMod.Promise[js.Array[_]] = js.native
  /* CompleteClass */
  override var isAsync: scala.Boolean = js.native
  @JSName("tagName")
  var tagName_ContainsValidator: java.lang.String = js.native
  def isAcceptable(s: java.lang.String): qLib.qMod.Promise[scala.Boolean] = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): qLib.qMod.Promise[scala.Boolean] = js.native
}

