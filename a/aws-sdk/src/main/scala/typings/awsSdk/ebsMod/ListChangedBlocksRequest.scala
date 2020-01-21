package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangedBlocksRequest extends js.Object {
  /**
    * The ID of the first snapshot to use for the comparison.
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
    * The ID of the second snapshot to use for the comparison.
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
    MaxResults: Int | Double = null,
    NextToken: PageToken = null,
    StartingBlockIndex: Int | Double = null
  ): ListChangedBlocksRequest = {
    val __obj = js.Dynamic.literal(SecondSnapshotId = SecondSnapshotId.asInstanceOf[js.Any])
    if (FirstSnapshotId != null) __obj.updateDynamic("FirstSnapshotId")(FirstSnapshotId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartingBlockIndex != null) __obj.updateDynamic("StartingBlockIndex")(StartingBlockIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangedBlocksRequest]
  }
}

