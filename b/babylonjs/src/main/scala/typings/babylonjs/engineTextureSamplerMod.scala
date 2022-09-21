package typings.babylonjs

import typings.babylonjs.textureSamplerMod.TextureSampler
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineTextureSamplerMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    trait ThinEngine extends StObject {
      
      /**
        * Sets a texture sampler to the according uniform.
        * @param name The name of the uniform in the effect
        * @param sampler The sampler to apply
        */
      def setTextureSampler(name: String, sampler: Nullable[TextureSampler]): Unit
    }
    object ThinEngine {
      
      inline def apply(setTextureSampler: (String, Nullable[TextureSampler]) => Unit): ThinEngine = {
        val __obj = js.Dynamic.literal(setTextureSampler = js.Any.fromFunction2(setTextureSampler))
        __obj.asInstanceOf[ThinEngine]
      }
      
      extension [Self <: ThinEngine](x: Self) {
        
        inline def setSetTextureSampler(value: (String, Nullable[TextureSampler]) => Unit): Self = StObject.set(x, "setTextureSampler", js.Any.fromFunction2(value))
      }
    }
  }
}
