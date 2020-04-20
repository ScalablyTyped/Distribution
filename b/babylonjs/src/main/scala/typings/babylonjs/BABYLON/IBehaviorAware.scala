package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBehaviorAware[T] extends js.Object {
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  def addBehavior(behavior: Behavior[T]): T
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  def getBehaviorByName(name: String): Nullable[Behavior[T]]
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  def removeBehavior(behavior: Behavior[T]): T
}

object IBehaviorAware {
  @scala.inline
  def apply[T](
    addBehavior: Behavior[T] => T,
    getBehaviorByName: String => Nullable[Behavior[T]],
    removeBehavior: Behavior[T] => T
  ): IBehaviorAware[T] = {
    val __obj = js.Dynamic.literal(addBehavior = js.Any.fromFunction1(addBehavior), getBehaviorByName = js.Any.fromFunction1(getBehaviorByName), removeBehavior = js.Any.fromFunction1(removeBehavior))
    __obj.asInstanceOf[IBehaviorAware[T]]
  }
}

