package typings.babylonjs

import typings.babylonjs.anon.Height
import typings.babylonjs.depthTextureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.renderTargetCreationOptionsMod.RenderTargetCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineRenderTargetMod {
  
  type RenderTargetTextureSize = Double | Height
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /** @hidden */
      def _createDepthStencilTexture(size: RenderTargetTextureSize, options: DepthTextureCreationOptions): InternalTexture = js.native
      
      /**
        * Creates a depth stencil texture.
        * This is only available in WebGL 2 or with the depth texture extension available.
        * @param size The size of face edge in the texture.
        * @param options The options defining the texture.
        * @returns The texture
        */
      def createDepthStencilTexture(size: RenderTargetTextureSize, options: DepthTextureCreationOptions): InternalTexture = js.native
      
      /**
        * Creates a new render target texture
        * @param size defines the size of the texture
        * @param options defines the options used to create the texture
        * @returns a new render target texture stored in an InternalTexture
        */
      def createRenderTargetTexture(size: RenderTargetTextureSize, options: Boolean): InternalTexture = js.native
      def createRenderTargetTexture(size: RenderTargetTextureSize, options: RenderTargetCreationOptions): InternalTexture = js.native
    }
  }
}
