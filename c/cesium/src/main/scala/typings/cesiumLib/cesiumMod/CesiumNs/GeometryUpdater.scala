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

