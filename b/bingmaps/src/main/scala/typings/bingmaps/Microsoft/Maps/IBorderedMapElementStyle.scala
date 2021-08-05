package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBorderedMapElementStyle
  extends StObject
     with IMapElementStyle {
  
  /**
    * Secondary/casing line hex color of the border of a filled polygon.
    */
  var borderOutlineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Primary line hex color of the border of a filled polygon.
    */
  var borderStrokeColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if a border is visible or not.
    */
  var borderVisible: js.UndefOr[Boolean] = js.undefined
}
object IBorderedMapElementStyle {
  
  inline def apply(): IBorderedMapElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBorderedMapElementStyle]
  }
  
  extension [Self <: IBorderedMapElementStyle](x: Self) {
    
    inline def setBorderOutlineColor(value: String): Self = StObject.set(x, "borderOutlineColor", value.asInstanceOf[js.Any])
    
    inline def setBorderOutlineColorUndefined: Self = StObject.set(x, "borderOutlineColor", js.undefined)
    
    inline def setBorderStrokeColor(value: String): Self = StObject.set(x, "borderStrokeColor", value.asInstanceOf[js.Any])
    
    inline def setBorderStrokeColorUndefined: Self = StObject.set(x, "borderStrokeColor", js.undefined)
    
    inline def setBorderVisible(value: Boolean): Self = StObject.set(x, "borderVisible", value.asInstanceOf[js.Any])
    
    inline def setBorderVisibleUndefined: Self = StObject.set(x, "borderVisible", js.undefined)
  }
}
