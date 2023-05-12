package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.RenderTargetTextureOptions
import typings.babylonjs.anon.Layers
import typings.babylonjs.anon.Ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RenderTargetTexture")
@js.native
open class RenderTargetTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.RenderTargetTexture {
  /**
    * Instantiate a render target texture. This is mainly used to render of screen the scene to for instance apply post process
    * or used a shadow, depth texture...
    * @param name The friendly name of the texture
    * @param size The size of the RTT (number if square, or {width: number, height:number} or {ratio:} to define a ratio from the main scene)
    * @param scene The scene the RTT belongs to. Default is the last created scene.
    * @param options The options for creating the render target texture.
    */
  def this(name: String, size: Double) = this()
  def this(name: String, size: Layers) = this()
  def this(name: String, size: Ratio) = this()
  def this(name: String, size: Double, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  def this(name: String, size: Layers, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  def this(name: String, size: Ratio, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  def this(name: String, size: Double, scene: Unit, options: RenderTargetTextureOptions) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    options: RenderTargetTextureOptions
  ) = this()
  def this(name: String, size: Layers, scene: Unit, options: RenderTargetTextureOptions) = this()
  def this(
    name: String,
    size: Layers,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    options: RenderTargetTextureOptions
  ) = this()
  def this(name: String, size: Ratio, scene: Unit, options: RenderTargetTextureOptions) = this()
  def this(
    name: String,
    size: Ratio,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    options: RenderTargetTextureOptions
  ) = this()
  /**
    * Instantiate a render target texture. This is mainly used to render of screen the scene to for instance apply post process
    * or used a shadow, depth texture...
    * @param name The friendly name of the texture
    * @param size The size of the RTT (number if square, or {width: number, height:number} or {ratio:} to define a ratio from the main scene)
    * @param scene The scene the RTT belongs to. Default is the last created scene
    * @param generateMipMaps True (default: false) if mipmaps need to be generated after render
    * @param doNotChangeAspectRatio True (default) to not change the aspect ratio of the scene in the RTT
    * @param type The type of the buffer in the RTT (byte (default), half float, float...)
    * @param isCube True (default: false) if a cube texture needs to be created
    * @param samplingMode The sampling mode to be used with the render target (Trilinear (default), Linear, Nearest...)
    * @param generateDepthBuffer True (default) to generate a depth buffer
    * @param generateStencilBuffer True (default: false) to generate a stencil buffer
    * @param isMulti True (default: false) if multiple textures need to be created (Draw Buffers)
    * @param format The internal format of the buffer in the RTT (RED, RG, RGB, RGBA (default), ALPHA...)
    * @param delayAllocation True (default: false) if the texture allocation should be delayed
    * @param samples Sample count to use when creating the RTT
    * @param creationFlags specific flags to use when creating the texture (e.g., Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures)
    * @param noColorAttachment True (default: false) to indicate that no color target should be created. (e.g., if you only want to write to the depth buffer)
    * @param useSRGBBuffer True (default: false) to create a SRGB texture
    */
  def this(
    name: String,
    size: Double | Layers | Ratio,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    generateMipMaps: js.UndefOr[Boolean],
    doNotChangeAspectRatio: js.UndefOr[Boolean],
    `type`: js.UndefOr[Double],
    isCube: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    generateDepthBuffer: js.UndefOr[Boolean],
    generateStencilBuffer: js.UndefOr[Boolean],
    isMulti: js.UndefOr[Boolean],
    format: js.UndefOr[Double],
    delayAllocation: js.UndefOr[Boolean],
    samples: js.UndefOr[Double],
    creationFlags: js.UndefOr[Double],
    noColorAttachment: js.UndefOr[Boolean],
    useSRGBBuffer: js.UndefOr[Boolean]
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
  
  /**
    * Entry point to access the wrapper on a texture.
    */
  /* CompleteClass */
  var renderTarget: Nullable[typings.babylonjs.BABYLON.RenderTargetWrapper] = js.native
}
/* static members */
object RenderTargetTexture {
  
  /**
    * The texture will only be rendered once which can be useful to improve performance if everything in your render is static for instance.
    */
  @JSGlobal("BABYLON.RenderTargetTexture.REFRESHRATE_RENDER_ONCE")
  @js.native
  val REFRESHRATE_RENDER_ONCE: Double = js.native
  
  /**
    * The texture will only be rendered rendered every frame and is recommended for dynamic contents.
    */
  @JSGlobal("BABYLON.RenderTargetTexture.REFRESHRATE_RENDER_ONEVERYFRAME")
  @js.native
  val REFRESHRATE_RENDER_ONEVERYFRAME: Double = js.native
  
  /**
    * The texture will be rendered every 2 frames which could be enough if your dynamic objects are not
    * the central point of your effect and can save a lot of performances.
    */
  @JSGlobal("BABYLON.RenderTargetTexture.REFRESHRATE_RENDER_ONEVERYTWOFRAMES")
  @js.native
  val REFRESHRATE_RENDER_ONEVERYTWOFRAMES: Double = js.native
}
