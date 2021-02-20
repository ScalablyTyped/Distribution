package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFacetAttributesResponse extends StObject {
  
  /**
    * The attributes attached to the facet.
    */
  var Attributes: js.UndefOr[FacetAttributeList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object ListFacetAttributesResponse {
  
  @scala.inline
  def apply(): ListFacetAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFacetAttributesResponse]
  }
  
  @scala.inline
  implicit class ListFacetAttributesResponseMutableBuilder[Self <: ListFacetAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: FacetAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: FacetAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
