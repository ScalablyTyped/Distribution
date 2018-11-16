package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This Helps creating a texture that will be created from a camera in your scene.
     * It is basically a dynamic texture that could be used to create special effects for instance.
     * Actually, It is the base of lot of effects in the framework like post process, shadows, effect layers and rendering pipelines...
     */
@JSImport("babylonjs", "RenderTargetTexture")
@js.native
class RenderTargetTexture protected ()
  extends babylonjsLib.BABYLONNs.RenderTargetTexture {
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
           */
  def this(name: java.lang.String, size: babylonjsLib.Anon_Height, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: js.UndefOr[scala.Boolean], doNotChangeAspectRatio: js.UndefOr[scala.Boolean], `type`: js.UndefOr[scala.Double], isCube: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], generateDepthBuffer: js.UndefOr[scala.Boolean], generateStencilBuffer: js.UndefOr[scala.Boolean], isMulti: js.UndefOr[scala.Boolean], format: js.UndefOr[scala.Double]) = this()
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
           */
  def this(name: java.lang.String, size: babylonjsLib.Anon_Ratio, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: js.UndefOr[scala.Boolean], doNotChangeAspectRatio: js.UndefOr[scala.Boolean], `type`: js.UndefOr[scala.Double], isCube: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], generateDepthBuffer: js.UndefOr[scala.Boolean], generateStencilBuffer: js.UndefOr[scala.Boolean], isMulti: js.UndefOr[scala.Boolean], format: js.UndefOr[scala.Double]) = this()
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
           */
  def this(name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: js.UndefOr[scala.Boolean], doNotChangeAspectRatio: js.UndefOr[scala.Boolean], `type`: js.UndefOr[scala.Double], isCube: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], generateDepthBuffer: js.UndefOr[scala.Boolean], generateStencilBuffer: js.UndefOr[scala.Boolean], isMulti: js.UndefOr[scala.Boolean], format: js.UndefOr[scala.Double]) = this()
}

/**
     * This Helps creating a texture that will be created from a camera in your scene.
     * It is basically a dynamic texture that could be used to create special effects for instance.
     * Actually, It is the base of lot of effects in the framework like post process, shadows, effect layers and rendering pipelines...
     */
@JSImport("babylonjs", "RenderTargetTexture")
@js.native
object RenderTargetTexture extends js.Object {
  /**
           * The texture will only be rendered once which can be useful to improve performance if everything in your render is static for instance.
           */
  val REFRESHRATE_RENDER_ONCE: scala.Double = js.native
  /**
           * The texture will only be rendered rendered every frame and is recomended for dynamic contents.
           */
  val REFRESHRATE_RENDER_ONEVERYFRAME: scala.Double = js.native
  /**
           * The texture will be rendered every 2 frames which could be enough if your dynamic objects are not
           * the central point of your effect and can save a lot of performances.
           */
  val REFRESHRATE_RENDER_ONEVERYTWOFRAMES: scala.Double = js.native
}

