package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLProgram
import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.WebGLUniformLocation
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NullEngine")
@js.native
class NullEngine () extends Engine {
  def this(options: NullEngineOptions) = this()
  var _options: js.Any = js.native
  /** @hidden */
  def _bindTexture(channel: Double, texture: InternalTexture): Unit = js.native
  /** @hidden */
  def _bindTextureDirectly(target: Double, texture: InternalTexture): Boolean = js.native
  /* protected */ def _deleteBuffer(buffer: WebGLBuffer): Unit = js.native
  /**
    * Bind webGl buffers directly to the webGL context
    * @param vertexBuffers defines the vertex buffer to bind
    * @param indexBuffer defines the index buffer to bind
    * @param vertexDeclaration defines the vertex declaration to use with the vertex buffer
    * @param vertexStrideSize defines the vertex stride of the vertex buffer
    * @param effect defines the effect associated with the vertex buffer
    */
  def bindBuffers(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: DataBuffer,
    effect: Effect
  ): Unit = js.native
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
    * Activates an effect, mkaing it the current one (ie. the one used for rendering)
    * @param effect defines the effect to activate
    */
  def enableEffect(effect: Effect): Unit = js.native
  /**
    * Set the value of an uniform to an array of number
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    */
  def setArray(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  /**
    * Set the value of an uniform to an array of number (stored as vec2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    */
  def setArray2(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  /**
    * Set the value of an uniform to an array of number (stored as vec3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    */
  def setArray3(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  /**
    * Set the value of an uniform to an array of number (stored as vec4)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    */
  def setArray4(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  /**
    * Set the value of an uniform to a boolean
    * @param uniform defines the webGL uniform location where to store the value
    * @param bool defines the boolean to store
    */
  def setBool(uniform: WebGLUniformLocation, bool: Double): Unit = js.native
  /**
    * Set the value of an uniform to a number (float)
    * @param uniform defines the webGL uniform location where to store the value
    * @param value defines the float number to store
    */
  def setFloat(uniform: WebGLUniformLocation, value: Double): Unit = js.native
  /**
    * Set the value of an uniform to a vec2
    * @param uniform defines the webGL uniform location where to store the value
    * @param x defines the 1st component of the value
    * @param y defines the 2nd component of the value
    */
  def setFloat2(uniform: WebGLUniformLocation, x: Double, y: Double): Unit = js.native
  /**
    * Set the value of an uniform to a vec3
    * @param uniform defines the webGL uniform location where to store the value
    * @param x defines the 1st component of the value
    * @param y defines the 2nd component of the value
    * @param z defines the 3rd component of the value
    */
  def setFloat3(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double): Unit = js.native
  /**
    * Set the value of an uniform to a vec4
    * @param uniform defines the webGL uniform location where to store the value
    * @param x defines the 1st component of the value
    * @param y defines the 2nd component of the value
    * @param z defines the 3rd component of the value
    * @param w defines the 4th component of the value
    */
  def setFloat4(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  /**
    * Set the value of an uniform to an array of float32
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of float32 to store
    */
  def setFloatArray(uniform: WebGLUniformLocation, array: Float32Array): Unit = js.native
  /**
    * Set the value of an uniform to an array of float32 (stored as vec2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of float32 to store
    */
  def setFloatArray2(uniform: WebGLUniformLocation, array: Float32Array): Unit = js.native
  /**
    * Set the value of an uniform to an array of float32 (stored as vec3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of float32 to store
    */
  def setFloatArray3(uniform: WebGLUniformLocation, array: Float32Array): Unit = js.native
  /**
    * Set the value of an uniform to an array of float32 (stored as vec4)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of float32 to store
    */
  def setFloatArray4(uniform: WebGLUniformLocation, array: Float32Array): Unit = js.native
  /**
    * Set the value of an uniform to an array of int32
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    */
  def setIntArray(uniform: WebGLUniformLocation, array: Int32Array): Unit = js.native
  /**
    * Set the value of an uniform to an array of int32 (stored as vec2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    */
  def setIntArray2(uniform: WebGLUniformLocation, array: Int32Array): Unit = js.native
  /**
    * Set the value of an uniform to an array of int32 (stored as vec3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    */
  def setIntArray3(uniform: WebGLUniformLocation, array: Int32Array): Unit = js.native
  /**
    * Set the value of an uniform to an array of int32 (stored as vec4)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    */
  def setIntArray4(uniform: WebGLUniformLocation, array: Int32Array): Unit = js.native
  /**
    * Set the value of an uniform to an array of float32 (stored as matrices)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrices defines the array of float32 to store
    */
  def setMatrices(uniform: WebGLUniformLocation, matrices: Float32Array): Unit = js.native
  /**
    * Set the value of an uniform to a matrix (2x2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrix defines the Float32Array representing the 2x2 matrix to store
    */
  def setMatrix2x2(uniform: WebGLUniformLocation, matrix: Float32Array): Unit = js.native
  /**
    * Set the value of an uniform to a matrix (3x3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrix defines the Float32Array representing the 3x3 matrix to store
    */
  def setMatrix3x3(uniform: WebGLUniformLocation, matrix: Float32Array): Unit = js.native
  /**
    * Update a dynamic index buffer
    * @param indexBuffer defines the target index buffer
    * @param indices defines the data to update
    * @param offset defines the offset in the target index buffer where update should start
    */
  def updateDynamicIndexBuffer(indexBuffer: WebGLBuffer, indices: IndicesArray): Unit = js.native
  def updateDynamicIndexBuffer(indexBuffer: WebGLBuffer, indices: IndicesArray, offset: Double): Unit = js.native
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
}

