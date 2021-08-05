package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkAssociation extends StObject {
  
  /**
    * The device ID for the link association.
    */
  var DeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the association.
    */
  var LinkAssociationState: js.UndefOr[typings.awsSdk.networkmanagerMod.LinkAssociationState] = js.undefined
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.undefined
}
object LinkAssociation {
  
  inline def apply(): LinkAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAssociation]
  }
  
  extension [Self <: LinkAssociation](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setLinkAssociationState(value: LinkAssociationState): Self = StObject.set(x, "LinkAssociationState", value.asInstanceOf[js.Any])
    
    inline def setLinkAssociationStateUndefined: Self = StObject.set(x, "LinkAssociationState", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
  }
}
