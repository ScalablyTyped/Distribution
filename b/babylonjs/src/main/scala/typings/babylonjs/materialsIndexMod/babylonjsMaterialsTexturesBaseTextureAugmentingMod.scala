package typings.babylonjs.materialsIndexMod

import typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMaterialsTexturesBaseTextureAugmentingMod {
  
  trait BaseTexture extends StObject {
    
    /**
      * Force recomputation of spherical polynomials.
      * Can be useful if you generate a cubemap multiple times (from a probe for eg) and you need the proper polynomials each time
      */
    def forceSphericalPolynomialsRecompute(): Unit
    
    /**
      * Get the polynomial representation of the texture data.
      * This is mainly use as a fast way to recover IBL Diffuse irradiance data.
      * @see https://learnopengl.com/PBR/IBL/Diffuse-irradiance
      */
    var sphericalPolynomial: Nullable[SphericalPolynomial]
  }
  object BaseTexture {
    
    inline def apply(forceSphericalPolynomialsRecompute: () => Unit): typings.babylonjs.materialsIndexMod.babylonjsMaterialsTexturesBaseTextureAugmentingMod.BaseTexture = {
      val __obj = js.Dynamic.literal(forceSphericalPolynomialsRecompute = js.Any.fromFunction0(forceSphericalPolynomialsRecompute), sphericalPolynomial = null)
      __obj.asInstanceOf[typings.babylonjs.materialsIndexMod.babylonjsMaterialsTexturesBaseTextureAugmentingMod.BaseTexture]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.babylonjs.materialsIndexMod.babylonjsMaterialsTexturesBaseTextureAugmentingMod.BaseTexture] (val x: Self) extends AnyVal {
      
      inline def setForceSphericalPolynomialsRecompute(value: () => Unit): Self = StObject.set(x, "forceSphericalPolynomialsRecompute", js.Any.fromFunction0(value))
      
      inline def setSphericalPolynomial(value: Nullable[SphericalPolynomial]): Self = StObject.set(x, "sphericalPolynomial", value.asInstanceOf[js.Any])
      
      inline def setSphericalPolynomialNull: Self = StObject.set(x, "sphericalPolynomial", null)
    }
  }
}
