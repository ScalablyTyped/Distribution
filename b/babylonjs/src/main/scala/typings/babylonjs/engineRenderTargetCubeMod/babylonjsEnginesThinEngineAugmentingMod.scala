package typings.babylonjs.engineRenderTargetCubeMod

import typings.babylonjs.PartialRenderTargetCreati
import typings.babylonjs.internalTextureMod.InternalTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  @js.native
  trait ThinEngine extends js.Object {
    /**
      * Creates a new render target cube texture
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target cube texture stored in an InternalTexture
      */
    def createRenderTargetCubeTexture(size: Double): InternalTexture = js.native
    def createRenderTargetCubeTexture(size: Double, options: PartialRenderTargetCreati): InternalTexture = js.native
  }
  
}

