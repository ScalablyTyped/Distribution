package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTransitGatewayMulticastGroupMembersResult extends js.Object {
  
  /**
    * Information about the registered transit gateway multicast group members.
    */
  var RegisteredMulticastGroupMembers: js.UndefOr[TransitGatewayMulticastRegisteredGroupMembers] = js.native
}
object RegisterTransitGatewayMulticastGroupMembersResult {
  
  @scala.inline
  def apply(): RegisterTransitGatewayMulticastGroupMembersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupMembersResult]
  }
  
  @scala.inline
  implicit class RegisterTransitGatewayMulticastGroupMembersResultOps[Self <: RegisterTransitGatewayMulticastGroupMembersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegisteredMulticastGroupMembers(value: TransitGatewayMulticastRegisteredGroupMembers): Self = this.set("RegisteredMulticastGroupMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredMulticastGroupMembers: Self = this.set("RegisteredMulticastGroupMembers", js.undefined)
  }
}
