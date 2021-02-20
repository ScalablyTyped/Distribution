package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypedLinkFacetNamesResponse extends StObject {
  
  /**
    * The names of typed link facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[TypedLinkNameList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object ListTypedLinkFacetNamesResponse {
  
  @scala.inline
  def apply(): ListTypedLinkFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypedLinkFacetNamesResponse]
  }
  
  @scala.inline
  implicit class ListTypedLinkFacetNamesResponseMutableBuilder[Self <: ListTypedLinkFacetNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetNames(value: TypedLinkNameList): Self = StObject.set(x, "FacetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetNamesUndefined: Self = StObject.set(x, "FacetNames", js.undefined)
    
    @scala.inline
    def setFacetNamesVarargs(value: TypedLinkName*): Self = StObject.set(x, "FacetNames", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
