package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWirelessGatewayRequest extends StObject {
  
  /**
    * A new description of the resource.
    */
  var Description: js.UndefOr[typings.awsSdk.iotwirelessMod.Description] = js.undefined
  
  /**
    * The ID of the resource to update.
    */
  var Id: WirelessGatewayId
  
  var JoinEuiFilters: js.UndefOr[typings.awsSdk.iotwirelessMod.JoinEuiFilters] = js.undefined
  
  /**
    * The new name of the resource.
    */
  var Name: js.UndefOr[WirelessGatewayName] = js.undefined
  
  var NetIdFilters: js.UndefOr[typings.awsSdk.iotwirelessMod.NetIdFilters] = js.undefined
}
object UpdateWirelessGatewayRequest {
  
  inline def apply(Id: WirelessGatewayId): UpdateWirelessGatewayRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWirelessGatewayRequest]
  }
  
  extension [Self <: UpdateWirelessGatewayRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setJoinEuiFilters(value: JoinEuiFilters): Self = StObject.set(x, "JoinEuiFilters", value.asInstanceOf[js.Any])
    
    inline def setJoinEuiFiltersUndefined: Self = StObject.set(x, "JoinEuiFilters", js.undefined)
    
    inline def setJoinEuiFiltersVarargs(value: JoinEuiRange*): Self = StObject.set(x, "JoinEuiFilters", js.Array(value*))
    
    inline def setName(value: WirelessGatewayName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNetIdFilters(value: NetIdFilters): Self = StObject.set(x, "NetIdFilters", value.asInstanceOf[js.Any])
    
    inline def setNetIdFiltersUndefined: Self = StObject.set(x, "NetIdFilters", js.undefined)
    
    inline def setNetIdFiltersVarargs(value: NetId*): Self = StObject.set(x, "NetIdFilters", js.Array(value*))
  }
}
