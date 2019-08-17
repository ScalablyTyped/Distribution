package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDataRetrievalPolicyMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDataRetrievalRuleMod._UnmarshalledDataRetrievalRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDataRetrievalPolicy extends _DataRetrievalPolicy {
  /**
    * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
    */
  @JSName("Rules")
  var Rules__UnmarshalledDataRetrievalPolicy: js.UndefOr[js.Array[_UnmarshalledDataRetrievalRule]] = js.undefined
}

object _UnmarshalledDataRetrievalPolicy {
  @scala.inline
  def apply(Rules: js.Array[_UnmarshalledDataRetrievalRule] = null): _UnmarshalledDataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[_UnmarshalledDataRetrievalPolicy]
  }
}

