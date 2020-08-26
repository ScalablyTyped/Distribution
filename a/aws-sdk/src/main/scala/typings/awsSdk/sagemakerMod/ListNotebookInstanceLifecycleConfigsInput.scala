package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotebookInstanceLifecycleConfigsInput extends js.Object {
  /**
    * A filter that returns only lifecycle configurations that were created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.native
  /**
    * A filter that returns only lifecycle configurations that were created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.native
  /**
    * A filter that returns only lifecycle configurations that were modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.native
  /**
    * A filter that returns only lifecycle configurations that were modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.native
  /**
    * The maximum number of lifecycle configurations to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A string in the lifecycle configuration name. This filter returns only lifecycle configurations whose name contains the specified string.
    */
  var NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains] = js.native
  /**
    * If the result of a ListNotebookInstanceLifecycleConfigs request was truncated, the response includes a NextToken. To get the next set of lifecycle configurations, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey] = js.native
  /**
    * The sort order for results.
    */
  var SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder] = js.native
}

object ListNotebookInstanceLifecycleConfigsInput {
  @scala.inline
  def apply(): ListNotebookInstanceLifecycleConfigsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsInput]
  }
  @scala.inline
  implicit class ListNotebookInstanceLifecycleConfigsInputOps[Self <: ListNotebookInstanceLifecycleConfigsInput] (val x: Self) extends AnyVal {
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
    def setCreationTimeAfter(value: CreationTime): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    @scala.inline
    def setCreationTimeBefore(value: CreationTime): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
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
    def setNameContains(value: NotebookInstanceLifecycleConfigNameContains): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortBy(value: NotebookInstanceLifecycleConfigSortKey): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: NotebookInstanceLifecycleConfigSortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
  
}

