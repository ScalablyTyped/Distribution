package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLimit extends js.Object {
  /**
    * The limit that you requested. Valid values include the following:    MAX_HEALTH_CHECKS_BY_OWNER: The maximum number of health checks that you can create using the current account.    MAX_HOSTED_ZONES_BY_OWNER: The maximum number of hosted zones that you can create using the current account.    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER: The maximum number of reusable delegation sets that you can create using the current account.    MAX_TRAFFIC_POLICIES_BY_OWNER: The maximum number of traffic policies that you can create using the current account.    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER: The maximum number of traffic policy instances that you can create using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon Route 53 console.)  
    */
  var Type: AccountLimitType = js.native
  /**
    * The current value for the limit that is specified by Type.
    */
  var Value: LimitValue = js.native
}

object AccountLimit {
  @scala.inline
  def apply(Type: AccountLimitType, Value: LimitValue): AccountLimit = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLimit]
  }
  @scala.inline
  implicit class AccountLimitOps[Self <: AccountLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: AccountLimitType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: LimitValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

