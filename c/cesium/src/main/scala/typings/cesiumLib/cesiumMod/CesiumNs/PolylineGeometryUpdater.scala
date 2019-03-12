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
    createDynamicUpdater: (PrimitiveCollection, PrimitiveCollection) => DynamicGeometryUpdater,
    createFillGeometryInstance: JulianDate => GeometryInstance,
    createOutlineGeometryInstance: JulianDate => GeometryInstance,
    depthFailMaterialProperty: MaterialProperty,
    destroy: () => scala.Unit,
    distanceDisplayConditionProperty: Property,
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
    outlineColorProperty: Property,
    outlineEnabled: scala.Boolean,
    outlineWidth: scala.Double,
    readonlydistanceDisplayConditionProperty: Property,
    shadowsProperty: Property
  ): PolylineGeometryUpdater = {
    val __obj = js.Dynamic.literal(classificationTypeProperty = classificationTypeProperty, createDynamicUpdater = js.Any.fromFunction2(createDynamicUpdater), createFillGeometryInstance = js.Any.fromFunction1(createFillGeometryInstance), createOutlineGeometryInstance = js.Any.fromFunction1(createOutlineGeometryInstance), depthFailMaterialProperty = depthFailMaterialProperty, destroy = js.Any.fromFunction0(destroy), distanceDisplayConditionProperty = distanceDisplayConditionProperty, entity = entity, fillEnabled = fillEnabled, fillMaterialProperty = fillMaterialProperty, geometryChanged = geometryChanged, hasConstantFill = hasConstantFill, hasConstantOutline = hasConstantOutline, id = id, isClosed = isClosed, isDestroyed = js.Any.fromFunction0(isDestroyed), isDynamic = isDynamic, isFilled = js.Any.fromFunction1(isFilled), isOutlineVisible = js.Any.fromFunction1(isOutlineVisible), outlineColorProperty = outlineColorProperty, outlineEnabled = outlineEnabled, outlineWidth = outlineWidth, readonlydistanceDisplayConditionProperty = readonlydistanceDisplayConditionProperty, shadowsProperty = shadowsProperty)
  
    __obj.asInstanceOf[PolylineGeometryUpdater]
  }
}

