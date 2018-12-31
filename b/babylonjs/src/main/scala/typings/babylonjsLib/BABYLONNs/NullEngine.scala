package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The null engine class provides support for headless version of babylon.js.
  * This can be used in server side scenario or for testing purposes
  */
@JSGlobal("BABYLON.NullEngine")
@js.native
class NullEngine () extends Engine {
  def this(options: NullEngineOptions) = this()
  var _options: js.Any = js.native
  /** @hidden */
  def _bindTexture(channel: scala.Double, texture: InternalTexture): scala.Unit = js.native
  /* protected */ def _bindTextureDirectly(target: scala.Double, texture: InternalTexture): scala.Boolean = js.native
  def bindBuffers(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: babylonjsLib.WebGLBuffer,
    effect: Effect
  ): scala.Unit = js.native
  def bindFramebuffer(texture: InternalTexture): scala.Unit = js.native
  def bindFramebuffer(texture: InternalTexture, faceIndex: scala.Double): scala.Unit = js.native
  def bindFramebuffer(texture: InternalTexture, faceIndex: scala.Double, requiredWidth: scala.Double): scala.Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: scala.Double,
    requiredWidth: scala.Double,
    requiredHeight: scala.Double
  ): scala.Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: scala.Double,
    requiredWidth: scala.Double,
    requiredHeight: scala.Double,
    forceFullscreenViewport: scala.Boolean
  ): scala.Unit = js.native
  def clear(color: Color4, backBuffer: scala.Boolean, depth: scala.Boolean): scala.Unit = js.native
  def clear(color: Color4, backBuffer: scala.Boolean, depth: scala.Boolean, stencil: scala.Boolean): scala.Unit = js.native
  def createRenderTargetTexture(size: js.Any, options: RenderTargetCreationOptions): InternalTexture = js.native
  def createRenderTargetTexture(size: js.Any, options: scala.Boolean): InternalTexture = js.native
  def createShaderProgram(vertexCode: java.lang.String, fragmentCode: java.lang.String, defines: java.lang.String): babylonjsLib.WebGLProgram = js.native
  def createShaderProgram(
    vertexCode: java.lang.String,
    fragmentCode: java.lang.String,
    defines: java.lang.String,
    context: babylonjsLib.WebGLRenderingContext
  ): babylonjsLib.WebGLProgram = js.native
  def createTexture(
    urlArg: java.lang.String,
    noMipmap: scala.Boolean,
    invertY: scala.Boolean,
    scene: Scene,
    samplingMode: js.UndefOr[scala.Double],
    onLoad: js.UndefOr[Nullable[js.Function0[scala.Unit]]],
    onError: js.UndefOr[
      Nullable[js.Function2[/* message */ java.lang.String, /* exception */ _, scala.Unit]]
    ],
    buffer: js.UndefOr[Nullable[stdLib.ArrayBuffer | stdLib.HTMLImageElement]],
    fallBack: js.UndefOr[InternalTexture],
    format: js.UndefOr[scala.Double]
  ): InternalTexture = js.native
  def enableEffect(effect: Effect): scala.Unit = js.native
  def setArray(uniform: babylonjsLib.WebGLUniformLocation, array: js.Array[scala.Double]): scala.Unit = js.native
  def setArray2(uniform: babylonjsLib.WebGLUniformLocation, array: js.Array[scala.Double]): scala.Unit = js.native
  def setArray3(uniform: babylonjsLib.WebGLUniformLocation, array: js.Array[scala.Double]): scala.Unit = js.native
  def setArray4(uniform: babylonjsLib.WebGLUniformLocation, array: js.Array[scala.Double]): scala.Unit = js.native
  def setBool(uniform: babylonjsLib.WebGLUniformLocation, bool: scala.Double): scala.Unit = js.native
  def setColor3(uniform: babylonjsLib.WebGLUniformLocation, color3: Color3): scala.Unit = js.native
  def setColor4(uniform: babylonjsLib.WebGLUniformLocation, color3: Color3, alpha: scala.Double): scala.Unit = js.native
  def setFloat(uniform: babylonjsLib.WebGLUniformLocation, value: scala.Double): scala.Unit = js.native
  def setFloat2(uniform: babylonjsLib.WebGLUniformLocation, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setFloat3(uniform: babylonjsLib.WebGLUniformLocation, x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  def setFloat4(
    uniform: babylonjsLib.WebGLUniformLocation,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double
  ): scala.Unit = js.native
  def setFloatArray(uniform: babylonjsLib.WebGLUniformLocation, array: stdLib.Float32Array): scala.Unit = js.native
  def setFloatArray2(uniform: babylonjsLib.WebGLUniformLocation, array: stdLib.Float32Array): scala.Unit = js.native
  def setFloatArray3(uniform: babylonjsLib.WebGLUniformLocation, array: stdLib.Float32Array): scala.Unit = js.native
  def setFloatArray4(uniform: babylonjsLib.WebGLUniformLocation, array: stdLib.Float32Array): scala.Unit = js.native
  def setIntArray(uniform: babylonjsLib.WebGLUniformLocation, array: stdLib.Int32Array): scala.Unit = js.native
  def setIntArray2(uniform: babylonjsLib.WebGLUniformLocation, array: stdLib.Int32Array): scala.Unit = js.native
  def setIntArray3(uniform: babylonjsLib.WebGLUniformLocation, array: stdLib.Int32Array): scala.Unit = js.native
  def setIntArray4(uniform: babylonjsLib.WebGLUniformLocation, array: stdLib.Int32Array): scala.Unit = js.native
  def setMatrices(uniform: babylonjsLib.WebGLUniformLocation, matrices: stdLib.Float32Array): scala.Unit = js.native
  def setMatrix(uniform: babylonjsLib.WebGLUniformLocation, matrix: Matrix): scala.Unit = js.native
  def setMatrix2x2(uniform: babylonjsLib.WebGLUniformLocation, matrix: stdLib.Float32Array): scala.Unit = js.native
  def setMatrix3x3(uniform: babylonjsLib.WebGLUniformLocation, matrix: stdLib.Float32Array): scala.Unit = js.native
}

