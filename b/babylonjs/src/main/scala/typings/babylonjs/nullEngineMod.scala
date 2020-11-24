package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.ipipelinecontextMod.IPipelineContext
import typings.babylonjs.mathLikeMod.IColor4Like
import typings.babylonjs.renderTargetCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.thinEngineMod.ISceneLike
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.Float32Array
import typings.std.HTMLImageElement
import typings.std.Int32Array
import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/nullEngine", JSImport.Namespace)
@js.native
object nullEngineMod extends js.Object {
  
  @js.native
  class NullEngine () extends Engine {
    def this(options: NullEngineOptions) = this()
    
    /** @hidden */
    def _bindTexture(channel: Double, texture: InternalTexture): Unit = js.native
    
    /** @hidden */
    def _bindTextureDirectly(target: Double, texture: InternalTexture): Boolean = js.native
    
    /* protected */ def _deleteBuffer(buffer: WebGLBuffer): Unit = js.native
    
    var _options: js.Any = js.native
    
    /**
      * Bind webGl buffers directly to the webGL context
      * @param vertexBuffers defines the vertex buffer to bind
      * @param indexBuffer defines the index buffer to bind
      * @param vertexDeclaration defines the vertex declaration to use with the vertex buffer
      * @param vertexStrideSize defines the vertex stride of the vertex buffer
      * @param effect defines the effect associated with the vertex buffer
      */
    def bindBuffers(vertexBuffers: StringDictionary[VertexBuffer], indexBuffer: DataBuffer, effect: Effect): Unit = js.native
    
