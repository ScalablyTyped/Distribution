package typings.babylonjs.behaviorMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBehaviorAware[T] extends js.Object {
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  def addBehavior(behavior: Behavior[T]): T = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  def getBehaviorByName(name: String): Nullable[Behavior[T]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  def removeBehavior(behavior: Behavior[T]): T = js.native
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
  
  @scala.inline
  implicit class IBehaviorAwareOps[Self <: IBehaviorAware[_], T] (val x: Self with IBehaviorAware[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddBehavior(value: Behavior[T] => T): Self = this.set("addBehavior", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBehaviorByName(value: String => Nullable[Behavior[T]]): Self = this.set("getBehaviorByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveBehavior(value: Behavior[T] => T): Self = this.set("removeBehavior", js.Any.fromFunction1(value))
  }
}
