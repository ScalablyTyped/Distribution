package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLUniformLocation
import typings.babylonjs.anon.Height
import typings.std.WebGLFramebuffer
import typings.std.WebGLVertexArrayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeEngine
  extends StObject
     with Engine {
  
  /**
    * @internal
    */
  def _bindTexture(channel: Double, texture: InternalTexture): Unit = js.native
  
  /* private */ var _boundBuffersVertexArray: Any = js.native
  
  /* private */ val _camera: Any = js.native
  
  /* private */ val _commandBufferEncoder: Any = js.native
  
  /* private */ var _currentDepthTest: Any = js.native
  
  /* protected */ def _deleteBuffer(buffer: NativeDataBuffer): Unit = js.native
  
  /* private */ var _deleteVertexArray: Any = js.native
  
  /* private */ var _depthWrite: Any = js.native
  
  /* private */ val _engine: Any = js.native
  
  /* private */ var _getAddressMode: Any = js.native
  
  /* private */ var _getNativeAlphaMode: Any = js.native
  
  /* private */ var _getNativeAttribType: Any = js.native
  
  /* private */ var _getNativeSamplingMode: Any = js.native
  
  /* private */ var _getNativeTextureFormat: Any = js.native
  
  /* private */ var _getStencilDepthFail: Any = js.native
  
  /* private */ var _getStencilDepthPass: Any = js.native
  
  /* private */ var _getStencilFunc: Any = js.native
  
  /* private */ var _getStencilOpFail: Any = js.native
  
  def _preparePipelineContext(
    pipelineContext: IPipelineContext,
    vertexSourceCode: String,
    fragmentSourceCode: String,
    createAsRaw: Boolean,
    rawVertexSourceCode: String,
    rawFragmentSourceCode: String,
    rebuildRebind: Any,
    defines: Nullable[String],
    transformFeedbackVaryings: Nullable[js.Array[String]]
  ): Unit = js.native
  
  /* protected */ def _recordVertexArrayObject(
    vertexArray: Any,
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: Nullable[NativeDataBuffer],
    effect: Effect
  ): Unit = js.native
  /* protected */ def _recordVertexArrayObject(
    vertexArray: Any,
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: Nullable[NativeDataBuffer],
    effect: Effect,
    overrideVertexBuffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]]
  ): Unit = js.native
  
  /**
    * @internal
    */
  def _releaseFramebufferObjects(framebuffer: Nullable[WebGLFramebuffer]): Unit = js.native
  
  /* private */ var _setStencil: Any = js.native
  
  /* protected */ def _setTexture(channel: Double, texture: Nullable[BaseTexture]): Boolean = js.native
  /* protected */ def _setTexture(channel: Double, texture: Nullable[BaseTexture], isPartOfTextureArray: Boolean): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Boolean,
    depthStencilTexture: Boolean
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Unit,
    depthStencilTexture: Boolean
  ): Boolean = js.native
  
  /* private */ var _setTextureCore: Any = js.native
  
  /* private */ var _setTextureSampling: Any = js.native
  
  /* private */ var _setTextureWrapMode: Any = js.native
  
  /* private */ var _stencilFunc: Any = js.native
  
  /* private */ var _stencilFuncMask: Any = js.native
  
  /* private */ var _stencilFuncRef: Any = js.native
  
  /* private */ var _stencilMask: Any = js.native
  
  /* private */ var _stencilOpDepthFail: Any = js.native
  
  /* private */ var _stencilOpStencilDepthPass: Any = js.native
  
  /* private */ var _stencilOpStencilFail: Any = js.native
  
  /* private */ var _stencilTest: Any = js.native
  
  /* private */ var _updateAnisotropicLevel: Any = js.native
  
  /* private */ var _zOffset: Any = js.native
  
  /* private */ var _zOffsetUnits: Any = js.native
  
  /* private */ var applyStencil: Any = js.native
  
  def bindBuffers(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: Nullable[NativeDataBuffer],
    effect: Effect
  ): Unit = js.native
  
  def bindFramebuffer(texture: RenderTargetWrapper): Unit = js.native
  def bindFramebuffer(texture: RenderTargetWrapper, faceIndex: Double): Unit = js.native
  def bindFramebuffer(texture: RenderTargetWrapper, faceIndex: Double, requiredWidth: Double): Unit = js.native
  def bindFramebuffer(texture: RenderTargetWrapper, faceIndex: Double, requiredWidth: Double, requiredHeight: Double): Unit = js.native
  def bindFramebuffer(
    texture: RenderTargetWrapper,
    faceIndex: Double,
    requiredWidth: Double,
    requiredHeight: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(
    texture: RenderTargetWrapper,
    faceIndex: Double,
    requiredWidth: Double,
    requiredHeight: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(texture: RenderTargetWrapper, faceIndex: Double, requiredWidth: Unit, requiredHeight: Double): Unit = js.native
  def bindFramebuffer(
    texture: RenderTargetWrapper,
    faceIndex: Double,
    requiredWidth: Unit,
    requiredHeight: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(
    texture: RenderTargetWrapper,
    faceIndex: Double,
    requiredWidth: Unit,
    requiredHeight: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(texture: RenderTargetWrapper, faceIndex: Unit, requiredWidth: Double): Unit = js.native
  def bindFramebuffer(texture: RenderTargetWrapper, faceIndex: Unit, requiredWidth: Double, requiredHeight: Double): Unit = js.native
  def bindFramebuffer(
    texture: RenderTargetWrapper,
    faceIndex: Unit,
    requiredWidth: Double,
    requiredHeight: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(
    texture: RenderTargetWrapper,
    faceIndex: Unit,
    requiredWidth: Double,
    requiredHeight: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(texture: RenderTargetWrapper, faceIndex: Unit, requiredWidth: Unit, requiredHeight: Double): Unit = js.native
  def bindFramebuffer(
    texture: RenderTargetWrapper,
    faceIndex: Unit,
    requiredWidth: Unit,
    requiredHeight: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def bindFramebuffer(
    texture: RenderTargetWrapper,
    faceIndex: Unit,
    requiredWidth: Unit,
    requiredHeight: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  
  def bindVertexArrayObject(vertexArray: WebGLVertexArrayObject): Unit = js.native
  
  /**
    * Creates a cube texture
    * @param rootUrl defines the url where the files to load is located
    * @param scene defines the current scene
    * @param files defines the list of files to load (1 per face)
    * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
    * @param onLoad defines an optional callback raised when the texture is loaded
    * @param onError defines an optional callback raised if there is an issue to load the texture
    * @param format defines the format of the data
    * @param forcedExtension defines the extension to use to pick the right loader
    * @param createPolynomials if a polynomial sphere should be created for the cube texture
    * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
    * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
    * @param fallback defines texture to use while falling back when (compressed) texture file not found.
    * @param loaderOptions options to be passed to the loader
    * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
    * @returns the cube texture as an InternalTexture
    */
  def createCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    files: Nullable[js.Array[String]],
    noMipmap: js.UndefOr[Boolean],
    onLoad: js.UndefOr[Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
    ],
    format: js.UndefOr[Double],
    forcedExtension: js.UndefOr[Any],
    createPolynomials: js.UndefOr[Boolean],
    lodScale: js.UndefOr[Double],
    lodOffset: js.UndefOr[Double],
    fallback: js.UndefOr[Nullable[InternalTexture]],
    loaderOptions: js.UndefOr[Any],
    useSRGBBuffer: js.UndefOr[Boolean]
  ): InternalTexture = js.native
  
  def createPipelineContext(): IPipelineContext = js.native
  
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Unit,
    `type`: Double
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Unit,
    `type`: Double,
    creationFlags: Double
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Unit,
    `type`: Double,
    creationFlags: Double,
    useSRGBBuffer: Boolean
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Unit,
    `type`: Double,
    creationFlags: Unit,
    useSRGBBuffer: Boolean
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Unit,
    `type`: Unit,
    creationFlags: Double
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Unit,
    `type`: Unit,
    creationFlags: Double,
    useSRGBBuffer: Boolean
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Unit,
    `type`: Unit,
    creationFlags: Unit,
    useSRGBBuffer: Boolean
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Nullable[String]
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Nullable[String],
    `type`: Unit,
    creationFlags: Double
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Nullable[String],
    `type`: Unit,
    creationFlags: Double,
    useSRGBBuffer: Boolean
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Nullable[String],
    `type`: Unit,
    creationFlags: Unit,
    useSRGBBuffer: Boolean
  ): InternalTexture = js.native
  
  def createRawTexture2DArray(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): InternalTexture = js.native
  def createRawTexture2DArray(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Unit,
    textureType: Double
  ): InternalTexture = js.native
  def createRawTexture2DArray(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Nullable[String]
  ): InternalTexture = js.native
  
  def createRenderTargetTexture(size: Double, options: Boolean): RenderTargetWrapper = js.native
  def createRenderTargetTexture(size: Double, options: RenderTargetCreationOptions): RenderTargetWrapper = js.native
  def createRenderTargetTexture(size: Height, options: Boolean): RenderTargetWrapper = js.native
  def createRenderTargetTexture(size: Height, options: RenderTargetCreationOptions): RenderTargetWrapper = js.native
  
  def createVertexBuffer(vertices: DataArray, updateable: Boolean): NativeDataBuffer = js.native
  
  def recordVertexArrayObject(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: Nullable[NativeDataBuffer],
    effect: Effect
  ): WebGLVertexArrayObject = js.native
  def recordVertexArrayObject(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: Nullable[NativeDataBuffer],
    effect: Effect,
    overrideVertexBuffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]]
  ): WebGLVertexArrayObject = js.native
  
  def setColor3(uniform: WebGLUniformLocation, color3: IColor3Like): Boolean = js.native
  
  def setColor4(uniform: WebGLUniformLocation, color3: IColor3Like, alpha: Double): Boolean = js.native
  
  def setFloatArray(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Boolean = js.native
  
  def setFloatArray2(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Boolean = js.native
  
  def setFloatArray3(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Boolean = js.native
  
  def setFloatArray4(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Boolean = js.native
  
  def setMatrix(uniform: WebGLUniformLocation, matrix: IMatrixLike): Unit = js.native
  
  /**
    * Update the content of a dynamic texture
    * @param texture defines the texture to update
    * @param canvas defines the canvas containing the source
    * @param invertY defines if data must be stored with Y axis inverted
    * @param premulAlpha defines if alpha is stored as premultiplied
    * @param format defines the format of the data
    */
  def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: Any, invertY: Boolean): Unit = js.native
  def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: Any, invertY: Boolean, premulAlpha: Boolean): Unit = js.native
  def updateDynamicTexture(
    texture: Nullable[InternalTexture],
    canvas: Any,
    invertY: Boolean,
    premulAlpha: Boolean,
    format: Double
  ): Unit = js.native
  def updateDynamicTexture(
    texture: Nullable[InternalTexture],
    canvas: Any,
    invertY: Boolean,
    premulAlpha: Unit,
    format: Double
  ): Unit = js.native
  
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    bufferView: Nullable[js.typedarray.ArrayBufferView],
    format: Double,
    invertY: Boolean,
    compression: Unit,
    `type`: Double
  ): Unit = js.native
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    bufferView: Nullable[js.typedarray.ArrayBufferView],
    format: Double,
    invertY: Boolean,
    compression: Unit,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): Unit = js.native
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    bufferView: Nullable[js.typedarray.ArrayBufferView],
    format: Double,
    invertY: Boolean,
    compression: Unit,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): Unit = js.native
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    bufferView: Nullable[js.typedarray.ArrayBufferView],
    format: Double,
    invertY: Boolean,
    compression: Nullable[String]
  ): Unit = js.native
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    bufferView: Nullable[js.typedarray.ArrayBufferView],
    format: Double,
    invertY: Boolean,
    compression: Nullable[String],
    `type`: Double
  ): Unit = js.native
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    bufferView: Nullable[js.typedarray.ArrayBufferView],
    format: Double,
    invertY: Boolean,
    compression: Nullable[String],
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): Unit = js.native
  
  /**
    * Wraps an external native texture in a Babylon texture.
    * @param texture defines the external texture
    * @returns the babylon internal texture
    */
  def wrapNativeTexture(texture: Any): InternalTexture = js.native
  
  /**
    * Wraps an external web gl texture in a Babylon texture.
    * @returns the babylon internal texture
    */
  def wrapWebGLTexture(): InternalTexture = js.native
}
