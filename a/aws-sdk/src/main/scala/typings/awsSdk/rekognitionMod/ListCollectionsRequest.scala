package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCollectionsRequest extends StObject {
  
  /**
    * Maximum number of collection IDs to return. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * Pagination token from the previous response.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListCollectionsRequest {
  
  @scala.inline
  def apply(): ListCollectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsRequest]
  }
  
  @scala.inline
  implicit class ListCollectionsRequestMutableBuilder[Self <: ListCollectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
