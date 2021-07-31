package typings.cesium.anon

import typings.cesium.mod.BoundingRectangle
import typings.cesium.mod.PixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearColor extends StObject {
  
  var clearColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var forcePowerOfTwo: js.UndefOr[Boolean] = js.undefined
  
  var fragmentShader: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var pixelFormat: js.UndefOr[PixelFormat] = js.undefined
  
  var scissorRectangle: js.UndefOr[BoundingRectangle] = js.undefined
  
  var textureScale: js.UndefOr[Double] = js.undefined
  
  var uniforms: js.UndefOr[js.Object] = js.undefined
}
object ClearColor {
  
  @scala.inline
  def apply(fragmentShader: String): ClearColor = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearColor]
  }
  
  @scala.inline
  implicit class ClearColorMutableBuilder[Self <: ClearColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "clearColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearColorUndefined: Self = StObject.set(x, "clearColor", js.undefined)
    
    @scala.inline
    def setForcePowerOfTwo(value: Boolean): Self = StObject.set(x, "forcePowerOfTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcePowerOfTwoUndefined: Self = StObject.set(x, "forcePowerOfTwo", js.undefined)
    
    @scala.inline
    def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPixelFormat(value: PixelFormat): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelFormatUndefined: Self = StObject.set(x, "pixelFormat", js.undefined)
    
    @scala.inline
    def setScissorRectangle(value: BoundingRectangle): Self = StObject.set(x, "scissorRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScissorRectangleUndefined: Self = StObject.set(x, "scissorRectangle", js.undefined)
    
    @scala.inline
    def setTextureScale(value: Double): Self = StObject.set(x, "textureScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureScaleUndefined: Self = StObject.set(x, "textureScale", js.undefined)
    
    @scala.inline
    def setUniforms(value: js.Object): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
  }
}
