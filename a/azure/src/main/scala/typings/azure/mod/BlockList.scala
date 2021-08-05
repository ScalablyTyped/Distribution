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
  
  inline def apply(
    CommittedBlocks: js.Array[String],
    LatestBlocks: js.Array[String],
    UncommittedBlocks: js.Array[String]
  ): BlockList = {
    val __obj = js.Dynamic.literal(CommittedBlocks = CommittedBlocks.asInstanceOf[js.Any], LatestBlocks = LatestBlocks.asInstanceOf[js.Any], UncommittedBlocks = UncommittedBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockList]
  }
  
  extension [Self <: BlockList](x: Self) {
    
    inline def setCommittedBlocks(value: js.Array[String]): Self = StObject.set(x, "CommittedBlocks", value.asInstanceOf[js.Any])
    
    inline def setCommittedBlocksVarargs(value: String*): Self = StObject.set(x, "CommittedBlocks", js.Array(value :_*))
    
    inline def setLatestBlocks(value: js.Array[String]): Self = StObject.set(x, "LatestBlocks", value.asInstanceOf[js.Any])
    
    inline def setLatestBlocksVarargs(value: String*): Self = StObject.set(x, "LatestBlocks", js.Array(value :_*))
    
    inline def setUncommittedBlocks(value: js.Array[String]): Self = StObject.set(x, "UncommittedBlocks", value.asInstanceOf[js.Any])
    
    inline def setUncommittedBlocksVarargs(value: String*): Self = StObject.set(x, "UncommittedBlocks", js.Array(value :_*))
  }
}
