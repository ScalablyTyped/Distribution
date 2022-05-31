package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMaterialsTexturesBaseTextureAugmentingMod {
  
  trait BaseTexture extends StObject {
    
    /**
      * Get the polynomial representation of the texture data.
      * This is mainly use as a fast way to recover IBL Diffuse irradiance data.
      * @see https://learnopengl.com/PBR/IBL/Diffuse-irradiance
      */
    var sphericalPolynomial: Nullable[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial]
  }
  object BaseTexture {
    
    inline def apply(): typings.babylonjs.mod.babylonjsMaterialsTexturesBaseTextureAugmentingMod.BaseTexture = {
      val __obj = js.Dynamic.literal(sphericalPolynomial = null)
      __obj.asInstanceOf[typings.babylonjs.mod.babylonjsMaterialsTexturesBaseTextureAugmentingMod.BaseTexture]
    }
    
    extension [Self <: typings.babylonjs.mod.babylonjsMaterialsTexturesBaseTextureAugmentingMod.BaseTexture](x: Self) {
      
      inline def setSphericalPolynomial(value: Nullable[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial]): Self = StObject.set(x, "sphericalPolynomial", value.asInstanceOf[js.Any])
      
      inline def setSphericalPolynomialNull: Self = StObject.set(x, "sphericalPolynomial", null)
    }
  }
}
