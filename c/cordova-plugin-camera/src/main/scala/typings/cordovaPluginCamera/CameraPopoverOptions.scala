package typings.cordovaPluginCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * iOS-only parameters that specify the anchor element location and arrow direction
  * of the popover when selecting images from an iPad's library or album.
  */
trait CameraPopoverOptions extends StObject {
  
  /**
    * Direction the arrow on the popover should point. Defined in Camera.PopoverArrowDirection
    * Matches iOS UIPopoverArrowDirection constants.
    *      ARROW_UP : 1,        
    *      ARROW_DOWN : 2,
    *      ARROW_LEFT : 4,
    *      ARROW_RIGHT : 8,
    *      ARROW_ANY : 15
    */
  var arrowDir: Double
  
  var height: Double
  
  var popoverHeight: Double
  
  var popoverWidth: Double
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object CameraPopoverOptions {
  
  inline def apply(
    arrowDir: Double,
    height: Double,
    popoverHeight: Double,
    popoverWidth: Double,
    width: Double,
    x: Double,
    y: Double
  ): CameraPopoverOptions = {
    val __obj = js.Dynamic.literal(arrowDir = arrowDir.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], popoverHeight = popoverHeight.asInstanceOf[js.Any], popoverWidth = popoverWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraPopoverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraPopoverOptions] (val x: Self) extends AnyVal {
    
    inline def setArrowDir(value: Double): Self = StObject.set(x, "arrowDir", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPopoverHeight(value: Double): Self = StObject.set(x, "popoverHeight", value.asInstanceOf[js.Any])
    
    inline def setPopoverWidth(value: Double): Self = StObject.set(x, "popoverWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
