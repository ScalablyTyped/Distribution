package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOctreeContainer[T] extends js.Object {
  
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
  implicit class IOctreeContainerOps[Self <: IOctreeContainer[_], T] (val x: Self with IOctreeContainer[T]) extends AnyVal {
    
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
    def setBlocksVarargs(value: OctreeBlock[T]*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[OctreeBlock[T]]): Self = this.set("blocks", value.asInstanceOf[js.Any])
  }
}
