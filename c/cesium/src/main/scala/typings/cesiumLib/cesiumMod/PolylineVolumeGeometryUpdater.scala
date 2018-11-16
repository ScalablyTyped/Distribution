package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineVolumeGeometryUpdater")
@js.native
class PolylineVolumeGeometryUpdater protected ()
  extends cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGeometryUpdater {
  def this(entity: cesiumLib.cesiumMod.CesiumNs.Entity, scene: cesiumLib.cesiumMod.CesiumNs.Scene) = this()
  /* CompleteClass */
  override val classificationTypeProperty: cesiumLib.cesiumMod.CesiumNs.Property = js.native
  /* CompleteClass */
  override val entity: cesiumLib.cesiumMod.CesiumNs.Entity = js.native
  /* CompleteClass */
  override val fillEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override val fillMaterialProperty: cesiumLib.cesiumMod.CesiumNs.MaterialProperty = js.native
  /* CompleteClass */
  override val geometryChanged: scala.Boolean = js.native
  /* CompleteClass */
  override val hasConstantFill: scala.Boolean = js.native
  /* CompleteClass */
  override val hasConstantOutline: scala.Boolean = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val isClosed: scala.Boolean = js.native
  /* CompleteClass */
  override val isDynamic: scala.Boolean = js.native
  /* CompleteClass */
  override val outlineColorProperty: cesiumLib.cesiumMod.CesiumNs.Property = js.native
  /* CompleteClass */
  override val outlineEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override val outlineWidth: scala.Double = js.native
  /* CompleteClass */
  override val readonlydistanceDisplayConditionProperty: cesiumLib.cesiumMod.CesiumNs.Property = js.native
  /* CompleteClass */
  override val shadowsProperty: cesiumLib.cesiumMod.CesiumNs.Property = js.native
  /* CompleteClass */
  override def createDynamicUpdater(
    primitives: cesiumLib.cesiumMod.CesiumNs.PrimitiveCollection,
    groundPrimitives: cesiumLib.cesiumMod.CesiumNs.PrimitiveCollection
  ): cesiumLib.cesiumMod.CesiumNs.DynamicGeometryUpdater = js.native
  /* CompleteClass */
  override def createFillGeometryInstance(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.GeometryInstance = js.native
  /* CompleteClass */
  override def createOutlineGeometryInstance(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.GeometryInstance = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def isFilled(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
  /* CompleteClass */
  override def isOutlineVisible(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
}

