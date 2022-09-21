package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttributeGroupsForApplicationResponse extends StObject {
  
  /**
    *  The details related to a specific AttributeGroup. 
    */
  var attributeGroupsDetails: js.UndefOr[AttributeGroupDetailsList] = js.undefined
  
  /**
    * The token to use to get the next page of results after a previous API call.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAttributeGroupsForApplicationResponse {
  
  inline def apply(): ListAttributeGroupsForApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttributeGroupsForApplicationResponse]
  }
  
  extension [Self <: ListAttributeGroupsForApplicationResponse](x: Self) {
    
    inline def setAttributeGroupsDetails(value: AttributeGroupDetailsList): Self = StObject.set(x, "attributeGroupsDetails", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroupsDetailsUndefined: Self = StObject.set(x, "attributeGroupsDetails", js.undefined)
    
    inline def setAttributeGroupsDetailsVarargs(value: AttributeGroupDetails*): Self = StObject.set(x, "attributeGroupsDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
