package typings.babylonjs

import typings.babylonjs.multiRenderTargetMod.IMultiRenderTargetOptions
import typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.textureCreationOptionsMod.TextureSize
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineMultiRenderMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /**
        * Select a subsets of attachments to draw to.
        * @param attachments gl attachments
        */
      def bindAttachments(attachments: js.Array[Double]): Unit = js.native
      
      /**
        * Creates a layout object to draw/clear on specific textures in a MRT
        * @param textureStatus textureStatus[i] indicates if the i-th is active
        * @returns A layout to be fed to the engine, calling `bindAttachments`.
        */
      def buildTextureLayout(textureStatus: js.Array[Boolean]): js.Array[Double] = js.native
      
      /**
        * Create a multi render target texture
        * @see https://doc.babylonjs.com/features/webgl2#multiple-render-target
        * @param size defines the size of the texture
        * @param options defines the creation options
        * @param initializeBuffers if set to true, the engine will make an initializing call of drawBuffers
        * @returns a new render target wrapper ready to render textures
        */
      def createMultipleRenderTarget(size: TextureSize, options: IMultiRenderTargetOptions): RenderTargetWrapper = js.native
      def createMultipleRenderTarget(size: TextureSize, options: IMultiRenderTargetOptions, initializeBuffers: Boolean): RenderTargetWrapper = js.native
      
      /**
        * Restores the webgl state to only draw on the main color attachment
        * when the frame buffer associated is the canvas frame buffer
        */
      def restoreSingleAttachment(): Unit = js.native
      
      /**
        * Restores the webgl state to only draw on the main color attachment
        * when the frame buffer associated is not the canvas frame buffer
        */
      def restoreSingleAttachmentForRenderTarget(): Unit = js.native
      
      /**
        * Unbind a list of render target textures from the webGL context
        * This is used only when drawBuffer extension or webGL2 are active
        * @param rtWrapper defines the render target wrapper to unbind
        * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
        * @param onBeforeUnbind defines a function which will be called before the effective unbind
        */
      def unBindMultiColorAttachmentFramebuffer(rtWrapper: RenderTargetWrapper, disableGenerateMipMaps: Boolean): Unit = js.native
      def unBindMultiColorAttachmentFramebuffer(
        rtWrapper: RenderTargetWrapper,
        disableGenerateMipMaps: Boolean,
        onBeforeUnbind: js.Function0[Unit]
      ): Unit = js.native
      
      /**
        * Update the sample count for a given multiple render target texture
        * @see https://doc.babylonjs.com/features/webgl2#multisample-render-targets
        * @param rtWrapper defines the render target wrapper to update
        * @param samples defines the sample count to set
        * @param initializeBuffers if set to true, the engine will make an initializing call of drawBuffers
        * @returns the effective sample count (could be 0 if multisample render targets are not supported)
        */
      def updateMultipleRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double): Double = js.native
      def updateMultipleRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double, initializeBuffers: Boolean): Double = js.native
    }
  }
}
