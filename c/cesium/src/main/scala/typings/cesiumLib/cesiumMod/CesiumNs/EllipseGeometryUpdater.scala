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
    createDynamicUpdater: (PrimitiveCollection, PrimitiveCollection) => DynamicGeometryUpdater,
    createFillGeometryInstance: JulianDate => GeometryInstance,
    createOutlineGeometryInstance: JulianDate => GeometryInstance,
    destroy: () => scala.Unit,
    entity: Entity,
    fillEnabled: scala.Boolean,
    fillMaterialProperty: MaterialProperty,
    geometryChanged: scala.Boolean,
    hasConstantFill: scala.Boolean,
    hasConstantOutline: scala.Boolean,
    id: java.lang.String,
    isClosed: scala.Boolean,
    isDestroyed: () => scala.Boolean,
    isDynamic: scala.Boolean,
    isFilled: JulianDate => scala.Boolean,
    isOutlineVisible: JulianDate => scala.Boolean,
    onTerrain: scala.Boolean,
    outlineColorProperty: Property,
    outlineEnabled: scala.Boolean,
    outlineWidth: scala.Double,
    readonlydistanceDisplayConditionProperty: Property,
    shadowsProperty: Property
  ): EllipseGeometryUpdater = {
    val __obj = js.Dynamic.literal(classificationTypeProperty = classificationTypeProperty, createDynamicUpdater = js.Any.fromFunction2(createDynamicUpdater), createFillGeometryInstance = js.Any.fromFunction1(createFillGeometryInstance), createOutlineGeometryInstance = js.Any.fromFunction1(createOutlineGeometryInstance), destroy = js.Any.fromFunction0(destroy), entity = entity, fillEnabled = fillEnabled, fillMaterialProperty = fillMaterialProperty, geometryChanged = geometryChanged, hasConstantFill = hasConstantFill, hasConstantOutline = hasConstantOutline, id = id, isClosed = isClosed, isDestroyed = js.Any.fromFunction0(isDestroyed), isDynamic = isDynamic, isFilled = js.Any.fromFunction1(isFilled), isOutlineVisible = js.Any.fromFunction1(isOutlineVisible), onTerrain = onTerrain, outlineColorProperty = outlineColorProperty, outlineEnabled = outlineEnabled, outlineWidth = outlineWidth, readonlydistanceDisplayConditionProperty = readonlydistanceDisplayConditionProperty, shadowsProperty = shadowsProperty)
  
    __obj.asInstanceOf[EllipseGeometryUpdater]
  }
}

