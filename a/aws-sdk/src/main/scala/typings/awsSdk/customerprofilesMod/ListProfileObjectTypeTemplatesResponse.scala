package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileObjectTypeTemplatesResponse extends StObject {
  
  /**
    * The list of ListProfileObjectType template instances.
    */
  var Items: js.UndefOr[ProfileObjectTypeTemplateList] = js.undefined
  
  /**
    * The pagination token from the previous ListObjectTypeTemplates API call. 
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListProfileObjectTypeTemplatesResponse {
  
  inline def apply(): ListProfileObjectTypeTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfileObjectTypeTemplatesResponse]
  }
  
  extension [Self <: ListProfileObjectTypeTemplatesResponse](x: Self) {
    
    inline def setItems(value: ProfileObjectTypeTemplateList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ListProfileObjectTypeTemplateItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
