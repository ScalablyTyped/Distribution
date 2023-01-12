package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait createElevationBandMaterialEntry extends StObject {
  
  var color: Color
  
  var height: Double
}
object createElevationBandMaterialEntry {
  
  inline def apply(color: Color, height: Double): createElevationBandMaterialEntry = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[createElevationBandMaterialEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: createElevationBandMaterialEntry] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
