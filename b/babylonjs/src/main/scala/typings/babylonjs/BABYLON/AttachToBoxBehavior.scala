package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachToBoxBehavior extends Behavior[Mesh] {
  var _closestFace: js.Any
  var _faceVectors: js.Any
  var _lookAtTmpMatrix: js.Any
  var _lookAtToRef: js.Any
  var _onRenderObserver: js.Any
  var _scene: js.Any
  var _target: js.Any
  var _tmpMatrix: js.Any
  var _tmpVector: js.Any
  var _zeroVector: js.Any
  /**
    * The distance from the bottom of the face that the UI should be attached to (default: 0.15)
    */
  var distanceAwayFromBottomOfFace: Double
  /**
    * The distance away from the face of the mesh that the UI should be attached to (default: 0.15)
    */
  var distanceAwayFromFace: Double
  var ui: js.Any
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
}

