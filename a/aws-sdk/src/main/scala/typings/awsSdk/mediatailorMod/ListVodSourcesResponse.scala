package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVodSourcesResponse extends StObject {
  
  /**
    * Lists the VOD sources.
    */
  var Items: js.UndefOr[listOfVodSource] = js.undefined
  
  /**
    * Pagination token from the list request. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListVodSourcesResponse {
  
  inline def apply(): ListVodSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVodSourcesResponse]
  }
  
  extension [Self <: ListVodSourcesResponse](x: Self) {
    
    inline def setItems(value: listOfVodSource): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: VodSource*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
