package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReusableDelegationSetLimitRequest extends js.Object {
  
  /**
    * The ID of the delegation set that you want to get the limit for.
    */
  var DelegationSetId: ResourceId = js.native
  
  /**
    * Specify MAX_ZONES_BY_REUSABLE_DELEGATION_SET to get the maximum number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Type: ReusableDelegationSetLimitType = js.native
}
object GetReusableDelegationSetLimitRequest {
  
  @scala.inline
  def apply(DelegationSetId: ResourceId, Type: ReusableDelegationSetLimitType): GetReusableDelegationSetLimitRequest = {
    val __obj = js.Dynamic.literal(DelegationSetId = DelegationSetId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetLimitRequest]
  }
  
  @scala.inline
  implicit class GetReusableDelegationSetLimitRequestOps[Self <: GetReusableDelegationSetLimitRequest] (val x: Self) extends AnyVal {
    
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
    def setDelegationSetId(value: ResourceId): Self = this.set("DelegationSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ReusableDelegationSetLimitType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
