package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageBuildVersionsResponse extends StObject {
  
  /**
    * The list of image build versions. 
    */
  var imageSummaryList: js.UndefOr[ImageSummaryList] = js.undefined
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListImageBuildVersionsResponse {
  
  inline def apply(): ListImageBuildVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageBuildVersionsResponse]
  }
  
  extension [Self <: ListImageBuildVersionsResponse](x: Self) {
    
    inline def setImageSummaryList(value: ImageSummaryList): Self = StObject.set(x, "imageSummaryList", value.asInstanceOf[js.Any])
    
    inline def setImageSummaryListUndefined: Self = StObject.set(x, "imageSummaryList", js.undefined)
    
    inline def setImageSummaryListVarargs(value: ImageSummary*): Self = StObject.set(x, "imageSummaryList", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
