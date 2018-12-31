package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to describe the capabilities of the engine relatively to the current browser
  */
@JSGlobal("BABYLON.EngineCapabilities")
@js.native
class EngineCapabilities () extends js.Object {
  /** Defines if astc texture compression is supported */
  var astc: js.Any = js.native
  /** Defines if timestamp can be used with timer query */
  var canUseTimestampForTimerQuery: scala.Boolean = js.native
  /** Defines if float color buffer are supported */
  var colorBufferFloat: scala.Boolean = js.native
  /** Defines if depth textures are supported */
  var depthTextureExtension: scala.Boolean = js.native
  /** Defines if draw buffers extension is supported */
  var drawBuffersExtension: scala.Boolean = js.native
  /** Defines if etc1 texture compression is supported */
  var etc1: js.Any = js.native
  /** Defines if etc2 texture compression is supported */
  var etc2: js.Any = js.native
  /** Defines if depth reading in the fragment shader is supported */
  var fragmentDepthSupported: scala.Boolean = js.native
  /** Defines if high precision shaders are supported */
  var highPrecisionShaderSupported: scala.Boolean = js.native
  /** Defines if instancing is supported */
  var instancedArrays: scala.Boolean = js.native
  /** Gets the maximum level of anisotropy supported */
  var maxAnisotropy: scala.Double = js.native
  /** Maximum textures units in the entire pipeline */
  var maxCombinedTexturesImageUnits: scala.Double = js.native
  /** Maximum cube texture size */
  var maxCubemapTextureSize: scala.Double = js.native
  /** Maximum number of uniforms per fragment shader */
  var maxFragmentUniformVectors: scala.Double = js.native
  /** Maximum render texture size */
  var maxRenderTextureSize: scala.Double = js.native
  /** Maximum texture size */
  var maxTextureSize: scala.Double = js.native
  /** Maximum textures units per fragment shader */
  var maxTexturesImageUnits: scala.Double = js.native
  /** Maximum number of varyings */
  var maxVaryingVectors: scala.Double = js.native
  /** Maximum number of vertex attributes */
  var maxVertexAttribs: scala.Double = js.native
  /** Maximum texture units per vertex shader */
  var maxVertexTextureImageUnits: scala.Double = js.native
  /** Maximum number of uniforms per vertex shader */
  var maxVertexUniformVectors: scala.Double = js.native
  /** Defines if pvrtc texture compression is supported */
  var pvrtc: js.Any = js.native
  /** Defines if s3tc texture compression is supported */
  var s3tc: Nullable[stdLib.WEBGL_compressed_texture_s3tc] = js.native
  /** Defines if standard derivates (dx/dy) are supported */
  var standardDerivatives: scala.Boolean = js.native
  /** Gets the webgl extension for anisotropic filtering (null if not supported) */
  var textureAnisotropicFilterExtension: Nullable[stdLib.EXT_texture_filter_anisotropic] = js.native
  /** Defines if float textures are supported */
  var textureFloat: scala.Boolean = js.native
  /** Defines if float texture linear filtering is supported*/
  var textureFloatLinearFiltering: scala.Boolean = js.native
  /** Defines if rendering to float textures is supported */
  var textureFloatRender: scala.Boolean = js.native
  /** Defines if half float textures are supported*/
  var textureHalfFloat: scala.Boolean = js.native
  /** Defines if half float texture linear filtering is supported*/
  var textureHalfFloatLinearFiltering: scala.Boolean = js.native
  /** Defines if rendering to half float textures is supported */
  var textureHalfFloatRender: scala.Boolean = js.native
  /** Defines if textureLOD shader command is supported */
  var textureLOD: scala.Boolean = js.native
  /** Gets disjoint timer query extension (null if not supported) */
  var timerQuery: babylonjsLib.EXT_disjoint_timer_query = js.native
  /** Defines if 32 bits indices are supported */
  var uintIndices: scala.Boolean = js.native
  /** Defines if vertex array objects are supported */
  var vertexArrayObject: scala.Boolean = js.native
}

