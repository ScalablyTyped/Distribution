package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.ImageBitmap
import typings.babylonjs.WebGLUniformLocation
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.Float32Array
import typings.std.HTMLImageElement
import typings.std.WebGLBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullEngine
  extends StObject
     with Engine {
  
  /* protected */ def _deleteBuffer(buffer: WebGLBuffer): Unit = js.native
  
  /* private */ var _options: js.Any = js.native
  
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
  def bindFramebuffer(texture: InternalTexture, faceIndex: Double): Unit = js.native
  def bindFramebuffer(texture: InternalTexture, faceIndex: Double, requiredWidth: Double): Unit = js.native
  def bindFramebuffer(texture: InternalTexture, faceIndex: Double, requiredWidth: Double, requiredHeight: Double): Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: Double,
    requiredWidth: Double,
    requiredHeight: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: Double,
    requiredWidth: Double,
    requiredHeight: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(texture: InternalTexture, faceIndex: Double, requiredWidth: Unit, requiredHeight: Double): Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: Double,
    requiredWidth: Unit,
    requiredHeight: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: Double,
    requiredWidth: Unit,
    requiredHeight: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(texture: InternalTexture, faceIndex: Unit, requiredWidth: Double): Unit = js.native
  def bindFramebuffer(texture: InternalTexture, faceIndex: Unit, requiredWidth: Double, requiredHeight: Double): Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: Unit,
    requiredWidth: Double,
    requiredHeight: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: Unit,
    requiredWidth: Double,
    requiredHeight: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(texture: InternalTexture, faceIndex: Unit, requiredWidth: Unit, requiredHeight: Double): Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: Unit,
    requiredWidth: Unit,
    requiredHeight: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: Unit,
    requiredWidth: Unit,
    requiredHeight: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  
  /**
    * Creates a new render target texture
    * @param size defines the size of the texture
    * @param options defines the options used to create the texture
    * @returns a new render target texture stored in an InternalTexture
    */
  def createRenderTargetTexture(size: js.Any, options: Boolean): InternalTexture = js.native
  def createRenderTargetTexture(size: js.Any, options: RenderTargetCreationOptions): InternalTexture = js.native
  
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
    onError: js.UndefOr[Nullable[js.Function2[/* message */ String, /* exception */ js.Any, Unit]]],
    buffer: js.UndefOr[
      Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap]
    ],
    fallback: js.UndefOr[Nullable[InternalTexture]],
    format: js.UndefOr[Nullable[Double]],
    forcedExtension: js.UndefOr[Nullable[String]],
    mimeType: js.UndefOr[String]
  ): InternalTexture = js.native
  
  /**
    * Set the value of an uniform to a boolean
    * @param uniform defines the webGL uniform location where to store the value
    * @param bool defines the boolean to store
    * @returns true if value was set
    */
  def setBool(uniform: WebGLUniformLocation, bool: Double): Boolean = js.native
  
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
    premulAlpha: Boolean
  ): Unit = js.native
  def updateDynamicTexture(
    texture: Nullable[InternalTexture],
    canvas: HTMLCanvasElement,
    invertY: Boolean,
    premulAlpha: Boolean,
    format: Double
  ): Unit = js.native
  def updateDynamicTexture(
    texture: Nullable[InternalTexture],
    canvas: HTMLCanvasElement,
    invertY: Boolean,
    premulAlpha: Unit,
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
  def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Double): Unit = js.native
  def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Double, byteLength: Double): Unit = js.native
  def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Unit, byteLength: Double): Unit = js.native
}
