package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScreenshotSize extends StObject {
  
  /**
    * number in pixels for canvas height
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * multiplier allowing render at a higher or lower resolution
    * If value is defined then height and width will be ignored and taken from camera
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * number in pixels for canvas width
    */
  var width: js.UndefOr[Double] = js.native
}
object IScreenshotSize {
  
  @scala.inline
  def apply(): IScreenshotSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScreenshotSize]
  }
  
  @scala.inline
  implicit class IScreenshotSizeMutableBuilder[Self <: IScreenshotSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
