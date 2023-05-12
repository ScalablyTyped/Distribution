package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMeshUVSpaceRendererOptions extends StObject {
  
  /**
    * Generate mip maps. Default: true
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Height of the texture. Default: 1024
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Optimize UV allocation. Default: true
    * If you plan to use the texture as a decal map and rotate / offset the texture, you should set this to false
    */
  var optimizeUVAllocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of the texture. Default: Constants.TEXTURETYPE_UNSIGNED_BYTE
    */
  var textureType: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the texture. Default: 1024
    */
  var width: js.UndefOr[Double] = js.undefined
}
object IMeshUVSpaceRendererOptions {
  
  inline def apply(): IMeshUVSpaceRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMeshUVSpaceRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMeshUVSpaceRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOptimizeUVAllocation(value: Boolean): Self = StObject.set(x, "optimizeUVAllocation", value.asInstanceOf[js.Any])
    
    inline def setOptimizeUVAllocationUndefined: Self = StObject.set(x, "optimizeUVAllocation", js.undefined)
    
    inline def setTextureType(value: Double): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
    
    inline def setTextureTypeUndefined: Self = StObject.set(x, "textureType", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
