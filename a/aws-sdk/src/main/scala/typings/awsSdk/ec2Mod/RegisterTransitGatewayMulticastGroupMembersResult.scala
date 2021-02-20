package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTransitGatewayMulticastGroupMembersResult extends StObject {
  
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
  implicit class RegisterTransitGatewayMulticastGroupMembersResultMutableBuilder[Self <: RegisterTransitGatewayMulticastGroupMembersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisteredMulticastGroupMembers(value: TransitGatewayMulticastRegisteredGroupMembers): Self = StObject.set(x, "RegisteredMulticastGroupMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredMulticastGroupMembersUndefined: Self = StObject.set(x, "RegisteredMulticastGroupMembers", js.undefined)
  }
}
