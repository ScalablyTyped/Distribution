package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Primitive")
@js.native
class Primitive ()
  extends cesiumLib.cesiumMod.CesiumNs.Primitive {
  def this(options: cesiumLib.Anon_AllowPickingAppearance) = this()
  /* CompleteClass */
  override val allowPicking: scala.Boolean = js.native
  /* CompleteClass */
  override var appearance: cesiumLib.cesiumMod.CesiumNs.Appearance = js.native
  /* CompleteClass */
  override val asynchronous: scala.Boolean = js.native
  /* CompleteClass */
  override val compressVertices: scala.Boolean = js.native
  /* CompleteClass */
  override var cull: scala.Boolean = js.native
  /* CompleteClass */
  override var debugShowBoundingVolume: scala.Boolean = js.native
  /* CompleteClass */
  override var depthFailAppearance: cesiumLib.cesiumMod.CesiumNs.Appearance = js.native
  /* CompleteClass */
  override val geometryInstances: js.Array[cesiumLib.cesiumMod.CesiumNs.GeometryInstance] | cesiumLib.cesiumMod.CesiumNs.GeometryInstance = js.native
  /* CompleteClass */
  override val interleave: scala.Boolean = js.native
  /* CompleteClass */
  override var modelMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  /* CompleteClass */
  override val ready: scala.Boolean = js.native
  /* CompleteClass */
  override val readyPromise: js.Promise[cesiumLib.cesiumMod.CesiumNs.Primitive] = js.native
  /* CompleteClass */
  override val releaseGeometryInstances: scala.Boolean = js.native
  /* CompleteClass */
  override var shadows: cesiumLib.cesiumMod.CesiumNs.ShadowMode = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override val vertexCacheOptimize: scala.Boolean = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def getGeometryInstanceAttributes(id: js.Any): js.Any = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

