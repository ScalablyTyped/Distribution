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
    val __obj = js.Dynamic.literal(classificationTypeProperty = classificationTypeProperty, createDynamicUpdater = createDynamicUpdater, createFillGeometryInstance = createFillGeometryInstance, createOutlineGeometryInstance = createOutlineGeometryInstance, depthFailMaterialProperty = depthFailMaterialProperty, destroy = destroy, distanceDisplayConditionProperty = distanceDisplayConditionProperty, entity = entity, fillEnabled = fillEnabled, fillMaterialProperty = fillMaterialProperty, geometryChanged = geometryChanged, hasConstantFill = hasConstantFill, hasConstantOutline = hasConstantOutline, id = id, isClosed = isClosed, isDestroyed = isDestroyed, isDynamic = isDynamic, isFilled = isFilled, isOutlineVisible = isOutlineVisible, outlineColorProperty = outlineColorProperty, outlineEnabled = outlineEnabled, outlineWidth = outlineWidth, readonlydistanceDisplayConditionProperty = readonlydistanceDisplayConditionProperty, shadowsProperty = shadowsProperty)
  
    __obj.asInstanceOf[PolylineGeometryUpdater]
  }
}

