package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.VirtualJoystickCustomizations> */
@js.native
trait PartialVirtualJoystickCus extends js.Object {
  
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
  implicit class PartialVirtualJoystickCusOps[Self <: PartialVirtualJoystickCus] (val x: Self) extends AnyVal {
    
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
    def setAlwaysVisible(value: Boolean): Self = this.set("alwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysVisible: Self = this.set("alwaysVisible", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContainerImage(value: String): Self = this.set("containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImage: Self = this.set("containerImage", js.undefined)
    
    @scala.inline
    def setContainerSize(value: Double): Self = this.set("containerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerSize: Self = this.set("containerSize", js.undefined)
    
    @scala.inline
    def setLimitToContainer(value: Boolean): Self = this.set("limitToContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitToContainer: Self = this.set("limitToContainer", js.undefined)
    
    @scala.inline
    def setPosition(value: Y): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPuckImage(value: String): Self = this.set("puckImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePuckImage: Self = this.set("puckImage", js.undefined)
    
    @scala.inline
    def setPuckSize(value: Double): Self = this.set("puckSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePuckSize: Self = this.set("puckSize", js.undefined)
  }
}
