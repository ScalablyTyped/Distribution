package typings.babylonjs.enginesIndexMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.OffscreenCanvas
import typings.babylonjs.WebGL2RenderingContext
import typings.babylonjs.audioInterfacesIaudioengineMod.IAudioEngine
import typings.babylonjs.enginesThinEngineMod.EngineOptions
import typings.babylonjs.loadingLoadingScreenMod.ILoadingScreen
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.offlineIofflineproviderMod.IOfflineProvider
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.typesMod.Nullable
import typings.std.AudioContext
import typings.std.AudioDestinationNode
import typings.std.HTMLElement
import typings.std.MediaStreamAudioDestinationNode
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/index", "Engine")
@js.native
open class Engine protected ()
  extends typings.babylonjs.enginesEngineMod.Engine {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which already used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ]) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: Unit,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: Unit,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
}
/* static members */
object Engine {
  
  @JSImport("babylonjs/Engines/index", "Engine")
  @js.native
  val ^ : js.Any = js.native
  
  /** Defines that alpha blending to SRC ALPHA * SRC + DEST */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_ADD")
  @js.native
  val ALPHA_ADD: Double = js.native
  
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_COMBINE")
  @js.native
  val ALPHA_COMBINE: Double = js.native
  
  /** Defines that alpha blending is disabled */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_DISABLE")
  @js.native
  val ALPHA_DISABLE: Double = js.native
  
