package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The engine class is responsible for interfacing with all lower-level APIs such as WebGL and Audio
  */
@JSImport("babylonjs", "Engine")
@js.native
class Engine protected ()
  extends babylonjsLib.BABYLONNs.Engine {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which alreay used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.HTMLCanvasElement | babylonjsLib.WebGLRenderingContext]) = this()
  def this(canvasOrContext: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.HTMLCanvasElement | babylonjsLib.WebGLRenderingContext], antialias: scala.Boolean) = this()
  def this(canvasOrContext: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.HTMLCanvasElement | babylonjsLib.WebGLRenderingContext], antialias: scala.Boolean, options: babylonjsLib.BABYLONNs.EngineOptions) = this()
  def this(canvasOrContext: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.HTMLCanvasElement | babylonjsLib.WebGLRenderingContext], antialias: scala.Boolean, options: babylonjsLib.BABYLONNs.EngineOptions, adaptToDeviceRatio: scala.Boolean) = this()
}

/**
  * The engine class is responsible for interfacing with all lower-level APIs such as WebGL and Audio
  */
@JSImport("babylonjs", "Engine")
@js.native
object Engine extends js.Object {
  /** Defines that alpha blending to SRC ALPHA * SRC + DEST */
  val ALPHA_ADD: scala.Double = js.native
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_COMBINE: scala.Double = js.native
  /** Defines that alpha blending is disabled */
  val ALPHA_DISABLE: scala.Double = js.native
  /** Defines that alpha blending to CST * SRC + (1 - CST) * DEST */
  val ALPHA_INTERPOLATE: scala.Double = js.native
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC) * DEST */
  val ALPHA_MAXIMIZED: scala.Double = js.native
  /** Defines that alpha blending to SRC * DEST */
  val ALPHA_MULTIPLY: scala.Double = js.native
  /** Defines that alpha blending to SRC + DEST */
  val ALPHA_ONEONE: scala.Double = js.native
  /** Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_PREMULTIPLIED: scala.Double = js.native
  /**
    * Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST
    * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_PREMULTIPLIED_PORTERDUFF: scala.Double = js.native
  /**
    * Defines that alpha blending to SRC + (1 - SRC) * DEST
    * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_SCREENMODE: scala.Double = js.native
  /** Defines that alpha blending to DEST - SRC * DEST */
  val ALPHA_SUBTRACT: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  val ALWAYS: scala.Double = js.native
  /**
    * Gets or sets the relative url used to load code if using the engine in non-minified mode
    */
  var CodeRepository: java.lang.String = js.native
  /**
    * Gets or sets the epsilon value used by collision engine
    */
  var CollisionsEpsilon: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented */
  val DECR: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
  val DECR_WRAP: scala.Double = js.native
  /** Defines that the ressource was successfully delay loaded */
  val DELAYLOADSTATE_LOADED: scala.Double = js.native
  /** Defines that the ressource is currently delay loading */
  val DELAYLOADSTATE_LOADING: scala.Double = js.native
  /** Defines that the ressource is not delayed*/
  val DELAYLOADSTATE_NONE: scala.Double = js.native
  /** Defines that the ressource is delayed and has not started loading */
  val DELAYLOADSTATE_NOTLOADED: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
  val EQUAL: scala.Double = js.native
  /** Use this array to turn off some WebGL2 features on known buggy browsers version */
  var ExceptionList: js.Array[babylonjsLib.Anon_Capture | babylonjsLib.Anon_CaptureCaptureConstraint] = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
  val GEQUAL: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
  val GREATER: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented */
  val INCR: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
  val INCR_WRAP: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be inverted */
  val INVERT: scala.Double = js.native
  /** Gets the list of created engines */
  var Instances: js.Array[babylonjsLib.BABYLONNs.Engine] = js.native
  /** Passed to stencilOperation to specify that stencil value must be kept */
  val KEEP: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
  val LEQUAL: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
  val LESS: scala.Double = js.native
  /**
    * Gets the latest created engine
    */
  val LastCreatedEngine: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Engine] = js.native
  /**
    * Gets the latest created scene
    */
  val LastCreatedScene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene] = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
  val NEVER: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
  val NOTEQUAL: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  val REPLACE: scala.Double = js.native
  /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
  val SCALEMODE_CEILING: scala.Double = js.native
  /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
  val SCALEMODE_FLOOR: scala.Double = js.native
  /** Defines that texture rescaling will look for the nearest power of 2 size */
  val SCALEMODE_NEAREST: scala.Double = js.native
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  var ShadersRepository: java.lang.String = js.native
  /** ALPHA */
  val TEXTUREFORMAT_ALPHA: scala.Double = js.native
  /** LUMINANCE */
  val TEXTUREFORMAT_LUMINANCE: scala.Double = js.native
  /** LUMINANCE_ALPHA */
  val TEXTUREFORMAT_LUMINANCE_ALPHA: scala.Double = js.native
  /** RED (2nd reference) */
  val TEXTUREFORMAT_R: scala.Double = js.native
  /** RED */
  val TEXTUREFORMAT_RED: scala.Double = js.native
  /** RED_INTEGER */
  val TEXTUREFORMAT_RED_INTEGER: scala.Double = js.native
  /** RG */
  val TEXTUREFORMAT_RG: scala.Double = js.native
  /** RGB */
  val TEXTUREFORMAT_RGB: scala.Double = js.native
  /** RGBA */
  val TEXTUREFORMAT_RGBA: scala.Double = js.native
  /** RGBA_INTEGER */
  val TEXTUREFORMAT_RGBA_INTEGER: scala.Double = js.native
  /** RGB_INTEGER */
  val TEXTUREFORMAT_RGB_INTEGER: scala.Double = js.native
  /** RG_INTEGER */
  val TEXTUREFORMAT_RG_INTEGER: scala.Double = js.native
  /** RED_INTEGER (2nd reference) */
  val TEXTUREFORMAT_R_INTEGER: scala.Double = js.native
  /** BYTE */
  val TEXTURETYPE_BYTE: scala.Double = js.native
  /** FLOAT */
  val TEXTURETYPE_FLOAT: scala.Double = js.native
  /** FLOAT_32_UNSIGNED_INT_24_8_REV */
  val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: scala.Double = js.native
  /** HALF_FLOAT */
  val TEXTURETYPE_HALF_FLOAT: scala.Double = js.native
  /** INT */
  val TEXTURETYPE_INT: scala.Double = js.native
  /** SHORT */
  val TEXTURETYPE_SHORT: scala.Double = js.native
  /** UNSIGNED_BYTE */
  val TEXTURETYPE_UNSIGNED_BYTE: scala.Double = js.native
  /** UNSIGNED_BYTE (2nd reference) */
  val TEXTURETYPE_UNSIGNED_INT: scala.Double = js.native
  /** UNSIGNED_INT */
  val TEXTURETYPE_UNSIGNED_INTEGER: scala.Double = js.native
  /** UNSIGNED_INT_10F_11F_11F_REV */
  val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: scala.Double = js.native
  /** UNSIGNED_INT_24_8 */
  val TEXTURETYPE_UNSIGNED_INT_24_8: scala.Double = js.native
  /** UNSIGNED_INT_2_10_10_10_REV */
  val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: scala.Double = js.native
  /** UNSIGNED_INT_5_9_9_9_REV */
  val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: scala.Double = js.native
  /** UNSIGNED_SHORT */
  val TEXTURETYPE_UNSIGNED_SHORT: scala.Double = js.native
  /** UNSIGNED_SHORT_4_4_4_4 */
  val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: scala.Double = js.native
  /** UNSIGNED_SHORT_5_5_5_1 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: scala.Double = js.native
  /** UNSIGNED_SHORT_5_6_5 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: scala.Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_BILINEAR_SAMPLINGMODE: scala.Double = js.native
  /** Texture is not repeating outside of 0..1 UVs */
  val TEXTURE_CLAMP_ADDRESSMODE: scala.Double = js.native
  /** Cubic coordinates mode */
  val TEXTURE_CUBIC_MODE: scala.Double = js.native
  /** Equirectangular coordinates mode */
  val TEXTURE_EQUIRECTANGULAR_MODE: scala.Double = js.native
  /** Explicit coordinates mode */
  val TEXTURE_EXPLICIT_MODE: scala.Double = js.native
  /** Equirectangular Fixed Mirrored coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: scala.Double = js.native
  /** Equirectangular Fixed coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: scala.Double = js.native
  /** Inverse Cubic coordinates mode */
  val TEXTURE_INVCUBIC_MODE: scala.Double = js.native
  /** mag = linear and min = linear and mip = none */
  val TEXTURE_LINEAR_LINEAR: scala.Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_LINEAR_LINEAR_MIPLINEAR: scala.Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_LINEAR_LINEAR_MIPNEAREST: scala.Double = js.native
  /** mag = linear and min = nearest and mip = none */
  val TEXTURE_LINEAR_NEAREST: scala.Double = js.native
  /** mag = linear and min = nearest and mip = linear */
  val TEXTURE_LINEAR_NEAREST_MIPLINEAR: scala.Double = js.native
  /** mag = linear and min = nearest and mip = nearest */
  val TEXTURE_LINEAR_NEAREST_MIPNEAREST: scala.Double = js.native
  /** Texture is repeating and mirrored */
  val TEXTURE_MIRROR_ADDRESSMODE: scala.Double = js.native
  /** mag = nearest and min = linear and mip = none */
  val TEXTURE_NEAREST_LINEAR: scala.Double = js.native
  /** mag = nearest and min = linear and mip = linear */
  val TEXTURE_NEAREST_LINEAR_MIPLINEAR: scala.Double = js.native
  /** mag = nearest and min = linear and mip = nearest */
  val TEXTURE_NEAREST_LINEAR_MIPNEAREST: scala.Double = js.native
  /** mag = nearest and min = nearest and mip = none */
  val TEXTURE_NEAREST_NEAREST: scala.Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_NEAREST_MIPLINEAR: scala.Double = js.native
  /** mag = nearest and min = nearest and mip = nearest */
  val TEXTURE_NEAREST_NEAREST_MIPNEAREST: scala.Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_SAMPLINGMODE: scala.Double = js.native
  /** Planar coordinates mode */
  val TEXTURE_PLANAR_MODE: scala.Double = js.native
  /** Projection coordinates mode */
  val TEXTURE_PROJECTION_MODE: scala.Double = js.native
  /** Skybox coordinates mode */
  val TEXTURE_SKYBOX_MODE: scala.Double = js.native
  /** Spherical coordinates mode */
  val TEXTURE_SPHERICAL_MODE: scala.Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_TRILINEAR_SAMPLINGMODE: scala.Double = js.native
  /** Texture is repeating outside of 0..1 UVs */
  val TEXTURE_WRAP_ADDRESSMODE: scala.Double = js.native
  /**
    * Returns the current version of the framework
    */
  val Version: java.lang.String = js.native
  /**
    * Hidden
    */
  var _TextureLoaders: js.Array[babylonjsLib.BABYLONNs.IInternalTextureLoader] = js.native
  /**
    * Gets the audio engine
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    * @ignorenaming
    */
  var audioEngine: babylonjsLib.BABYLONNs.IAudioEngine = js.native
  /**
    * Default AudioEngine Factory responsible of creating the Audio Engine.
    * By default, this will create a BabylonJS Audio Engine if the workload
    * has been embedded.
    */
  def AudioEngineFactory(hostElement: babylonjsLib.BABYLONNs.Nullable[stdLib.HTMLElement]): babylonjsLib.BABYLONNs.IAudioEngine = js.native
  /**
    * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
    * @param flag defines which part of the materials must be marked as dirty
    * @param predicate defines a predicate used to filter which materials should be affected
    */
  def MarkAllMaterialsAsDirty(flag: scala.Double): scala.Unit = js.native
  def MarkAllMaterialsAsDirty(
    flag: scala.Double,
    predicate: js.Function1[/* mat */ babylonjsLib.BABYLONNs.Material, scala.Boolean]
  ): scala.Unit = js.native
  /**
    * Gets a boolean indicating if the engine can be instanciated (ie. if a webGL context can be found)
    * @returns true if the engine can be created
    * @ignorenaming
    */
  def isSupported(): scala.Boolean = js.native
}

