package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Material extends js.Object {
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
  implicit class MaterialOps[Self <: Material] (val x: Self) extends AnyVal {
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
    def setBottomRadius(value: Property): Self = this.set("bottomRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomRadius: Self = this.set("bottomRadius", js.undefined)
    @scala.inline
    def setFill(value: Property): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setLength(value: Property): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMaterial(value: MaterialProperty): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setNumberOfVerticalLines(value: Property): Self = this.set("numberOfVerticalLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfVerticalLines: Self = this.set("numberOfVerticalLines", js.undefined)
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
    def setShow(value: Property): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSlices(value: Property): Self = this.set("slices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlices: Self = this.set("slices", js.undefined)
    @scala.inline
    def setTopRadius(value: Property): Self = this.set("topRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopRadius: Self = this.set("topRadius", js.undefined)
  }
  
}

