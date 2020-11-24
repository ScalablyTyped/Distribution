package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRMotionControllerComponentChangesValues[T] extends js.Object {
  
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
  implicit class IWebXRMotionControllerComponentChangesValuesOps[Self <: IWebXRMotionControllerComponentChangesValues[_], T] (val x: Self with IWebXRMotionControllerComponentChangesValues[T]) extends AnyVal {
    
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
    def setCurrent(value: T): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: T): Self = this.set("previous", value.asInstanceOf[js.Any])
  }
}
