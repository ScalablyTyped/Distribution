package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A behavior that when attached to a mesh will allow the mesh to be scaled
  */
@JSGlobal("BABYLON.MultiPointerScaleBehavior")
@js.native
/**
  * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
  */
class MultiPointerScaleBehavior () extends Behavior[Mesh] {
  var _dragBehaviorA: js.Any = js.native
  var _dragBehaviorB: js.Any = js.native
  var _getCurrentDistance: js.Any = js.native
  var _initialScale: js.Any = js.native
  var _ownerNode: js.Any = js.native
  var _sceneRenderObserver: js.Any = js.native
  var _startDistance: js.Any = js.native
  var _targetScale: js.Any = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: Mesh): scala.Unit = js.native
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): scala.Unit = js.native
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): scala.Unit = js.native
}

