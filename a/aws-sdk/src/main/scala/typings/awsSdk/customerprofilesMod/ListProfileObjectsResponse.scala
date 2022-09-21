package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileObjectsResponse extends StObject {
  
  /**
    * The list of ListProfileObject instances.
    */
  var Items: js.UndefOr[ProfileObjectList] = js.undefined
  
  /**
    * The pagination token from the previous call to ListProfileObjects.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListProfileObjectsResponse {
  
  inline def apply(): ListProfileObjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfileObjectsResponse]
  }
  
  extension [Self <: ListProfileObjectsResponse](x: Self) {
    
    inline def setItems(value: ProfileObjectList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ListProfileObjectsItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
