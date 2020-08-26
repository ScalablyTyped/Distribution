package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ConstantProperty
import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationType extends js.Object {
  var arcType: js.UndefOr[Property | typings.cesium.mod.ArcType] = js.native
  var classificationType: js.UndefOr[Property | typings.cesium.mod.ClassificationType] = js.native
  var closeBottom: js.UndefOr[Boolean] = js.native
  var closeTop: js.UndefOr[Boolean] = js.native
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  var extrudedHeight: js.UndefOr[Property] = js.native
  var extrudedHeightReference: js.UndefOr[Property] = js.native
  var fill: js.UndefOr[Property | Boolean] = js.native
  var granularity: js.UndefOr[Property] = js.native
  var height: js.UndefOr[Property | Double] = js.native
  var heightReference: js.UndefOr[Property] = js.native
  var hierarchy: js.UndefOr[Property | js.Array[Cartesian3] | typings.cesium.mod.PolygonHierarchy] = js.native
  var material: js.UndefOr[MaterialProperty | typings.cesium.mod.Color] = js.native
  var outline: js.UndefOr[Property | Boolean] = js.native
  var outlineColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.native
  var outlineWidth: js.UndefOr[Property | Double] = js.native
  var perPositionHeight: js.UndefOr[Property] = js.native
  var shadows: js.UndefOr[Property | ShadowMode] = js.native
  var show: js.UndefOr[Property | Boolean] = js.native
  var stRotation: js.UndefOr[Property] = js.native
  var zIndex: js.UndefOr[ConstantProperty | Double] = js.native
}

object ClassificationType {
  @scala.inline
  def apply(): ClassificationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationType]
  }
  @scala.inline
  implicit class ClassificationTypeOps[Self <: ClassificationType] (val x: Self) extends AnyVal {
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
    def setArcType(value: Property | typings.cesium.mod.ArcType): Self = this.set("arcType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcType: Self = this.set("arcType", js.undefined)
    @scala.inline
    def setClassificationType(value: Property | typings.cesium.mod.ClassificationType): Self = this.set("classificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassificationType: Self = this.set("classificationType", js.undefined)
    @scala.inline
    def setCloseBottom(value: Boolean): Self = this.set("closeBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseBottom: Self = this.set("closeBottom", js.undefined)
    @scala.inline
    def setCloseTop(value: Boolean): Self = this.set("closeTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseTop: Self = this.set("closeTop", js.undefined)
    @scala.inline
    def setDistanceDisplayCondition(value: Property): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    @scala.inline
    def setExtrudedHeight(value: Property): Self = this.set("extrudedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtrudedHeight: Self = this.set("extrudedHeight", js.undefined)
    @scala.inline
    def setExtrudedHeightReference(value: Property): Self = this.set("extrudedHeightReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtrudedHeightReference: Self = this.set("extrudedHeightReference", js.undefined)
    @scala.inline
    def setFill(value: Property | Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setGranularity(value: Property): Self = this.set("granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    @scala.inline
    def setHeight(value: Property | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightReference(value: Property): Self = this.set("heightReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightReference: Self = this.set("heightReference", js.undefined)
    @scala.inline
    def setHierarchyVarargs(value: Cartesian3*): Self = this.set("hierarchy", js.Array(value :_*))
    @scala.inline
    def setHierarchy(value: Property | js.Array[Cartesian3] | typings.cesium.mod.PolygonHierarchy): Self = this.set("hierarchy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchy: Self = this.set("hierarchy", js.undefined)
    @scala.inline
    def setMaterial(value: MaterialProperty | typings.cesium.mod.Color): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setOutline(value: Property | Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setOutlineColor(value: Property | typings.cesium.mod.Color): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    @scala.inline
    def setOutlineWidth(value: Property | Double): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    @scala.inline
    def setPerPositionHeight(value: Property): Self = this.set("perPositionHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerPositionHeight: Self = this.set("perPositionHeight", js.undefined)
    @scala.inline
    def setShadows(value: Property | ShadowMode): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setShow(value: Property | Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setStRotation(value: Property): Self = this.set("stRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStRotation: Self = this.set("stRotation", js.undefined)
    @scala.inline
    def setZIndex(value: ConstantProperty | Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

