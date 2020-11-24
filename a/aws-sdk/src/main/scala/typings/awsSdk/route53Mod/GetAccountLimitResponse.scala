package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountLimitResponse extends js.Object {
  
  /**
    * The current number of entities that you have created of the specified type. For example, if you specified MAX_HEALTH_CHECKS_BY_OWNER for the value of Type in the request, the value of Count is the current number of health checks that you have created using the current account.
    */
  var Count: UsageCount = js.native
  
  /**
    * The current setting for the specified limit. For example, if you specified MAX_HEALTH_CHECKS_BY_OWNER for the value of Type in the request, the value of Limit is the maximum number of health checks that you can create using the current account.
    */
  var Limit: AccountLimit = js.native
}
object GetAccountLimitResponse {
  
  @scala.inline
  def apply(Count: UsageCount, Limit: AccountLimit): GetAccountLimitResponse = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Limit = Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountLimitResponse]
  }
  
  @scala.inline
  implicit class GetAccountLimitResponseOps[Self <: GetAccountLimitResponse] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: AccountLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
  }
}
