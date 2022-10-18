package typings.babylonjs

import typings.babylonjs.materialsEffectMod.Effect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsIEffectFallbacksMod {
  
  trait IEffectFallbacks extends StObject {
    
    /**
      * Checks to see if more fallbacks are still available.
      */
    var hasMoreFallbacks: Boolean
    
    /**
      * Removes the defines that should be removed when falling back.
      * @param currentDefines defines the current define statements for the shader.
      * @param effect defines the current effect we try to compile
      * @returns The resulting defines with defines of the current rank removed.
      */
    def reduce(currentDefines: String, effect: Effect): String
    
    /**
      * Removes the fallback from the bound mesh.
      */
    def unBindMesh(): Unit
  }
  object IEffectFallbacks {
    
    inline def apply(hasMoreFallbacks: Boolean, reduce: (String, Effect) => String, unBindMesh: () => Unit): IEffectFallbacks = {
      val __obj = js.Dynamic.literal(hasMoreFallbacks = hasMoreFallbacks.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce), unBindMesh = js.Any.fromFunction0(unBindMesh))
      __obj.asInstanceOf[IEffectFallbacks]
    }
    
    extension [Self <: IEffectFallbacks](x: Self) {
      
      inline def setHasMoreFallbacks(value: Boolean): Self = StObject.set(x, "hasMoreFallbacks", value.asInstanceOf[js.Any])
      
      inline def setReduce(value: (String, Effect) => String): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
      
      inline def setUnBindMesh(value: () => Unit): Self = StObject.set(x, "unBindMesh", js.Any.fromFunction0(value))
    }
  }
}
