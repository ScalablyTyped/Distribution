package typings.babylonjs.engineRenderTargetMod

import typings.babylonjs.anon.Height
import typings.babylonjs.depthTextureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.renderTargetCreationOptionsMod.RenderTargetCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  @js.native
  trait ThinEngine extends js.Object {
    /** @hidden */
    def _createDepthStencilTexture(size: Double, options: DepthTextureCreationOptions): InternalTexture = js.native
    def _createDepthStencilTexture(size: Height, options: DepthTextureCreationOptions): InternalTexture = js.native
    /**
      * Creates a depth stencil texture.
      * This is only available in WebGL 2 or with the depth texture extension available.
      * @param size The size of face edge in the texture.
      * @param options The options defining the texture.
      * @returns The texture
      */
    def createDepthStencilTexture(size: Double, options: DepthTextureCreationOptions): InternalTexture = js.native
    def createDepthStencilTexture(size: Height, options: DepthTextureCreationOptions): InternalTexture = js.native
    /**
      * Creates a new render target texture
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target texture stored in an InternalTexture
      */
    def createRenderTargetTexture(size: Double, options: Boolean): InternalTexture = js.native
    def createRenderTargetTexture(size: Double, options: RenderTargetCreationOptions): InternalTexture = js.native
    def createRenderTargetTexture(size: Height, options: Boolean): InternalTexture = js.native
    def createRenderTargetTexture(size: Height, options: RenderTargetCreationOptions): InternalTexture = js.native
  }
  
}

