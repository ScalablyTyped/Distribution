package typings.cesium.cesiumMod

import typings.cesium.Anon_AllowPickingAppearanceAsynchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GroundPrimitive")
@js.native
class GroundPrimitive () extends js.Object {
  def this(options: Anon_AllowPickingAppearanceAsynchronous) = this()
  val allowPicking: Boolean = js.native
  var appearance: Appearance = js.native
  val asynchronous: Boolean = js.native
  var classificationType: ClassificationType = js.native
  val compressVertices: Boolean = js.native
  var debugShowBoundingVolume: Boolean = js.native
  var debugShowShadowVolume: Boolean = js.native
  var depthFailAppearance: Appearance = js.native
  val geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  val interleave: Boolean = js.native
  val ready: Boolean = js.native
  val readyPromise: js.Promise[Primitive] = js.native
  val releaseGeometryInstances: Boolean = js.native
  var show: Boolean = js.native
  val vertexCacheOptimize: Boolean = js.native
  def destroy(): Unit = js.native
  def getGeometryInstanceAttributes(id: js.Any): js.Any = js.native
  def isDestroyed(): Boolean = js.native
  def update(): Unit = js.native
}

/* static members */
@JSImport("cesium", "GroundPrimitive")
@js.native
object GroundPrimitive extends js.Object {
  def initializeTerrainHeights(): js.Promise[Unit] = js.native
  def isSupported(scene: Scene): Boolean = js.native
  def supportsMaterials(scene: Scene): Boolean = js.native
}

