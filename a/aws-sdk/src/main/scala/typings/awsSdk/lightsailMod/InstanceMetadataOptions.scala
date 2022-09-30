package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMetadataOptions extends StObject {
  
  /**
    * Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled. If the value is disabled, you cannot access your instance metadata.
    */
  var httpEndpoint: js.UndefOr[HttpEndpoint] = js.undefined
  
  /**
    * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
    */
  var httpProtocolIpv6: js.UndefOr[HttpProtocolIpv6] = js.undefined
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance metadata requests can travel farther.
    */
  var httpPutResponseHopLimit: js.UndefOr[integer] = js.undefined
  
  /**
    * The state of token usage for your instance metadata requests. If the state is optional, you can choose whether to retrieve instance metadata with a signed token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the version 2.0 role credentials are returned. If the state is required, you must send a signed token header with all instance metadata retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials. The version 1.0 credentials are not available.  Not all instance blueprints in Lightsail support version 2.0 credentials. Use the MetadataNoToken instance metric to track the number of calls to the instance metadata service that are using version 1.0 credentials. For more information, see Viewing instance metrics in Amazon Lightsail in the Amazon Lightsail Developer Guide. 
    */
  var httpTokens: js.UndefOr[HttpTokens] = js.undefined
  
  /**
    * The state of the metadata option changes. The following states are possible:    pending - The metadata options are being updated. The instance is not yet ready to process metadata traffic with the new selection.    applied - The metadata options have been successfully applied to the instance.  
    */
  var state: js.UndefOr[InstanceMetadataState] = js.undefined
}
object InstanceMetadataOptions {
  
  inline def apply(): InstanceMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMetadataOptions]
  }
  
  extension [Self <: InstanceMetadataOptions](x: Self) {
    
    inline def setHttpEndpoint(value: HttpEndpoint): Self = StObject.set(x, "httpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointUndefined: Self = StObject.set(x, "httpEndpoint", js.undefined)
    
    inline def setHttpProtocolIpv6(value: HttpProtocolIpv6): Self = StObject.set(x, "httpProtocolIpv6", value.asInstanceOf[js.Any])
    
    inline def setHttpProtocolIpv6Undefined: Self = StObject.set(x, "httpProtocolIpv6", js.undefined)
    
    inline def setHttpPutResponseHopLimit(value: integer): Self = StObject.set(x, "httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    inline def setHttpPutResponseHopLimitUndefined: Self = StObject.set(x, "httpPutResponseHopLimit", js.undefined)
    
    inline def setHttpTokens(value: HttpTokens): Self = StObject.set(x, "httpTokens", value.asInstanceOf[js.Any])
    
    inline def setHttpTokensUndefined: Self = StObject.set(x, "httpTokens", js.undefined)
    
    inline def setState(value: InstanceMetadataState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
