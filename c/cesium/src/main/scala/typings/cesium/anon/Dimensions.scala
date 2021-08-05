package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  var dimensions: js.UndefOr[Property] = js.undefined
  
  var fill: js.UndefOr[Property] = js.undefined
  
  var material: js.UndefOr[MaterialProperty] = js.undefined
  
  var outline: js.UndefOr[Property] = js.undefined
  
  var outlineColor: js.UndefOr[Property] = js.undefined
  
  var outlineWidth: js.UndefOr[Property] = js.undefined
  
  var show: js.UndefOr[Property] = js.undefined
}
object Dimensions {
  
  inline def apply(): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimensions]
  }
  
  extension [Self <: Dimensions](x: Self) {
    
    inline def setDimensions(value: Property): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setFill(value: Property): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setMaterial(value: MaterialProperty): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setOutline(value: Property): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineColor(value: Property): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setOutlineWidth(value: Property): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
