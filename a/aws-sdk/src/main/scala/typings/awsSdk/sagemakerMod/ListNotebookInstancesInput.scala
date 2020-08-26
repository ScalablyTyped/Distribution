package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotebookInstancesInput extends js.Object {
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
  implicit class ListNotebookInstancesInputOps[Self <: ListNotebookInstancesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalCodeRepositoryEquals(value: CodeRepositoryNameOrUrl): Self = this.set("AdditionalCodeRepositoryEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalCodeRepositoryEquals: Self = this.set("AdditionalCodeRepositoryEquals", js.undefined)
    @scala.inline
    def setCreationTimeAfter(value: CreationTime): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    @scala.inline
    def setCreationTimeBefore(value: CreationTime): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
    @scala.inline
    def setDefaultCodeRepositoryContains(value: CodeRepositoryContains): Self = this.set("DefaultCodeRepositoryContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCodeRepositoryContains: Self = this.set("DefaultCodeRepositoryContains", js.undefined)
    @scala.inline
    def setLastModifiedTimeAfter(value: LastModifiedTime): Self = this.set("LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimeAfter: Self = this.set("LastModifiedTimeAfter", js.undefined)
    @scala.inline
    def setLastModifiedTimeBefore(value: LastModifiedTime): Self = this.set("LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimeBefore: Self = this.set("LastModifiedTimeBefore", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNameContains(value: NotebookInstanceNameContains): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setNotebookInstanceLifecycleConfigNameContains(value: NotebookInstanceLifecycleConfigName): Self = this.set("NotebookInstanceLifecycleConfigNameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookInstanceLifecycleConfigNameContains: Self = this.set("NotebookInstanceLifecycleConfigNameContains", js.undefined)
    @scala.inline
    def setSortBy(value: NotebookInstanceSortKey): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: NotebookInstanceSortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    @scala.inline
    def setStatusEquals(value: NotebookInstanceStatus): Self = this.set("StatusEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusEquals: Self = this.set("StatusEquals", js.undefined)
  }
  
}

