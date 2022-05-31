package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesBatch extends StObject {
  
  var hardwareInstancedRendering: js.Array[Boolean]
  
  var mustReturn: Boolean
  
  var renderSelf: js.Array[Boolean]
  
  var visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]]
}
object InstancesBatch {
  
  inline def apply(
    hardwareInstancedRendering: js.Array[Boolean],
    mustReturn: Boolean,
    renderSelf: js.Array[Boolean],
    visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]]
  ): InstancesBatch = {
    val __obj = js.Dynamic.literal(hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], mustReturn = mustReturn.asInstanceOf[js.Any], renderSelf = renderSelf.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesBatch]
  }
  
  extension [Self <: InstancesBatch](x: Self) {
    
    inline def setHardwareInstancedRendering(value: js.Array[Boolean]): Self = StObject.set(x, "hardwareInstancedRendering", value.asInstanceOf[js.Any])
    
    inline def setHardwareInstancedRenderingVarargs(value: Boolean*): Self = StObject.set(x, "hardwareInstancedRendering", js.Array(value :_*))
    
    inline def setMustReturn(value: Boolean): Self = StObject.set(x, "mustReturn", value.asInstanceOf[js.Any])
    
    inline def setRenderSelf(value: js.Array[Boolean]): Self = StObject.set(x, "renderSelf", value.asInstanceOf[js.Any])
    
    inline def setRenderSelfVarargs(value: Boolean*): Self = StObject.set(x, "renderSelf", js.Array(value :_*))
    
    inline def setVisibleInstances(value: js.Array[Nullable[js.Array[InstancedMesh]]]): Self = StObject.set(x, "visibleInstances", value.asInstanceOf[js.Any])
    
    inline def setVisibleInstancesVarargs(value: Nullable[js.Array[InstancedMesh]]*): Self = StObject.set(x, "visibleInstances", js.Array(value :_*))
  }
}