  /** Defines that alpha blending to CST * SRC + (1 - CST) * DEST */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_INTERPOLATE")
  @js.native
  val ALPHA_INTERPOLATE: Double = js.native
  
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC) * DEST */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_MAXIMIZED")
  @js.native
  val ALPHA_MAXIMIZED: Double = js.native
  
  /** Defines that alpha blending to SRC * DEST */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_MULTIPLY")
  @js.native
  val ALPHA_MULTIPLY: Double = js.native
  
  /** Defines that alpha blending to SRC + DEST */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_ONEONE")
  @js.native
  val ALPHA_ONEONE: Double = js.native
  
  /** Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_PREMULTIPLIED")
  @js.native
  val ALPHA_PREMULTIPLIED: Double = js.native
  
  /**
    * Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST
    * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
    */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_PREMULTIPLIED_PORTERDUFF")
  @js.native
  val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
  
  /**
    * Defines that alpha blending to SRC + (1 - SRC) * DEST
    * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
    */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_SCREENMODE")
  @js.native
  val ALPHA_SCREENMODE: Double = js.native
  
  /** Defines that alpha blending to DEST - SRC * DEST */
  @JSImport("babylonjs/Engines/index", "Engine.ALPHA_SUBTRACT")
  @js.native
  val ALPHA_SUBTRACT: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  @JSImport("babylonjs/Engines/index", "Engine.ALWAYS")
  @js.native
  val ALWAYS: Double = js.native
  
  /**
    * Default AudioEngine factory responsible of creating the Audio Engine.
    * By default, this will create a BabylonJS Audio Engine if the workload has been embedded.
    */
  inline def AudioEngineFactory(
    hostElement: Nullable[HTMLElement],
    audioContext: Nullable[AudioContext],
    audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
  ): IAudioEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("AudioEngineFactory")(hostElement.asInstanceOf[js.Any], audioContext.asInstanceOf[js.Any], audioDestination.asInstanceOf[js.Any])).asInstanceOf[IAudioEngine]
  
  /** Passed to stencilOperation to specify that stencil value must be decremented */
  @JSImport("babylonjs/Engines/index", "Engine.DECR")
  @js.native
  val DECR: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
  @JSImport("babylonjs/Engines/index", "Engine.DECR_WRAP")
  @js.native
  val DECR_WRAP: Double = js.native
  
  /** Defines that the resource was successfully delay loaded */
  @JSImport("babylonjs/Engines/index", "Engine.DELAYLOADSTATE_LOADED")
  @js.native
  val DELAYLOADSTATE_LOADED: Double = js.native
  
  /** Defines that the resource is currently delay loading */
  @JSImport("babylonjs/Engines/index", "Engine.DELAYLOADSTATE_LOADING")
  @js.native
  val DELAYLOADSTATE_LOADING: Double = js.native
  
  /** Defines that the resource is not delayed*/
  @JSImport("babylonjs/Engines/index", "Engine.DELAYLOADSTATE_NONE")
  @js.native
  val DELAYLOADSTATE_NONE: Double = js.native
  
  /** Defines that the resource is delayed and has not started loading */
  @JSImport("babylonjs/Engines/index", "Engine.DELAYLOADSTATE_NOTLOADED")
  @js.native
  val DELAYLOADSTATE_NOTLOADED: Double = js.native
  
  /**
    * Method called to create the default loading screen.
    * This can be overridden in your own app.
    * @param canvas The rendering canvas element
    * @returns The loading screen
    */
  inline def DefaultLoadingScreenFactory(canvas: HTMLCanvasElement): ILoadingScreen = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultLoadingScreenFactory")(canvas.asInstanceOf[js.Any]).asInstanceOf[ILoadingScreen]
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
  @JSImport("babylonjs/Engines/index", "Engine.EQUAL")
  @js.native
  val EQUAL: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
  @JSImport("babylonjs/Engines/index", "Engine.GEQUAL")
  @js.native
  val GEQUAL: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
  @JSImport("babylonjs/Engines/index", "Engine.GREATER")
  @js.native
  val GREATER: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be incremented */
  @JSImport("babylonjs/Engines/index", "Engine.INCR")
  @js.native
  val INCR: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
  @JSImport("babylonjs/Engines/index", "Engine.INCR_WRAP")
  @js.native
  val INCR_WRAP: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be inverted */
  @JSImport("babylonjs/Engines/index", "Engine.INVERT")
  @js.native
  val INVERT: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be kept */
  @JSImport("babylonjs/Engines/index", "Engine.KEEP")
  @js.native
  val KEEP: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
  @JSImport("babylonjs/Engines/index", "Engine.LEQUAL")
  @js.native
  val LEQUAL: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
  @JSImport("babylonjs/Engines/index", "Engine.LESS")
  @js.native
  val LESS: Double = js.native
  
  /**
    * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
    * @param flag defines which part of the materials must be marked as dirty
    * @param predicate defines a predicate used to filter which materials should be affected
    */
  inline def MarkAllMaterialsAsDirty(flag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("MarkAllMaterialsAsDirty")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def MarkAllMaterialsAsDirty(flag: Double, predicate: js.Function1[/* mat */ Material, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("MarkAllMaterialsAsDirty")(flag.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
  @JSImport("babylonjs/Engines/index", "Engine.NEVER")
  @js.native
  val NEVER: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
  @JSImport("babylonjs/Engines/index", "Engine.NOTEQUAL")
  @js.native
  val NOTEQUAL: Double = js.native
  
  /**
    * Default offline support factory responsible of creating a tool used to store data locally.
    * By default, this will create a Database object if the workload has been embedded.
    */
  inline def OfflineProviderFactory(
    urlToScene: String,
    callbackManifestChecked: js.Function1[/* checked */ Boolean, Any],
    disableManifestCheck: Boolean
  ): IOfflineProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("OfflineProviderFactory")(urlToScene.asInstanceOf[js.Any], callbackManifestChecked.asInstanceOf[js.Any], disableManifestCheck.asInstanceOf[js.Any])).asInstanceOf[IOfflineProvider]
  
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  @JSImport("babylonjs/Engines/index", "Engine.REPLACE")
  @js.native
  val REPLACE: Double = js.native
  
  /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
  @JSImport("babylonjs/Engines/index", "Engine.SCALEMODE_CEILING")
  @js.native
  val SCALEMODE_CEILING: Double = js.native
  
  /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
  @JSImport("babylonjs/Engines/index", "Engine.SCALEMODE_FLOOR")
  @js.native
  val SCALEMODE_FLOOR: Double = js.native
  
  /** Defines that texture rescaling will look for the nearest power of 2 size */
  @JSImport("babylonjs/Engines/index", "Engine.SCALEMODE_NEAREST")
  @js.native
  val SCALEMODE_NEAREST: Double = js.native
  
  /** ALPHA */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_ALPHA")
  @js.native
  val TEXTUREFORMAT_ALPHA: Double = js.native
  
  /** LUMINANCE */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_LUMINANCE")
  @js.native
  val TEXTUREFORMAT_LUMINANCE: Double = js.native
  
  /** LUMINANCE_ALPHA */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_LUMINANCE_ALPHA")
  @js.native
  val TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
  
  /** RED (2nd reference) */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_R")
  @js.native
  val TEXTUREFORMAT_R: Double = js.native
  
  /** RED */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RED")
  @js.native
  val TEXTUREFORMAT_RED: Double = js.native
  
  /** RED_INTEGER */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RED_INTEGER")
  @js.native
  val TEXTUREFORMAT_RED_INTEGER: Double = js.native
  
  /** RG */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RG")
  @js.native
  val TEXTUREFORMAT_RG: Double = js.native
  
  /** RGB */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RGB")
  @js.native
  val TEXTUREFORMAT_RGB: Double = js.native
  
  /** RGBA */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RGBA")
  @js.native
  val TEXTUREFORMAT_RGBA: Double = js.native
  
  /** RGBA_INTEGER */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RGBA_INTEGER")
  @js.native
  val TEXTUREFORMAT_RGBA_INTEGER: Double = js.native
  
  /** RGB_INTEGER */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RGB_INTEGER")
  @js.native
  val TEXTUREFORMAT_RGB_INTEGER: Double = js.native
  
  /** RG_INTEGER */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RG_INTEGER")
  @js.native
  val TEXTUREFORMAT_RG_INTEGER: Double = js.native
  
  /** RED_INTEGER (2nd reference) */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_R_INTEGER")
  @js.native
  val TEXTUREFORMAT_R_INTEGER: Double = js.native
  
  /** BYTE */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_BYTE")
  @js.native
  val TEXTURETYPE_BYTE: Double = js.native
  
  /** FLOAT */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_FLOAT")
  @js.native
  val TEXTURETYPE_FLOAT: Double = js.native
  
  /** FLOAT_32_UNSIGNED_INT_24_8_REV */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV")
  @js.native
  val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
  
  /** HALF_FLOAT */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_HALF_FLOAT")
  @js.native
  val TEXTURETYPE_HALF_FLOAT: Double = js.native
  
  /** INT */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_INT")
  @js.native
  val TEXTURETYPE_INT: Double = js.native
  
  /** SHORT */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_SHORT")
  @js.native
  val TEXTURETYPE_SHORT: Double = js.native
  
  /** UNSIGNED_BYTE */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_BYTE")
  @js.native
  val TEXTURETYPE_UNSIGNED_BYTE: Double = js.native
  
  /** UNSIGNED_BYTE (2nd reference) */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT: Double = js.native
  
  /** UNSIGNED_INT */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INTEGER")
  @js.native
  val TEXTURETYPE_UNSIGNED_INTEGER: Double = js.native
  
  /** UNSIGNED_INT_10F_11F_11F_REV */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
  
  /** UNSIGNED_INT_24_8 */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT_24_8")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_24_8: Double = js.native
  
  /** UNSIGNED_INT_2_10_10_10_REV */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Double = js.native
  
  /** UNSIGNED_INT_5_9_9_9_REV */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Double = js.native
  
  /** UNSIGNED_SHORT */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_SHORT")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT: Double = js.native
  
  /** UNSIGNED_SHORT_4_4_4_4 */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Double = js.native
  
  /** UNSIGNED_SHORT_5_5_5_1 */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Double = js.native
  
  /** UNSIGNED_SHORT_5_6_5 */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_SHORT_5_6_5")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Double = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_BILINEAR_SAMPLINGMODE")
  @js.native
  val TEXTURE_BILINEAR_SAMPLINGMODE: Double = js.native
  
  /** Texture is not repeating outside of 0..1 UVs */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_CLAMP_ADDRESSMODE")
  @js.native
  val TEXTURE_CLAMP_ADDRESSMODE: Double = js.native
  
  /** Cubic coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_CUBIC_MODE")
  @js.native
  val TEXTURE_CUBIC_MODE: Double = js.native
  
  /** Equirectangular coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_EQUIRECTANGULAR_MODE")
  @js.native
  val TEXTURE_EQUIRECTANGULAR_MODE: Double = js.native
  
  /** Explicit coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_EXPLICIT_MODE")
  @js.native
  val TEXTURE_EXPLICIT_MODE: Double = js.native
  
  /** Equirectangular Fixed Mirrored coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
  @js.native
  val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  
  /** Equirectangular Fixed coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_FIXED_EQUIRECTANGULAR_MODE")
  @js.native
  val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  
  /** Inverse Cubic coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_INVCUBIC_MODE")
  @js.native
  val TEXTURE_INVCUBIC_MODE: Double = js.native
  
  /** mag = linear and min = linear and mip = none */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_LINEAR")
  @js.native
  val TEXTURE_LINEAR_LINEAR: Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_LINEAR_MIPLINEAR")
  @js.native
  val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_LINEAR_MIPNEAREST")
  @js.native
  val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
  
  /** mag = linear and min = nearest and mip = none */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_NEAREST")
  @js.native
  val TEXTURE_LINEAR_NEAREST: Double = js.native
  
  /** mag = linear and min = nearest and mip = linear */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_NEAREST_MIPLINEAR")
  @js.native
  val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
  
  /** mag = linear and min = nearest and mip = nearest */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_NEAREST_MIPNEAREST")
  @js.native
  val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
  
  /** Texture is repeating and mirrored */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_MIRROR_ADDRESSMODE")
  @js.native
  val TEXTURE_MIRROR_ADDRESSMODE: Double = js.native
  
  /** mag = nearest and min = linear and mip = none */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_LINEAR")
  @js.native
  val TEXTURE_NEAREST_LINEAR: Double = js.native
  
  /** mag = nearest and min = linear and mip = linear */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_LINEAR_MIPLINEAR")
  @js.native
  val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
  
  /** mag = nearest and min = linear and mip = nearest */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_LINEAR_MIPNEAREST")
  @js.native
  val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
  
  /** mag = nearest and min = nearest and mip = none */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_NEAREST")
  @js.native
  val TEXTURE_NEAREST_NEAREST: Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_NEAREST_MIPLINEAR")
  @js.native
  val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
  
  /** mag = nearest and min = nearest and mip = nearest */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_NEAREST_MIPNEAREST")
  @js.native
  val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = none */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_SAMPLINGMODE")
  @js.native
  val TEXTURE_NEAREST_SAMPLINGMODE: Double = js.native
  
  /** Planar coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_PLANAR_MODE")
  @js.native
  val TEXTURE_PLANAR_MODE: Double = js.native
  
  /** Projection coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_PROJECTION_MODE")
  @js.native
  val TEXTURE_PROJECTION_MODE: Double = js.native
  
  /** Skybox coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_SKYBOX_MODE")
  @js.native
  val TEXTURE_SKYBOX_MODE: Double = js.native
  
  /** Spherical coordinates mode */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_SPHERICAL_MODE")
  @js.native
  val TEXTURE_SPHERICAL_MODE: Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_TRILINEAR_SAMPLINGMODE")
  @js.native
  val TEXTURE_TRILINEAR_SAMPLINGMODE: Double = js.native
  
  /** Texture is repeating outside of 0..1 UVs */
  @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_WRAP_ADDRESSMODE")
  @js.native
  val TEXTURE_WRAP_ADDRESSMODE: Double = js.native
  
  /**
    * Asks the browser to exit fullscreen mode
    */
  inline def _ExitFullscreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_ExitFullscreen")().asInstanceOf[Unit]
  
  /**
    * Asks the browser to exit pointerlock mode
    */
  inline def _ExitPointerlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_ExitPointerlock")().asInstanceOf[Unit]
  
  @JSImport("babylonjs/Engines/index", "Engine._RenderPassIdCounter")
  @js.native
  def _RenderPassIdCounter: Double = js.native
  inline def _RenderPassIdCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RenderPassIdCounter")(x.asInstanceOf[js.Any])
  
  /**
    * Ask the browser to promote the current element to fullscreen rendering mode
    * @param element defines the DOM element to promote
    */
  inline def _RequestFullscreen(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RequestFullscreen")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Pointerlock and fullscreen */
  /**
    * Ask the browser to promote the current element to pointerlock mode
    * @param element defines the DOM element to promote
    */
  inline def _RequestPointerlock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RequestPointerlock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Method called to create the default rescale post process on each engine.
    */
  @JSImport("babylonjs/Engines/index", "Engine._RescalePostProcessFactory")
  @js.native
  def _RescalePostProcessFactory: Nullable[js.Function1[/* engine */ this.type, PostProcess]] = js.native
  inline def _RescalePostProcessFactory_=(x: Nullable[js.Function1[/* engine */ this.type, PostProcess]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RescalePostProcessFactory")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the audio engine
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
    * @ignorenaming
    */
  @JSImport("babylonjs/Engines/index", "Engine.audioEngine")
  @js.native
  def audioEngine: Nullable[IAudioEngine] = js.native
  inline def audioEngine_=(x: Nullable[IAudioEngine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioEngine")(x.asInstanceOf[js.Any])
}
