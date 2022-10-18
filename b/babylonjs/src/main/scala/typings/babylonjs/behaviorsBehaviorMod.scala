package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsBehaviorMod {
  
  trait Behavior[T] extends StObject {
    
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
    
    /** gets or sets behavior's name */
    var name: String
  }
  object Behavior {
    
    inline def apply[T](attach: T => Unit, detach: () => Unit, init: () => Unit, name: String): Behavior[T] = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), init = js.Any.fromFunction0(init), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Behavior[T]]
    }
    
    extension [Self <: Behavior[?], T](x: Self & Behavior[T]) {
      
      inline def setAttach(value: T => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
      
      inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBehaviorAware[T] extends StObject {
    
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
    
    inline def apply[T](
      addBehavior: Behavior[T] => T,
      getBehaviorByName: String => Nullable[Behavior[T]],
      removeBehavior: Behavior[T] => T
    ): IBehaviorAware[T] = {
      val __obj = js.Dynamic.literal(addBehavior = js.Any.fromFunction1(addBehavior), getBehaviorByName = js.Any.fromFunction1(getBehaviorByName), removeBehavior = js.Any.fromFunction1(removeBehavior))
      __obj.asInstanceOf[IBehaviorAware[T]]
    }
    
    extension [Self <: IBehaviorAware[?], T](x: Self & IBehaviorAware[T]) {
      
      inline def setAddBehavior(value: Behavior[T] => T): Self = StObject.set(x, "addBehavior", js.Any.fromFunction1(value))
      
      inline def setGetBehaviorByName(value: String => Nullable[Behavior[T]]): Self = StObject.set(x, "getBehaviorByName", js.Any.fromFunction1(value))
      
      inline def setRemoveBehavior(value: Behavior[T] => T): Self = StObject.set(x, "removeBehavior", js.Any.fromFunction1(value))
    }
  }
}
