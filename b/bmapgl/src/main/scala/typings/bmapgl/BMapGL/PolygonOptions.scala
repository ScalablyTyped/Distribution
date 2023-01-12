package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonOptions extends StObject {
  
  var enableClicking: js.UndefOr[Boolean] = js.undefined
  
  var enableEditing: js.UndefOr[Boolean] = js.undefined
  
  var enableMassClear: js.UndefOr[Boolean] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeStyle: js.UndefOr[String] = js.undefined
  
  var strokeWeight: js.UndefOr[Double] = js.undefined
}
object PolygonOptions {
  
  inline def apply(): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolygonOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableClicking(value: Boolean): Self = StObject.set(x, "enableClicking", value.asInstanceOf[js.Any])
    
    inline def setEnableClickingUndefined: Self = StObject.set(x, "enableClicking", js.undefined)
    
    inline def setEnableEditing(value: Boolean): Self = StObject.set(x, "enableEditing", value.asInstanceOf[js.Any])
    
    inline def setEnableEditingUndefined: Self = StObject.set(x, "enableEditing", js.undefined)
    
    inline def setEnableMassClear(value: Boolean): Self = StObject.set(x, "enableMassClear", value.asInstanceOf[js.Any])
    
    inline def setEnableMassClearUndefined: Self = StObject.set(x, "enableMassClear", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
