package typings.cesium.anon

import typings.cesium.mod.BoundingRectangle
import typings.cesium.mod.PixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearColor extends js.Object {
  
  var clearColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var forcePowerOfTwo: js.UndefOr[Boolean] = js.native
  
  var fragmentShader: String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pixelFormat: js.UndefOr[PixelFormat] = js.native
  
  var scissorRectangle: js.UndefOr[BoundingRectangle] = js.native
  
  var textureScale: js.UndefOr[Double] = js.native
  
  var uniforms: js.UndefOr[js.Object] = js.native
}
object ClearColor {
  
  @scala.inline
  def apply(fragmentShader: String): ClearColor = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearColor]
  }
  
  @scala.inline
  implicit class ClearColorOps[Self <: ClearColor] (val x: Self) extends AnyVal {
    
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
    def setFragmentShader(value: String): Self = this.set("fragmentShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearColor(value: typings.cesium.mod.Color): Self = this.set("clearColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearColor: Self = this.set("clearColor", js.undefined)
    
    @scala.inline
    def setForcePowerOfTwo(value: Boolean): Self = this.set("forcePowerOfTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForcePowerOfTwo: Self = this.set("forcePowerOfTwo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPixelFormat(value: PixelFormat): Self = this.set("pixelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelFormat: Self = this.set("pixelFormat", js.undefined)
    
    @scala.inline
    def setScissorRectangle(value: BoundingRectangle): Self = this.set("scissorRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScissorRectangle: Self = this.set("scissorRectangle", js.undefined)
    
    @scala.inline
    def setTextureScale(value: Double): Self = this.set("textureScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextureScale: Self = this.set("textureScale", js.undefined)
    
    @scala.inline
    def setUniforms(value: js.Object): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
  }
}
