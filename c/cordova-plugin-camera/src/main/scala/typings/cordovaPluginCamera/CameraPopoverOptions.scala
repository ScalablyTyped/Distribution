package typings.cordovaPluginCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * iOS-only parameters that specify the anchor element location and arrow direction
  * of the popover when selecting images from an iPad's library or album.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CameraPopoverOptions * / any */ @js.native
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
  var arrowDir: Double = js.native
  
  var height: Double = js.native
  
  var popoverHeight: Double = js.native
  
  var popoverWidth: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object CameraPopoverOptions {
  
  @scala.inline
  def apply(
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
  implicit class CameraPopoverOptionsMutableBuilder[Self <: CameraPopoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowDir(value: Double): Self = StObject.set(x, "arrowDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverHeight(value: Double): Self = StObject.set(x, "popoverHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverWidth(value: Double): Self = StObject.set(x, "popoverWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
