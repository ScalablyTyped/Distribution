package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFacetNamesResponse extends StObject {
  
  /**
    * The names of facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[FacetNameList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
}
object ListFacetNamesResponse {
  
  @scala.inline
  def apply(): ListFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFacetNamesResponse]
  }
  
  @scala.inline
  implicit class ListFacetNamesResponseMutableBuilder[Self <: ListFacetNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetNames(value: FacetNameList): Self = StObject.set(x, "FacetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetNamesUndefined: Self = StObject.set(x, "FacetNames", js.undefined)
    
    @scala.inline
    def setFacetNamesVarargs(value: FacetName*): Self = StObject.set(x, "FacetNames", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
