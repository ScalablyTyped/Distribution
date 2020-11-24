package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseTop extends js.Object {
  
  var closeBottom: js.UndefOr[Property] = js.native
  
  var closeTop: js.UndefOr[Property] = js.native
  
  var coordinates: js.UndefOr[Property] = js.native
  
  var extrudedHeight: js.UndefOr[Property] = js.native
  
  var fill: js.UndefOr[Property] = js.native
  
  var granularity: js.UndefOr[Property] = js.native
  
  var height: js.UndefOr[Property] = js.native
  
  var material: js.UndefOr[MaterialProperty] = js.native
  
  var outline: js.UndefOr[Property] = js.native
  
  var outlineColor: js.UndefOr[Property] = js.native
  
  var outlineWidth: js.UndefOr[Property] = js.native
  
  var rotation: js.UndefOr[Property] = js.native
  
  var show: js.UndefOr[Property] = js.native
  
  var stRotation: js.UndefOr[Property] = js.native
}
object CloseTop {
  
  @scala.inline
  def apply(): CloseTop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseTop]
  }
  
  @scala.inline
  implicit class CloseTopOps[Self <: CloseTop] (val x: Self) extends AnyVal {
    
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
    def setCloseBottom(value: Property): Self = this.set("closeBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseBottom: Self = this.set("closeBottom", js.undefined)
    
    @scala.inline
    def setCloseTop(value: Property): Self = this.set("closeTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTop: Self = this.set("closeTop", js.undefined)
    
    @scala.inline
    def setCoordinates(value: Property): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setExtrudedHeight(value: Property): Self = this.set("extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrudedHeight: Self = this.set("extrudedHeight", js.undefined)
    
    @scala.inline
    def setFill(value: Property): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setGranularity(value: Property): Self = this.set("granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    
    @scala.inline
    def setHeight(value: Property): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
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
    def setRotation(value: Property): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setShow(value: Property): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStRotation(value: Property): Self = this.set("stRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStRotation: Self = this.set("stRotation", js.undefined)
  }
}
