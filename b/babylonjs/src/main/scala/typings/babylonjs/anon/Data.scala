package typings.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.typesMod.Nullable
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: StringDictionary[Float32Array]
  var sizes: StringDictionary[Double]
  var strides: StringDictionary[Double]
  var vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
}

object Data {
  @scala.inline
  def apply(
    data: StringDictionary[Float32Array],
    sizes: StringDictionary[Double],
    strides: StringDictionary[Double],
    vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], vertexBuffers = vertexBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

