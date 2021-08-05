package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCompilationJobsRequest extends StObject {
  
  /**
    * A filter that returns the model compilation jobs that were created after a specified time. 
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
  
  /**
    * A filter that returns the model compilation jobs that were created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
  
  /**
    * A filter that returns the model compilation jobs that were modified after a specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined
  
  /**
    * A filter that returns the model compilation jobs that were modified before a specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined
  
  /**
    * The maximum number of model compilation jobs to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * A filter that returns the model compilation jobs whose name contains a specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.sagemakerMod.NameContains] = js.undefined
  
  /**
    * If the result of the previous ListCompilationJobs request was truncated, the response includes a NextToken. To retrieve the next set of model compilation jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The field by which to sort results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ListCompilationJobsSortBy] = js.undefined
  
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.undefined
  
  /**
    * A filter that retrieves model compilation jobs with a specific DescribeCompilationJobResponse$CompilationJobStatus status.
    */
  var StatusEquals: js.UndefOr[CompilationJobStatus] = js.undefined
}
object ListCompilationJobsRequest {
  
  inline def apply(): ListCompilationJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompilationJobsRequest]
  }
  
  extension [Self <: ListCompilationJobsRequest](x: Self) {
    
    inline def setCreationTimeAfter(value: CreationTime): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: CreationTime): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setLastModifiedTimeAfter(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    inline def setLastModifiedTimeBefore(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: NameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: ListCompilationJobsSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatusEquals(value: CompilationJobStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
