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
  def apply(
    AdditionalCodeRepositoryEquals: CodeRepositoryNameOrUrl = null,
    CreationTimeAfter: CreationTime = null,
    CreationTimeBefore: CreationTime = null,
    DefaultCodeRepositoryContains: CodeRepositoryContains = null,
    LastModifiedTimeAfter: LastModifiedTime = null,
    LastModifiedTimeBefore: LastModifiedTime = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: NotebookInstanceNameContains = null,
    NextToken: NextToken = null,
    NotebookInstanceLifecycleConfigNameContains: NotebookInstanceLifecycleConfigName = null,
    SortBy: NotebookInstanceSortKey = null,
    SortOrder: NotebookInstanceSortOrder = null,
    StatusEquals: NotebookInstanceStatus = null
  ): ListNotebookInstancesInput = {
    val __obj = js.Dynamic.literal()
    if (AdditionalCodeRepositoryEquals != null) __obj.updateDynamic("AdditionalCodeRepositoryEquals")(AdditionalCodeRepositoryEquals.asInstanceOf[js.Any])
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (DefaultCodeRepositoryContains != null) __obj.updateDynamic("DefaultCodeRepositoryContains")(DefaultCodeRepositoryContains.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NotebookInstanceLifecycleConfigNameContains != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigNameContains")(NotebookInstanceLifecycleConfigNameContains.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNotebookInstancesInput]
  }
}

