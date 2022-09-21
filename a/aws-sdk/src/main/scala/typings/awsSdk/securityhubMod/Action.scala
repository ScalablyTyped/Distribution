package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * The type of action that was detected. The possible action types are:    NETWORK_CONNECTION     AWS_API_CALL     DNS_REQUEST     PORT_PROBE   
    */
  var ActionType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Included if ActionType is AWS_API_CALL. Provides details about the API call that was detected. 
    */
  var AwsApiCallAction: js.UndefOr[typings.awsSdk.securityhubMod.AwsApiCallAction] = js.undefined
  
  /**
    * Included if ActionType is DNS_REQUEST. Provides details about the DNS request that was detected. 
    */
  var DnsRequestAction: js.UndefOr[typings.awsSdk.securityhubMod.DnsRequestAction] = js.undefined
  
  /**
    * Included if ActionType is NETWORK_CONNECTION. Provides details about the network connection that was detected.
    */
  var NetworkConnectionAction: js.UndefOr[typings.awsSdk.securityhubMod.NetworkConnectionAction] = js.undefined
  
  /**
    * Included if ActionType is PORT_PROBE. Provides details about the port probe that was detected. 
    */
  var PortProbeAction: js.UndefOr[typings.awsSdk.securityhubMod.PortProbeAction] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setActionType(value: NonEmptyString): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setAwsApiCallAction(value: AwsApiCallAction): Self = StObject.set(x, "AwsApiCallAction", value.asInstanceOf[js.Any])
    
    inline def setAwsApiCallActionUndefined: Self = StObject.set(x, "AwsApiCallAction", js.undefined)
    
    inline def setDnsRequestAction(value: DnsRequestAction): Self = StObject.set(x, "DnsRequestAction", value.asInstanceOf[js.Any])
    
    inline def setDnsRequestActionUndefined: Self = StObject.set(x, "DnsRequestAction", js.undefined)
    
    inline def setNetworkConnectionAction(value: NetworkConnectionAction): Self = StObject.set(x, "NetworkConnectionAction", value.asInstanceOf[js.Any])
    
    inline def setNetworkConnectionActionUndefined: Self = StObject.set(x, "NetworkConnectionAction", js.undefined)
    
    inline def setPortProbeAction(value: PortProbeAction): Self = StObject.set(x, "PortProbeAction", value.asInstanceOf[js.Any])
    
    inline def setPortProbeActionUndefined: Self = StObject.set(x, "PortProbeAction", js.undefined)
  }
}
