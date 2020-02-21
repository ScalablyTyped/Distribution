package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedBlock extends js.Object {
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typings.awsSdk.ebsMod.BlockIndex] = js.native
  /**
    * The block token for the block index of the FirstSnapshotId specified in the ListChangedBlocks operation. This value is absent if the first snapshot does not have the changed block that is on the second snapshot.
    */
  var FirstBlockToken: js.UndefOr[BlockToken] = js.native
  /**
    * The block token for the block index of the SecondSnapshotId specified in the ListChangedBlocks operation.
    */
  var SecondBlockToken: js.UndefOr[BlockToken] = js.native
}

object ChangedBlock {
  @scala.inline
  def apply(
    BlockIndex: Int | Double = null,
    FirstBlockToken: BlockToken = null,
    SecondBlockToken: BlockToken = null
  ): ChangedBlock = {
    val __obj = js.Dynamic.literal()
    if (BlockIndex != null) __obj.updateDynamic("BlockIndex")(BlockIndex.asInstanceOf[js.Any])
    if (FirstBlockToken != null) __obj.updateDynamic("FirstBlockToken")(FirstBlockToken.asInstanceOf[js.Any])
    if (SecondBlockToken != null) __obj.updateDynamic("SecondBlockToken")(SecondBlockToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedBlock]
  }
}

