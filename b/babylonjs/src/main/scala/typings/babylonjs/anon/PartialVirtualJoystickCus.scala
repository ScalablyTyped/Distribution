package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.VirtualJoystickCustomizations> */
trait PartialVirtualJoystickCus extends StObject {
  
  var alwaysVisible: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var containerImage: js.UndefOr[String] = js.undefined
  
  var containerSize: js.UndefOr[Double] = js.undefined
  
  var limitToContainer: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[X] = js.undefined
  
  var puckImage: js.UndefOr[String] = js.undefined
  
  var puckSize: js.UndefOr[Double] = js.undefined
}
object PartialVirtualJoystickCus {
  
  inline def apply(): PartialVirtualJoystickCus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVirtualJoystickCus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialVirtualJoystickCus] (val x: Self) extends AnyVal {
    
    inline def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setContainerSizeUndefined: Self = StObject.set(x, "containerSize", js.undefined)
    
    inline def setLimitToContainer(value: Boolean): Self = StObject.set(x, "limitToContainer", value.asInstanceOf[js.Any])
    
    inline def setLimitToContainerUndefined: Self = StObject.set(x, "limitToContainer", js.undefined)
    
    inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPuckImage(value: String): Self = StObject.set(x, "puckImage", value.asInstanceOf[js.Any])
    
    inline def setPuckImageUndefined: Self = StObject.set(x, "puckImage", js.undefined)
    
    inline def setPuckSize(value: Double): Self = StObject.set(x, "puckSize", value.asInstanceOf[js.Any])
    
    inline def setPuckSizeUndefined: Self = StObject.set(x, "puckSize", js.undefined)
  }
}
