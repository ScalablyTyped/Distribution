package typings.azure.azureMod

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
    val __obj = js.Dynamic.literal(CommittedBlocks = CommittedBlocks, LatestBlocks = LatestBlocks, UncommittedBlocks = UncommittedBlocks)
  
    __obj.asInstanceOf[BlockList]
  }
}

