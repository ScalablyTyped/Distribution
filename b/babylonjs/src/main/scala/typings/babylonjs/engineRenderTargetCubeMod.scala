package typings.babylonjs

import typings.babylonjs.anon.PartialRenderTargetCreati
import typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineRenderTargetCubeMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /**
        * Creates a new render target cube wrapper
        * @param size defines the size of the texture
        * @param options defines the options used to create the texture
        * @returns a new render target cube wrapper
        */
      def createRenderTargetCubeTexture(size: Double): RenderTargetWrapper = js.native
      def createRenderTargetCubeTexture(size: Double, options: PartialRenderTargetCreati): RenderTargetWrapper = js.native
    }
  }
}
