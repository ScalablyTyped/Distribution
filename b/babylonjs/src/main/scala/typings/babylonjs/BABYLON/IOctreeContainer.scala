package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOctreeContainer[T] extends StObject {
  
  /**
    * Blocks within the octree
    */
  var blocks: js.Array[OctreeBlock[T]] = js.native
}
object IOctreeContainer {
  
  @scala.inline
  def apply[T](blocks: js.Array[OctreeBlock[T]]): IOctreeContainer[T] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOctreeContainer[T]]
  }
  
  @scala.inline
  implicit class IOctreeContainerMutableBuilder[Self <: IOctreeContainer[_], T] (val x: Self with IOctreeContainer[T]) extends AnyVal {
    
    @scala.inline
    def setBlocks(value: js.Array[OctreeBlock[T]]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksVarargs(value: OctreeBlock[T]*): Self = StObject.set(x, "blocks", js.Array(value :_*))
  }
}
