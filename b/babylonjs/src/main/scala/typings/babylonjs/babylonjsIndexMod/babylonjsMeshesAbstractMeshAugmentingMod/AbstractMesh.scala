package typings.babylonjs.babylonjsIndexMod.babylonjsMeshesAbstractMeshAugmentingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractMesh extends js.Object {
  
  /**
    * Object used to store instanced buffers defined by user
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    */
  var instancedBuffers: StringDictionary[js.Any] = js.native
}
object AbstractMesh {
  
  @scala.inline
  def apply(instancedBuffers: StringDictionary[js.Any]): AbstractMesh = {
    val __obj = js.Dynamic.literal(instancedBuffers = instancedBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
  
  @scala.inline
  implicit class AbstractMeshOps[Self <: AbstractMesh] (val x: Self) extends AnyVal {
    
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
    def setInstancedBuffers(value: StringDictionary[js.Any]): Self = this.set("instancedBuffers", value.asInstanceOf[js.Any])
  }
}
