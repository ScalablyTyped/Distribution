package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRetrievalPolicy extends js.Object {
  /**
    * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.
    */
  var Rules: js.UndefOr[DataRetrievalRulesList] = js.native
}

object DataRetrievalPolicy {
  @scala.inline
  def apply(Rules: DataRetrievalRulesList = null): DataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRetrievalPolicy]
  }
}

