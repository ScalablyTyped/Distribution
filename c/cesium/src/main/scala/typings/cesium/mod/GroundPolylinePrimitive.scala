package typings.cesium.mod

import typings.cesium.AnonAllowPickingAppearanceAsynchronousClassificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GroundPolylinePrimitive")
@js.native
class GroundPolylinePrimitive protected () extends js.Object {
  def this(options: AnonAllowPickingAppearanceAsynchronousClassificationType) = this()
  val allowPicking: Boolean = js.native
  var appearance: Appearance = js.native
  val asynchronous: Boolean = js.native
  var classificationType: ClassificationType = js.native
  var debugShowBoundingVolume: Boolean = js.native
  val debugShowShadowVolume: Boolean = js.native
  val geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  val interleave: Boolean = js.native
  val ready: Boolean = js.native
  val readyPromise: js.Promise[GroundPolylinePrimitive] = js.native
  val releaseGeometryInstances: Boolean = js.native
  var show: Boolean = js.native
  def destroy(): Unit = js.native
  def getGeometryInstanceAttributes(id: js.Any): GeometryInstance = js.native
  def isDestroyed(): Boolean = js.native
  def update(): Unit = js.native
}

/* static members */
@JSImport("cesium", "GroundPolylinePrimitive")
@js.native
object GroundPolylinePrimitive extends js.Object {
  def initializeTerrainHeights(): js.Promise[_] = js.native
  def isSupported(scene: Scene): Boolean = js.native
}

