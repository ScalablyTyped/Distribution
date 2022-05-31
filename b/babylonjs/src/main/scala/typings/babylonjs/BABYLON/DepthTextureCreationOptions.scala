package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthTextureCreationOptions extends StObject {
  
  /** Specifies whether or not bilinear filtering is enable on the texture */
  var bilinearFiltering: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode */
  var comparisonFunction: js.UndefOr[Double] = js.undefined
  
  /** Specifies whether or not a stencil should be allocated in the texture */
  var generateStencil: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies if the created texture is a cube texture */
  var isCube: js.UndefOr[Boolean] = js.undefined
}
object DepthTextureCreationOptions {
  
  inline def apply(): DepthTextureCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthTextureCreationOptions]
  }
  
  extension [Self <: DepthTextureCreationOptions](x: Self) {
    
    inline def setBilinearFiltering(value: Boolean): Self = StObject.set(x, "bilinearFiltering", value.asInstanceOf[js.Any])
    
    inline def setBilinearFilteringUndefined: Self = StObject.set(x, "bilinearFiltering", js.undefined)
    
    inline def setComparisonFunction(value: Double): Self = StObject.set(x, "comparisonFunction", value.asInstanceOf[js.Any])
    
    inline def setComparisonFunctionUndefined: Self = StObject.set(x, "comparisonFunction", js.undefined)
    
    inline def setGenerateStencil(value: Boolean): Self = StObject.set(x, "generateStencil", value.asInstanceOf[js.Any])
    
    inline def setGenerateStencilUndefined: Self = StObject.set(x, "generateStencil", js.undefined)
    
    inline def setIsCube(value: Boolean): Self = StObject.set(x, "isCube", value.asInstanceOf[js.Any])
    
    inline def setIsCubeUndefined: Self = StObject.set(x, "isCube", js.undefined)
  }
}
