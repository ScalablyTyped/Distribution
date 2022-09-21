package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventDataStoresResponse extends StObject {
  
  /**
    * Contains information about event data stores in the account, in the current region.
    */
  var EventDataStores: js.UndefOr[typings.awsSdk.cloudtrailMod.EventDataStores] = js.undefined
  
  /**
    * A token you can use to get the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListEventDataStoresResponse {
  
  inline def apply(): ListEventDataStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventDataStoresResponse]
  }
  
  extension [Self <: ListEventDataStoresResponse](x: Self) {
    
    inline def setEventDataStores(value: EventDataStores): Self = StObject.set(x, "EventDataStores", value.asInstanceOf[js.Any])
    
    inline def setEventDataStoresUndefined: Self = StObject.set(x, "EventDataStores", js.undefined)
    
    inline def setEventDataStoresVarargs(value: EventDataStore*): Self = StObject.set(x, "EventDataStores", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
