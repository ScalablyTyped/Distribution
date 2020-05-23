package typings.babylonjs

import typings.std.ArrayBufferView
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.WebGLBuffer
import typings.std.WebGLQuery
import typings.std.WebGLTexture
import typings.std.WebGLTransformFeedback
import typings.std.WebGLVertexArrayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type definitions for WebGL 2, Editor's Draft Fri Feb 24 16:10:18 2017 -0800
// Project: https://www.khronos.org/registry/webgl/specs/latest/2.0/
// Definitions by: Nico Kemnitz <https://github.com/nkemnitz/>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
@js.native
trait WebGLRenderingContext extends js.Object {
  var ANY_SAMPLES_PASSED: Double = js.native
                               // 0x8CE4
  // Occlusion Query
  var ANY_SAMPLES_PASSED_CONSERVATIVE: Double = js.native
  val COLOR_ATTACHMENT0: Double = js.native
                               // 0x8CE1
  val COLOR_ATTACHMENT1: Double = js.native
                               // 0x8CE2
  val COLOR_ATTACHMENT2: Double = js.native
                               // 0x8CE3
  val COLOR_ATTACHMENT3: Double = js.native
  val COMPARE_REF_TO_TEXTURE: Double = js.native
  var DEPTH24_STENCIL8: Double = js.native
  val DEPTH_COMPONENT24: Double = js.native
  val DEPTH_COMPONENT32F: Double = js.native
  var DRAW_FRAMEBUFFER: Double = js.native
  val FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
  val HALF_FLOAT: Double = js.native
  var HALF_FLOAT_OES: Double = js.native
  val INTERLEAVED_ATTRIBS: Double = js.native
  var MAX: Double = js.native
  var MAX_SAMPLES: Double = js.native
  var MIN: Double = js.native
  var QUERY_RESULT: Double = js.native
  var QUERY_RESULT_AVAILABLE: Double = js.native
  val R11F_G11F_B10F: Double = js.native
  var R16F: Double = js.native
  val R16I: Double = js.native
  val R16UI: Double = js.native
  var R32F: Double = js.native
  val R32I: Double = js.native
  val R32UI: Double = js.native
  var R8: Double = js.native
  val R8I: Double = js.native
  val R8UI: Double = js.native
  val R8_SNORM: Double = js.native
  val RASTERIZER_DISCARD: Double = js.native
  var READ_FRAMEBUFFER: Double = js.native
  var RED: Double = js.native
  val RED_INTEGER: Double = js.native
  var RG: Double = js.native
  var RG16F: Double = js.native
  val RG16I: Double = js.native
  val RG16UI: Double = js.native
  var RG32F: Double = js.native
  val RG32I: Double = js.native
  val RG32UI: Double = js.native
  var RG8: Double = js.native
  val RG8I: Double = js.native
  val RG8UI: Double = js.native
  val RG8_SNORM: Double = js.native
  val RGB10_A2: Double = js.native
  val RGB10_A2UI: Double = js.native
  var RGB16F: Double = js.native
  val RGB16I: Double = js.native
  val RGB16UI: Double = js.native
  var RGB32F: Double = js.native
  val RGB32I: Double = js.native
  val RGB32UI: Double = js.native
  val RGB8: Double = js.native
  val RGB8I: Double = js.native
  val RGB8UI: Double = js.native
  val RGB8_SNORM: Double = js.native
  val RGB9_E5: Double = js.native
  var RGBA16F: Double = js.native
  val RGBA16I: Double = js.native
  val RGBA16UI: Double = js.native
  var RGBA32F: Double = js.native
  val RGBA32I: Double = js.native
  val RGBA32UI: Double = js.native
  var RGBA8: Double = js.native
  val RGBA8I: Double = js.native
  val RGBA8UI: Double = js.native
  val RGBA8_SNORM: Double = js.native
  val RGBA_INTEGER: Double = js.native
  val RGB_INTEGER: Double = js.native
  val RG_INTEGER: Double = js.native
  val TEXTURE_2D_ARRAY: Double = js.native
  val TEXTURE_3D: Double = js.native
  val TEXTURE_COMPARE_FUNC: Double = js.native
  val TEXTURE_COMPARE_MODE: Double = js.native
  val TEXTURE_WRAP_R: Double = js.native
  val TRANSFORM_FEEDBACK: Double = js.native
  val TRANSFORM_FEEDBACK_BUFFER: Double = js.native
  var UNIFORM_BUFFER: Double = js.native
  val UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
  var UNSIGNED_INT_24_8: Double = js.native
  val UNSIGNED_INT_2_10_10_10_REV: Double = js.native
  val UNSIGNED_INT_5_9_9_9_REV: Double = js.native
  var renderbufferStorageMultisample: js.UndefOr[
    js.Function5[
      /* target */ Double, 
      /* samples */ Double, 
      /* internalformat */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      Unit
    ]
  ] = js.native
  def beginQuery(target: Double, query: WebGLQuery): Unit = js.native
  def beginTransformFeedback(primitiveMode: Double): Unit = js.native
  def bindBufferBase(target: Double, index: Double): Unit = js.native
  def bindBufferBase(target: Double, index: Double, buffer: WebGLBuffer): Unit = js.native
  def bindTransformFeedback(target: Double): Unit = js.native
  def bindTransformFeedback(target: Double, transformFeedback: WebGLTransformFeedback): Unit = js.native
  def bindVertexArray(): Unit = js.native
  def bindVertexArray(vao: WebGLVertexArrayObject): Unit = js.native
  def blitFramebuffer(
    srcX0: Double,
    srcY0: Double,
    srcX1: Double,
    srcY1: Double,
    dstX0: Double,
    dstY0: Double,
    dstX1: Double,
    dstY1: Double,
    mask: Double,
    filter: Double
  ): Unit = js.native
  def clearBufferfi(buffer: Double, drawbuffer: Double, depth: Double, stencil: Double): Unit = js.native
  def clearBufferfv(buffer: Double, drawbuffer: Double, values: ArrayBufferView): Unit = js.native
  def clearBufferfv(buffer: Double, drawbuffer: Double, values: ArrayBufferView, srcOffset: Double): Unit = js.native
  def clearBufferiv(buffer: Double, drawbuffer: Double, values: ArrayBufferView): Unit = js.native
  def clearBufferiv(buffer: Double, drawbuffer: Double, values: ArrayBufferView, srcOffset: Double): Unit = js.native
  def clearBufferuiv(buffer: Double, drawbuffer: Double, values: ArrayBufferView): Unit = js.native
  def clearBufferuiv(buffer: Double, drawbuffer: Double, values: ArrayBufferView, srcOffset: Double): Unit = js.native
  def compressedTexImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    data: ArrayBufferView
  ): Unit = js.native
  def compressedTexImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    data: ArrayBufferView,
    offset: Double
  ): Unit = js.native
  def compressedTexImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    data: ArrayBufferView,
    offset: Double,
    length: Double
  ): Unit = js.native
  // Queries
  def createQuery(): WebGLQuery = js.native
  def createTransformFeedback(): WebGLTransformFeedback = js.native
  def createVertexArray(): js.Any = js.native
  def deleteQuery(query: WebGLQuery): Unit = js.native
  def deleteTransformFeedback(transformFeedbac: WebGLTransformFeedback): Unit = js.native
  def deleteVertexArray(vao: WebGLVertexArrayObject): Unit = js.native
  def drawArraysInstanced(mode: Double, first: Double, count: Double, primcount: Double): Unit = js.native
  /* Multiple Render Targets */
  def drawBuffers(buffers: js.Array[Double]): Unit = js.native
  def drawElementsInstanced(mode: Double, count: Double, `type`: Double, offset: Double, primcount: Double): Unit = js.native
  def endQuery(target: Double): Unit = js.native
  def endTransformFeedback(): Unit = js.native
  def framebufferTextureLayer(target: Double, attachment: Double, texture: Null, level: Double, layer: Double): Unit = js.native
  def framebufferTextureLayer(target: Double, attachment: Double, texture: WebGLTexture, level: Double, layer: Double): Unit = js.native
  def getQuery(target: Double, pname: Double): js.Any = js.native
  def getQueryParameter(query: WebGLQuery, pname: Double): js.Any = js.native
  def getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Double = js.native
  def readBuffer(src: Double): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLCanvasElement
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLVideoElement
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: ImageBitmap
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: ArrayBufferView
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: ArrayBufferView,
    offset: Double
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLImageElement
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: ImageData
  ): Unit = js.native
  def transformFeedbackVaryings(program: WebGLProgram, varyings: js.Array[String], bufferMode: Double): Unit = js.native
  def uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Double, uniformBlockBinding: Double): Unit = js.native
  def vertexAttribDivisor(index: Double, divisor: Double): Unit = js.native
}

