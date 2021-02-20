package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iEffectFallbacksMod {
  
  @js.native
  trait IEffectFallbacks extends StObject {
    
    /**
      * Checks to see if more fallbacks are still availible.
      */
    var hasMoreFallbacks: Boolean = js.native
    
    /**
      * Removes the defines that should be removed when falling back.
      * @param currentDefines defines the current define statements for the shader.
      * @param effect defines the current effect we try to compile
      * @returns The resulting defines with defines of the current rank removed.
      */
    def reduce(currentDefines: String, effect: Effect): String = js.native
    
    /**
      * Removes the fallback from the bound mesh.
      */
    def unBindMesh(): Unit = js.native
  }
  object IEffectFallbacks {
    
    @scala.inline
    def apply(hasMoreFallbacks: Boolean, reduce: (String, Effect) => String, unBindMesh: () => Unit): IEffectFallbacks = {
      val __obj = js.Dynamic.literal(hasMoreFallbacks = hasMoreFallbacks.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce), unBindMesh = js.Any.fromFunction0(unBindMesh))
      __obj.asInstanceOf[IEffectFallbacks]
    }
    
    @scala.inline
    implicit class IEffectFallbacksMutableBuilder[Self <: IEffectFallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasMoreFallbacks(value: Boolean): Self = StObject.set(x, "hasMoreFallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduce(value: (String, Effect) => String): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnBindMesh(value: () => Unit): Self = StObject.set(x, "unBindMesh", js.Any.fromFunction0(value))
    }
  }
}
