package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
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
  implicit class PointerInfoPreMutableBuilder[Self <: PointerInfoPre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalPosition(value: Vector2): Self = StObject.set(x, "localPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRay(value: Nullable[Ray]): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRayNull: Self = StObject.set(x, "ray", null)
    
    @scala.inline
    def setSkipOnPointerObservable(value: Boolean): Self = StObject.set(x, "skipOnPointerObservable", value.asInstanceOf[js.Any])
  }
}
