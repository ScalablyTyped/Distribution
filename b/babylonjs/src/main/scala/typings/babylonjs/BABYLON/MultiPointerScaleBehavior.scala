package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPointerScaleBehavior extends Behavior[Mesh] {
  var _dragBehaviorA: js.Any
  var _dragBehaviorB: js.Any
  var _getCurrentDistance: js.Any
  var _initialScale: js.Any
  var _ownerNode: js.Any
  var _sceneRenderObserver: js.Any
  var _startDistance: js.Any
  var _targetScale: js.Any
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MMultiPointerScaleBehavior: String
}

object MultiPointerScaleBehavior {
  @scala.inline
  def apply(
    _dragBehaviorA: js.Any,
    _dragBehaviorB: js.Any,
    _getCurrentDistance: js.Any,
    _initialScale: js.Any,
    _ownerNode: js.Any,
    _sceneRenderObserver: js.Any,
    _startDistance: js.Any,
    _targetScale: js.Any,
    attach: Mesh => Unit,
    detach: () => Unit,
    init: () => Unit,
    name: () => String
  ): MultiPointerScaleBehavior = {
    val __obj = js.Dynamic.literal(_dragBehaviorA = _dragBehaviorA.asInstanceOf[js.Any], _dragBehaviorB = _dragBehaviorB.asInstanceOf[js.Any], _getCurrentDistance = _getCurrentDistance.asInstanceOf[js.Any], _initialScale = _initialScale.asInstanceOf[js.Any], _ownerNode = _ownerNode.asInstanceOf[js.Any], _sceneRenderObserver = _sceneRenderObserver.asInstanceOf[js.Any], _startDistance = _startDistance.asInstanceOf[js.Any], _targetScale = _targetScale.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), init = js.Any.fromFunction0(init), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[MultiPointerScaleBehavior]
  }
}

