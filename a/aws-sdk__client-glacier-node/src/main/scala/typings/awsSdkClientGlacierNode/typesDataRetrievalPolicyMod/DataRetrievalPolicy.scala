package typings.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod

import typings.awsSdkClientGlacierNode.typesDataRetrievalRuleMod.DataRetrievalRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRetrievalPolicy extends js.Object {
  /**
    * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
    */
  var Rules: js.UndefOr[js.Array[DataRetrievalRule] | Iterable[DataRetrievalRule]] = js.undefined
}

object DataRetrievalPolicy {
  @scala.inline
  def apply(Rules: js.Array[DataRetrievalRule] | Iterable[DataRetrievalRule] = null): DataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRetrievalPolicy]
  }
}

