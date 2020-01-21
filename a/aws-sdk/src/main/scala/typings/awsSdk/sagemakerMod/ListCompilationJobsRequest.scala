package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCompilationJobsRequest extends js.Object {
  /**
    * A filter that returns the model compilation jobs that were created after a specified time. 
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.native
  /**
    * A filter that returns the model compilation jobs that were created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.native
  /**
    * A filter that returns the model compilation jobs that were modified after a specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.native
  /**
    * A filter that returns the model compilation jobs that were modified before a specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.native
  /**
    * The maximum number of model compilation jobs to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A filter that returns the model compilation jobs whose name contains a specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.sagemakerMod.NameContains] = js.native
  /**
    * If the result of the previous ListCompilationJobs request was truncated, the response includes a NextToken. To retrieve the next set of model compilation jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field by which to sort results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ListCompilationJobsSortBy] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that retrieves model compilation jobs with a specific DescribeCompilationJobResponse$CompilationJobStatus status.
    */
  var StatusEquals: js.UndefOr[CompilationJobStatus] = js.native
}

object ListCompilationJobsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: CreationTime = null,
    CreationTimeBefore: CreationTime = null,
    LastModifiedTimeAfter: LastModifiedTime = null,
    LastModifiedTimeBefore: LastModifiedTime = null,
    MaxResults: Int | Double = null,
    NameContains: NameContains = null,
    NextToken: NextToken = null,
    SortBy: ListCompilationJobsSortBy = null,
    SortOrder: SortOrder = null,
    StatusEquals: CompilationJobStatus = null
  ): ListCompilationJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCompilationJobsRequest]
  }
}

