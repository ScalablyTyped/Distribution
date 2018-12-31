package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface used to define a behavior
  */
trait Behavior[T] extends js.Object {
  /** gets or sets behavior's name */
  var name: java.lang.String
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  def attach(target: T): scala.Unit
  /**
    * Called when the behavior is detached from its target
    */
  def detach(): scala.Unit
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  def init(): scala.Unit
}

