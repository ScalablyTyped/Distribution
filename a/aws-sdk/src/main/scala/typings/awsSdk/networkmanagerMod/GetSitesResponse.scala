package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSitesResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.networkmanagerMod.NextToken] = js.undefined
  
  /**
    * The sites.
    */
  var Sites: js.UndefOr[SiteList] = js.undefined
}
object GetSitesResponse {
  
  inline def apply(): GetSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSitesResponse]
  }
  
  extension [Self <: GetSitesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSites(value: SiteList): Self = StObject.set(x, "Sites", value.asInstanceOf[js.Any])
    
    inline def setSitesUndefined: Self = StObject.set(x, "Sites", js.undefined)
    
    inline def setSitesVarargs(value: Site*): Self = StObject.set(x, "Sites", js.Array(value*))
  }
}