    /**
      * Binds the frame buffer to the specified texture.
      * @param texture The texture to render to or null for the default canvas
      * @param faceIndex The face of the texture to render to in case of cube texture
      * @param requiredWidth The width of the target to render to
      * @param requiredHeight The height of the target to render to
      * @param forceFullscreenViewport Forces the viewport to be the entire texture/screen if true
      * @param lodLevel defines le lod level to bind to the frame buffer
      */
    def bindFramebuffer(texture: InternalTexture): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      requiredWidth: js.UndefOr[scala.Nothing],
      requiredHeight: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      requiredWidth: js.UndefOr[scala.Nothing],
      requiredHeight: Double
    ): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      requiredWidth: js.UndefOr[scala.Nothing],
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(texture: InternalTexture, faceIndex: js.UndefOr[scala.Nothing], requiredWidth: Double): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      requiredWidth: Double,
      requiredHeight: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      requiredWidth: Double,
      requiredHeight: Double
    ): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      requiredWidth: Double,
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(texture: InternalTexture, faceIndex: Double): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: Double,
      requiredWidth: js.UndefOr[scala.Nothing],
      requiredHeight: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: Double,
      requiredWidth: js.UndefOr[scala.Nothing],
      requiredHeight: Double
    ): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: Double,
      requiredWidth: js.UndefOr[scala.Nothing],
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(texture: InternalTexture, faceIndex: Double, requiredWidth: Double): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: Double,
      requiredWidth: Double,
      requiredHeight: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(texture: InternalTexture, faceIndex: Double, requiredWidth: Double, requiredHeight: Double): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: Double,
      requiredWidth: Double,
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    
    /**
      * Clear the current render buffer or the current render target (if any is set up)
      * @param color defines the color to use
      * @param backBuffer defines if the back buffer must be cleared
      * @param depth defines if the depth buffer must be cleared
      * @param stencil defines if the stencil buffer must be cleared
      */
    def clear(color: IColor4Like, backBuffer: Boolean, depth: Boolean): Unit = js.native
    def clear(color: IColor4Like, backBuffer: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    
    /**
      * Creates a new render target texture
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target texture stored in an InternalTexture
      */
    def createRenderTargetTexture(size: js.Any, options: Boolean): InternalTexture = js.native
    def createRenderTargetTexture(size: js.Any, options: RenderTargetCreationOptions): InternalTexture = js.native
    
    def createShaderProgram(pipelineContext: IPipelineContext, vertexCode: String, fragmentCode: String, defines: String): WebGLProgram = js.native
    def createShaderProgram(
      pipelineContext: IPipelineContext,
      vertexCode: String,
      fragmentCode: String,
      defines: String,
      context: WebGLRenderingContext
    ): WebGLProgram = js.native
    
    /**
      * Usually called from Texture.ts.
      * Passed information to create a WebGLTexture
      * @param urlArg defines a value which contains one of the following:
      * * A conventional http URL, e.g. 'http://...' or 'file://...'
      * * A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
      * * An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file
      * @param invertY when true, image is flipped when loaded.  You probably want true. Certain compressed textures may invert this if their default is inverted (eg. ktx)
      * @param scene needed for loading to the correct scene
      * @param samplingMode mode with should be used sample / access the texture (Default: Texture.TRILINEAR_SAMPLINGMODE)
      * @param onLoad optional callback to be called upon successful completion
      * @param onError optional callback to be called upon failure
      * @param buffer a source of a file previously fetched as either a base64 string, an ArrayBuffer (compressed or image format), HTMLImageElement (image format), or a Blob
      * @param fallback an internal argument in case the function must be called again, due to etc1 not having alpha capabilities
      * @param format internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param mimeType defines an optional mime type
      * @returns a InternalTexture for assignment back into BABYLON.Texture
      */
    def createTexture(
      urlArg: Nullable[String],
      noMipmap: Boolean,
      invertY: Boolean,
      scene: Nullable[ISceneLike],
      samplingMode: js.UndefOr[Double],
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[/* message */ String, /* exception */ _, Unit]]],
      buffer: js.UndefOr[
          Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap]
        ],
      fallback: js.UndefOr[Nullable[InternalTexture]],
      format: js.UndefOr[Nullable[Double]],
      forcedExtension: js.UndefOr[Nullable[String]],
      mimeType: js.UndefOr[String]
    ): InternalTexture = js.native
    
    /**
      * Activates an effect, mkaing it the current one (ie. the one used for rendering)
      * @param effect defines the effect to activate
      */
    def enableEffect(effect: Effect): Unit = js.native
    
    /**
      * Set the value of an uniform to an array of number
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of number to store
      * @returns true if value was set
      */
    def setArray(uniform: WebGLUniformLocation, array: js.Array[Double]): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of number (stored as vec2)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of number to store
      * @returns true if value was set
      */
    def setArray2(uniform: WebGLUniformLocation, array: js.Array[Double]): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of number (stored as vec3)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of number to store
      * @returns true if value was set
      */
    def setArray3(uniform: WebGLUniformLocation, array: js.Array[Double]): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of number (stored as vec4)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of number to store
      * @returns true if value was set
      */
    def setArray4(uniform: WebGLUniformLocation, array: js.Array[Double]): Boolean = js.native
    
    /**
      * Set the value of an uniform to a boolean
      * @param uniform defines the webGL uniform location where to store the value
      * @param bool defines the boolean to store
      * @returns true if value was set
      */
    def setBool(uniform: WebGLUniformLocation, bool: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a number (float)
      * @param uniform defines the webGL uniform location where to store the value
      * @param value defines the float number to store
      * @returns true if value was set
      */
    def setFloat(uniform: WebGLUniformLocation, value: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a vec2
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @returns true if value was set
      */
    def setFloat2(uniform: WebGLUniformLocation, x: Double, y: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a vec3
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @param z defines the 3rd component of the value
      * @returns true if value was set
      */
    def setFloat3(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a vec4
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @param z defines the 3rd component of the value
      * @param w defines the 4th component of the value
      * @returns true if value was set
      */
    def setFloat4(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double, w: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of float32 to store
      * @returns true if value was set
      */
    def setFloatArray(uniform: WebGLUniformLocation, array: Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32 (stored as vec2)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of float32 to store
      * @returns true if value was set
      */
    def setFloatArray2(uniform: WebGLUniformLocation, array: Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32 (stored as vec3)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of float32 to store
      * @returns true if value was set
      */
    def setFloatArray3(uniform: WebGLUniformLocation, array: Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32 (stored as vec4)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of float32 to store
      * @returns true if value was set
      */
    def setFloatArray4(uniform: WebGLUniformLocation, array: Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of int32
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of int32 to store
      * @returns true if value was set
      */
    def setIntArray(uniform: WebGLUniformLocation, array: Int32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of int32 (stored as vec2)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of int32 to store
      * @returns true if value was set
      */
    def setIntArray2(uniform: WebGLUniformLocation, array: Int32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of int32 (stored as vec3)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of int32 to store
      * @returns true if value was set
      */
    def setIntArray3(uniform: WebGLUniformLocation, array: Int32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of int32 (stored as vec4)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of int32 to store
      * @returns true if value was set
      */
    def setIntArray4(uniform: WebGLUniformLocation, array: Int32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32 (stored as matrices)
      * @param uniform defines the webGL uniform location where to store the value
      * @param matrices defines the array of float32 to store
      * @returns true if value was set
      */
    def setMatrices(uniform: WebGLUniformLocation, matrices: Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to a matrix (2x2)
      * @param uniform defines the webGL uniform location where to store the value
      * @param matrix defines the Float32Array representing the 2x2 matrix to store
      * @returns true if value was set
      */
    def setMatrix2x2(uniform: WebGLUniformLocation, matrix: Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to a matrix (3x3)
      * @param uniform defines the webGL uniform location where to store the value
      * @param matrix defines the Float32Array representing the 3x3 matrix to store
      * @returns true if value was set
      */
    def setMatrix3x3(uniform: WebGLUniformLocation, matrix: Float32Array): Boolean = js.native
    
    /**
      * Update a dynamic index buffer
      * @param indexBuffer defines the target index buffer
      * @param indices defines the data to update
      * @param offset defines the offset in the target index buffer where update should start
      */
    def updateDynamicIndexBuffer(indexBuffer: WebGLBuffer, indices: IndicesArray): Unit = js.native
    def updateDynamicIndexBuffer(indexBuffer: WebGLBuffer, indices: IndicesArray, offset: Double): Unit = js.native
    
    /**
      * Update the content of a dynamic texture
      * @param texture defines the texture to update
      * @param canvas defines the canvas containing the source
      * @param invertY defines if data must be stored with Y axis inverted
      * @param premulAlpha defines if alpha is stored as premultiplied
      * @param format defines the format of the data
      * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
      */
    def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: HTMLCanvasElement, invertY: Boolean): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: js.UndefOr[scala.Nothing],
      format: Double
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double
    ): Unit = js.native
    
    /**
      * Updates a dynamic vertex buffer.
      * @param vertexBuffer the vertex buffer to update
      * @param vertices the data used to update the vertex buffer
      * @param byteOffset the byte offset of the data (optional)
      * @param byteLength the byte length of the data (optional)
      */
    def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray): Unit = js.native
    def updateDynamicVertexBuffer(
      vertexBuffer: WebGLBuffer,
      vertices: FloatArray,
      byteOffset: js.UndefOr[scala.Nothing],
      byteLength: Double
    ): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Double): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Double, byteLength: Double): Unit = js.native
  }
  
  @js.native
  class NullEngineOptions () extends js.Object {
    
    /**
      * If delta time between frames should be constant
      * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
      */
    var deterministicLockstep: Boolean = js.native
    
    /**
      * Maximum about of steps between frames (Default: 4)
      * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
      */
    var lockstepMaxSteps: Double = js.native
    
    /**
      * Render height (Default: 256)
      */
    var renderHeight: Double = js.native
    
    /**
      * Render width (Default: 512)
      */
    var renderWidth: Double = js.native
    
    /**
      * Texture size (Default: 512)
      */
    var textureSize: Double = js.native
    
    /**
      * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
      */
    var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.native
  }
}
