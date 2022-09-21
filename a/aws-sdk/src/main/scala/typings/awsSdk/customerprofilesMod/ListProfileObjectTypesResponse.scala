package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileObjectTypesResponse extends StObject {
  
  /**
    * The list of ListProfileObjectTypes instances.
    */
  var Items: js.UndefOr[ProfileObjectTypeList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListProfileObjectTypesResponse {
  
  inline def apply(): ListProfileObjectTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfileObjectTypesResponse]
  }
  
  extension [Self <: ListProfileObjectTypesResponse](x: Self) {
    
    inline def setItems(value: ProfileObjectTypeList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ListProfileObjectTypeItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
