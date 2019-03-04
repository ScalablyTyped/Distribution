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
    outlineColorProperty: Property,
    outlineEnabled: scala.Boolean,
    outlineWidth: scala.Double,
    readonlydistanceDisplayConditionProperty: Property,
    shadowsProperty: Property
  ): GeometryUpdater = {
    val __obj = js.Dynamic.literal(classificationTypeProperty = classificationTypeProperty, createDynamicUpdater = createDynamicUpdater, createFillGeometryInstance = createFillGeometryInstance, createOutlineGeometryInstance = createOutlineGeometryInstance, destroy = destroy, entity = entity, fillEnabled = fillEnabled, fillMaterialProperty = fillMaterialProperty, geometryChanged = geometryChanged, hasConstantFill = hasConstantFill, hasConstantOutline = hasConstantOutline, id = id, isClosed = isClosed, isDestroyed = isDestroyed, isDynamic = isDynamic, isFilled = isFilled, isOutlineVisible = isOutlineVisible, outlineColorProperty = outlineColorProperty, outlineEnabled = outlineEnabled, outlineWidth = outlineWidth, readonlydistanceDisplayConditionProperty = readonlydistanceDisplayConditionProperty, shadowsProperty = shadowsProperty)
  
    __obj.asInstanceOf[GeometryUpdater]
  }
}

