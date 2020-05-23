package typings.babylonjs.materialsIndexMod.babylonjsMaterialsTexturesBaseTextureAugmentingMod

import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTexture extends js.Object {
  /**
    * Get the polynomial representation of the texture data.
    * This is mainly use as a fast way to recover IBL Diffuse irradiance data.
    * @see https://learnopengl.com/PBR/IBL/Diffuse-irradiance
    */
  var sphericalPolynomial: Nullable[SphericalPolynomial]
}

object BaseTexture {
  @scala.inline
  def apply(sphericalPolynomial: Nullable[SphericalPolynomial] = null): BaseTexture = {
    val __obj = js.Dynamic.literal(sphericalPolynomial = sphericalPolynomial.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTexture]
  }
}

