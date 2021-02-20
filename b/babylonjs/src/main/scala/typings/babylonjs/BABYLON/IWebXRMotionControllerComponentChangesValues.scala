package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRMotionControllerComponentChangesValues[T] extends StObject {
  
  /**
    * current (this frame) value
    */
  var current: T = js.native
  
  /**
    * previous (last change) value
    */
  var previous: T = js.native
}
object IWebXRMotionControllerComponentChangesValues {
  
  @scala.inline
  def apply[T](current: T, previous: T): IWebXRMotionControllerComponentChangesValues[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRMotionControllerComponentChangesValues[T]]
  }
  
  @scala.inline
  implicit class IWebXRMotionControllerComponentChangesValuesMutableBuilder[Self <: IWebXRMotionControllerComponentChangesValues[_], T] (val x: Self with IWebXRMotionControllerComponentChangesValues[T]) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: T): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
