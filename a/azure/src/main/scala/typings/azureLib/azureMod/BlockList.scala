package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockList extends js.Object {
  var CommittedBlocks: js.Array[java.lang.String]
  var LatestBlocks: js.Array[java.lang.String]
  var UncommittedBlocks: js.Array[java.lang.String]
}

object BlockList {
  @scala.inline
  def apply(
    CommittedBlocks: js.Array[java.lang.String],
    LatestBlocks: js.Array[java.lang.String],
    UncommittedBlocks: js.Array[java.lang.String]
  ): BlockList = {
    val __obj = js.Dynamic.literal(CommittedBlocks = CommittedBlocks, LatestBlocks = LatestBlocks, UncommittedBlocks = UncommittedBlocks)
  
    __obj.asInstanceOf[BlockList]
  }
}

