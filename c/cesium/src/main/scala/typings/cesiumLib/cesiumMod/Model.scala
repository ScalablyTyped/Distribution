package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Model")
@js.native
class Model ()
  extends cesiumLib.cesiumMod.CesiumNs.Model {
  def this(options: cesiumLib.Anon_AllowPicking) = this()
  /* CompleteClass */
  override var activeAnimations: cesiumLib.cesiumMod.CesiumNs.ModelAnimationCollection = js.native
  /* CompleteClass */
  override var allowPicking: scala.Boolean = js.native
  /* CompleteClass */
  override var asynchronous: scala.Boolean = js.native
  /* CompleteClass */
  override var basePath: java.lang.String = js.native
  /* CompleteClass */
  override var boundingSphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  /* CompleteClass */
  override var debugShowBoundingVolume: scala.Boolean = js.native
  /* CompleteClass */
  override var debugWireframe: scala.Boolean = js.native
  /* CompleteClass */
  override var gltf: js.Any = js.native
  /* CompleteClass */
  override var id: js.Any = js.native
  /* CompleteClass */
  override var minimumPixelSize: scala.Double = js.native
  /* CompleteClass */
  override var modelMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  /* CompleteClass */
  override var ready: scala.Boolean = js.native
  /* CompleteClass */
  override var readyPromise: js.Promise[cesiumLib.cesiumMod.CesiumNs.Model] = js.native
  /* CompleteClass */
  override var scale: scala.Double = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def getMaterial(name: java.lang.String): cesiumLib.cesiumMod.CesiumNs.ModelMaterial = js.native
  /* CompleteClass */
  override def getMesh(name: java.lang.String): cesiumLib.cesiumMod.CesiumNs.ModelMesh = js.native
  /* CompleteClass */
  override def getNode(name: java.lang.String): cesiumLib.cesiumMod.CesiumNs.ModelNode = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "Model")
@js.native
object Model extends js.Object {
  def fromGltf(options: cesiumLib.Anon_AllowPickingAsynchronous): cesiumLib.cesiumMod.CesiumNs.Model = js.native
}

