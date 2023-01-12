package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMotionControllerButtonMeshMap extends StObject {
  
  /**
    * the mesh that defines the pressed value mesh position.
    * This is used to find the max-position of this button
    */
  var pressedMesh: AbstractMesh
  
  /**
    * the mesh that defines the unpressed value mesh position.
    * This is used to find the min (or initial) position of this button
    */
  var unpressedMesh: AbstractMesh
  
  /**
    * The mesh that will be changed when value changes
    */
  var valueMesh: AbstractMesh
}
object IMotionControllerButtonMeshMap {
  
  inline def apply(pressedMesh: AbstractMesh, unpressedMesh: AbstractMesh, valueMesh: AbstractMesh): IMotionControllerButtonMeshMap = {
    val __obj = js.Dynamic.literal(pressedMesh = pressedMesh.asInstanceOf[js.Any], unpressedMesh = unpressedMesh.asInstanceOf[js.Any], valueMesh = valueMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerButtonMeshMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMotionControllerButtonMeshMap] (val x: Self) extends AnyVal {
    
    inline def setPressedMesh(value: AbstractMesh): Self = StObject.set(x, "pressedMesh", value.asInstanceOf[js.Any])
    
    inline def setUnpressedMesh(value: AbstractMesh): Self = StObject.set(x, "unpressedMesh", value.asInstanceOf[js.Any])
    
    inline def setValueMesh(value: AbstractMesh): Self = StObject.set(x, "valueMesh", value.asInstanceOf[js.Any])
  }
}
