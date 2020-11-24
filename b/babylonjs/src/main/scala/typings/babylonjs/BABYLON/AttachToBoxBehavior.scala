package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachToBoxBehavior extends Behavior[Mesh] {
  
  var _closestFace: js.Any = js.native
  
  var _faceVectors: js.Any = js.native
  
  var _lookAtTmpMatrix: js.Any = js.native
  
  var _lookAtToRef: js.Any = js.native
  
  var _onRenderObserver: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _target: js.Any = js.native
  
  var _tmpMatrix: js.Any = js.native
  
  var _tmpVector: js.Any = js.native
  
  var _zeroVector: js.Any = js.native
  
  /**
    * The distance from the bottom of the face that the UI should be attached to (default: 0.15)
    */
  var distanceAwayFromBottomOfFace: Double = js.native
  
  /**
    * The distance away from the face of the mesh that the UI should be attached to (default: 0.15)
    */
  var distanceAwayFromFace: Double = js.native
  
  var ui: js.Any = js.native
}
object AttachToBoxBehavior {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AttachToBoxBehaviorOps[Self <: AttachToBoxBehavior] (val x: Self) extends AnyVal {
    
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
    def set_closestFace(value: js.Any): Self = this.set("_closestFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_faceVectors(value: js.Any): Self = this.set("_faceVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lookAtTmpMatrix(value: js.Any): Self = this.set("_lookAtTmpMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lookAtToRef(value: js.Any): Self = this.set("_lookAtToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onRenderObserver(value: js.Any): Self = this.set("_onRenderObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scene(value: js.Any): Self = this.set("_scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_target(value: js.Any): Self = this.set("_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tmpMatrix(value: js.Any): Self = this.set("_tmpMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tmpVector(value: js.Any): Self = this.set("_tmpVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_zeroVector(value: js.Any): Self = this.set("_zeroVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceAwayFromBottomOfFace(value: Double): Self = this.set("distanceAwayFromBottomOfFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceAwayFromFace(value: Double): Self = this.set("distanceAwayFromFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: js.Any): Self = this.set("ui", value.asInstanceOf[js.Any])
  }
}
