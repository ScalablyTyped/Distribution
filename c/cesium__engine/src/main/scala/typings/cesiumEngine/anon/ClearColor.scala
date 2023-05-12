package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.BoundingRectangle
import typings.cesiumEngine.mod.PixelDatatype
import typings.cesiumEngine.mod.PixelFormat
import typings.cesiumEngine.mod.PostProcessStageSampleMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearColor extends StObject {
  
  var clearColor: js.UndefOr[typings.cesiumEngine.mod.Color] = js.undefined
  
  var forcePowerOfTwo: js.UndefOr[Boolean] = js.undefined
  
  var fragmentShader: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var pixelDatatype: js.UndefOr[PixelDatatype] = js.undefined
  
  var pixelFormat: js.UndefOr[PixelFormat] = js.undefined
  
  var sampleMode: js.UndefOr[PostProcessStageSampleMode] = js.undefined
  
  var scissorRectangle: js.UndefOr[BoundingRectangle] = js.undefined
  
  var textureScale: js.UndefOr[Double] = js.undefined
  
  var uniforms: js.UndefOr[Any] = js.undefined
}
object ClearColor {
  
  inline def apply(fragmentShader: String): ClearColor = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearColor] (val x: Self) extends AnyVal {
    
    inline def setClearColor(value: typings.cesiumEngine.mod.Color): Self = StObject.set(x, "clearColor", value.asInstanceOf[js.Any])
    
    inline def setClearColorUndefined: Self = StObject.set(x, "clearColor", js.undefined)
    
    inline def setForcePowerOfTwo(value: Boolean): Self = StObject.set(x, "forcePowerOfTwo", value.asInstanceOf[js.Any])
    
    inline def setForcePowerOfTwoUndefined: Self = StObject.set(x, "forcePowerOfTwo", js.undefined)
    
    inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPixelDatatype(value: PixelDatatype): Self = StObject.set(x, "pixelDatatype", value.asInstanceOf[js.Any])
    
    inline def setPixelDatatypeUndefined: Self = StObject.set(x, "pixelDatatype", js.undefined)
    
    inline def setPixelFormat(value: PixelFormat): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
    
    inline def setPixelFormatUndefined: Self = StObject.set(x, "pixelFormat", js.undefined)
    
    inline def setSampleMode(value: PostProcessStageSampleMode): Self = StObject.set(x, "sampleMode", value.asInstanceOf[js.Any])
    
    inline def setSampleModeUndefined: Self = StObject.set(x, "sampleMode", js.undefined)
    
    inline def setScissorRectangle(value: BoundingRectangle): Self = StObject.set(x, "scissorRectangle", value.asInstanceOf[js.Any])
    
    inline def setScissorRectangleUndefined: Self = StObject.set(x, "scissorRectangle", js.undefined)
    
    inline def setTextureScale(value: Double): Self = StObject.set(x, "textureScale", value.asInstanceOf[js.Any])
    
    inline def setTextureScaleUndefined: Self = StObject.set(x, "textureScale", js.undefined)
    
    inline def setUniforms(value: Any): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
  }
}
