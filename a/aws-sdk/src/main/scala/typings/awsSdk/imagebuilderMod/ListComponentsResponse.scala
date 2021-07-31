package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsResponse extends StObject {
  
  /**
    * The list of component semantic versions. 
    */
  var componentVersionList: js.UndefOr[ComponentVersionList] = js.undefined
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListComponentsResponse {
  
  @scala.inline
  def apply(): ListComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsResponse]
  }
  
  @scala.inline
  implicit class ListComponentsResponseMutableBuilder[Self <: ListComponentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentVersionList(value: ComponentVersionList): Self = StObject.set(x, "componentVersionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentVersionListUndefined: Self = StObject.set(x, "componentVersionList", js.undefined)
    
    @scala.inline
    def setComponentVersionListVarargs(value: ComponentVersion*): Self = StObject.set(x, "componentVersionList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
