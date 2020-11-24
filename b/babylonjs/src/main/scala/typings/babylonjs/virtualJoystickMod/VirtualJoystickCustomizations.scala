package typings.babylonjs.virtualJoystickMod

import typings.babylonjs.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the different customization options available
  * for VirtualJoystick
  */
@js.native
trait VirtualJoystickCustomizations extends js.Object {
  
  /**
    * Defines whether or not the joystick container is always visible
    */
  var alwaysVisible: Boolean = js.native
  
  /**
    * Color of the joystick && puck
    */
  var color: String = js.native
  
  /**
    * Image URL for the joystick's container
    */
  var containerImage: js.UndefOr[String] = js.native
  
  /**
    * Size of the joystick's container
    */
  var containerSize: Double = js.native
  
  /**
    * Defines whether or not to limit the movement of the puck to the joystick's container
    */
  var limitToContainer: Boolean = js.native
  
  /**
    * Defines the unmoving position of the joystick container
    */
  var position: js.UndefOr[Y] = js.native
  
  /**
    * Image URL for the joystick's puck
    */
  var puckImage: js.UndefOr[String] = js.native
  
  /**
    * Size of the joystick's puck
    */
  var puckSize: Double = js.native
}
object VirtualJoystickCustomizations {
  
  @scala.inline
  def apply(
    alwaysVisible: Boolean,
    color: String,
    containerSize: Double,
    limitToContainer: Boolean,
    puckSize: Double
  ): VirtualJoystickCustomizations = {
    val __obj = js.Dynamic.literal(alwaysVisible = alwaysVisible.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], limitToContainer = limitToContainer.asInstanceOf[js.Any], puckSize = puckSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualJoystickCustomizations]
  }
  
  @scala.inline
  implicit class VirtualJoystickCustomizationsOps[Self <: VirtualJoystickCustomizations] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerSize(value: Double): Self = this.set("containerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitToContainer(value: Boolean): Self = this.set("limitToContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPuckSize(value: Double): Self = this.set("puckSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImage(value: String): Self = this.set("containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImage: Self = this.set("containerImage", js.undefined)
    
    @scala.inline
    def setPosition(value: Y): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPuckImage(value: String): Self = this.set("puckImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePuckImage: Self = this.set("puckImage", js.undefined)
  }
}
