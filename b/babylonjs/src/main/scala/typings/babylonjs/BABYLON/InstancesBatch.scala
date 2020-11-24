package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesBatch extends js.Object {
  
  var hardwareInstancedRendering: js.Array[Boolean] = js.native
  
  var mustReturn: Boolean = js.native
  
  var renderSelf: js.Array[Boolean] = js.native
  
  var visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]] = js.native
}
object InstancesBatch {
  
  @scala.inline
  def apply(
    hardwareInstancedRendering: js.Array[Boolean],
    mustReturn: Boolean,
    renderSelf: js.Array[Boolean],
    visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]]
  ): InstancesBatch = {
    val __obj = js.Dynamic.literal(hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], mustReturn = mustReturn.asInstanceOf[js.Any], renderSelf = renderSelf.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesBatch]
  }
  
  @scala.inline
  implicit class InstancesBatchOps[Self <: InstancesBatch] (val x: Self) extends AnyVal {
    
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
    def setHardwareInstancedRenderingVarargs(value: Boolean*): Self = this.set("hardwareInstancedRendering", js.Array(value :_*))
    
    @scala.inline
    def setHardwareInstancedRendering(value: js.Array[Boolean]): Self = this.set("hardwareInstancedRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustReturn(value: Boolean): Self = this.set("mustReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderSelfVarargs(value: Boolean*): Self = this.set("renderSelf", js.Array(value :_*))
    
    @scala.inline
    def setRenderSelf(value: js.Array[Boolean]): Self = this.set("renderSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInstancesVarargs(value: Nullable[js.Array[InstancedMesh]]*): Self = this.set("visibleInstances", js.Array(value :_*))
    
    @scala.inline
    def setVisibleInstances(value: js.Array[Nullable[js.Array[InstancedMesh]]]): Self = this.set("visibleInstances", value.asInstanceOf[js.Any])
  }
}
