package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentModerationRequest extends StObject {
  
  /**
    * The identifier for the unsafe content job. Use JobId to identify the job in a subsequent call to GetContentModeration.
    */
  var JobId: typings.awsSdk.rekognitionMod.JobId
  
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.rekognitionMod.MaxResults] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a pagination token in the response. You can use this pagination token to retrieve the next set of unsafe content labels.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Sort to use for elements in the ModerationLabelDetections array. Use TIMESTAMP to sort array elements by the time labels are detected. Use NAME to alphabetically group elements for a label together. Within each label group, the array element are sorted by detection confidence. The default sort is by TIMESTAMP.
    */
  var SortBy: js.UndefOr[ContentModerationSortBy] = js.undefined
}
object GetContentModerationRequest {
  
  @scala.inline
  def apply(JobId: JobId): GetContentModerationRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContentModerationRequest]
  }
  
  @scala.inline
  implicit class GetContentModerationRequestMutableBuilder[Self <: GetContentModerationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: ContentModerationSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
  }
}
