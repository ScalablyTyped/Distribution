package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outline extends js.Object {
  
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
  implicit class OutlineOps[Self <: Outline] (val x: Self) extends AnyVal {
    
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
    def setExtrudedHeight(value: Property): Self = this.set("extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrudedHeight: Self = this.set("extrudedHeight", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
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
    def setMaterial(value: MaterialProperty | typings.cesium.mod.Color): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setNumberOfVerticalLines(value: Property): Self = this.set("numberOfVerticalLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfVerticalLines: Self = this.set("numberOfVerticalLines", js.undefined)
    
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: typings.cesium.mod.Color): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Double): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    
    @scala.inline
    def setRotation(value: Property): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setSemiMajorAxis(value: Property | Double): Self = this.set("semiMajorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemiMajorAxis: Self = this.set("semiMajorAxis", js.undefined)
    
    @scala.inline
    def setSemiMinorAxis(value: Property | Double): Self = this.set("semiMinorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemiMinorAxis: Self = this.set("semiMinorAxis", js.undefined)
    
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
