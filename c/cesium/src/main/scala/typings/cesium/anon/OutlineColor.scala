package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineColor extends StObject {
  
  var color: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var outlineColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var outlineWidth: js.UndefOr[Property | Double] = js.undefined
}
object OutlineColor {
  
  inline def apply(): OutlineColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineColor]
  }
  
  extension [Self <: OutlineColor](x: Self) {
    
    inline def setColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOutlineColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
  }
}
