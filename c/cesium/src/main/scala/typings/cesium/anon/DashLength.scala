package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashLength extends StObject {
  
  var color: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var dashLength: js.UndefOr[Property | Double] = js.undefined
  
  var dashPattern: js.UndefOr[Property | Double] = js.undefined
  
  var gapColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
}
object DashLength {
  
  inline def apply(): DashLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashLength]
  }
  
  extension [Self <: DashLength](x: Self) {
    
    inline def setColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashLength(value: Property | Double): Self = StObject.set(x, "dashLength", value.asInstanceOf[js.Any])
    
    inline def setDashLengthUndefined: Self = StObject.set(x, "dashLength", js.undefined)
    
    inline def setDashPattern(value: Property | Double): Self = StObject.set(x, "dashPattern", value.asInstanceOf[js.Any])
    
    inline def setDashPatternUndefined: Self = StObject.set(x, "dashPattern", js.undefined)
    
    inline def setGapColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "gapColor", value.asInstanceOf[js.Any])
    
    inline def setGapColorUndefined: Self = StObject.set(x, "gapColor", js.undefined)
  }
}
