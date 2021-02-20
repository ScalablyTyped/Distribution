package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlineColor extends StObject {
  
  var fill: js.UndefOr[Property] = js.native
  
  var material: js.UndefOr[MaterialProperty] = js.native
  
  var outline: js.UndefOr[Property] = js.native
  
  var outlineColor: js.UndefOr[Property] = js.native
  
  var outlineWidth: js.UndefOr[Property] = js.native
  
  var radii: js.UndefOr[Property] = js.native
  
  var show: js.UndefOr[Property] = js.native
  
  var slicePartitions: js.UndefOr[Property] = js.native
  
  var stackPartitions: js.UndefOr[Property] = js.native
  
  var subdivisions: js.UndefOr[Property] = js.native
}
object OutlineColor {
  
  @scala.inline
  def apply(): OutlineColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineColor]
  }
  
  @scala.inline
  implicit class OutlineColorMutableBuilder[Self <: OutlineColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: Property): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setMaterial(value: MaterialProperty): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
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
    def setRadii(value: Property): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    @scala.inline
    def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSlicePartitions(value: Property): Self = StObject.set(x, "slicePartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicePartitionsUndefined: Self = StObject.set(x, "slicePartitions", js.undefined)
    
    @scala.inline
    def setStackPartitions(value: Property): Self = StObject.set(x, "stackPartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPartitionsUndefined: Self = StObject.set(x, "stackPartitions", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Property): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
  }
}
