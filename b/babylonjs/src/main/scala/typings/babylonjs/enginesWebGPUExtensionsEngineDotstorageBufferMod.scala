package typings.babylonjs

import typings.babylonjs.buffersStorageBufferMod.StorageBuffer
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUExtensionsEngineDotstorageBufferMod {
  
  /* augmented module */
  object babylonjsMaterialsEffectAugmentingMod {
    
    trait Effect extends StObject {
      
      /**
        * Sets a storage buffer on the engine to be used in the shader.
        * @param name Name of the storage buffer variable.
        * @param buffer Storage buffer to set.
        */
      def setStorageBuffer(name: String, buffer: Nullable[StorageBuffer]): Unit
    }
    object Effect {
      
      inline def apply(setStorageBuffer: (String, Nullable[StorageBuffer]) => Unit): Effect = {
        val __obj = js.Dynamic.literal(setStorageBuffer = js.Any.fromFunction2(setStorageBuffer))
        __obj.asInstanceOf[Effect]
      }
      
      extension [Self <: Effect](x: Self) {
        
        inline def setSetStorageBuffer(value: (String, Nullable[StorageBuffer]) => Unit): Self = StObject.set(x, "setStorageBuffer", js.Any.fromFunction2(value))
      }
    }
  }
}
