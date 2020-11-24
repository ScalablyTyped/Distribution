package typings.babylonjs.legacyMod

import typings.babylonjs.anon.Height
import typings.babylonjs.anon.Ratio
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "RenderTargetTexture")
@js.native
class RenderTargetTexture protected ()
  extends typings.babylonjs.indexMod.RenderTargetTexture {
  /**
    * Instantiate a render target texture. This is mainly used to render of screen the scene to for instance apply post processse
    * or used a shadow, depth texture...
    * @param name The friendly name of the texture
    * @param size The size of the RTT (number if square, or {width: number, height:number} or {ratio:} to define a ratio from the main scene)
    * @param scene The scene the RTT belongs to. The latest created scene will be used if not precised.
    * @param generateMipMaps True if mip maps need to be generated after render.
    * @param doNotChangeAspectRatio True to not change the aspect ratio of the scene in the RTT
    * @param type The type of the buffer in the RTT (int, half float, float...)
    * @param isCube True if a cube texture needs to be created
    * @param samplingMode The sampling mode to be usedwith the render target (Linear, Nearest...)
    * @param generateDepthBuffer True to generate a depth buffer
    * @param generateStencilBuffer True to generate a stencil buffer
    * @param isMulti True if multiple textures need to be created (Draw Buffers)
    * @param format The internal format of the buffer in the RTT (RED, RG, RGB, RGBA, ALPHA...)
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(
    name: String,
    size: Double | Height | Ratio,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    generateMipMaps: js.UndefOr[Boolean],
    doNotChangeAspectRatio: js.UndefOr[Boolean],
    `type`: js.UndefOr[Double],
    isCube: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    generateDepthBuffer: js.UndefOr[Boolean],
    generateStencilBuffer: js.UndefOr[Boolean],
    isMulti: js.UndefOr[Boolean],
    format: js.UndefOr[Double],
    delayAllocation: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "RenderTargetTexture")
@js.native
object RenderTargetTexture extends js.Object {
  
  /**
    * The texture will only be rendered once which can be useful to improve performance if everything in your render is static for instance.
    */
  val REFRESHRATE_RENDER_ONCE: Double = js.native
  
  /**
    * The texture will only be rendered rendered every frame and is recomended for dynamic contents.
    */
  val REFRESHRATE_RENDER_ONEVERYFRAME: Double = js.native
  
  /**
    * The texture will be rendered every 2 frames which could be enough if your dynamic objects are not
    * the central point of your effect and can save a lot of performances.
    */
  val REFRESHRATE_RENDER_ONEVERYTWOFRAMES: Double = js.native
}
