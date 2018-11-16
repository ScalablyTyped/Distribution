package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A behavior that when attached to a mesh will will place a specified node on the meshes face pointing towards the camera
     */
@JSGlobal("BABYLON.AttachToBoxBehavior")
@js.native
class AttachToBoxBehavior protected () extends Behavior[Mesh] {
  /**
           * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
           * @param ui The transform node that should be attched to the mesh
           */
  def this(ui: TransformNode) = this()
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
  var distanceAwayFromBottomOfFace: scala.Double = js.native
  /**
           * The distance away from the face of the mesh that the UI should be attached to (default: 0.15)
           */
  var distanceAwayFromFace: scala.Double = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var ui: js.Any = js.native
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

