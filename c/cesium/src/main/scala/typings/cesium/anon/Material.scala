package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Material extends StObject {
  
  var bottomRadius: js.UndefOr[Property] = js.undefined
  
  var fill: js.UndefOr[Property] = js.undefined
  
  var length: js.UndefOr[Property] = js.undefined
  
  var material: js.UndefOr[MaterialProperty] = js.undefined
  
  var numberOfVerticalLines: js.UndefOr[Property] = js.undefined
  
  var outline: js.UndefOr[Property] = js.undefined
  
  var outlineColor: js.UndefOr[Property] = js.undefined
  
  var outlineWidth: js.UndefOr[Property] = js.undefined
  
  var show: js.UndefOr[Property] = js.undefined
  
  var slices: js.UndefOr[Property] = js.undefined
  
  var topRadius: js.UndefOr[Property] = js.undefined
}
object Material {
  
  inline def apply(): Material = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Material]
  }
  
  extension [Self <: Material](x: Self) {
    
    inline def setBottomRadius(value: Property): Self = StObject.set(x, "bottomRadius", value.asInstanceOf[js.Any])
    
    inline def setBottomRadiusUndefined: Self = StObject.set(x, "bottomRadius", js.undefined)
    
    inline def setFill(value: Property): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setLength(value: Property): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMaterial(value: MaterialProperty): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setNumberOfVerticalLines(value: Property): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
    
    inline def setOutline(value: Property): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineColor(value: Property): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setOutlineWidth(value: Property): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSlices(value: Property): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    inline def setTopRadius(value: Property): Self = StObject.set(x, "topRadius", value.asInstanceOf[js.Any])
    
    inline def setTopRadiusUndefined: Self = StObject.set(x, "topRadius", js.undefined)
  }
}
