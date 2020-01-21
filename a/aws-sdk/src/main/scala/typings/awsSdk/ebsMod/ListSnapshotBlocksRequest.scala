package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSnapshotBlocksRequest extends js.Object {
  /**
    * The number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ebsMod.MaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  /**
    * The ID of the snapshot from which to get block indexes and block tokens.
    */
  var SnapshotId: typings.awsSdk.ebsMod.SnapshotId = js.native
  /**
    * The block index from which the list should start. The list in the response will start from this block index or the next valid block index in the snapshot.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.native
}

object ListSnapshotBlocksRequest {
  @scala.inline
  def apply(
    SnapshotId: SnapshotId,
    MaxResults: Int | Double = null,
    NextToken: PageToken = null,
    StartingBlockIndex: Int | Double = null
  ): ListSnapshotBlocksRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartingBlockIndex != null) __obj.updateDynamic("StartingBlockIndex")(StartingBlockIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSnapshotBlocksRequest]
  }
}

