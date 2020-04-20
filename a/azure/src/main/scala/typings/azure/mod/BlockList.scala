package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockList extends js.Object {
  var CommittedBlocks: js.Array[String]
  var LatestBlocks: js.Array[String]
  var UncommittedBlocks: js.Array[String]
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
}

