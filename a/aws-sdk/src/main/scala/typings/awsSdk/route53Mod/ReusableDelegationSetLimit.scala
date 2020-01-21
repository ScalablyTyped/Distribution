package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReusableDelegationSetLimit extends js.Object {
  /**
    * The limit that you requested: MAX_ZONES_BY_REUSABLE_DELEGATION_SET, the maximum number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Type: ReusableDelegationSetLimitType = js.native
  /**
    * The current value for the MAX_ZONES_BY_REUSABLE_DELEGATION_SET limit.
    */
  var Value: LimitValue = js.native
}

object ReusableDelegationSetLimit {
  @scala.inline
  def apply(Type: ReusableDelegationSetLimitType, Value: LimitValue): ReusableDelegationSetLimit = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReusableDelegationSetLimit]
  }
}

