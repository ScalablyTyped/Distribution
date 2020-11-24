package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color3
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffer extends js.Object {
  
  var alphaFilter: Double = js.native
  
  var buffer: Uint8Array = js.native
  
  var bufferHeight: Double = js.native
  
  var bufferWidth: Double = js.native
  
  var colorFilter: Color3 = js.native
  
  var height: Double = js.native
  
  var maxHeight: Double = js.native
  
  var minHeight: Double = js.native
  
  var subdivisions: Double = js.native
  
  var width: Double = js.native
}
object Buffer {
  
  @scala.inline
  def apply(
    alphaFilter: Double,
    buffer: Uint8Array,
    bufferHeight: Double,
    bufferWidth: Double,
    colorFilter: Color3,
    height: Double,
    maxHeight: Double,
    minHeight: Double,
    subdivisions: Double,
    width: Double
  ): Buffer = {
    val __obj = js.Dynamic.literal(alphaFilter = alphaFilter.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferHeight = bufferHeight.asInstanceOf[js.Any], bufferWidth = bufferWidth.asInstanceOf[js.Any], colorFilter = colorFilter.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], subdivisions = subdivisions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
    
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
    def setAlphaFilter(value: Double): Self = this.set("alphaFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: Uint8Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferHeight(value: Double): Self = this.set("bufferHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferWidth(value: Double): Self = this.set("bufferWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFilter(value: Color3): Self = this.set("colorFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisions(value: Double): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
