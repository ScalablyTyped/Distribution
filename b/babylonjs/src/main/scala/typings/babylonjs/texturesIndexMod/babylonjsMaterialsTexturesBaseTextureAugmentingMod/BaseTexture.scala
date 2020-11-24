package typings.babylonjs.texturesIndexMod.babylonjsMaterialsTexturesBaseTextureAugmentingMod

import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTexture extends js.Object {
  
  /**
    * Get the polynomial representation of the texture data.
    * This is mainly use as a fast way to recover IBL Diffuse irradiance data.
    * @see https://learnopengl.com/PBR/IBL/Diffuse-irradiance
    */
  var sphericalPolynomial: Nullable[SphericalPolynomial] = js.native
}
object BaseTexture {
  
  @scala.inline
  def apply(): BaseTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTexture]
  }
  
  @scala.inline
  implicit class BaseTextureOps[Self <: BaseTexture] (val x: Self) extends AnyVal {
    
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
    def setSphericalPolynomial(value: Nullable[SphericalPolynomial]): Self = this.set("sphericalPolynomial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSphericalPolynomialNull: Self = this.set("sphericalPolynomial", null)
  }
}
