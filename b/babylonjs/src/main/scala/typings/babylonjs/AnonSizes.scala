package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.VertexBuffer
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizes extends js.Object {
  var data: StringDictionary[Float32Array]
  var sizes: StringDictionary[Double]
  var strides: StringDictionary[Double]
  var vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
}

object AnonSizes {
  @scala.inline
  def apply(
    data: StringDictionary[Float32Array],
    sizes: StringDictionary[Double],
    strides: StringDictionary[Double],
    vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
  ): AnonSizes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], vertexBuffers = vertexBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizes]
  }
}

