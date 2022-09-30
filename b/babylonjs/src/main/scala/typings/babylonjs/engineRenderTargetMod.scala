package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.textureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.textureCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.textureCreationOptionsMod.TextureSize
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineRenderTargetMod {
  
  type RenderTargetTextureSize = TextureSize
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /** @internal */
      def _createDepthStencilTexture(size: TextureSize, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
      
      /** @internal */
      def _createHardwareRenderTargetWrapper(isMulti: Boolean, isCube: Boolean, size: TextureSize): RenderTargetWrapper = js.native
      
      /**
        * Creates a depth stencil texture.
        * This is only available in WebGL 2 or with the depth texture extension available.
        * @param size The size of face edge in the texture.
        * @param options The options defining the texture.
        * @param rtWrapper The render target wrapper for which the depth/stencil texture must be created
        * @returns The texture
        */
      def createDepthStencilTexture(size: TextureSize, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
      
      /**
        * Creates a new render target texture
        * @param size defines the size of the texture
        * @param options defines the options used to create the texture
        * @returns a new render target wrapper ready to render texture
        */
      def createRenderTargetTexture(size: TextureSize, options: Boolean): RenderTargetWrapper = js.native
      def createRenderTargetTexture(size: TextureSize, options: RenderTargetCreationOptions): RenderTargetWrapper = js.native
      
      /**
        * Updates the sample count of a render target texture
        * @see https://doc.babylonjs.com/features/webgl2#multisample-render-targets
        * @param rtWrapper defines the render target wrapper to update
        * @param samples defines the sample count to set
        * @returns the effective sample count (could be 0 if multisample render targets are not supported)
        */
      def updateRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double): Double = js.native
    }
  }
}
