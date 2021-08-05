package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  var extrudedHeight: js.UndefOr[Property] = js.undefined
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var granularity: js.UndefOr[Property] = js.undefined
  
  var height: js.UndefOr[Property] = js.undefined
  
  var material: js.UndefOr[MaterialProperty | typings.cesium.mod.Color] = js.undefined
  
  var numberOfVerticalLines: js.UndefOr[Property] = js.undefined
  
  var outline: js.UndefOr[Boolean] = js.undefined
  
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var outlineWidth: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[Property] = js.undefined
  
  var semiMajorAxis: js.UndefOr[Property | Double] = js.undefined
  
  var semiMinorAxis: js.UndefOr[Property | Double] = js.undefined
  
  var show: js.UndefOr[Property] = js.undefined
  
  var stRotation: js.UndefOr[Property] = js.undefined
}
object Outline {
  
  inline def apply(): Outline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outline]
  }
  
  extension [Self <: Outline](x: Self) {
    
    inline def setExtrudedHeight(value: Property): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    inline def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setGranularity(value: Property): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setHeight(value: Property): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaterial(value: MaterialProperty | typings.cesium.mod.Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setNumberOfVerticalLines(value: Property): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
    
    inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setRotation(value: Property): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSemiMajorAxis(value: Property | Double): Self = StObject.set(x, "semiMajorAxis", value.asInstanceOf[js.Any])
    
    inline def setSemiMajorAxisUndefined: Self = StObject.set(x, "semiMajorAxis", js.undefined)
    
    inline def setSemiMinorAxis(value: Property | Double): Self = StObject.set(x, "semiMinorAxis", value.asInstanceOf[js.Any])
    
    inline def setSemiMinorAxisUndefined: Self = StObject.set(x, "semiMinorAxis", js.undefined)
    
    inline def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStRotation(value: Property): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
    
    inline def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
  }
}
