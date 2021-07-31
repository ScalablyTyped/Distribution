package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedResourcesResponse extends StObject {
  
  /**
    * The token to use to get the next page of results after a previous API call. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Information about the resources.
    */
  var resources: js.UndefOr[Resources] = js.undefined
}
object ListAssociatedResourcesResponse {
  
  @scala.inline
  def apply(): ListAssociatedResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedResourcesResponse]
  }
  
  @scala.inline
  implicit class ListAssociatedResourcesResponseMutableBuilder[Self <: ListAssociatedResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ResourceInfo*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
