package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantFlowEntitlementsResponse extends js.Object {
  
  /**
    * The entitlements that were just granted.
    */
  var Entitlements: js.UndefOr[listOfEntitlement] = js.native
  
  /**
    * The ARN of the flow that these entitlements were granted to.
    */
  var FlowArn: js.UndefOr[string] = js.native
}
object GrantFlowEntitlementsResponse {
  
  @scala.inline
  def apply(): GrantFlowEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantFlowEntitlementsResponse]
  }
  
  @scala.inline
  implicit class GrantFlowEntitlementsResponseOps[Self <: GrantFlowEntitlementsResponse] (val x: Self) extends AnyVal {
    
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
    def setEntitlementsVarargs(value: Entitlement*): Self = this.set("Entitlements", js.Array(value :_*))
    
    @scala.inline
    def setEntitlements(value: listOfEntitlement): Self = this.set("Entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntitlements: Self = this.set("Entitlements", js.undefined)
    
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowArn: Self = this.set("FlowArn", js.undefined)
  }
}
