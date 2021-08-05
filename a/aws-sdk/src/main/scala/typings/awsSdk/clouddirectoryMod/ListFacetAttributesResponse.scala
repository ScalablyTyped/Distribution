package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFacetAttributesResponse extends StObject {
  
  /**
    * The attributes attached to the facet.
    */
  var Attributes: js.UndefOr[FacetAttributeList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
}
object ListFacetAttributesResponse {
  
  inline def apply(): ListFacetAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFacetAttributesResponse]
  }
  
  extension [Self <: ListFacetAttributesResponse](x: Self) {
    
    inline def setAttributes(value: FacetAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: FacetAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
