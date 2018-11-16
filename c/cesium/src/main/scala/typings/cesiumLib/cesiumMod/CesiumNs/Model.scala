package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  var activeAnimations: ModelAnimationCollection
  var allowPicking: scala.Boolean
  var asynchronous: scala.Boolean
  var basePath: java.lang.String
  var boundingSphere: BoundingSphere
  var debugShowBoundingVolume: scala.Boolean
  var debugWireframe: scala.Boolean
  var gltf: js.Any
  var id: js.Any
  var minimumPixelSize: scala.Double
  var modelMatrix: Matrix4
  var ready: scala.Boolean
  var readyPromise: stdLib.Promise[Model]
  var scale: scala.Double
  var show: scala.Boolean
  def destroy(): scala.Unit
  def getMaterial(name: java.lang.String): ModelMaterial
  def getMesh(name: java.lang.String): ModelMesh
  def getNode(name: java.lang.String): ModelNode
  def isDestroyed(): scala.Boolean
  def update(): scala.Unit
}

