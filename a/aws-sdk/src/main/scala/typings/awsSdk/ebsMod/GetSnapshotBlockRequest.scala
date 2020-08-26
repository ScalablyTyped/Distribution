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
  @scala.inline
  implicit class GetSnapshotBlockRequestOps[Self <: GetSnapshotBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockIndex(value: BlockIndex): Self = this.set("BlockIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockToken(value: BlockToken): Self = this.set("BlockToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
  }
  
}

