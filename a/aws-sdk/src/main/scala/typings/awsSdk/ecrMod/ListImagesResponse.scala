package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagesResponse extends StObject {
  
  /**
    * The list of image IDs for the requested repository.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
  
  /**
    * The nextToken value to include in a future ListImages request. When the results of a ListImages request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
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
    def setImageIds(value: ImageIdentifierList): Self = StObject.set(x, "imageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdsUndefined: Self = StObject.set(x, "imageIds", js.undefined)
    
    @scala.inline
    def setImageIdsVarargs(value: ImageIdentifier*): Self = StObject.set(x, "imageIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
