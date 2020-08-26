package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fill extends js.Object {
  var cornerType: js.UndefOr[Property] = js.native
  var extrudedHeight: js.UndefOr[Property] = js.native
  var fill: js.UndefOr[Property] = js.native
  var granularity: js.UndefOr[Property] = js.native
  var height: js.UndefOr[Property] = js.native
  var material: js.UndefOr[MaterialProperty] = js.native
  var outline: js.UndefOr[Property] = js.native
  var outlineColor: js.UndefOr[Property] = js.native
  var outlineWidth: js.UndefOr[Property] = js.native
  var positions: js.UndefOr[Property] = js.native
  var show: js.UndefOr[Property] = js.native
  var width: js.UndefOr[Property] = js.native
}

object Fill {
  @scala.inline
  def apply(): Fill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  implicit class FillOps[Self <: Fill] (val x: Self) extends AnyVal {
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
    def setCornerType(value: Property): Self = this.set("cornerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerType: Self = this.set("cornerType", js.undefined)
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
    def setPositions(value: Property): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
    @scala.inline
    def setShow(value: Property): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setWidth(value: Property): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

