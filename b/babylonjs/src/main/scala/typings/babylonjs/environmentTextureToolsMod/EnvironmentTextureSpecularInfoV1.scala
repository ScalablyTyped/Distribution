package typings.babylonjs.environmentTextureToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentTextureSpecularInfoV1 extends js.Object {
  
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
  implicit class EnvironmentTextureSpecularInfoV1Ops[Self <: EnvironmentTextureSpecularInfoV1] (val x: Self) extends AnyVal {
    
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
    def setLodGenerationScale(value: Double): Self = this.set("lodGenerationScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMipmapsVarargs(value: BufferImageData*): Self = this.set("mipmaps", js.Array(value :_*))
    
    @scala.inline
    def setMipmaps(value: js.Array[BufferImageData]): Self = this.set("mipmaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularDataPosition(value: Double): Self = this.set("specularDataPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularDataPosition: Self = this.set("specularDataPosition", js.undefined)
  }
}
