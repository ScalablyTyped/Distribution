package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMotionControllerMeshMap extends StObject {
  
  /**
    * the mesh that defines the maximum value mesh position.
    */
  var maxMesh: js.UndefOr[AbstractMesh] = js.undefined
  
  /**
    * the mesh that defines the minimum value mesh position.
    */
  var minMesh: js.UndefOr[AbstractMesh] = js.undefined
  
  /**
    * The mesh that will be changed when axis value changes
    */
  var valueMesh: js.UndefOr[AbstractMesh] = js.undefined
}
object IMotionControllerMeshMap {
  
  inline def apply(): IMotionControllerMeshMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMotionControllerMeshMap]
  }
  
  extension [Self <: IMotionControllerMeshMap](x: Self) {
    
    inline def setMaxMesh(value: AbstractMesh): Self = StObject.set(x, "maxMesh", value.asInstanceOf[js.Any])
    
    inline def setMaxMeshUndefined: Self = StObject.set(x, "maxMesh", js.undefined)
    
    inline def setMinMesh(value: AbstractMesh): Self = StObject.set(x, "minMesh", value.asInstanceOf[js.Any])
    
    inline def setMinMeshUndefined: Self = StObject.set(x, "minMesh", js.undefined)
    
    inline def setValueMesh(value: AbstractMesh): Self = StObject.set(x, "valueMesh", value.asInstanceOf[js.Any])
    
    inline def setValueMeshUndefined: Self = StObject.set(x, "valueMesh", js.undefined)
  }
}
