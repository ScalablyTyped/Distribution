package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineColor extends StObject {
  
  var fill: js.UndefOr[Property] = js.undefined
  
  var material: js.UndefOr[MaterialProperty] = js.undefined
  
  var outline: js.UndefOr[Property] = js.undefined
  
  var outlineColor: js.UndefOr[Property] = js.undefined
  
  var outlineWidth: js.UndefOr[Property] = js.undefined
  
  var radii: js.UndefOr[Property] = js.undefined
  
  var show: js.UndefOr[Property] = js.undefined
  
  var slicePartitions: js.UndefOr[Property] = js.undefined
  
  var stackPartitions: js.UndefOr[Property] = js.undefined
  
  var subdivisions: js.UndefOr[Property] = js.undefined
}
object OutlineColor {
  
  inline def apply(): OutlineColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineColor]
  }
  
  extension [Self <: OutlineColor](x: Self) {
    
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
    
    inline def setRadii(value: Property): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    inline def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    inline def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSlicePartitions(value: Property): Self = StObject.set(x, "slicePartitions", value.asInstanceOf[js.Any])
    
    inline def setSlicePartitionsUndefined: Self = StObject.set(x, "slicePartitions", js.undefined)
    
    inline def setStackPartitions(value: Property): Self = StObject.set(x, "stackPartitions", value.asInstanceOf[js.Any])
    
    inline def setStackPartitionsUndefined: Self = StObject.set(x, "stackPartitions", js.undefined)
    
    inline def setSubdivisions(value: Property): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
  }
}
