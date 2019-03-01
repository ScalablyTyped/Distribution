package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineGeometryUpdater extends GeometryUpdater {
  val depthFailMaterialProperty: MaterialProperty
  val distanceDisplayConditionProperty: Property
}

object PolylineGeometryUpdater {
  @scala.inline
  def apply(
    classificationTypeProperty: Property,
    createDynamicUpdater: js.Function2[PrimitiveCollection, PrimitiveCollection, DynamicGeometryUpdater],
    createFillGeometryInstance: js.Function1[JulianDate, GeometryInstance],
    createOutlineGeometryInstance: js.Function1[JulianDate, GeometryInstance],
    depthFailMaterialProperty: MaterialProperty,
    destroy: js.Function0[scala.Unit],
    distanceDisplayConditionProperty: Property,
    entity: Entity,
    fillEnabled: scala.Boolean,
    fillMaterialProperty: MaterialProperty,
    geometryChanged: scala.Boolean,
    hasConstantFill: scala.Boolean,
    hasConstantOutline: scala.Boolean,
    id: java.lang.String,
    isClosed: scala.Boolean,
    isDestroyed: js.Function0[scala.Boolean],
    isDynamic: scala.Boolean,
    isFilled: js.Function1[JulianDate, scala.Boolean],
    isOutlineVisible: js.Function1[JulianDate, scala.Boolean],
    outlineColorProperty: Property,
    outlineEnabled: scala.Boolean,
    outlineWidth: scala.Double,
    readonlydistanceDisplayConditionProperty: Property,
    shadowsProperty: Property
  ): PolylineGeometryUpdater = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("classificationTypeProperty")(classificationTypeProperty)
    __obj.updateDynamic("createDynamicUpdater")(createDynamicUpdater)
    __obj.updateDynamic("createFillGeometryInstance")(createFillGeometryInstance)
    __obj.updateDynamic("createOutlineGeometryInstance")(createOutlineGeometryInstance)
    __obj.updateDynamic("depthFailMaterialProperty")(depthFailMaterialProperty)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("distanceDisplayConditionProperty")(distanceDisplayConditionProperty)
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("fillEnabled")(fillEnabled)
    __obj.updateDynamic("fillMaterialProperty")(fillMaterialProperty)
    __obj.updateDynamic("geometryChanged")(geometryChanged)
    __obj.updateDynamic("hasConstantFill")(hasConstantFill)
    __obj.updateDynamic("hasConstantOutline")(hasConstantOutline)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isClosed")(isClosed)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("isDynamic")(isDynamic)
    __obj.updateDynamic("isFilled")(isFilled)
    __obj.updateDynamic("isOutlineVisible")(isOutlineVisible)
    __obj.updateDynamic("outlineColorProperty")(outlineColorProperty)
    __obj.updateDynamic("outlineEnabled")(outlineEnabled)
    __obj.updateDynamic("outlineWidth")(outlineWidth)
    __obj.updateDynamic("readonlydistanceDisplayConditionProperty")(readonlydistanceDisplayConditionProperty)
    __obj.updateDynamic("shadowsProperty")(shadowsProperty)
    __obj.asInstanceOf[PolylineGeometryUpdater]
  }
}

