package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlineColor extends js.Object {
  
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
  implicit class OutlineColorOps[Self <: OutlineColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFill(value: Property): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setMaterial(value: MaterialProperty): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setOutline(value: Property): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: Property): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Property): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    
    @scala.inline
    def setRadii(value: Property): Self = this.set("radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadii: Self = this.set("radii", js.undefined)
    
    @scala.inline
    def setShow(value: Property): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSlicePartitions(value: Property): Self = this.set("slicePartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlicePartitions: Self = this.set("slicePartitions", js.undefined)
    
    @scala.inline
    def setStackPartitions(value: Property): Self = this.set("stackPartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackPartitions: Self = this.set("stackPartitions", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Property): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
  }
}
