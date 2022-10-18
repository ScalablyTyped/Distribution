package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainInfos extends StObject {
  
  /**
    * A list of DomainInfo structures.
    */
  var domainInfos: DomainInfoList
  
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
}
object DomainInfos {
  
  inline def apply(domainInfos: DomainInfoList): DomainInfos = {
    val __obj = js.Dynamic.literal(domainInfos = domainInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInfos]
  }
  
  extension [Self <: DomainInfos](x: Self) {
    
    inline def setDomainInfos(value: DomainInfoList): Self = StObject.set(x, "domainInfos", value.asInstanceOf[js.Any])
    
    inline def setDomainInfosVarargs(value: DomainInfo*): Self = StObject.set(x, "domainInfos", js.Array(value*))
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
