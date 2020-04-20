package typings.babylonjs.instancedMeshMod.babylonjsMeshesMeshAugmentingMod

import typings.babylonjs.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mesh extends js.Object {
  /** @hidden */
  var _userInstancedBuffersStorage: AnonData
  /**
    * Register a custom buffer that will be instanced
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    * @param kind defines the buffer kind
    * @param stride defines the stride in floats
    */
  def registerInstancedBuffer(kind: String, stride: Double): Unit
}

object Mesh {
  @scala.inline
  def apply(_userInstancedBuffersStorage: AnonData, registerInstancedBuffer: (String, Double) => Unit): Mesh = {
    val __obj = js.Dynamic.literal(_userInstancedBuffersStorage = _userInstancedBuffersStorage.asInstanceOf[js.Any], registerInstancedBuffer = js.Any.fromFunction2(registerInstancedBuffer))
    __obj.asInstanceOf[Mesh]
  }
}

