package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeometryUpdater")
@js.native
class GeometryUpdater protected () extends js.Object {
  def this(options: cesiumLib.Anon_Entity) = this()
  val classificationTypeProperty: Property = js.native
  val entity: Entity = js.native
  val fillEnabled: scala.Boolean = js.native
  val fillMaterialProperty: MaterialProperty = js.native
  val geometryChanged: scala.Boolean = js.native
  val hasConstantFill: scala.Boolean = js.native
  val hasConstantOutline: scala.Boolean = js.native
  val id: java.lang.String = js.native
  val isClosed: scala.Boolean = js.native
  val isDynamic: scala.Boolean = js.native
  val outlineColorProperty: Property = js.native
  val outlineEnabled: scala.Boolean = js.native
  val outlineWidth: scala.Double = js.native
  val readonlydistanceDisplayConditionProperty: Property = js.native
  val shadowsProperty: Property = js.native
  def createDynamicUpdater(primitives: PrimitiveCollection, groundPrimitives: PrimitiveCollection): DynamicGeometryUpdater = js.native
  def createFillGeometryInstance(time: JulianDate): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate): GeometryInstance = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def isFilled(time: JulianDate): scala.Boolean = js.native
  def isOutlineVisible(time: JulianDate): scala.Boolean = js.native
}

