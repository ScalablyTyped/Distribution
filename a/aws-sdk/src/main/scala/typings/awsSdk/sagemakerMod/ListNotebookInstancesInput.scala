package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotebookInstancesInput extends StObject {
  
  /**
    * A filter that returns only notebook instances with associated with the specified git repository.
    */
  var AdditionalCodeRepositoryEquals: js.UndefOr[CodeRepositoryNameOrUrl] = js.native
  
  /**
    * A filter that returns only notebook instances that were created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.native
  
  /**
    * A filter that returns only notebook instances that were created before the specified time (timestamp). 
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.native
  
  /**
    * A string in the name or URL of a Git repository associated with this notebook instance. This filter returns only notebook instances associated with a git repository with a name that contains the specified string.
    */
  var DefaultCodeRepositoryContains: js.UndefOr[CodeRepositoryContains] = js.native
  
  /**
    * A filter that returns only notebook instances that were modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.native
  
  /**
    * A filter that returns only notebook instances that were modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.native
  
  /**
    * The maximum number of notebook instances to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * A string in the notebook instances' name. This filter returns only notebook instances whose name contains the specified string.
    */
  var NameContains: js.UndefOr[NotebookInstanceNameContains] = js.native
  
  /**
    *  If the previous call to the ListNotebookInstances is truncated, the response includes a NextToken. You can use this token in your subsequent ListNotebookInstances request to fetch the next set of notebook instances.   You might specify a filter or a sort order in your request. When response is truncated, you must use the same values for the filer and sort order in the next request.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * A string in the name of a notebook instances lifecycle configuration associated with this notebook instance. This filter returns only notebook instances associated with a lifecycle configuration with a name that contains the specified string.
    */
  var NotebookInstanceLifecycleConfigNameContains: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.native
  
  /**
    * The field to sort results by. The default is Name.
    */
  var SortBy: js.UndefOr[NotebookInstanceSortKey] = js.native
  
  /**
    * The sort order for results. 
    */
  var SortOrder: js.UndefOr[NotebookInstanceSortOrder] = js.native
  
  /**
    * A filter that returns only notebook instances with the specified status.
    */
  var StatusEquals: js.UndefOr[NotebookInstanceStatus] = js.native
}
object ListNotebookInstancesInput {
  
  @scala.inline
  def apply(): ListNotebookInstancesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstancesInput]
  }
  
  @scala.inline
  implicit class ListNotebookInstancesInputMutableBuilder[Self <: ListNotebookInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalCodeRepositoryEquals(value: CodeRepositoryNameOrUrl): Self = StObject.set(x, "AdditionalCodeRepositoryEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalCodeRepositoryEqualsUndefined: Self = StObject.set(x, "AdditionalCodeRepositoryEquals", js.undefined)
    
    @scala.inline
    def setCreationTimeAfter(value: CreationTime): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: CreationTime): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setDefaultCodeRepositoryContains(value: CodeRepositoryContains): Self = StObject.set(x, "DefaultCodeRepositoryContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCodeRepositoryContainsUndefined: Self = StObject.set(x, "DefaultCodeRepositoryContains", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeAfter(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeBefore(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: NotebookInstanceNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigNameContains(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigNameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigNameContainsUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigNameContains", js.undefined)
    
    @scala.inline
    def setSortBy(value: NotebookInstanceSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: NotebookInstanceSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    @scala.inline
    def setStatusEquals(value: NotebookInstanceStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
