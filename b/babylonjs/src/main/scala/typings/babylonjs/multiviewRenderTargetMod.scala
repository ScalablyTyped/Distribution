package typings.babylonjs

import typings.babylonjs.anon.Ratio
import typings.babylonjs.anon.Width
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/MultiviewRenderTarget", JSImport.Namespace)
@js.native
object multiviewRenderTargetMod extends js.Object {
  
  @js.native
  class MultiviewRenderTarget protected () extends RenderTargetTexture {
    /**
      * Creates a multiview render target
      * @param scene scene used with the render target
      * @param size the size of the render target (used for each view)
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, size: Double) = this()
    def this(scene: Scene, size: Ratio) = this()
    def this(scene: Scene, size: Width) = this()
  }
}
