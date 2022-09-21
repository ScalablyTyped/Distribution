package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOfferingsResult extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A value that represents the list offering results.
    */
  var offerings: js.UndefOr[Offerings] = js.undefined
}
object ListOfferingsResult {
  
  inline def apply(): ListOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingsResult]
  }
  
  extension [Self <: ListOfferingsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOfferings(value: Offerings): Self = StObject.set(x, "offerings", value.asInstanceOf[js.Any])
    
    inline def setOfferingsUndefined: Self = StObject.set(x, "offerings", js.undefined)
    
    inline def setOfferingsVarargs(value: Offering*): Self = StObject.set(x, "offerings", js.Array(value*))
  }
}
