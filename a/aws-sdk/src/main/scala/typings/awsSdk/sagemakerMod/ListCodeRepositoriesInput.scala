package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCodeRepositoriesInput extends StObject {
  
  /**
    * A filter that returns only Git repositories that were created after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
  
  /**
    * A filter that returns only Git repositories that were created before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
  
  /**
    * A filter that returns only Git repositories that were last modified after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only Git repositories that were last modified before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum number of Git repositories to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * A string in the Git repositories name. This filter returns only repositories whose name contains the specified string.
    */
  var NameContains: js.UndefOr[CodeRepositoryNameContains] = js.undefined
  
  /**
    * If the result of a ListCodeRepositoriesOutput request was truncated, the response includes a NextToken. To get the next set of Git repositories, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The field to sort results by. The default is Name.
    */
  var SortBy: js.UndefOr[CodeRepositorySortBy] = js.undefined
  
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[CodeRepositorySortOrder] = js.undefined
}
object ListCodeRepositoriesInput {
  
  @scala.inline
  def apply(): ListCodeRepositoriesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCodeRepositoriesInput]
  }
  
  @scala.inline
  implicit class ListCodeRepositoriesInputMutableBuilder[Self <: ListCodeRepositoriesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: CreationTime): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: CreationTime): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
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
    def setNameContains(value: CodeRepositoryNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: CodeRepositorySortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: CodeRepositorySortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
