package typings.babylonjs

import typings.babylonjs.materialsTexturesExternalTextureMod.ExternalTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUExtensionsEngineDotexternalTextureMod {
  
  /* augmented module */
  object babylonjsMaterialsEffectAugmentingMod {
    
    trait Effect extends StObject {
      
      /**
        * Sets an external texture on the engine to be used in the shader.
        * @param name Name of the external texture variable.
        * @param texture Texture to set.
        */
      def setExternalTexture(name: String, texture: Nullable[ExternalTexture]): Unit
    }
    object Effect {
      
      inline def apply(setExternalTexture: (String, Nullable[ExternalTexture]) => Unit): Effect = {
        val __obj = js.Dynamic.literal(setExternalTexture = js.Any.fromFunction2(setExternalTexture))
        __obj.asInstanceOf[Effect]
      }
      
      extension [Self <: Effect](x: Self) {
        
        inline def setSetExternalTexture(value: (String, Nullable[ExternalTexture]) => Unit): Self = StObject.set(x, "setExternalTexture", js.Any.fromFunction2(value))
      }
    }
  }
}
