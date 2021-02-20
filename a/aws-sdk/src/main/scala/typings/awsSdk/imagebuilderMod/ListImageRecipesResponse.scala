package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImageRecipesResponse extends StObject {
  
  /**
    * The list of image pipelines. 
    */
  var imageRecipeSummaryList: js.UndefOr[ImageRecipeSummaryList] = js.native
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object ListImageRecipesResponse {
  
  @scala.inline
  def apply(): ListImageRecipesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageRecipesResponse]
  }
  
  @scala.inline
  implicit class ListImageRecipesResponseMutableBuilder[Self <: ListImageRecipesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageRecipeSummaryList(value: ImageRecipeSummaryList): Self = StObject.set(x, "imageRecipeSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRecipeSummaryListUndefined: Self = StObject.set(x, "imageRecipeSummaryList", js.undefined)
    
    @scala.inline
    def setImageRecipeSummaryListVarargs(value: ImageRecipeSummary*): Self = StObject.set(x, "imageRecipeSummaryList", js.Array(value :_*))
    
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
