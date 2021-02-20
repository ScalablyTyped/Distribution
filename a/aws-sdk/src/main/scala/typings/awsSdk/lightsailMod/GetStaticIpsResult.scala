package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStaticIpsResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetStaticIps request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * An array of key-value pairs containing information about your get static IPs request.
    */
  var staticIps: js.UndefOr[StaticIpList] = js.native
}
object GetStaticIpsResult {
  
  @scala.inline
  def apply(): GetStaticIpsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStaticIpsResult]
  }
  
  @scala.inline
  implicit class GetStaticIpsResultMutableBuilder[Self <: GetStaticIpsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setStaticIps(value: StaticIpList): Self = StObject.set(x, "staticIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticIpsUndefined: Self = StObject.set(x, "staticIps", js.undefined)
    
    @scala.inline
    def setStaticIpsVarargs(value: StaticIp*): Self = StObject.set(x, "staticIps", js.Array(value :_*))
  }
}
