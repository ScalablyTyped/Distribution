package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerInfo extends PointerInfoBase {
  
  /**
    * Defines the picking info associated to the info (if any)\
    */
  var pickInfo: Nullable[PickingInfo] = js.native
}
object PointerInfo {
  
  @scala.inline
  def apply(event: PointerEvent | MouseWheelEvent, `type`: Double): PointerInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfo]
  }
  
  @scala.inline
  implicit class PointerInfoMutableBuilder[Self <: PointerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPickInfo(value: Nullable[PickingInfo]): Self = StObject.set(x, "pickInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickInfoNull: Self = StObject.set(x, "pickInfo", null)
  }
}
