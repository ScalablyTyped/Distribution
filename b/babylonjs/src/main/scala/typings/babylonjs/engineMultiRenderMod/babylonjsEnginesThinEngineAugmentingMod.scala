package typings.babylonjs.engineMultiRenderMod

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.multiRenderTargetMod.IMultiRenderTargetOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  
  @js.native
  trait ThinEngine extends js.Object {
    
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
      * @returns the cube texture as an InternalTexture
      */
    def createMultipleRenderTarget(size: js.Any, options: IMultiRenderTargetOptions): js.Array[InternalTexture] = js.native
    
    /**
      * Restores the webgl state to only draw on the main color attachment
      */
    def restoreSingleAttachment(): Unit = js.native
    
    /**
      * Unbind a list of render target textures from the webGL context
      * This is used only when drawBuffer extension or webGL2 are active
      * @param textures defines the render target textures to unbind
      * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
      * @param onBeforeUnbind defines a function which will be called before the effective unbind
      */
    def unBindMultiColorAttachmentFramebuffer(textures: js.Array[InternalTexture], disableGenerateMipMaps: Boolean): Unit = js.native
    def unBindMultiColorAttachmentFramebuffer(
      textures: js.Array[InternalTexture],
      disableGenerateMipMaps: Boolean,
      onBeforeUnbind: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Update the sample count for a given multiple render target texture
      * @see https://doc.babylonjs.com/features/webgl2#multisample-render-targets
      * @param textures defines the textures to update
      * @param samples defines the sample count to set
      * @returns the effective sample count (could be 0 if multisample render targets are not supported)
      */
    def updateMultipleRenderTargetTextureSampleCount(textures: Nullable[js.Array[InternalTexture]], samples: Double): Double = js.native
  }
}
