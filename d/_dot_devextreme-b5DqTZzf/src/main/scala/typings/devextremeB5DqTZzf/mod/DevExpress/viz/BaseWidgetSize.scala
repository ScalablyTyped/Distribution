package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWidgetSize extends StObject {
  
  /**
    * Specifies the height of the UI component in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width of the UI component in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object BaseWidgetSize {
  
  inline def apply(): BaseWidgetSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetSize]
  }
  
  extension [Self <: BaseWidgetSize](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
