package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLRenderingContext extends js.Object {
  var ANY_SAMPLES_PASSED: scala.Double = js.native
  var ANY_SAMPLES_PASSED_CONSERVATIVE: scala.Double = js.native
  val COLOR_ATTACHMENT0: scala.Double = js.native
  val COLOR_ATTACHMENT1: scala.Double = js.native
  val COLOR_ATTACHMENT2: scala.Double = js.native
  val COLOR_ATTACHMENT3: scala.Double = js.native
  val COMPARE_REF_TO_TEXTURE: scala.Double = js.native
  var DEPTH24_STENCIL8: scala.Double = js.native
  val DEPTH_COMPONENT24: scala.Double = js.native
  var DRAW_FRAMEBUFFER: scala.Double = js.native
  val FLOAT_32_UNSIGNED_INT_24_8_REV: scala.Double = js.native
  val HALF_FLOAT: scala.Double = js.native
  var HALF_FLOAT_OES: scala.Double = js.native
  val INTERLEAVED_ATTRIBS: scala.Double = js.native
  var MAX_SAMPLES: scala.Double = js.native
  var QUERY_RESULT: scala.Double = js.native
  var QUERY_RESULT_AVAILABLE: scala.Double = js.native
  val R11F_G11F_B10F: scala.Double = js.native
  var R16F: scala.Double = js.native
  val R16I: scala.Double = js.native
  val R16UI: scala.Double = js.native
  var R32F: scala.Double = js.native
  val R32I: scala.Double = js.native
  val R32UI: scala.Double = js.native
  var R8: scala.Double = js.native
  val R8I: scala.Double = js.native
  val R8UI: scala.Double = js.native
  val R8_SNORM: scala.Double = js.native
  val RASTERIZER_DISCARD: scala.Double = js.native
  var READ_FRAMEBUFFER: scala.Double = js.native
  var RED: scala.Double = js.native
  val RED_INTEGER: scala.Double = js.native
  var RG: scala.Double = js.native
  var RG16F: scala.Double = js.native
  val RG16I: scala.Double = js.native
  val RG16UI: scala.Double = js.native
  var RG32F: scala.Double = js.native
  val RG32I: scala.Double = js.native
  val RG32UI: scala.Double = js.native
  var RG8: scala.Double = js.native
  val RG8I: scala.Double = js.native
  val RG8UI: scala.Double = js.native
  val RG8_SNORM: scala.Double = js.native
  val RGB10_A2: scala.Double = js.native
  val RGB10_A2UI: scala.Double = js.native
  var RGB16F: scala.Double = js.native
  val RGB16I: scala.Double = js.native
  val RGB16UI: scala.Double = js.native
  var RGB32F: scala.Double = js.native
  val RGB32I: scala.Double = js.native
  val RGB32UI: scala.Double = js.native
  val RGB8: scala.Double = js.native
  val RGB8I: scala.Double = js.native
  val RGB8UI: scala.Double = js.native
  val RGB8_SNORM: scala.Double = js.native
  val RGB9_E5: scala.Double = js.native
  var RGBA16F: scala.Double = js.native
  val RGBA16I: scala.Double = js.native
  val RGBA16UI: scala.Double = js.native
  var RGBA32F: scala.Double = js.native
  val RGBA32I: scala.Double = js.native
  val RGBA32UI: scala.Double = js.native
  var RGBA8: scala.Double = js.native
  val RGBA8I: scala.Double = js.native
  val RGBA8UI: scala.Double = js.native
  val RGBA8_SNORM: scala.Double = js.native
  val RGBA_INTEGER: scala.Double = js.native
  val RGB_INTEGER: scala.Double = js.native
  val RG_INTEGER: scala.Double = js.native
  val TEXTURE_2D_ARRAY: scala.Double = js.native
  val TEXTURE_3D: scala.Double = js.native
  val TEXTURE_COMPARE_FUNC: scala.Double = js.native
  val TEXTURE_COMPARE_MODE: scala.Double = js.native
  val TEXTURE_WRAP_R: scala.Double = js.native
  val TRANSFORM_FEEDBACK: scala.Double = js.native
  val TRANSFORM_FEEDBACK_BUFFER: scala.Double = js.native
  var UNIFORM_BUFFER: scala.Double = js.native
  val UNSIGNED_INT_10F_11F_11F_REV: scala.Double = js.native
  var UNSIGNED_INT_24_8: scala.Double = js.native
  val UNSIGNED_INT_2_10_10_10_REV: scala.Double = js.native
  val UNSIGNED_INT_5_9_9_9_REV: scala.Double = js.native
  def beginQuery(target: scala.Double, query: WebGLQuery): scala.Unit = js.native
  def beginTransformFeedback(primitiveMode: scala.Double): scala.Unit = js.native
  def bindBufferBase(target: scala.Double, index: scala.Double): scala.Unit = js.native
  def bindBufferBase(target: scala.Double, index: scala.Double, buffer: WebGLBuffer): scala.Unit = js.native
  def bindTransformFeedback(target: scala.Double): scala.Unit = js.native
  def bindTransformFeedback(target: scala.Double, transformFeedback: WebGLTransformFeedback): scala.Unit = js.native
  def bindVertexArray(): scala.Unit = js.native
  def bindVertexArray(vao: WebGLVertexArrayObject): scala.Unit = js.native
  def blitFramebuffer(
    srcX0: scala.Double,
    srcY0: scala.Double,
    srcX1: scala.Double,
    srcY1: scala.Double,
    dstX0: scala.Double,
    dstY0: scala.Double,
    dstX1: scala.Double,
    dstY1: scala.Double,
    mask: scala.Double,
    filter: scala.Double
  ): scala.Unit = js.native
  def clearBufferfi(buffer: scala.Double, drawbuffer: scala.Double, depth: scala.Double, stencil: scala.Double): scala.Unit = js.native
  def clearBufferfv(buffer: scala.Double, drawbuffer: scala.Double, values: stdLib.ArrayBufferView): scala.Unit = js.native
  def clearBufferfv(
    buffer: scala.Double,
    drawbuffer: scala.Double,
    values: stdLib.ArrayBufferView,
    srcOffset: scala.Double
  ): scala.Unit = js.native
  def clearBufferiv(buffer: scala.Double, drawbuffer: scala.Double, values: stdLib.ArrayBufferView): scala.Unit = js.native
  def clearBufferiv(
    buffer: scala.Double,
    drawbuffer: scala.Double,
    values: stdLib.ArrayBufferView,
    srcOffset: scala.Double
  ): scala.Unit = js.native
  def clearBufferuiv(buffer: scala.Double, drawbuffer: scala.Double, values: stdLib.ArrayBufferView): scala.Unit = js.native
  def clearBufferuiv(
    buffer: scala.Double,
    drawbuffer: scala.Double,
    values: stdLib.ArrayBufferView,
    srcOffset: scala.Double
  ): scala.Unit = js.native
  def compressedTexImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    data: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def compressedTexImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    data: stdLib.ArrayBufferView,
    offset: scala.Double
  ): scala.Unit = js.native
  def compressedTexImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    data: stdLib.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Unit = js.native
  def createQuery(): WebGLQuery = js.native
  def createTransformFeedback(): WebGLTransformFeedback = js.native
  def createVertexArray(): js.Any = js.native
  def deleteQuery(query: WebGLQuery): scala.Unit = js.native
  def deleteTransformFeedback(transformFeedbac: WebGLTransformFeedback): scala.Unit = js.native
  def deleteVertexArray(vao: WebGLVertexArrayObject): scala.Unit = js.native
  def drawArraysInstanced(mode: scala.Double, first: scala.Double, count: scala.Double, primcount: scala.Double): scala.Unit = js.native
  def drawBuffers(buffers: js.Array[scala.Double]): scala.Unit = js.native
  def drawElementsInstanced(
    mode: scala.Double,
    count: scala.Double,
    `type`: scala.Double,
    offset: scala.Double,
    primcount: scala.Double
  ): scala.Unit = js.native
  def endQuery(target: scala.Double): scala.Unit = js.native
  def endTransformFeedback(): scala.Unit = js.native
  def getQuery(target: scala.Double, pname: scala.Double): js.Any = js.native
  def getQueryParameter(query: WebGLQuery, pname: scala.Double): js.Any = js.native
  def getUniformBlockIndex(program: WebGLProgram, uniformBlockName: java.lang.String): scala.Double = js.native
  def readBuffer(src: scala.Double): scala.Unit = js.native
  def renderbufferStorageMultisample(
    target: scala.Double,
    samples: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: HTMLCanvasElement
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: HTMLVideoElement
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: ImageBitmap
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: stdLib.ArrayBufferView,
    offset: scala.Double
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: stdLib.HTMLImageElement
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: stdLib.ImageData
  ): scala.Unit = js.native
  def transformFeedbackVaryings(program: WebGLProgram, varyings: js.Array[java.lang.String], bufferMode: scala.Double): scala.Unit = js.native
  def uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: scala.Double, uniformBlockBinding: scala.Double): scala.Unit = js.native
  def vertexAttribDivisor(index: scala.Double, divisor: scala.Double): scala.Unit = js.native
}

