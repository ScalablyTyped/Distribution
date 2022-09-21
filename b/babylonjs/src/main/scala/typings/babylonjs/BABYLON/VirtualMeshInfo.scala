package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data store to track virtual pointers movement
  */
trait VirtualMeshInfo extends StObject {
  
  var dragMesh: AbstractMesh
  
  var dragging: Boolean
  
  var lastDragPosition: Vector3
  
  var lastOriginPosition: Vector3
  
  var moving: Boolean
  
  var originMesh: AbstractMesh
  
  var pivotMesh: AbstractMesh
  
  var startingOrientation: Quaternion
  
  var startingPivotOrientation: Quaternion
  
  var startingPivotPosition: Vector3
  
  var startingPosition: Vector3
}
object VirtualMeshInfo {
  
  inline def apply(
    dragMesh: AbstractMesh,
    dragging: Boolean,
    lastDragPosition: Vector3,
    lastOriginPosition: Vector3,
    moving: Boolean,
    originMesh: AbstractMesh,
    pivotMesh: AbstractMesh,
    startingOrientation: Quaternion,
    startingPivotOrientation: Quaternion,
    startingPivotPosition: Vector3,
    startingPosition: Vector3
  ): VirtualMeshInfo = {
    val __obj = js.Dynamic.literal(dragMesh = dragMesh.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], lastDragPosition = lastDragPosition.asInstanceOf[js.Any], lastOriginPosition = lastOriginPosition.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], originMesh = originMesh.asInstanceOf[js.Any], pivotMesh = pivotMesh.asInstanceOf[js.Any], startingOrientation = startingOrientation.asInstanceOf[js.Any], startingPivotOrientation = startingPivotOrientation.asInstanceOf[js.Any], startingPivotPosition = startingPivotPosition.asInstanceOf[js.Any], startingPosition = startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualMeshInfo]
  }
  
  extension [Self <: VirtualMeshInfo](x: Self) {
    
    inline def setDragMesh(value: AbstractMesh): Self = StObject.set(x, "dragMesh", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setLastDragPosition(value: Vector3): Self = StObject.set(x, "lastDragPosition", value.asInstanceOf[js.Any])
    
    inline def setLastOriginPosition(value: Vector3): Self = StObject.set(x, "lastOriginPosition", value.asInstanceOf[js.Any])
    
    inline def setMoving(value: Boolean): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
    
    inline def setOriginMesh(value: AbstractMesh): Self = StObject.set(x, "originMesh", value.asInstanceOf[js.Any])
    
    inline def setPivotMesh(value: AbstractMesh): Self = StObject.set(x, "pivotMesh", value.asInstanceOf[js.Any])
    
    inline def setStartingOrientation(value: Quaternion): Self = StObject.set(x, "startingOrientation", value.asInstanceOf[js.Any])
    
    inline def setStartingPivotOrientation(value: Quaternion): Self = StObject.set(x, "startingPivotOrientation", value.asInstanceOf[js.Any])
    
    inline def setStartingPivotPosition(value: Vector3): Self = StObject.set(x, "startingPivotPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPosition(value: Vector3): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
  }
}
