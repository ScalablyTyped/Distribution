package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outline extends StObject {
  
  var extrudedHeight: js.UndefOr[Property] = js.native
  
  var fill: js.UndefOr[Boolean] = js.native
  
  var granularity: js.UndefOr[Property] = js.native
  
  var height: js.UndefOr[Property] = js.native
  
  var material: js.UndefOr[MaterialProperty | typings.cesium.mod.Color] = js.native
  
  var numberOfVerticalLines: js.UndefOr[Property] = js.native
  
  var outline: js.UndefOr[Boolean] = js.native
  
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var outlineWidth: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Property] = js.native
  
  var semiMajorAxis: js.UndefOr[Property | Double] = js.native
  
  var semiMinorAxis: js.UndefOr[Property | Double] = js.native
  
  var show: js.UndefOr[Property] = js.native
  
  var stRotation: js.UndefOr[Property] = js.native
}
object Outline {
  
  @scala.inline
  def apply(): Outline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outline]
  }
  
  @scala.inline
  implicit class OutlineMutableBuilder[Self <: Outline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtrudedHeight(value: Property): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGranularity(value: Property): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setHeight(value: Property): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaterial(value: MaterialProperty | typings.cesium.mod.Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setNumberOfVerticalLines(value: Property): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
    
    @scala.inline
    def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    @scala.inline
    def setRotation(value: Property): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSemiMajorAxis(value: Property | Double): Self = StObject.set(x, "semiMajorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiMajorAxisUndefined: Self = StObject.set(x, "semiMajorAxis", js.undefined)
    
    @scala.inline
    def setSemiMinorAxis(value: Property | Double): Self = StObject.set(x, "semiMinorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiMinorAxisUndefined: Self = StObject.set(x, "semiMinorAxis", js.undefined)
    
    @scala.inline
    def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStRotation(value: Property): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
  }
}
