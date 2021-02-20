package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorMod {
  
  @js.native
  trait Behavior[T] extends StObject {
    
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    def attach(target: T): Unit = js.native
    
    /**
      * Called when the behavior is detached from its target
      */
    def detach(): Unit = js.native
    
    /**
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    def init(): Unit = js.native
    
    /** gets or sets behavior's name */
    var name: String = js.native
  }
  object Behavior {
    
    @scala.inline
    def apply[T](attach: T => Unit, detach: () => Unit, init: () => Unit, name: String): Behavior[T] = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), init = js.Any.fromFunction0(init), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Behavior[T]]
    }
    
    @scala.inline
    implicit class BehaviorMutableBuilder[Self <: Behavior[_], T] (val x: Self with Behavior[T]) extends AnyVal {
      
      @scala.inline
      def setAttach(value: T => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBehaviorAware[T] extends StObject {
    
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
    implicit class IBehaviorAwareMutableBuilder[Self <: IBehaviorAware[_], T] (val x: Self with IBehaviorAware[T]) extends AnyVal {
      
      @scala.inline
      def setAddBehavior(value: Behavior[T] => T): Self = StObject.set(x, "addBehavior", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBehaviorByName(value: String => Nullable[Behavior[T]]): Self = StObject.set(x, "getBehaviorByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveBehavior(value: Behavior[T] => T): Self = StObject.set(x, "removeBehavior", js.Any.fromFunction1(value))
    }
  }
}
