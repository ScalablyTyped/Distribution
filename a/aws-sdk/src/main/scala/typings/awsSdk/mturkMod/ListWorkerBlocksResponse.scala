package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkerBlocksResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  /**
    *  The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
    */
  var WorkerBlocks: js.UndefOr[WorkerBlockList] = js.native
}

object ListWorkerBlocksResponse {
  @scala.inline
  def apply(
    NextToken: PaginationToken = null,
    NumResults: js.UndefOr[Integer] = js.undefined,
    WorkerBlocks: WorkerBlockList = null
  ): ListWorkerBlocksResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(NumResults)) __obj.updateDynamic("NumResults")(NumResults.get.asInstanceOf[js.Any])
    if (WorkerBlocks != null) __obj.updateDynamic("WorkerBlocks")(WorkerBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkerBlocksResponse]
  }
}

