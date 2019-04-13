package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Model")
@js.native
class Model () extends js.Object {
  def this(options: cesiumLib.Anon_AllowPicking) = this()
  var activeAnimations: ModelAnimationCollection = js.native
  var allowPicking: scala.Boolean = js.native
  var asynchronous: scala.Boolean = js.native
  var basePath: java.lang.String = js.native
  var boundingSphere: BoundingSphere = js.native
  var debugShowBoundingVolume: scala.Boolean = js.native
  var debugWireframe: scala.Boolean = js.native
  var gltf: js.Any = js.native
  var id: js.Any = js.native
  var minimumPixelSize: scala.Double = js.native
  var modelMatrix: Matrix4 = js.native
  var ready: scala.Boolean = js.native
  var readyPromise: js.Promise[Model] = js.native
  var scale: scala.Double = js.native
  var show: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def getMaterial(name: java.lang.String): ModelMaterial = js.native
  def getMesh(name: java.lang.String): ModelMesh = js.native
  def getNode(name: java.lang.String): ModelNode = js.native
  def isDestroyed(): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "Model")
@js.native
object Model extends js.Object {
  def fromGltf(options: cesiumLib.Anon_AllowPickingAsynchronous): cesiumLib.cesiumMod.Model = js.native
}

