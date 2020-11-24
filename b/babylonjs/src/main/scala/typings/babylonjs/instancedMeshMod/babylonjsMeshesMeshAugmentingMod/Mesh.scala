package typings.babylonjs.instancedMeshMod.babylonjsMeshesMeshAugmentingMod

import typings.babylonjs.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mesh extends js.Object {
  
  /** @hidden */
  var _userInstancedBuffersStorage: Data = js.native
  
  /**
    * true to use the edge renderer for all instances of this mesh
    */
  var edgesShareWithInstances: Boolean = js.native
  
  /**
    * Register a custom buffer that will be instanced
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    * @param kind defines the buffer kind
    * @param stride defines the stride in floats
    */
  def registerInstancedBuffer(kind: String, stride: Double): Unit = js.native
}
object Mesh {
  
  @scala.inline
  def apply(
    _userInstancedBuffersStorage: Data,
    edgesShareWithInstances: Boolean,
    registerInstancedBuffer: (String, Double) => Unit
  ): Mesh = {
    val __obj = js.Dynamic.literal(_userInstancedBuffersStorage = _userInstancedBuffersStorage.asInstanceOf[js.Any], edgesShareWithInstances = edgesShareWithInstances.asInstanceOf[js.Any], registerInstancedBuffer = js.Any.fromFunction2(registerInstancedBuffer))
    __obj.asInstanceOf[Mesh]
  }
  
  @scala.inline
  implicit class MeshOps[Self <: Mesh] (val x: Self) extends AnyVal {
    
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
    def set_userInstancedBuffersStorage(value: Data): Self = this.set("_userInstancedBuffersStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesShareWithInstances(value: Boolean): Self = this.set("edgesShareWithInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterInstancedBuffer(value: (String, Double) => Unit): Self = this.set("registerInstancedBuffer", js.Any.fromFunction2(value))
  }
}
