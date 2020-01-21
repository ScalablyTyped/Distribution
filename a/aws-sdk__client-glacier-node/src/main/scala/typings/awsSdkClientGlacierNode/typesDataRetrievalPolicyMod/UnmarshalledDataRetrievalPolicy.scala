package typings.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod

import typings.awsSdkClientGlacierNode.typesDataRetrievalRuleMod.UnmarshalledDataRetrievalRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledDataRetrievalPolicy extends DataRetrievalPolicy {
  /**
    * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledDataRetrievalPolicy: js.UndefOr[js.Array[UnmarshalledDataRetrievalRule]] = js.undefined
}

object UnmarshalledDataRetrievalPolicy {
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledDataRetrievalRule] = null): UnmarshalledDataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDataRetrievalPolicy]
  }
}

