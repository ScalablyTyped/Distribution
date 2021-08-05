package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypedLinkFacetAttributesResponse extends StObject {
  
  /**
    * An ordered set of attributes associate with the typed link.
    */
  var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
}
object ListTypedLinkFacetAttributesResponse {
  
  inline def apply(): ListTypedLinkFacetAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypedLinkFacetAttributesResponse]
  }
  
  extension [Self <: ListTypedLinkFacetAttributesResponse](x: Self) {
    
    inline def setAttributes(value: TypedLinkAttributeDefinitionList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: TypedLinkAttributeDefinition*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
