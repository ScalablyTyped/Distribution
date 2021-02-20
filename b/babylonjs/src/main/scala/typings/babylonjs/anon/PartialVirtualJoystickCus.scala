package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.VirtualJoystickCustomizations> */
@js.native
trait PartialVirtualJoystickCus extends StObject {
  
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var containerImage: js.UndefOr[String] = js.native
  
  var containerSize: js.UndefOr[Double] = js.native
  
  var limitToContainer: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[Y] = js.native
  
  var puckImage: js.UndefOr[String] = js.native
  
  var puckSize: js.UndefOr[Double] = js.native
}
object PartialVirtualJoystickCus {
  
  @scala.inline
  def apply(): PartialVirtualJoystickCus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVirtualJoystickCus]
  }
  
  @scala.inline
  implicit class PartialVirtualJoystickCusMutableBuilder[Self <: PartialVirtualJoystickCus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    @scala.inline
    def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerSizeUndefined: Self = StObject.set(x, "containerSize", js.undefined)
    
    @scala.inline
    def setLimitToContainer(value: Boolean): Self = StObject.set(x, "limitToContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitToContainerUndefined: Self = StObject.set(x, "limitToContainer", js.undefined)
    
    @scala.inline
    def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPuckImage(value: String): Self = StObject.set(x, "puckImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPuckImageUndefined: Self = StObject.set(x, "puckImage", js.undefined)
    
    @scala.inline
    def setPuckSize(value: Double): Self = StObject.set(x, "puckSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPuckSizeUndefined: Self = StObject.set(x, "puckSize", js.undefined)
  }
}
