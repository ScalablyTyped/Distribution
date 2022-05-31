package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachToBoxBehavior
  extends StObject
     with Behavior[Mesh] {
  
  /* private */ var _closestFace: js.Any
  
  /* private */ var _faceVectors: js.Any
  
  /* private */ var _lookAtTmpMatrix: js.Any
  
  /* private */ var _lookAtToRef: js.Any
  
  /* private */ var _onRenderObserver: js.Any
  
  /* private */ var _scene: js.Any
  
  /* private */ var _target: js.Any
  
  /* private */ var _tmpMatrix: js.Any
  
  /* private */ var _tmpVector: js.Any
  
  /* private */ var _zeroVector: js.Any
  
  /**
    * The distance from the bottom of the face that the UI should be attached to (default: 0.15)
    */
  var distanceAwayFromBottomOfFace: Double
  
  /**
    * The distance away from the face of the mesh that the UI should be attached to (default: 0.15)
    */
  var distanceAwayFromFace: Double
  
  /* private */ var ui: js.Any
}
object AttachToBoxBehavior {
  
  inline def apply(
    _closestFace: js.Any,
    _faceVectors: js.Any,
    _lookAtTmpMatrix: js.Any,
    _lookAtToRef: js.Any,
    _onRenderObserver: js.Any,
    _scene: js.Any,
    _target: js.Any,
    _tmpMatrix: js.Any,
    _tmpVector: js.Any,
    _zeroVector: js.Any,
    attach: Mesh => Unit,
    detach: () => Unit,
    distanceAwayFromBottomOfFace: Double,
    distanceAwayFromFace: Double,
    init: () => Unit,
    name: String,
    ui: js.Any
  ): AttachToBoxBehavior = {
    val __obj = js.Dynamic.literal(_closestFace = _closestFace.asInstanceOf[js.Any], _faceVectors = _faceVectors.asInstanceOf[js.Any], _lookAtTmpMatrix = _lookAtTmpMatrix.asInstanceOf[js.Any], _lookAtToRef = _lookAtToRef.asInstanceOf[js.Any], _onRenderObserver = _onRenderObserver.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _target = _target.asInstanceOf[js.Any], _tmpMatrix = _tmpMatrix.asInstanceOf[js.Any], _tmpVector = _tmpVector.asInstanceOf[js.Any], _zeroVector = _zeroVector.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), distanceAwayFromBottomOfFace = distanceAwayFromBottomOfFace.asInstanceOf[js.Any], distanceAwayFromFace = distanceAwayFromFace.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), name = name.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToBoxBehavior]
  }
  
  extension [Self <: AttachToBoxBehavior](x: Self) {
    
    inline def setDistanceAwayFromBottomOfFace(value: Double): Self = StObject.set(x, "distanceAwayFromBottomOfFace", value.asInstanceOf[js.Any])
    
    inline def setDistanceAwayFromFace(value: Double): Self = StObject.set(x, "distanceAwayFromFace", value.asInstanceOf[js.Any])
    
    inline def setUi(value: js.Any): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def set_closestFace(value: js.Any): Self = StObject.set(x, "_closestFace", value.asInstanceOf[js.Any])
    
    inline def set_faceVectors(value: js.Any): Self = StObject.set(x, "_faceVectors", value.asInstanceOf[js.Any])
    
    inline def set_lookAtTmpMatrix(value: js.Any): Self = StObject.set(x, "_lookAtTmpMatrix", value.asInstanceOf[js.Any])
    
    inline def set_lookAtToRef(value: js.Any): Self = StObject.set(x, "_lookAtToRef", value.asInstanceOf[js.Any])
    
    inline def set_onRenderObserver(value: js.Any): Self = StObject.set(x, "_onRenderObserver", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: js.Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
    
    inline def set_target(value: js.Any): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_tmpMatrix(value: js.Any): Self = StObject.set(x, "_tmpMatrix", value.asInstanceOf[js.Any])
    
    inline def set_tmpVector(value: js.Any): Self = StObject.set(x, "_tmpVector", value.asInstanceOf[js.Any])
    
    inline def set_zeroVector(value: js.Any): Self = StObject.set(x, "_zeroVector", value.asInstanceOf[js.Any])
  }
}
