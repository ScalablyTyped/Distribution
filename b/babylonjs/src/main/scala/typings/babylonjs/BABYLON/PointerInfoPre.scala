package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerInfoPre extends PointerInfoBase {
  
  /**
    * Defines the local position of the pointer on the canvas.
    */
  var localPosition: Vector2 = js.native
  
  /**
    * Ray from a pointer if availible (eg. 6dof controller)
    */
  var ray: Nullable[Ray] = js.native
  
  /**
    * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
    */
  var skipOnPointerObservable: Boolean = js.native
}
object PointerInfoPre {
  
  @scala.inline
  def apply(
    event: PointerEvent | MouseWheelEvent,
    localPosition: Vector2,
    skipOnPointerObservable: Boolean,
    `type`: Double
  ): PointerInfoPre = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], localPosition = localPosition.asInstanceOf[js.Any], skipOnPointerObservable = skipOnPointerObservable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoPre]
  }
  
  @scala.inline
  implicit class PointerInfoPreOps[Self <: PointerInfoPre] (val x: Self) extends AnyVal {
    
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
    def setLocalPosition(value: Vector2): Self = this.set("localPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipOnPointerObservable(value: Boolean): Self = this.set("skipOnPointerObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRay(value: Nullable[Ray]): Self = this.set("ray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRayNull: Self = this.set("ray", null)
  }
}
