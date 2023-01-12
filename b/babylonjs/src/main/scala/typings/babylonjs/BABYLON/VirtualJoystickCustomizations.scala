package typings.babylonjs.BABYLON

import typings.babylonjs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the different customization options available
  * for VirtualJoystick
  */
trait VirtualJoystickCustomizations extends StObject {
  
  /**
    * Defines whether or not the joystick container is always visible
    */
  var alwaysVisible: Boolean
  
  /**
    * Color of the joystick && puck
    */
  var color: String
  
  /**
    * Image URL for the joystick's container
    */
  var containerImage: js.UndefOr[String] = js.undefined
  
  /**
    * Size of the joystick's container
    */
  var containerSize: Double
  
  /**
    * Defines whether or not to limit the movement of the puck to the joystick's container
    */
  var limitToContainer: Boolean
  
  /**
    * Defines the unmoving position of the joystick container
    */
  var position: js.UndefOr[X] = js.undefined
  
  /**
    * Image URL for the joystick's puck
    */
  var puckImage: js.UndefOr[String] = js.undefined
  
  /**
    * Size of the joystick's puck
    */
  var puckSize: Double
}
object VirtualJoystickCustomizations {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: VirtualJoystickCustomizations] (val x: Self) extends AnyVal {
    
    inline def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setLimitToContainer(value: Boolean): Self = StObject.set(x, "limitToContainer", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPuckImage(value: String): Self = StObject.set(x, "puckImage", value.asInstanceOf[js.Any])
    
    inline def setPuckImageUndefined: Self = StObject.set(x, "puckImage", js.undefined)
    
    inline def setPuckSize(value: Double): Self = StObject.set(x, "puckSize", value.asInstanceOf[js.Any])
  }
}
