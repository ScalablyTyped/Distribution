package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNetworkAnalyzerConfigurationRequest extends StObject {
  
  var ConfigurationName: NetworkAnalyzerConfigurationName
  
  var Description: js.UndefOr[typings.awsSdk.iotwirelessMod.Description] = js.undefined
  
  var TraceContent: js.UndefOr[typings.awsSdk.iotwirelessMod.TraceContent] = js.undefined
  
  /**
    * Wireless device resources to add to the network analyzer configuration. Provide the WirelessDeviceId of the resource to add in the input array.
    */
  var WirelessDevicesToAdd: js.UndefOr[WirelessDeviceList] = js.undefined
  
  /**
    * Wireless device resources to remove from the network analyzer configuration. Provide the WirelessDeviceId of the resources to remove in the input array.
    */
  var WirelessDevicesToRemove: js.UndefOr[WirelessDeviceList] = js.undefined
  
  /**
    * Wireless gateway resources to add to the network analyzer configuration. Provide the WirelessGatewayId of the resource to add in the input array.
    */
  var WirelessGatewaysToAdd: js.UndefOr[WirelessGatewayList] = js.undefined
  
  /**
    * Wireless gateway resources to remove from the network analyzer configuration. Provide the WirelessGatewayId of the resources to remove in the input array.
    */
  var WirelessGatewaysToRemove: js.UndefOr[WirelessGatewayList] = js.undefined
}
object UpdateNetworkAnalyzerConfigurationRequest {
  
  inline def apply(ConfigurationName: NetworkAnalyzerConfigurationName): UpdateNetworkAnalyzerConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkAnalyzerConfigurationRequest]
  }
  
  extension [Self <: UpdateNetworkAnalyzerConfigurationRequest](x: Self) {
    
    inline def setConfigurationName(value: NetworkAnalyzerConfigurationName): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setTraceContent(value: TraceContent): Self = StObject.set(x, "TraceContent", value.asInstanceOf[js.Any])
    
    inline def setTraceContentUndefined: Self = StObject.set(x, "TraceContent", js.undefined)
    
    inline def setWirelessDevicesToAdd(value: WirelessDeviceList): Self = StObject.set(x, "WirelessDevicesToAdd", value.asInstanceOf[js.Any])
    
    inline def setWirelessDevicesToAddUndefined: Self = StObject.set(x, "WirelessDevicesToAdd", js.undefined)
    
    inline def setWirelessDevicesToAddVarargs(value: WirelessDeviceId*): Self = StObject.set(x, "WirelessDevicesToAdd", js.Array(value*))
    
    inline def setWirelessDevicesToRemove(value: WirelessDeviceList): Self = StObject.set(x, "WirelessDevicesToRemove", value.asInstanceOf[js.Any])
    
    inline def setWirelessDevicesToRemoveUndefined: Self = StObject.set(x, "WirelessDevicesToRemove", js.undefined)
    
    inline def setWirelessDevicesToRemoveVarargs(value: WirelessDeviceId*): Self = StObject.set(x, "WirelessDevicesToRemove", js.Array(value*))
    
    inline def setWirelessGatewaysToAdd(value: WirelessGatewayList): Self = StObject.set(x, "WirelessGatewaysToAdd", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewaysToAddUndefined: Self = StObject.set(x, "WirelessGatewaysToAdd", js.undefined)
    
    inline def setWirelessGatewaysToAddVarargs(value: WirelessGatewayId*): Self = StObject.set(x, "WirelessGatewaysToAdd", js.Array(value*))
    
    inline def setWirelessGatewaysToRemove(value: WirelessGatewayList): Self = StObject.set(x, "WirelessGatewaysToRemove", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewaysToRemoveUndefined: Self = StObject.set(x, "WirelessGatewaysToRemove", js.undefined)
    
    inline def setWirelessGatewaysToRemoveVarargs(value: WirelessGatewayId*): Self = StObject.set(x, "WirelessGatewaysToRemove", js.Array(value*))
  }
}
