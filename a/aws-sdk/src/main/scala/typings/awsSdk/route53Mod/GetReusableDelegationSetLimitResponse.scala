package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class GetReusableDelegationSetLimitResponseOps[Self <: GetReusableDelegationSetLimitResponse] (val x: Self) extends AnyVal {
    
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
    def setCount(value: UsageCount): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: ReusableDelegationSetLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
  }
}
