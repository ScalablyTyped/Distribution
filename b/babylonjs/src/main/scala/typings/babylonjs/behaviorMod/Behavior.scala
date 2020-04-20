package typings.babylonjs.behaviorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Behavior[T] extends js.Object {
  /** gets or sets behavior's name */
  var name: String
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  def attach(target: T): Unit
  /**
    * Called when the behavior is detached from its target
    */
  def detach(): Unit
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  def init(): Unit
}

object Behavior {
  @scala.inline
  def apply[T](attach: T => Unit, detach: () => Unit, init: () => Unit, name: String): Behavior[T] = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), init = js.Any.fromFunction0(init), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior[T]]
  }
}

