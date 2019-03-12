package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryUpdater extends js.Object {
  val classificationTypeProperty: Property
  val entity: Entity
  val fillEnabled: scala.Boolean
  val fillMaterialProperty: MaterialProperty
  val geometryChanged: scala.Boolean
  val hasConstantFill: scala.Boolean
  val hasConstantOutline: scala.Boolean
  val id: java.lang.String
  val isClosed: scala.Boolean
  val isDynamic: scala.Boolean
  val outlineColorProperty: Property
  val outlineEnabled: scala.Boolean
  val outlineWidth: scala.Double
  val readonlydistanceDisplayConditionProperty: Property
  val shadowsProperty: Property
  def createDynamicUpdater(primitives: PrimitiveCollection, groundPrimitives: PrimitiveCollection): DynamicGeometryUpdater
  def createFillGeometryInstance(time: JulianDate): GeometryInstance
  def createOutlineGeometryInstance(time: JulianDate): GeometryInstance
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def isFilled(time: JulianDate): scala.Boolean
  def isOutlineVisible(time: JulianDate): scala.Boolean
}

object GeometryUpdater {
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
    outlineColorProperty: Property,
    outlineEnabled: scala.Boolean,
    outlineWidth: scala.Double,
    readonlydistanceDisplayConditionProperty: Property,
    shadowsProperty: Property
  ): GeometryUpdater = {
    val __obj = js.Dynamic.literal(classificationTypeProperty = classificationTypeProperty, createDynamicUpdater = js.Any.fromFunction2(createDynamicUpdater), createFillGeometryInstance = js.Any.fromFunction1(createFillGeometryInstance), createOutlineGeometryInstance = js.Any.fromFunction1(createOutlineGeometryInstance), destroy = js.Any.fromFunction0(destroy), entity = entity, fillEnabled = fillEnabled, fillMaterialProperty = fillMaterialProperty, geometryChanged = geometryChanged, hasConstantFill = hasConstantFill, hasConstantOutline = hasConstantOutline, id = id, isClosed = isClosed, isDestroyed = js.Any.fromFunction0(isDestroyed), isDynamic = isDynamic, isFilled = js.Any.fromFunction1(isFilled), isOutlineVisible = js.Any.fromFunction1(isOutlineVisible), outlineColorProperty = outlineColorProperty, outlineEnabled = outlineEnabled, outlineWidth = outlineWidth, readonlydistanceDisplayConditionProperty = readonlydistanceDisplayConditionProperty, shadowsProperty = shadowsProperty)
  
    __obj.asInstanceOf[GeometryUpdater]
  }
}

