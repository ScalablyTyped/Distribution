package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockList extends js.Object {
  var CommittedBlocks: js.Array[String] = js.native
  var LatestBlocks: js.Array[String] = js.native
  var UncommittedBlocks: js.Array[String] = js.native
}

object BlockList {
  @scala.inline
  def apply(
    CommittedBlocks: js.Array[String],
    LatestBlocks: js.Array[String],
    UncommittedBlocks: js.Array[String]
  ): BlockList = {
    val __obj = js.Dynamic.literal(CommittedBlocks = CommittedBlocks.asInstanceOf[js.Any], LatestBlocks = LatestBlocks.asInstanceOf[js.Any], UncommittedBlocks = UncommittedBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockList]
  }
  @scala.inline
  implicit class BlockListOps[Self <: BlockList] (val x: Self) extends AnyVal {
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
    def setCommittedBlocksVarargs(value: String*): Self = this.set("CommittedBlocks", js.Array(value :_*))
    @scala.inline
    def setCommittedBlocks(value: js.Array[String]): Self = this.set("CommittedBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestBlocksVarargs(value: String*): Self = this.set("LatestBlocks", js.Array(value :_*))
    @scala.inline
    def setLatestBlocks(value: js.Array[String]): Self = this.set("LatestBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setUncommittedBlocksVarargs(value: String*): Self = this.set("UncommittedBlocks", js.Array(value :_*))
    @scala.inline
    def setUncommittedBlocks(value: js.Array[String]): Self = this.set("UncommittedBlocks", value.asInstanceOf[js.Any])
  }
  
}

