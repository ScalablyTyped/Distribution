package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLUniformLocation
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INativeEngine extends StObject {
  
  def copyTexture(desination: js.typedarray.Uint32Array, source: js.typedarray.Uint32Array): Unit = js.native
  
  def createFrameBuffer(
    texture: Nullable[js.typedarray.Uint32Array],
    width: Double,
    height: Double,
    generateStencilBuffer: Boolean,
    generateDepthBuffer: Boolean
  ): js.typedarray.Uint32Array = js.native
  
  def createImageBitmap(data: js.typedarray.ArrayBufferView): ImageBitmap = js.native
  def createImageBitmap(data: IImage): ImageBitmap = js.native
  
  def createIndexBuffer(
    bytes: js.typedarray.ArrayBuffer,
    byteOffset: Double,
    byteLength: Double,
    is32Bits: Boolean,
    dynamic: Boolean
  ): js.typedarray.Uint32Array = js.native
  
  def createProgram(vertexShader: String, fragmentShader: String): js.typedarray.Uint32Array = js.native
  
  def createProgramAsync(
    vertexShader: String,
    fragmentShader: String,
    onSuccess: js.Function0[Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): js.typedarray.Uint32Array = js.native
  
  def createTexture(): js.typedarray.Uint32Array = js.native
  
  def createVertexArray(): js.typedarray.Uint32Array = js.native
  
  def createVertexBuffer(bytes: js.typedarray.ArrayBuffer, byteOffset: Double, byteLength: Double, dynamic: Boolean): js.typedarray.Uint32Array = js.native
  
  def deleteTexture(texture: js.typedarray.Uint32Array): Unit = js.native
  
  def dispose(): Unit = js.native
  
  def getAttributes(shaderProgram: js.typedarray.Uint32Array, attributeNames: js.Array[String]): js.Array[Double] = js.native
  
  def getRenderHeight(): Double = js.native
  
  def getRenderWidth(): Double = js.native
  
  def getTextureHeight(texture: js.typedarray.Uint32Array): Double = js.native
  
  def getTextureWidth(texture: js.typedarray.Uint32Array): Double = js.native
  
  def getUniforms(shaderProgram: js.typedarray.Uint32Array, uniformsNames: js.Array[String]): js.Array[WebGLUniformLocation] = js.native
  
  def initializeTexture(
    texture: js.typedarray.Uint32Array,
    width: Double,
    height: Double,
    hasMips: Boolean,
    format: Double,
    renderTarget: Boolean,
    srgb: Boolean
  ): Unit = js.native
  
  def loadCubeTexture(
    texture: js.typedarray.Uint32Array,
    data: js.Array[js.typedarray.ArrayBufferView],
    generateMips: Boolean,
    invertY: Boolean,
    srgb: Boolean,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit = js.native
  
  def loadCubeTextureWithMips(
    texture: js.typedarray.Uint32Array,
    data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    invertY: Boolean,
    srgb: Boolean,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit = js.native
  
  def loadRawTexture(
    texture: js.typedarray.Uint32Array,
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    format: Double,
    generateMips: Boolean,
    invertY: Boolean
  ): Unit = js.native
  
  def loadRawTexture2DArray(
    texture: js.typedarray.Uint32Array,
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean
  ): Unit = js.native
  
  def loadTexture(
    texture: js.typedarray.Uint32Array,
    data: js.typedarray.ArrayBufferView,
    generateMips: Boolean,
    invertY: Boolean,
    srgb: Boolean,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit = js.native
  
  def readTexture(
    texture: js.typedarray.Uint32Array,
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
