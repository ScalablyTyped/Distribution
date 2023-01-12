package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRMotionControllerComponentChangesValues[T] extends StObject {
  
  /**
    * current (this frame) value
    */
  var current: T
  
  /**
    * previous (last change) value
    */
  var previous: T
}
object IWebXRMotionControllerComponentChangesValues {
  
  inline def apply[T](current: T, previous: T): IWebXRMotionControllerComponentChangesValues[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRMotionControllerComponentChangesValues[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRMotionControllerComponentChangesValues[?], T] (val x: Self & IWebXRMotionControllerComponentChangesValues[T]) extends AnyVal {
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: T): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
