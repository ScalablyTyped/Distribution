package typings.babylonjs

import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseTexturePolynomialMod {
  
  /* augmented module */
  object babylonjsMaterialsTexturesBaseTextureAugmentingMod {
    
    @js.native
    trait BaseTexture extends StObject {
      
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
      implicit class BaseTextureMutableBuilder[Self <: BaseTexture] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSphericalPolynomial(value: Nullable[SphericalPolynomial]): Self = StObject.set(x, "sphericalPolynomial", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSphericalPolynomialNull: Self = StObject.set(x, "sphericalPolynomial", null)
      }
    }
  }
}
