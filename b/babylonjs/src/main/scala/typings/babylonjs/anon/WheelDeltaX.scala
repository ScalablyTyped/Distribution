package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WheelDeltaX extends StObject {
  
  var wheelDeltaX: Double = js.native
  
  var wheelDeltaY: Double = js.native
  
  var wheelDeltaZ: Double = js.native
}
object WheelDeltaX {
  
  @scala.inline
  def apply(wheelDeltaX: Double, wheelDeltaY: Double, wheelDeltaZ: Double): WheelDeltaX = {
    val __obj = js.Dynamic.literal(wheelDeltaX = wheelDeltaX.asInstanceOf[js.Any], wheelDeltaY = wheelDeltaY.asInstanceOf[js.Any], wheelDeltaZ = wheelDeltaZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelDeltaX]
  }
  
  @scala.inline
  implicit class WheelDeltaXMutableBuilder[Self <: WheelDeltaX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWheelDeltaX(value: Double): Self = StObject.set(x, "wheelDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDeltaY(value: Double): Self = StObject.set(x, "wheelDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDeltaZ(value: Double): Self = StObject.set(x, "wheelDeltaZ", value.asInstanceOf[js.Any])
  }
}
