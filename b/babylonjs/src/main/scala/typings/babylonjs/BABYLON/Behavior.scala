package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Behavior[?], T] (val x: Self & Behavior[T]) extends AnyVal {
    
    inline def setAttach(value: T => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
