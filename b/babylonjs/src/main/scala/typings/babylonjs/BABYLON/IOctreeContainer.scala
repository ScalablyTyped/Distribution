package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOctreeContainer[T] extends StObject {
  
  /**
    * Blocks within the octree
    */
  var blocks: js.Array[OctreeBlock[T]]
}
object IOctreeContainer {
  
  inline def apply[T](blocks: js.Array[OctreeBlock[T]]): IOctreeContainer[T] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOctreeContainer[T]]
  }
  
  extension [Self <: IOctreeContainer[?], T](x: Self & IOctreeContainer[T]) {
    
    inline def setBlocks(value: js.Array[OctreeBlock[T]]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksVarargs(value: OctreeBlock[T]*): Self = StObject.set(x, "blocks", js.Array(value*))
  }
}
