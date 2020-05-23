package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AttachToBoxBehavior")
@js.native
class AttachToBoxBehavior protected ()
  extends typings.babylonjs.BABYLON.AttachToBoxBehavior {
  /**
    * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
    * @param ui The transform node that should be attched to the mesh
    */
  def this(ui: typings.babylonjs.BABYLON.TransformNode) = this()
  /* CompleteClass */
  override var _closestFace: js.Any = js.native
  /* CompleteClass */
  override var _faceVectors: js.Any = js.native
  /* CompleteClass */
  override var _lookAtTmpMatrix: js.Any = js.native
  /* CompleteClass */
  override var _lookAtToRef: js.Any = js.native
  /* CompleteClass */
  override var _onRenderObserver: js.Any = js.native
  /* CompleteClass */
  override var _scene: js.Any = js.native
  /* CompleteClass */
  override var _target: js.Any = js.native
  /* CompleteClass */
  override var _tmpMatrix: js.Any = js.native
  /* CompleteClass */
  override var _tmpVector: js.Any = js.native
  /* CompleteClass */
  override var _zeroVector: js.Any = js.native
  /**
    * The distance from the bottom of the face that the UI should be attached to (default: 0.15)
    */
  /* CompleteClass */
  override var distanceAwayFromBottomOfFace: Double = js.native
  /**
    * The distance away from the face of the mesh that the UI should be attached to (default: 0.15)
    */
  /* CompleteClass */
  override var distanceAwayFromFace: Double = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var ui: js.Any = js.native
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: typings.babylonjs.BABYLON.Mesh): Unit = js.native
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): Unit = js.native
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): Unit = js.native
}

