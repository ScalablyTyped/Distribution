package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipseGeometryUpdater extends GeometryUpdater {
  val onTerrain: scala.Boolean
}

object EllipseGeometryUpdater {
  @scala.inline
  def apply(
    classificationTypeProperty: Property,
    createDynamicUpdater: js.Function2[PrimitiveCollection, PrimitiveCollection, DynamicGeometryUpdater],
    createFillGeometryInstance: js.Function1[JulianDate, GeometryInstance],
    createOutlineGeometryInstance: js.Function1[JulianDate, GeometryInstance],
    destroy: js.Function0[scala.Unit],
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
    onTerrain: scala.Boolean,
    outlineColorProperty: Property,
    outlineEnabled: scala.Boolean,
    outlineWidth: scala.Double,
    readonlydistanceDisplayConditionProperty: Property,
    shadowsProperty: Property
  ): EllipseGeometryUpdater = {
    val __obj = js.Dynamic.literal(classificationTypeProperty = classificationTypeProperty, createDynamicUpdater = createDynamicUpdater, createFillGeometryInstance = createFillGeometryInstance, createOutlineGeometryInstance = createOutlineGeometryInstance, destroy = destroy, entity = entity, fillEnabled = fillEnabled, fillMaterialProperty = fillMaterialProperty, geometryChanged = geometryChanged, hasConstantFill = hasConstantFill, hasConstantOutline = hasConstantOutline, id = id, isClosed = isClosed, isDestroyed = isDestroyed, isDynamic = isDynamic, isFilled = isFilled, isOutlineVisible = isOutlineVisible, onTerrain = onTerrain, outlineColorProperty = outlineColorProperty, outlineEnabled = outlineEnabled, outlineWidth = outlineWidth, readonlydistanceDisplayConditionProperty = readonlydistanceDisplayConditionProperty, shadowsProperty = shadowsProperty)
  
    __obj.asInstanceOf[EllipseGeometryUpdater]
  }
}

