package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypedLinkFacetAttributesResponse extends StObject {
  
  /**
    * An ordered set of attributes associate with the typed link.
    */
  var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object ListTypedLinkFacetAttributesResponse {
  
  @scala.inline
  def apply(): ListTypedLinkFacetAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypedLinkFacetAttributesResponse]
  }
  
  @scala.inline
  implicit class ListTypedLinkFacetAttributesResponseMutableBuilder[Self <: ListTypedLinkFacetAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: TypedLinkAttributeDefinitionList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: TypedLinkAttributeDefinition*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
