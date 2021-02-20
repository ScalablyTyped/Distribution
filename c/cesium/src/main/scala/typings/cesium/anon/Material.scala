package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Material extends StObject {
  
  var bottomRadius: js.UndefOr[Property] = js.native
  
  var fill: js.UndefOr[Property] = js.native
  
  var length: js.UndefOr[Property] = js.native
  
  var material: js.UndefOr[MaterialProperty] = js.native
  
  var numberOfVerticalLines: js.UndefOr[Property] = js.native
  
  var outline: js.UndefOr[Property] = js.native
  
  var outlineColor: js.UndefOr[Property] = js.native
  
  var outlineWidth: js.UndefOr[Property] = js.native
  
  var show: js.UndefOr[Property] = js.native
  
  var slices: js.UndefOr[Property] = js.native
  
  var topRadius: js.UndefOr[Property] = js.native
}
object Material {
  
  @scala.inline
  def apply(): Material = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Material]
  }
  
  @scala.inline
  implicit class MaterialMutableBuilder[Self <: Material] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomRadius(value: Property): Self = StObject.set(x, "bottomRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomRadiusUndefined: Self = StObject.set(x, "bottomRadius", js.undefined)
    
    @scala.inline
    def setFill(value: Property): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setLength(value: Property): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMaterial(value: MaterialProperty): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setNumberOfVerticalLines(value: Property): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
    
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
    def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSlices(value: Property): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    @scala.inline
    def setTopRadius(value: Property): Self = StObject.set(x, "topRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRadiusUndefined: Self = StObject.set(x, "topRadius", js.undefined)
  }
}
