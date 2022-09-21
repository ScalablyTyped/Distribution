package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentTextureSpecularInfoV1 extends StObject {
  
  /**
    * Defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness.
    */
  var lodGenerationScale: Double
  
  /**
    * This contains all the images data needed to reconstruct the cubemap.
    */
  var mipmaps: js.Array[BufferImageData]
  
  /**
    * Defines where the specular Payload is located. It is a runtime value only not stored in the file.
    */
  var specularDataPosition: js.UndefOr[Double] = js.undefined
}
object EnvironmentTextureSpecularInfoV1 {
  
  inline def apply(lodGenerationScale: Double, mipmaps: js.Array[BufferImageData]): EnvironmentTextureSpecularInfoV1 = {
    val __obj = js.Dynamic.literal(lodGenerationScale = lodGenerationScale.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTextureSpecularInfoV1]
  }
  
  extension [Self <: EnvironmentTextureSpecularInfoV1](x: Self) {
    
    inline def setLodGenerationScale(value: Double): Self = StObject.set(x, "lodGenerationScale", value.asInstanceOf[js.Any])
    
    inline def setMipmaps(value: js.Array[BufferImageData]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
    
    inline def setMipmapsVarargs(value: BufferImageData*): Self = StObject.set(x, "mipmaps", js.Array(value*))
    
    inline def setSpecularDataPosition(value: Double): Self = StObject.set(x, "specularDataPosition", value.asInstanceOf[js.Any])
    
    inline def setSpecularDataPositionUndefined: Self = StObject.set(x, "specularDataPosition", js.undefined)
  }
}
