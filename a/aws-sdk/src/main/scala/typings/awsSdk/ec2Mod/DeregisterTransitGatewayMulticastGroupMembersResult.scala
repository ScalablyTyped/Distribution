package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTransitGatewayMulticastGroupMembersResult extends StObject {
  
  /**
    * Information about the deregistered members.
    */
  var DeregisteredMulticastGroupMembers: js.UndefOr[TransitGatewayMulticastDeregisteredGroupMembers] = js.undefined
}
object DeregisterTransitGatewayMulticastGroupMembersResult {
  
  inline def apply(): DeregisterTransitGatewayMulticastGroupMembersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayMulticastGroupMembersResult]
  }
  
  extension [Self <: DeregisterTransitGatewayMulticastGroupMembersResult](x: Self) {
    
    inline def setDeregisteredMulticastGroupMembers(value: TransitGatewayMulticastDeregisteredGroupMembers): Self = StObject.set(x, "DeregisteredMulticastGroupMembers", value.asInstanceOf[js.Any])
    
    inline def setDeregisteredMulticastGroupMembersUndefined: Self = StObject.set(x, "DeregisteredMulticastGroupMembers", js.undefined)
  }
}
