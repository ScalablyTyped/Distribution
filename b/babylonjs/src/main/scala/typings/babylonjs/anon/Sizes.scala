package typings.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.VertexBuffer
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sizes extends js.Object {
  
  var data: StringDictionary[Float32Array] = js.native
  
  var sizes: StringDictionary[Double] = js.native
  
  var strides: StringDictionary[Double] = js.native
  
  var vertexBuffers: StringDictionary[Nullable[VertexBuffer]] = js.native
}
object Sizes {
  
  @scala.inline
  def apply(
    data: StringDictionary[Float32Array],
    sizes: StringDictionary[Double],
    strides: StringDictionary[Double],
    vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
  ): Sizes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], vertexBuffers = vertexBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizes]
  }
  
  @scala.inline
  implicit class SizesOps[Self <: Sizes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: StringDictionary[Float32Array]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizes(value: StringDictionary[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: StringDictionary[Double]): Self = this.set("strides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexBuffers(value: StringDictionary[Nullable[VertexBuffer]]): Self = this.set("vertexBuffers", value.asInstanceOf[js.Any])
  }
}
