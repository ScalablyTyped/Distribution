package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageVersionsRequest extends StObject {
  
  /**
    * A filter that returns only versions created on or after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only versions created on or before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the image to list the versions of.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName
  
  /**
    * A filter that returns only versions modified on or after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only versions modified on or before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum number of versions to return in the response. The default value is 10. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the previous call to ListImageVersions didn't return the full set of versions, the call returns a token for getting the next set of versions.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The property used to sort results. The default value is CREATION_TIME.
    */
  var SortBy: js.UndefOr[ImageVersionSortBy] = js.undefined
  
  /**
    * The sort order. The default value is DESCENDING.
    */
  var SortOrder: js.UndefOr[ImageVersionSortOrder] = js.undefined
}
object ListImageVersionsRequest {
  
  @scala.inline
  def apply(ImageName: ImageName): ListImageVersionsRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImageVersionsRequest]
  }
  
  @scala.inline
  implicit class ListImageVersionsRequestMutableBuilder[Self <: ListImageVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: Timestamp): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeAfter(value: Timestamp): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeBefore(value: Timestamp): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: ImageVersionSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: ImageVersionSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
