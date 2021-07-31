package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedAttributeGroupsRequest extends StObject {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier
  
  /**
    * The upper bound of the number of results to return (cannot exceed 25). If this parameter is omitted, it defaults to 25. This value is optional.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to use to get the next page of results after a previous API call. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssociatedAttributeGroupsRequest {
  
  @scala.inline
  def apply(application: ApplicationSpecifier): ListAssociatedAttributeGroupsRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedAttributeGroupsRequest]
  }
  
  @scala.inline
  implicit class ListAssociatedAttributeGroupsRequestMutableBuilder[Self <: ListAssociatedAttributeGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
