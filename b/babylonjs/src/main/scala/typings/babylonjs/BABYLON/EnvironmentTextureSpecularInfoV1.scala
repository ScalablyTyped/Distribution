package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentTextureSpecularInfoV1 extends StObject {
  
  /**
    * Defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness.
    */
  var lodGenerationScale: Double = js.native
  
  /**
    * This contains all the images data needed to reconstruct the cubemap.
    */
  var mipmaps: js.Array[BufferImageData] = js.native
  
  /**
    * Defines where the specular Payload is located. It is a runtime value only not stored in the file.
    */
  var specularDataPosition: js.UndefOr[Double] = js.native
}
object EnvironmentTextureSpecularInfoV1 {
  
  @scala.inline
  def apply(lodGenerationScale: Double, mipmaps: js.Array[BufferImageData]): EnvironmentTextureSpecularInfoV1 = {
    val __obj = js.Dynamic.literal(lodGenerationScale = lodGenerationScale.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTextureSpecularInfoV1]
  }
  
  @scala.inline
  implicit class EnvironmentTextureSpecularInfoV1MutableBuilder[Self <: EnvironmentTextureSpecularInfoV1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLodGenerationScale(value: Double): Self = StObject.set(x, "lodGenerationScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMipmaps(value: js.Array[BufferImageData]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMipmapsVarargs(value: BufferImageData*): Self = StObject.set(x, "mipmaps", js.Array(value :_*))
    
    @scala.inline
    def setSpecularDataPosition(value: Double): Self = StObject.set(x, "specularDataPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularDataPositionUndefined: Self = StObject.set(x, "specularDataPosition", js.undefined)
  }
}
