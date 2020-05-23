package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResolverRulePolicyResponse extends js.Object {
  /**
    * Whether the PutResolverRulePolicy request was successful.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}

object PutResolverRulePolicyResponse {
  @scala.inline
  def apply(ReturnValue: js.UndefOr[Boolean] = js.undefined): PutResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReturnValue)) __obj.updateDynamic("ReturnValue")(ReturnValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResolverRulePolicyResponse]
  }
}

