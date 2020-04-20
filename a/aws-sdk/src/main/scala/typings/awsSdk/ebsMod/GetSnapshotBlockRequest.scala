package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotBlockRequest extends js.Object {
  /**
    * The block index of the block from which to get data. Obtain the BlockIndex by running the ListChangedBlocks or ListSnapshotBlocks operations.
    */
  var BlockIndex: typings.awsSdk.ebsMod.BlockIndex = js.native
  /**
    * The block token of the block from which to get data. Obtain the BlockToken by running the ListChangedBlocks or ListSnapshotBlocks operations.
    */
  var BlockToken: typings.awsSdk.ebsMod.BlockToken = js.native
  /**
    * The ID of the snapshot containing the block from which to get data.
    */
  var SnapshotId: typings.awsSdk.ebsMod.SnapshotId = js.native
}

object GetSnapshotBlockRequest {
  @scala.inline
  def apply(BlockIndex: BlockIndex, BlockToken: BlockToken, SnapshotId: SnapshotId): GetSnapshotBlockRequest = {
    val __obj = js.Dynamic.literal(BlockIndex = BlockIndex.asInstanceOf[js.Any], BlockToken = BlockToken.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotBlockRequest]
  }
}

