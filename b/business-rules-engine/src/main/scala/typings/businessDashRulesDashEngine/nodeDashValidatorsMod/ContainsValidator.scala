package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IAsyncPropertyValidator
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "ContainsValidator")
@js.native
class ContainsValidator protected () extends IAsyncPropertyValidator {
  def this(Options: Promise[js.Array[_]]) = this()
  var Options: Promise[js.Array[_]] = js.native
  /* CompleteClass */
  override var isAsync: Boolean = js.native
  @JSName("tagName")
  var tagName_ContainsValidator: String = js.native
  def isAcceptable(s: String): Promise[Boolean] = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Promise[Boolean] = js.native
}

