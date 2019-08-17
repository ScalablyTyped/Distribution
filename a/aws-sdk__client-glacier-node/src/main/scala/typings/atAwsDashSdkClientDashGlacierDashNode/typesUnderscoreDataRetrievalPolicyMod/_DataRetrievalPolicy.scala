package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDataRetrievalPolicyMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDataRetrievalRuleMod._DataRetrievalRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DataRetrievalPolicy extends js.Object {
  /**
    * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
    */
  var Rules: js.UndefOr[js.Array[_DataRetrievalRule] | Iterable[_DataRetrievalRule]] = js.undefined
}

object _DataRetrievalPolicy {
  @scala.inline
  def apply(Rules: js.Array[_DataRetrievalRule] | Iterable[_DataRetrievalRule] = null): _DataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DataRetrievalPolicy]
  }
}

