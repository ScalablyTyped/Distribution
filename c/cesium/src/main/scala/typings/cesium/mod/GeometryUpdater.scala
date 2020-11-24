package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeometryUpdater")
@js.native
class GeometryUpdater protected () extends js.Object {
  def this(options: typings.cesium.anon.Entity) = this()
  
  val classificationTypeProperty: Property = js.native
  
  def createDynamicUpdater(primitives: PrimitiveCollection, groundPrimitives: PrimitiveCollection): DynamicGeometryUpdater = js.native
  
  def createFillGeometryInstance(time: JulianDate): GeometryInstance = js.native
  
  def createOutlineGeometryInstance(time: JulianDate): GeometryInstance = js.native
  
  def destroy(): Unit = js.native
  
  val entity: Entity = js.native
  
  val fillEnabled: Boolean = js.native
  
  val fillMaterialProperty: MaterialProperty = js.native
  
  val geometryChanged: Boolean = js.native
  
  val hasConstantFill: Boolean = js.native
  
  val hasConstantOutline: Boolean = js.native
  
  val id: String = js.native
  
  val isClosed: Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val isDynamic: Boolean = js.native
  
  def isFilled(time: JulianDate): Boolean = js.native
  
  def isOutlineVisible(time: JulianDate): Boolean = js.native
  
  val outlineColorProperty: Property = js.native
  
  val outlineEnabled: Boolean = js.native
  
  val outlineWidth: Double = js.native
  
  val readonlydistanceDisplayConditionProperty: Property = js.native
  
  val shadowsProperty: Property = js.native
}
