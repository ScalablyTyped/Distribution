package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImagesResponse extends StObject {
  
  /**
    * The list of image semantic versions. 
    */
  var imageVersionList: js.UndefOr[ImageVersionList] = js.native
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object ListImagesResponse {
  
  @scala.inline
  def apply(): ListImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesResponse]
  }
  
  @scala.inline
  implicit class ListImagesResponseMutableBuilder[Self <: ListImagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageVersionList(value: ImageVersionList): Self = StObject.set(x, "imageVersionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionListUndefined: Self = StObject.set(x, "imageVersionList", js.undefined)
    
    @scala.inline
    def setImageVersionListVarargs(value: ImageVersion*): Self = StObject.set(x, "imageVersionList", js.Array(value :_*))
    
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
