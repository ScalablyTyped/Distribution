package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReusableDelegationSetLimitResponse extends js.Object {
  /**
    * The current number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Count: UsageCount = js.native
  /**
    * The current setting for the limit on hosted zones that you can associate with the specified reusable delegation set.
    */
  var Limit: ReusableDelegationSetLimit = js.native
}

object GetReusableDelegationSetLimitResponse {
  @scala.inline
  def apply(Count: UsageCount, Limit: ReusableDelegationSetLimit): GetReusableDelegationSetLimitResponse = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Limit = Limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetReusableDelegationSetLimitResponse]
  }
}

