package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FramingBehavior")
@js.native
class FramingBehavior ()
  extends typings.babylonjs.BABYLON.FramingBehavior {
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: typings.babylonjs.BABYLON.ArcRotateCamera): Unit = js.native
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

/* static members */
@JSGlobal("BABYLON.FramingBehavior")
@js.native
object FramingBehavior extends js.Object {
  /**
    * The easing function used by animations
    */
  var EasingFunction: typings.babylonjs.BABYLON.ExponentialEase = js.native
  /**
    * The easing mode used by animations
    */
  var EasingMode: Double = js.native
  /**
    * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
    */
  var FitFrustumSidesMode: Double = js.native
  /**
    * The camera can move all the way towards the mesh.
    */
  var IgnoreBoundsSizeMode: Double = js.native
}

