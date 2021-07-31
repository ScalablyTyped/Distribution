package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockList extends StObject {
  
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
  
  @scala.inline
  implicit class BlockListMutableBuilder[Self <: BlockList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommittedBlocks(value: js.Array[String]): Self = StObject.set(x, "CommittedBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommittedBlocksVarargs(value: String*): Self = StObject.set(x, "CommittedBlocks", js.Array(value :_*))
    
    @scala.inline
    def setLatestBlocks(value: js.Array[String]): Self = StObject.set(x, "LatestBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestBlocksVarargs(value: String*): Self = StObject.set(x, "LatestBlocks", js.Array(value :_*))
    
    @scala.inline
    def setUncommittedBlocks(value: js.Array[String]): Self = StObject.set(x, "UncommittedBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncommittedBlocksVarargs(value: String*): Self = StObject.set(x, "UncommittedBlocks", js.Array(value :_*))
  }
}
