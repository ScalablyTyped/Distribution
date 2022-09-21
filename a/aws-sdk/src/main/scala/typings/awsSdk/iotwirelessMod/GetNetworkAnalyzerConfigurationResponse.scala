package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkAnalyzerConfigurationResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the new resource.
    */
  var Arn: js.UndefOr[NetworkAnalyzerConfigurationArn] = js.undefined
  
  var Description: js.UndefOr[typings.awsSdk.iotwirelessMod.Description] = js.undefined
  
  var Name: js.UndefOr[NetworkAnalyzerConfigurationName] = js.undefined
  
  var TraceContent: js.UndefOr[typings.awsSdk.iotwirelessMod.TraceContent] = js.undefined
  
  /**
    * List of wireless gateway resources that have been added to the network analyzer configuration.
    */
  var WirelessDevices: js.UndefOr[WirelessDeviceList] = js.undefined
  
  /**
    * List of wireless gateway resources that have been added to the network analyzer configuration.
    */
  var WirelessGateways: js.UndefOr[WirelessGatewayList] = js.undefined
}
object GetNetworkAnalyzerConfigurationResponse {
  
  inline def apply(): GetNetworkAnalyzerConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkAnalyzerConfigurationResponse]
  }
  
  extension [Self <: GetNetworkAnalyzerConfigurationResponse](x: Self) {
    
    inline def setArn(value: NetworkAnalyzerConfigurationArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NetworkAnalyzerConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTraceContent(value: TraceContent): Self = StObject.set(x, "TraceContent", value.asInstanceOf[js.Any])
    
    inline def setTraceContentUndefined: Self = StObject.set(x, "TraceContent", js.undefined)
    
    inline def setWirelessDevices(value: WirelessDeviceList): Self = StObject.set(x, "WirelessDevices", value.asInstanceOf[js.Any])
    
    inline def setWirelessDevicesUndefined: Self = StObject.set(x, "WirelessDevices", js.undefined)
    
    inline def setWirelessDevicesVarargs(value: WirelessDeviceId*): Self = StObject.set(x, "WirelessDevices", js.Array(value*))
    
    inline def setWirelessGateways(value: WirelessGatewayList): Self = StObject.set(x, "WirelessGateways", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewaysUndefined: Self = StObject.set(x, "WirelessGateways", js.undefined)
    
    inline def setWirelessGatewaysVarargs(value: WirelessGatewayId*): Self = StObject.set(x, "WirelessGateways", js.Array(value*))
  }
}
