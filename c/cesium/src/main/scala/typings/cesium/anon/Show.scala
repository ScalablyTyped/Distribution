package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Show extends StObject {
  
  var fill: js.UndefOr[Property] = js.undefined
  
  var granularity: js.UndefOr[Property] = js.undefined
  
  var material: js.UndefOr[MaterialProperty] = js.undefined
  
  var maximumHeights: js.UndefOr[Property] = js.undefined
  
  var minimumHeights: js.UndefOr[Property] = js.undefined
  
  var outline: js.UndefOr[Property] = js.undefined
  
  var outlineColor: js.UndefOr[Property] = js.undefined
  
  var outlineWidth: js.UndefOr[Property] = js.undefined
  
  var positions: js.UndefOr[Property] = js.undefined
  
  var show: js.UndefOr[Property] = js.undefined
}
object Show {
  
  @scala.inline
  def apply(): Show = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Show]
  }
  
  @scala.inline
  implicit class ShowMutableBuilder[Self <: Show] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: Property): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGranularity(value: Property): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setMaterial(value: MaterialProperty): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setMaximumHeights(value: Property): Self = StObject.set(x, "maximumHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumHeightsUndefined: Self = StObject.set(x, "maximumHeights", js.undefined)
    
    @scala.inline
    def setMinimumHeights(value: Property): Self = StObject.set(x, "minimumHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumHeightsUndefined: Self = StObject.set(x, "minimumHeights", js.undefined)
    
    @scala.inline
    def setOutline(value: Property): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColor(value: Property): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Property): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    @scala.inline
    def setPositions(value: Property): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    @scala.inline
    def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
