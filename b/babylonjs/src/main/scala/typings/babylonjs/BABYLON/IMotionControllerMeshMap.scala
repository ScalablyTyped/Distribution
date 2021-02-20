package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMotionControllerMeshMap extends StObject {
  
  /**
    * the mesh that defines the maximum value mesh position.
    */
  var maxMesh: js.UndefOr[AbstractMesh] = js.native
  
  /**
    * the mesh that defines the minimum value mesh position.
    */
  var minMesh: js.UndefOr[AbstractMesh] = js.native
  
  /**
    * The mesh that will be changed when axis value changes
    */
  var valueMesh: js.UndefOr[AbstractMesh] = js.native
}
object IMotionControllerMeshMap {
  
  @scala.inline
  def apply(): IMotionControllerMeshMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMotionControllerMeshMap]
  }
  
  @scala.inline
  implicit class IMotionControllerMeshMapMutableBuilder[Self <: IMotionControllerMeshMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxMesh(value: AbstractMesh): Self = StObject.set(x, "maxMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMeshUndefined: Self = StObject.set(x, "maxMesh", js.undefined)
    
    @scala.inline
    def setMinMesh(value: AbstractMesh): Self = StObject.set(x, "minMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinMeshUndefined: Self = StObject.set(x, "minMesh", js.undefined)
    
    @scala.inline
    def setValueMesh(value: AbstractMesh): Self = StObject.set(x, "valueMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMeshUndefined: Self = StObject.set(x, "valueMesh", js.undefined)
  }
}
