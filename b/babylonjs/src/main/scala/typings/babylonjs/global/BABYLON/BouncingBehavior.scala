package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BouncingBehavior")
@js.native
class BouncingBehavior ()
  extends typings.babylonjs.BABYLON.BouncingBehavior {
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
@JSGlobal("BABYLON.BouncingBehavior")
@js.native
object BouncingBehavior extends js.Object {
  /**
    * The easing function used by animations
    */
  var EasingFunction: typings.babylonjs.BABYLON.BackEase = js.native
  /**
    * The easing mode used by animations
    */
  var EasingMode: Double = js.native
}

