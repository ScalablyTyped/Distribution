package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachToBoxBehavior
  extends StObject
     with Behavior[Mesh] {
  
  /* private */ var _closestFace: Any
  
  /* private */ var _faceVectors: Any
  
  /* private */ var _lookAtTmpMatrix: Any
  
  /* private */ var _lookAtToRef: Any
  
  /* private */ var _onRenderObserver: Any
  
  /* private */ var _scene: Any
  
  /* private */ var _target: Any
  
  /* private */ var _tmpMatrix: Any
  
  /* private */ var _tmpVector: Any
  
  /* private */ var _ui: Any
  
  /* private */ var _zeroVector: Any
  
  /**
    * The distance from the bottom of the face that the UI should be attached to (default: 0.15)
    */
  var distanceAwayFromBottomOfFace: Double
  
  /**
    * The distance away from the face of the mesh that the UI should be attached to (default: 0.15)
    */
  var distanceAwayFromFace: Double
}
object AttachToBoxBehavior {
  
  inline def apply(
    _closestFace: Any,
    _faceVectors: Any,
    _lookAtTmpMatrix: Any,
    _lookAtToRef: Any,
    _onRenderObserver: Any,
    _scene: Any,
    _target: Any,
    _tmpMatrix: Any,
    _tmpVector: Any,
    _ui: Any,
    _zeroVector: Any,
    attach: Mesh => Unit,
    detach: () => Unit,
    distanceAwayFromBottomOfFace: Double,
    distanceAwayFromFace: Double,
    init: () => Unit,
    name: String
  ): AttachToBoxBehavior = {
    val __obj = js.Dynamic.literal(_closestFace = _closestFace.asInstanceOf[js.Any], _faceVectors = _faceVectors.asInstanceOf[js.Any], _lookAtTmpMatrix = _lookAtTmpMatrix.asInstanceOf[js.Any], _lookAtToRef = _lookAtToRef.asInstanceOf[js.Any], _onRenderObserver = _onRenderObserver.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _target = _target.asInstanceOf[js.Any], _tmpMatrix = _tmpMatrix.asInstanceOf[js.Any], _tmpVector = _tmpVector.asInstanceOf[js.Any], _ui = _ui.asInstanceOf[js.Any], _zeroVector = _zeroVector.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), distanceAwayFromBottomOfFace = distanceAwayFromBottomOfFace.asInstanceOf[js.Any], distanceAwayFromFace = distanceAwayFromFace.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToBoxBehavior]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachToBoxBehavior] (val x: Self) extends AnyVal {
    
    inline def setDistanceAwayFromBottomOfFace(value: Double): Self = StObject.set(x, "distanceAwayFromBottomOfFace", value.asInstanceOf[js.Any])
    
    inline def setDistanceAwayFromFace(value: Double): Self = StObject.set(x, "distanceAwayFromFace", value.asInstanceOf[js.Any])
    
    inline def set_closestFace(value: Any): Self = StObject.set(x, "_closestFace", value.asInstanceOf[js.Any])
    
    inline def set_faceVectors(value: Any): Self = StObject.set(x, "_faceVectors", value.asInstanceOf[js.Any])
    
    inline def set_lookAtTmpMatrix(value: Any): Self = StObject.set(x, "_lookAtTmpMatrix", value.asInstanceOf[js.Any])
    
    inline def set_lookAtToRef(value: Any): Self = StObject.set(x, "_lookAtToRef", value.asInstanceOf[js.Any])
    
    inline def set_onRenderObserver(value: Any): Self = StObject.set(x, "_onRenderObserver", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
    
    inline def set_target(value: Any): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_tmpMatrix(value: Any): Self = StObject.set(x, "_tmpMatrix", value.asInstanceOf[js.Any])
    
    inline def set_tmpVector(value: Any): Self = StObject.set(x, "_tmpVector", value.asInstanceOf[js.Any])
    
    inline def set_ui(value: Any): Self = StObject.set(x, "_ui", value.asInstanceOf[js.Any])
    
    inline def set_zeroVector(value: Any): Self = StObject.set(x, "_zeroVector", value.asInstanceOf[js.Any])
  }
}
