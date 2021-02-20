package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerTouch extends StObject {
  
  /**
    * Id of touch. Unique for each finger.
    */
  var pointerId: Double = js.native
  
  /**
    * Event type passed from DOM.
    */
  var `type`: js.Any = js.native
  
  /**
    * X coordinate of touch.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of touch.
    */
  var y: Double = js.native
}
object PointerTouch {
  
  @scala.inline
  def apply(pointerId: Double, `type`: js.Any, x: Double, y: Double): PointerTouch = {
    val __obj = js.Dynamic.literal(pointerId = pointerId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerTouch]
  }
  
  @scala.inline
  implicit class PointerTouchMutableBuilder[Self <: PointerTouch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
