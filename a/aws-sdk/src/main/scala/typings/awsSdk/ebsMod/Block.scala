package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typings.awsSdk.ebsMod.BlockIndex] = js.native
  /**
    * The block token for the block index.
    */
  var BlockToken: js.UndefOr[typings.awsSdk.ebsMod.BlockToken] = js.native
}

object Block {
  @scala.inline
  def apply(BlockIndex: js.UndefOr[BlockIndex] = js.undefined, BlockToken: BlockToken = null): Block = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BlockIndex)) __obj.updateDynamic("BlockIndex")(BlockIndex.get.asInstanceOf[js.Any])
    if (BlockToken != null) __obj.updateDynamic("BlockToken")(BlockToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

