package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReusableDelegationSetResponse extends js.Object {
  
  /**
    * A complex type that contains information about the reusable delegation set.
    */
  var DelegationSet: typings.awsSdk.route53Mod.DelegationSet = js.native
}
object GetReusableDelegationSetResponse {
  
  @scala.inline
  def apply(DelegationSet: DelegationSet): GetReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetResponse]
  }
  
  @scala.inline
  implicit class GetReusableDelegationSetResponseOps[Self <: GetReusableDelegationSetResponse] (val x: Self) extends AnyVal {
    
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
    def setDelegationSet(value: DelegationSet): Self = this.set("DelegationSet", value.asInstanceOf[js.Any])
  }
}
