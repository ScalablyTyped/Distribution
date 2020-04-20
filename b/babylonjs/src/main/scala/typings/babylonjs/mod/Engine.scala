package typings.babylonjs.mod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.audioEngineMod.IAudioEngine
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.loadingScreenMod.ILoadingScreen
import typings.babylonjs.thinEngineMod.EngineOptions
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "Engine")
@js.native
class Engine protected ()
  extends typings.babylonjs.legacyMod.Engine {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which alreay used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext]) = this()
  def this(canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext], antialias: Boolean) = this()
  def this(
    canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
    antialias: Boolean,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
    antialias: Boolean,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs", "Engine")
@js.native
object Engine extends js.Object {
  /** Defines that alpha blending to SRC ALPHA * SRC + DEST */
  val ALPHA_ADD: Double = js.native
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_COMBINE: Double = js.native
  /** Defines that alpha blending is disabled */
  val ALPHA_DISABLE: Double = js.native
  /** Defines that alpha blending to CST * SRC + (1 - CST) * DEST */
  val ALPHA_INTERPOLATE: Double = js.native
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC) * DEST */
  val ALPHA_MAXIMIZED: Double = js.native
  /** Defines that alpha blending to SRC * DEST */
  val ALPHA_MULTIPLY: Double = js.native
  /** Defines that alpha blending to SRC + DEST */
  val ALPHA_ONEONE: Double = js.native
  /** Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_PREMULTIPLIED: Double = js.native
  /**
    * Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST
    * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
  /**
    * Defines that alpha blending to SRC + (1 - SRC) * DEST
    * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_SCREENMODE: Double = js.native
  /** Defines that alpha blending to DEST - SRC * DEST */
  val ALPHA_SUBTRACT: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  val ALWAYS: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented */
  val DECR: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
  val DECR_WRAP: Double = js.native
  /** Defines that the ressource was successfully delay loaded */
  val DELAYLOADSTATE_LOADED: Double = js.native
  /** Defines that the ressource is currently delay loading */
  val DELAYLOADSTATE_LOADING: Double = js.native
  /** Defines that the ressource is not delayed*/
  val DELAYLOADSTATE_NONE: Double = js.native
  /** Defines that the ressource is delayed and has not started loading */
  val DELAYLOADSTATE_NOTLOADED: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
  val EQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
  val GEQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
  val GREATER: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented */
  val INCR: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
  val INCR_WRAP: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be inverted */
  val INVERT: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be kept */
  val KEEP: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
  val LEQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
  val LESS: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
  val NEVER: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
  val NOTEQUAL: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  val REPLACE: Double = js.native
  /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
  val SCALEMODE_CEILING: Double = js.native
  /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
  val SCALEMODE_FLOOR: Double = js.native
  /** Defines that texture rescaling will look for the nearest power of 2 size */
  val SCALEMODE_NEAREST: Double = js.native
  /** ALPHA */
  val TEXTUREFORMAT_ALPHA: Double = js.native
  /** LUMINANCE */
  val TEXTUREFORMAT_LUMINANCE: Double = js.native
  /** LUMINANCE_ALPHA */
  val TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
  /** RED (2nd reference) */
  val TEXTUREFORMAT_R: Double = js.native
  /** RED */
  val TEXTUREFORMAT_RED: Double = js.native
  /** RED_INTEGER */
  val TEXTUREFORMAT_RED_INTEGER: Double = js.native
  /** RG */
  val TEXTUREFORMAT_RG: Double = js.native
  /** RGB */
  val TEXTUREFORMAT_RGB: Double = js.native
  /** RGBA */
  val TEXTUREFORMAT_RGBA: Double = js.native
  /** RGBA_INTEGER */
  val TEXTUREFORMAT_RGBA_INTEGER: Double = js.native
  /** RGB_INTEGER */
  val TEXTUREFORMAT_RGB_INTEGER: Double = js.native
  /** RG_INTEGER */
  val TEXTUREFORMAT_RG_INTEGER: Double = js.native
  /** RED_INTEGER (2nd reference) */
  val TEXTUREFORMAT_R_INTEGER: Double = js.native
  /** BYTE */
  val TEXTURETYPE_BYTE: Double = js.native
  /** FLOAT */
  val TEXTURETYPE_FLOAT: Double = js.native
  /** FLOAT_32_UNSIGNED_INT_24_8_REV */
  val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
  /** HALF_FLOAT */
  val TEXTURETYPE_HALF_FLOAT: Double = js.native
  /** INT */
  val TEXTURETYPE_INT: Double = js.native
  /** SHORT */
  val TEXTURETYPE_SHORT: Double = js.native
  /** UNSIGNED_BYTE */
  val TEXTURETYPE_UNSIGNED_BYTE: Double = js.native
  /** UNSIGNED_BYTE (2nd reference) */
  val TEXTURETYPE_UNSIGNED_INT: Double = js.native
  /** UNSIGNED_INT */
  val TEXTURETYPE_UNSIGNED_INTEGER: Double = js.native
  /** UNSIGNED_INT_10F_11F_11F_REV */
  val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
  /** UNSIGNED_INT_24_8 */
  val TEXTURETYPE_UNSIGNED_INT_24_8: Double = js.native
  /** UNSIGNED_INT_2_10_10_10_REV */
  val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Double = js.native
  /** UNSIGNED_INT_5_9_9_9_REV */
  val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Double = js.native
  /** UNSIGNED_SHORT */
  val TEXTURETYPE_UNSIGNED_SHORT: Double = js.native
  /** UNSIGNED_SHORT_4_4_4_4 */
  val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Double = js.native
  /** UNSIGNED_SHORT_5_5_5_1 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Double = js.native
  /** UNSIGNED_SHORT_5_6_5 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_BILINEAR_SAMPLINGMODE: Double = js.native
  /** Texture is not repeating outside of 0..1 UVs */
  val TEXTURE_CLAMP_ADDRESSMODE: Double = js.native
  /** Cubic coordinates mode */
  val TEXTURE_CUBIC_MODE: Double = js.native
  /** Equirectangular coordinates mode */
  val TEXTURE_EQUIRECTANGULAR_MODE: Double = js.native
  /** Explicit coordinates mode */
  val TEXTURE_EXPLICIT_MODE: Double = js.native
  /** Equirectangular Fixed Mirrored coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  /** Equirectangular Fixed coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  /** Inverse Cubic coordinates mode */
  val TEXTURE_INVCUBIC_MODE: Double = js.native
  /** mag = linear and min = linear and mip = none */
  val TEXTURE_LINEAR_LINEAR: Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
  /** mag = linear and min = nearest and mip = none */
  val TEXTURE_LINEAR_NEAREST: Double = js.native
  /** mag = linear and min = nearest and mip = linear */
  val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
  /** mag = linear and min = nearest and mip = nearest */
  val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
  /** Texture is repeating and mirrored */
  val TEXTURE_MIRROR_ADDRESSMODE: Double = js.native
  /** mag = nearest and min = linear and mip = none */
  val TEXTURE_NEAREST_LINEAR: Double = js.native
  /** mag = nearest and min = linear and mip = linear */
  val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
  /** mag = nearest and min = linear and mip = nearest */
  val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
  /** mag = nearest and min = nearest and mip = none */
  val TEXTURE_NEAREST_NEAREST: Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
  /** mag = nearest and min = nearest and mip = nearest */
  val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_SAMPLINGMODE: Double = js.native
  /** Planar coordinates mode */
  val TEXTURE_PLANAR_MODE: Double = js.native
  /** Projection coordinates mode */
  val TEXTURE_PROJECTION_MODE: Double = js.native
  /** Skybox coordinates mode */
  val TEXTURE_SKYBOX_MODE: Double = js.native
  /** Spherical coordinates mode */
  val TEXTURE_SPHERICAL_MODE: Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_TRILINEAR_SAMPLINGMODE: Double = js.native
  /** Texture is repeating outside of 0..1 UVs */
  val TEXTURE_WRAP_ADDRESSMODE: Double = js.native
  /**
    * Method called to create the default rescale post process on each engine.
    */
  var _RescalePostProcessFactory: Nullable[
    js.Function1[/* engine */ this.type, typings.babylonjs.postProcessMod.PostProcess]
  ] = js.native
  /**
    * Gets the audio engine
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    * @ignorenaming
    */
  var audioEngine: IAudioEngine = js.native
  /**
    * Default AudioEngine factory responsible of creating the Audio Engine.
    * By default, this will create a BabylonJS Audio Engine if the workload has been embedded.
    */
  def AudioEngineFactory(hostElement: Nullable[HTMLElement]): IAudioEngine = js.native
  /**
    * Method called to create the default loading screen.
    * This can be overriden in your own app.
    * @param canvas The rendering canvas element
    * @returns The loading screen
    */
  def DefaultLoadingScreenFactory(canvas: HTMLCanvasElement): ILoadingScreen = js.native
  /** Gets the list of created engines */
  def Instances: js.Array[typings.babylonjs.engineMod.Engine] = js.native
  /**
    * Gets the latest created engine
    */
  def LastCreatedEngine: Nullable[typings.babylonjs.engineMod.Engine] = js.native
  /**
    * Gets the latest created scene
    */
  def LastCreatedScene: Nullable[typings.babylonjs.sceneMod.Scene] = js.native
  /**
    * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
    * @param flag defines which part of the materials must be marked as dirty
    * @param predicate defines a predicate used to filter which materials should be affected
    */
  def MarkAllMaterialsAsDirty(flag: Double): Unit = js.native
  def MarkAllMaterialsAsDirty(flag: Double, predicate: js.Function1[/* mat */ typings.babylonjs.materialMod.Material, Boolean]): Unit = js.native
  /**
    * Returns the current npm package of the sdk
    */
  def NpmPackage: String = js.native
  /**
    * Default offline support factory responsible of creating a tool used to store data locally.
    * By default, this will create a Database object if the workload has been embedded.
    */
  def OfflineProviderFactory(
    urlToScene: String,
    callbackManifestChecked: js.Function1[/* checked */ Boolean, _],
    disableManifestCheck: Boolean
  ): IOfflineProvider = js.native
  /**
    * Returns the current version of the framework
    */
  def Version: String = js.native
  /**
    * Asks the browser to exit fullscreen mode
    */
  def _ExitFullscreen(): Unit = js.native
  /**
    * Asks the browser to exit pointerlock mode
    */
  def _ExitPointerlock(): Unit = js.native
  /**
    * Ask the browser to promote the current element to fullscreen rendering mode
    * @param element defines the DOM element to promote
    */
  def _RequestFullscreen(element: HTMLElement): Unit = js.native
  /** Pointerlock and fullscreen */
  /**
    * Ask the browser to promote the current element to pointerlock mode
    * @param element defines the DOM element to promote
    */
  def _RequestPointerlock(element: HTMLElement): Unit = js.native
}

