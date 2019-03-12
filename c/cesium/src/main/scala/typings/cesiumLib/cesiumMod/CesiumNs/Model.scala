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
  var readyPromise: js.Promise[Model]
  var scale: scala.Double
  var show: scala.Boolean
  def destroy(): scala.Unit
  def getMaterial(name: java.lang.String): ModelMaterial
  def getMesh(name: java.lang.String): ModelMesh
  def getNode(name: java.lang.String): ModelNode
  def isDestroyed(): scala.Boolean
  def update(): scala.Unit
}

object Model {
  @scala.inline
  def apply(
    activeAnimations: ModelAnimationCollection,
    allowPicking: scala.Boolean,
    asynchronous: scala.Boolean,
    basePath: java.lang.String,
    boundingSphere: BoundingSphere,
    debugShowBoundingVolume: scala.Boolean,
    debugWireframe: scala.Boolean,
    destroy: () => scala.Unit,
    getMaterial: java.lang.String => ModelMaterial,
    getMesh: java.lang.String => ModelMesh,
    getNode: java.lang.String => ModelNode,
    gltf: js.Any,
    id: js.Any,
    isDestroyed: () => scala.Boolean,
    minimumPixelSize: scala.Double,
    modelMatrix: Matrix4,
    ready: scala.Boolean,
    readyPromise: js.Promise[Model],
    scale: scala.Double,
    show: scala.Boolean,
    update: () => scala.Unit
  ): Model = {
    val __obj = js.Dynamic.literal(activeAnimations = activeAnimations, allowPicking = allowPicking, asynchronous = asynchronous, basePath = basePath, boundingSphere = boundingSphere, debugShowBoundingVolume = debugShowBoundingVolume, debugWireframe = debugWireframe, destroy = js.Any.fromFunction0(destroy), getMaterial = js.Any.fromFunction1(getMaterial), getMesh = js.Any.fromFunction1(getMesh), getNode = js.Any.fromFunction1(getNode), gltf = gltf, id = id, isDestroyed = js.Any.fromFunction0(isDestroyed), minimumPixelSize = minimumPixelSize, modelMatrix = modelMatrix, ready = ready, readyPromise = readyPromise, scale = scale, show = show, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Model]
  }
}

