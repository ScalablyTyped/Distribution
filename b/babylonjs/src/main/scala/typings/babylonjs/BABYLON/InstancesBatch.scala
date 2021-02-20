package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesBatch extends StObject {
  
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
  implicit class InstancesBatchMutableBuilder[Self <: InstancesBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHardwareInstancedRendering(value: js.Array[Boolean]): Self = StObject.set(x, "hardwareInstancedRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareInstancedRenderingVarargs(value: Boolean*): Self = StObject.set(x, "hardwareInstancedRendering", js.Array(value :_*))
    
    @scala.inline
    def setMustReturn(value: Boolean): Self = StObject.set(x, "mustReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderSelf(value: js.Array[Boolean]): Self = StObject.set(x, "renderSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderSelfVarargs(value: Boolean*): Self = StObject.set(x, "renderSelf", js.Array(value :_*))
    
    @scala.inline
    def setVisibleInstances(value: js.Array[Nullable[js.Array[InstancedMesh]]]): Self = StObject.set(x, "visibleInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInstancesVarargs(value: Nullable[js.Array[InstancedMesh]]*): Self = StObject.set(x, "visibleInstances", js.Array(value :_*))
  }
}
