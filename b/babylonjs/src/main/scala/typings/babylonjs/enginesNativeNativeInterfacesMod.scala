package typings.babylonjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import typings.babylonjs.deviceInputInputInterfacesMod.IDeviceInputSystem
import typings.babylonjs.enginesIcanvasMod.ICanvas
import typings.babylonjs.enginesIcanvasMod.IImage
import typings.babylonjs.enginesNativeNativeDataStreamMod.NativeDataStream
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import typings.std.ImageBitmap
import typings.std.MediaTrackConstraints
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesNativeNativeInterfacesMod {
  
  /** @internal */
  @js.native
  trait IDeviceInputSystemConstructor
    extends StObject
       with Instantiable3[
          /* onDeviceConnected */ js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit], 
          /* onDeviceDisconnected */ js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit], 
          /* onInputChanged */ js.Function4[
            /* deviceType */ DeviceType, 
            /* deviceSlot */ Double, 
            /* inputIndex */ Double, 
            /* currentState */ Double, 
            Unit
          ], 
          IDeviceInputSystem
        ]
  
  trait INative extends StObject {
    
    var Camera: INativeCameraConstructor
    
    var Canvas: INativeCanvasConstructor
    
    var DeviceInputSystem: IDeviceInputSystemConstructor
    
    var Engine: INativeEngineConstructor
    
    var Image: INativeImageConstructor
    
    var NativeDataStream: INativeDataStreamConstructor
    
    var XMLHttpRequest: Any
  }
  object INative {
    
    inline def apply(
      Camera: INativeCameraConstructor,
      Canvas: INativeCanvasConstructor,
      DeviceInputSystem: IDeviceInputSystemConstructor,
      Engine: INativeEngineConstructor,
      Image: INativeImageConstructor,
      NativeDataStream: INativeDataStreamConstructor,
      XMLHttpRequest: Any
    ): INative = {
      val __obj = js.Dynamic.literal(Camera = Camera.asInstanceOf[js.Any], Canvas = Canvas.asInstanceOf[js.Any], DeviceInputSystem = DeviceInputSystem.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], NativeDataStream = NativeDataStream.asInstanceOf[js.Any], XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[INative]
    }
    
    extension [Self <: INative](x: Self) {
      
      inline def setCamera(value: INativeCameraConstructor): Self = StObject.set(x, "Camera", value.asInstanceOf[js.Any])
      
      inline def setCanvas(value: INativeCanvasConstructor): Self = StObject.set(x, "Canvas", value.asInstanceOf[js.Any])
      
      inline def setDeviceInputSystem(value: IDeviceInputSystemConstructor): Self = StObject.set(x, "DeviceInputSystem", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: INativeEngineConstructor): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
      
      inline def setImage(value: INativeImageConstructor): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setNativeDataStream(value: INativeDataStreamConstructor): Self = StObject.set(x, "NativeDataStream", value.asInstanceOf[js.Any])
      
      inline def setXMLHttpRequest(value: Any): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
    }
  }
  
  trait INativeCamera extends StObject {
    
    def createVideo(constraints: MediaTrackConstraints): Any
    
    def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit
  }
  object INativeCamera {
    
    inline def apply(
      createVideo: MediaTrackConstraints => Any,
      updateVideoTexture: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Unit
    ): INativeCamera = {
      val __obj = js.Dynamic.literal(createVideo = js.Any.fromFunction1(createVideo), updateVideoTexture = js.Any.fromFunction3(updateVideoTexture))
      __obj.asInstanceOf[INativeCamera]
    }
    
    extension [Self <: INativeCamera](x: Self) {
      
      inline def setCreateVideo(value: MediaTrackConstraints => Any): Self = StObject.set(x, "createVideo", js.Any.fromFunction1(value))
      
      inline def setUpdateVideoTexture(value: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Unit): Self = StObject.set(x, "updateVideoTexture", js.Any.fromFunction3(value))
    }
  }
  
  /** @internal */
  @js.native
  trait INativeCameraConstructor
    extends StObject
       with Instantiable0[INativeCamera]
  
  /** @internal */
  @js.native
  trait INativeCanvasConstructor
    extends StObject
       with Instantiable0[ICanvas] {
    
    def loadTTFAsync(fontName: String, buffer: js.typedarray.ArrayBuffer): Unit = js.native
  }
  
  trait INativeDataStream extends StObject {
    
    def writeBuffer(buffer: js.typedarray.ArrayBuffer, length: Double): Unit
  }
  object INativeDataStream {
    
    inline def apply(writeBuffer: (js.typedarray.ArrayBuffer, Double) => Unit): INativeDataStream = {
      val __obj = js.Dynamic.literal(writeBuffer = js.Any.fromFunction2(writeBuffer))
      __obj.asInstanceOf[INativeDataStream]
    }
    
    extension [Self <: INativeDataStream](x: Self) {
      
      inline def setWriteBuffer(value: (js.typedarray.ArrayBuffer, Double) => Unit): Self = StObject.set(x, "writeBuffer", js.Any.fromFunction2(value))
    }
  }
  
  /** @internal */
  @js.native
  trait INativeDataStreamConstructor
    extends StObject
       with Instantiable1[/* requestFlushCallback */ js.Function0[Unit], INativeDataStream] {
    
    val VALIDATION_BOOLEAN: Double = js.native
    
    val VALIDATION_ENABLED: Boolean = js.native
    
    val VALIDATION_FLOAT_32: Double = js.native
    
    val VALIDATION_FLOAT_32_ARRAY: Double = js.native
    
    val VALIDATION_INT_32: Double = js.native
    
    val VALIDATION_INT_32_ARRAY: Double = js.native
    
    val VALIDATION_NATIVE_DATA: Double = js.native
    
    val VALIDATION_UINT_32: Double = js.native
    
    val VALIDATION_UINT_32_ARRAY: Double = js.native
  }
  
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
  
  /** @internal */
  @js.native
  trait INativeEngineConstructor
    extends StObject
       with Instantiable0[INativeEngine] {
    
    val ADDRESS_MODE_BORDER: Double = js.native
    
    val ADDRESS_MODE_CLAMP: Double = js.native
    
    val ADDRESS_MODE_MIRROR: Double = js.native
    
    val ADDRESS_MODE_MIRROR_ONCE: Double = js.native
    
    val ADDRESS_MODE_WRAP: Double = js.native
    
    val ALPHA_ADD: Double = js.native
    
    val ALPHA_COMBINE: Double = js.native
    
    val ALPHA_DISABLE: Double = js.native
    
    val ALPHA_INTERPOLATE: Double = js.native
    
    val ALPHA_MAXIMIZED: Double = js.native
    
    val ALPHA_MULTIPLY: Double = js.native
    
    val ALPHA_ONEONE: Double = js.native
    
    val ALPHA_PREMULTIPLIED: Double = js.native
    
    val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
    
    val ALPHA_SCREENMODE: Double = js.native
    
    val ALPHA_SUBTRACT: Double = js.native
    
    val ATTRIB_TYPE_FLOAT: Double = js.native
    
    val ATTRIB_TYPE_INT16: Double = js.native
    
    val ATTRIB_TYPE_INT8: Double = js.native
    
    val ATTRIB_TYPE_UINT16: Double = js.native
    
    val ATTRIB_TYPE_UINT8: Double = js.native
    
    val CAPS_LIMITS_MAX_TEXTURE_LAYERS: Double = js.native
    
    val CAPS_LIMITS_MAX_TEXTURE_SIZE: Double = js.native
    
    val COMMAND_BINDFRAMEBUFFER: js.typedarray.Uint32Array = js.native
    
    val COMMAND_BINDVERTEXARRAY: js.typedarray.Uint32Array = js.native
    
    val COMMAND_CLEAR: js.typedarray.Uint32Array = js.native
    
    val COMMAND_DELETEFRAMEBUFFER: js.typedarray.Uint32Array = js.native
    
    val COMMAND_DELETEINDEXBUFFER: js.typedarray.Uint32Array = js.native
    
    val COMMAND_DELETEPROGRAM: js.typedarray.Uint32Array = js.native
    
    val COMMAND_DELETEVERTEXARRAY: js.typedarray.Uint32Array = js.native
    
    val COMMAND_DELETEVERTEXBUFFER: js.typedarray.Uint32Array = js.native
    
    val COMMAND_DRAW: js.typedarray.Uint32Array = js.native
    
    val COMMAND_DRAWINDEXED: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETBLENDMODE: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETCOLORWRITE: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETDEPTHTEST: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETDEPTHWRITE: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETFLOAT: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETFLOAT2: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETFLOAT3: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETFLOAT4: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETFLOATARRAY: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETFLOATARRAY2: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETFLOATARRAY3: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETFLOATARRAY4: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETINT: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETINTARRAY: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETINTARRAY2: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETINTARRAY3: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETINTARRAY4: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETMATRICES: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETMATRIX: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETMATRIX2X2: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETMATRIX3X3: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETPROGRAM: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETSTATE: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETSTENCIL: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETTEXTURE: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETTEXTUREANISOTROPICLEVEL: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETTEXTURESAMPLING: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETTEXTUREWRAPMODE: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETZOFFSET: js.typedarray.Uint32Array = js.native
    
    val COMMAND_SETZOFFSETUNITS: js.typedarray.Uint32Array = js.native
    
    val COMMAND_UNBINDFRAMEBUFFER: js.typedarray.Uint32Array = js.native
    
    val DEPTH_TEST_ALWAYS: Double = js.native
    
    val DEPTH_TEST_EQUAL: Double = js.native
    
    val DEPTH_TEST_GEQUAL: Double = js.native
    
    val DEPTH_TEST_GREATER: Double = js.native
    
    val DEPTH_TEST_LEQUAL: Double = js.native
    
    val DEPTH_TEST_LESS: Double = js.native
    
    val DEPTH_TEST_NEVER: Double = js.native
    
    val DEPTH_TEST_NOTEQUAL: Double = js.native
    
    val PROTOCOL_VERSION: Double = js.native
    
    val STENCIL_OP_FAIL_S_DECR: Double = js.native
    
    val STENCIL_OP_FAIL_S_DECRSAT: Double = js.native
    
    val STENCIL_OP_FAIL_S_INCR: Double = js.native
    
    val STENCIL_OP_FAIL_S_INCRSAT: Double = js.native
    
    val STENCIL_OP_FAIL_S_INVERT: Double = js.native
    
    val STENCIL_OP_FAIL_S_KEEP: Double = js.native
    
    val STENCIL_OP_FAIL_S_REPLACE: Double = js.native
    
    val STENCIL_OP_FAIL_S_ZERO: Double = js.native
    
    val STENCIL_OP_FAIL_Z_DECR: Double = js.native
    
    val STENCIL_OP_FAIL_Z_DECRSAT: Double = js.native
    
    val STENCIL_OP_FAIL_Z_INCR: Double = js.native
    
    val STENCIL_OP_FAIL_Z_INCRSAT: Double = js.native
    
    val STENCIL_OP_FAIL_Z_INVERT: Double = js.native
    
    val STENCIL_OP_FAIL_Z_KEEP: Double = js.native
    
    val STENCIL_OP_FAIL_Z_REPLACE: Double = js.native
    
    val STENCIL_OP_FAIL_Z_ZERO: Double = js.native
    
    val STENCIL_OP_PASS_Z_DECR: Double = js.native
    
    val STENCIL_OP_PASS_Z_DECRSAT: Double = js.native
    
    val STENCIL_OP_PASS_Z_INCR: Double = js.native
    
    val STENCIL_OP_PASS_Z_INCRSAT: Double = js.native
    
    val STENCIL_OP_PASS_Z_INVERT: Double = js.native
    
    val STENCIL_OP_PASS_Z_KEEP: Double = js.native
    
    val STENCIL_OP_PASS_Z_REPLACE: Double = js.native
    
    val STENCIL_OP_PASS_Z_ZERO: Double = js.native
    
    val STENCIL_TEST_ALWAYS: Double = js.native
    
    val STENCIL_TEST_EQUAL: Double = js.native
    
    val STENCIL_TEST_GEQUAL: Double = js.native
    
    val STENCIL_TEST_GREATER: Double = js.native
    
    val STENCIL_TEST_LEQUAL: Double = js.native
    
    val STENCIL_TEST_LESS: Double = js.native
    
    val STENCIL_TEST_NEVER: Double = js.native
    
    val STENCIL_TEST_NOTEQUAL: Double = js.native
    
    val TEXTURE_FORMAT_RGB8: Double = js.native
    
    val TEXTURE_FORMAT_RGBA32F: Double = js.native
    
    val TEXTURE_FORMAT_RGBA8: Double = js.native
    
    val TEXTURE_LINEAR_LINEAR: Double = js.native
    
    val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
    
    val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
    
    val TEXTURE_LINEAR_NEAREST: Double = js.native
    
    val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
    
    val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
    
    val TEXTURE_NEAREST_LINEAR: Double = js.native
    
    val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
    
    val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
    
    val TEXTURE_NEAREST_NEAREST: Double = js.native
    
    val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
    
    val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
  }
  
  /** @internal */
  @js.native
  trait INativeImageConstructor
    extends StObject
       with Instantiable0[IImage]
}
