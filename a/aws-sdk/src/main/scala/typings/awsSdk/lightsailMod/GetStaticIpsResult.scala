package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStaticIpsResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetStaticIps request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of key-value pairs containing information about your get static IPs request.
    */
  var staticIps: js.UndefOr[StaticIpList] = js.undefined
}
object GetStaticIpsResult {
  
  inline def apply(): GetStaticIpsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStaticIpsResult]
  }
  
  extension [Self <: GetStaticIpsResult](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStaticIps(value: StaticIpList): Self = StObject.set(x, "staticIps", value.asInstanceOf[js.Any])
    
    inline def setStaticIpsUndefined: Self = StObject.set(x, "staticIps", js.undefined)
    
    inline def setStaticIpsVarargs(value: StaticIp*): Self = StObject.set(x, "staticIps", js.Array(value :_*))
  }
}
