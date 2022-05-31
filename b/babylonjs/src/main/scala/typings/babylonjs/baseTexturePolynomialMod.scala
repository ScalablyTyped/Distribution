package typings.babylonjs

import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseTexturePolynomialMod {
  
  /* augmented module */
  object babylonjsMaterialsTexturesBaseTextureAugmentingMod {
    
    trait BaseTexture extends StObject {
      
      /**
        * Get the polynomial representation of the texture data.
        * This is mainly use as a fast way to recover IBL Diffuse irradiance data.
        * @see https://learnopengl.com/PBR/IBL/Diffuse-irradiance
        */
      var sphericalPolynomial: Nullable[SphericalPolynomial]
    }
    object BaseTexture {
      
      inline def apply(): BaseTexture = {
        val __obj = js.Dynamic.literal(sphericalPolynomial = null)
        __obj.asInstanceOf[BaseTexture]
      }
      
      extension [Self <: BaseTexture](x: Self) {
        
        inline def setSphericalPolynomial(value: Nullable[SphericalPolynomial]): Self = StObject.set(x, "sphericalPolynomial", value.asInstanceOf[js.Any])
        
        inline def setSphericalPolynomialNull: Self = StObject.set(x, "sphericalPolynomial", null)
      }
    }
  }
}
