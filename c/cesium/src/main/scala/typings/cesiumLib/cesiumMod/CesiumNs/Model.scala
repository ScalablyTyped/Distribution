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
    destroy: js.Function0[scala.Unit],
    getMaterial: js.Function1[java.lang.String, ModelMaterial],
    getMesh: js.Function1[java.lang.String, ModelMesh],
    getNode: js.Function1[java.lang.String, ModelNode],
    gltf: js.Any,
    id: js.Any,
    isDestroyed: js.Function0[scala.Boolean],
    minimumPixelSize: scala.Double,
    modelMatrix: Matrix4,
    ready: scala.Boolean,
    readyPromise: js.Promise[Model],
    scale: scala.Double,
    show: scala.Boolean,
    update: js.Function0[scala.Unit]
  ): Model = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeAnimations")(activeAnimations)
    __obj.updateDynamic("allowPicking")(allowPicking)
    __obj.updateDynamic("asynchronous")(asynchronous)
    __obj.updateDynamic("basePath")(basePath)
    __obj.updateDynamic("boundingSphere")(boundingSphere)
    __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    __obj.updateDynamic("debugWireframe")(debugWireframe)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getMaterial")(getMaterial)
    __obj.updateDynamic("getMesh")(getMesh)
    __obj.updateDynamic("getNode")(getNode)
    __obj.updateDynamic("gltf")(gltf)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("minimumPixelSize")(minimumPixelSize)
    __obj.updateDynamic("modelMatrix")(modelMatrix)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("readyPromise")(readyPromise)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Model]
  }
}

