package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangedBlocksRequest extends js.Object {
  /**
    * The ID of the first snapshot to use for the comparison.  The FirstSnapshotID parameter must be specified with a SecondSnapshotId parameter; otherwise, an error occurs. 
    */
  var FirstSnapshotId: js.UndefOr[SnapshotId] = js.native
  /**
    * The number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ebsMod.MaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  /**
    * The ID of the second snapshot to use for the comparison.  The SecondSnapshotId parameter must be specified with a FirstSnapshotID parameter; otherwise, an error occurs. 
    */
  var SecondSnapshotId: SnapshotId = js.native
  /**
    * The block index from which the comparison should start. The list in the response will start from this block index or the next valid block index in the snapshots.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.native
}

object ListChangedBlocksRequest {
  @scala.inline
  def apply(
    SecondSnapshotId: SnapshotId,
    FirstSnapshotId: SnapshotId = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: PageToken = null,
    StartingBlockIndex: js.UndefOr[BlockIndex] = js.undefined
  ): ListChangedBlocksRequest = {
    val __obj = js.Dynamic.literal(SecondSnapshotId = SecondSnapshotId.asInstanceOf[js.Any])
    if (FirstSnapshotId != null) __obj.updateDynamic("FirstSnapshotId")(FirstSnapshotId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(StartingBlockIndex)) __obj.updateDynamic("StartingBlockIndex")(StartingBlockIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangedBlocksRequest]
  }
}

