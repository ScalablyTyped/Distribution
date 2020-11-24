package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Glyph extends js.Object {
  
  var bitmap: js.Array[js.Array[Double]] = js.native
  
  var boundingBox: BoundingBox = js.native
  
  var bytes: js.Array[Double] = js.native
  
  var char: String = js.native
  
  var code: Double = js.native
  
  var deviceWidthX: Double = js.native
  
  var deviceWidthY: Double = js.native
  
  var name: String = js.native
  
  var scalableWidthX: Double = js.native
  
  var scalableWidthY: Double = js.native
}
object Glyph {
  
  @scala.inline
  def apply(
    bitmap: js.Array[js.Array[Double]],
    boundingBox: BoundingBox,
    bytes: js.Array[Double],
    char: String,
    code: Double,
    deviceWidthX: Double,
    deviceWidthY: Double,
    name: String,
    scalableWidthX: Double,
    scalableWidthY: Double
  ): Glyph = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], deviceWidthX = deviceWidthX.asInstanceOf[js.Any], deviceWidthY = deviceWidthY.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalableWidthX = scalableWidthX.asInstanceOf[js.Any], scalableWidthY = scalableWidthY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
  
  @scala.inline
  implicit class GlyphOps[Self <: Glyph] (val x: Self) extends AnyVal {
    
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
    def setBitmapVarargs(value: js.Array[Double]*): Self = this.set("bitmap", js.Array(value :_*))
    
    @scala.inline
    def setBitmap(value: js.Array[js.Array[Double]]): Self = this.set("bitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesVarargs(value: Double*): Self = this.set("bytes", js.Array(value :_*))
    
    @scala.inline
    def setBytes(value: js.Array[Double]): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: String): Self = this.set("char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceWidthX(value: Double): Self = this.set("deviceWidthX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceWidthY(value: Double): Self = this.set("deviceWidthY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableWidthX(value: Double): Self = this.set("scalableWidthX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableWidthY(value: Double): Self = this.set("scalableWidthY", value.asInstanceOf[js.Any])
  }
}
