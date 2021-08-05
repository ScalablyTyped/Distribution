package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicesRequest extends StObject {
  
  /**
    * One or more device IDs. The maximum is 10.
    */
  var DeviceIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.undefined
}
object GetDevicesRequest {
  
  inline def apply(GlobalNetworkId: String): GetDevicesRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesRequest]
  }
  
  extension [Self <: GetDevicesRequest](x: Self) {
    
    inline def setDeviceIds(value: StringList): Self = StObject.set(x, "DeviceIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdsUndefined: Self = StObject.set(x, "DeviceIds", js.undefined)
    
    inline def setDeviceIdsVarargs(value: String*): Self = StObject.set(x, "DeviceIds", js.Array(value :_*))
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSiteId(value: String): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
  }
}
