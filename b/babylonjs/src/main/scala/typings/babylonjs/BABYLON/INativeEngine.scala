package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLUniformLocation
import typings.std.ImageBitmap
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INativeEngine extends StObject {
  
  def copyTexture(desination: Nullable[WebGLTexture], source: Nullable[WebGLTexture]): Unit = js.native
  
  def createFrameBuffer(
    texture: WebGLTexture,
    width: Double,
    height: Double,
    format: Double,
    generateStencilBuffer: Boolean,
    generateDepthBuffer: Boolean,
    generateMips: Boolean
  ): WebGLFramebuffer = js.native
  
  def createImageBitmap(data: js.typedarray.ArrayBufferView): ImageBitmap = js.native
  def createImageBitmap(data: IImage): ImageBitmap = js.native
  
  def createIndexBuffer(
    bytes: js.typedarray.ArrayBuffer,
    byteOffset: Double,
    byteLength: Double,
    is32Bits: Boolean,
    dynamic: Boolean
  ): js.typedarray.Uint32Array = js.native
  
  def createProgram(vertexShader: String, fragmentShader: String): Any = js.native
  
  def createTexture(): WebGLTexture = js.native
  
  def createVertexArray(): js.typedarray.Uint32Array = js.native
  
  def createVertexBuffer(bytes: js.typedarray.ArrayBuffer, byteOffset: Double, byteLength: Double, dynamic: Boolean): js.typedarray.Uint32Array = js.native
  
  def deleteTexture(texture: Nullable[WebGLTexture]): Unit = js.native
  
  def dispose(): Unit = js.native
  
  def getAttributes(shaderProgram: Any, attributeNames: js.Array[String]): js.Array[Double] = js.native
  
  def getHardwareScalingLevel(): Double = js.native
  
  def getRenderHeight(): Double = js.native
  
  def getRenderWidth(): Double = js.native
  
  def getTextureHeight(texture: WebGLTexture): Double = js.native
  
  def getTextureWidth(texture: WebGLTexture): Double = js.native
  
  def getUniforms(shaderProgram: Any, uniformsNames: js.Array[String]): js.Array[WebGLUniformLocation] = js.native
  
  def loadCubeTexture(
    texture: WebGLTexture,
    data: js.Array[js.typedarray.ArrayBufferView],
    generateMips: Boolean,
    invertY: Boolean,
    srgb: Boolean,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit = js.native
  
  def loadCubeTextureWithMips(
    texture: WebGLTexture,
    data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    invertY: Boolean,
    srgb: Boolean,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit = js.native
  
  def loadRawTexture(
    texture: WebGLTexture,
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    format: Double,
    generateMips: Boolean,
    invertY: Boolean
  ): Unit = js.native
  
  def loadRawTexture2DArray(
    texture: WebGLTexture,
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean
  ): Unit = js.native
  
  def loadTexture(
    texture: WebGLTexture,
    data: js.typedarray.ArrayBufferView,
    generateMips: Boolean,
    invertY: Boolean,
    srgb: Boolean,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit = js.native
  
  def readTexture(
    texture: WebGLTexture,
    mipLevel: Double,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    buffer: Nullable[js.typedarray.ArrayBuffer],
    bufferOffset: Double,
    bufferLength: Double
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def recordIndexBuffer(vertexArray: js.typedarray.Uint32Array, indexBuffer: js.typedarray.Uint32Array): Unit = js.native
  
  def recordVertexBuffer(
    vertexArray: js.typedarray.Uint32Array,
    vertexBuffer: js.typedarray.Uint32Array,
    location: Double,
    byteOffset: Double,
    byteStride: Double,
    numElements: Double,
    `type`: Double,
    normalized: Boolean,
    instanceDivisor: Double
  ): Unit = js.native
  
  def requestAnimationFrame(callback: js.Function0[Unit]): Unit = js.native
  
  def resizeImageBitmap(image: ImageBitmap, bufferWidth: Double, bufferHeight: Double): js.typedarray.Uint8Array = js.native
  
  def setCommandDataStream(dataStream: NativeDataStream): Unit = js.native
  
  def setHardwareScalingLevel(level: Double): Unit = js.native
  
  def setViewPort(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  def submitCommands(): Unit = js.native
  
  def updateDynamicIndexBuffer(
    buffer: js.typedarray.Uint32Array,
    bytes: js.typedarray.ArrayBuffer,
    byteOffset: Double,
    byteLength: Double,
    startIndex: Double
  ): Unit = js.native
  
  def updateDynamicVertexBuffer(
    vertexBuffer: js.typedarray.Uint32Array,
    bytes: js.typedarray.ArrayBuffer,
    byteOffset: Double,
    byteLength: Double
  ): Unit = js.native
}
