package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Width
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathMod.Color3
import typings.babylonjs.mathMod.Matrix
import typings.babylonjs.mathMod.Viewport
import typings.babylonjs.renderTargetCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.Nullable
import typings.std.Float32Array
import typings.std.WebGLVertexArrayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeEngineMod {
  
  @JSImport("babylonjs/Engines/nativeEngine", "NativeEngine")
  @js.native
  class NativeEngine () extends Engine {
    
    /** Defines the invalid handle returned by bgfx when resource creation goes wrong */
    /* private */ val INVALID_HANDLE: js.Any = js.native
    
    /* private */ var _boundBuffersVertexArray: js.Any = js.native
    
    /* private */ var _currentDepthTest: js.Any = js.native
    
    /* protected */ def _deleteBuffer(buffer: NativeDataBuffer): Unit = js.native
    
    /* private */ var _getAddressMode: js.Any = js.native
    
    /* private */ var _getNativeAlphaMode: js.Any = js.native
    
    /* private */ var _getNativeAttribType: js.Any = js.native
    
    /* private */ var _getNativeSamplingMode: js.Any = js.native
    
    /* private */ var _getNativeTextureFormat: js.Any = js.native
    
    /* private */ val _native: js.Any = js.native
    
    /* protected */ def _recordVertexArrayObject(
      vertexArray: js.Any,
      vertexBuffers: StringDictionary[VertexBuffer],
      indexBuffer: Nullable[NativeDataBuffer],
      effect: Effect
    ): Unit = js.native
    
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
    
    /* private */ var _updateAnisotropicLevel: js.Any = js.native
    
    def bindBuffers(
      vertexBuffers: StringDictionary[VertexBuffer],
      indexBuffer: Nullable[NativeDataBuffer],
      effect: Effect
    ): Unit = js.native
    
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
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: js.UndefOr[Boolean],
      onLoad: js.UndefOr[Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
          ]
        ],
      format: js.UndefOr[Double],
      forcedExtension: js.UndefOr[js.Any],
      createPolynomials: js.UndefOr[Boolean],
      lodScale: js.UndefOr[Double],
      lodOffset: js.UndefOr[Double],
      fallback: js.UndefOr[Nullable[InternalTexture]]
    ): InternalTexture = js.native
    
    def createRenderTargetTexture(size: Double, options: Boolean): NativeTexture = js.native
    def createRenderTargetTexture(size: Double, options: RenderTargetCreationOptions): NativeTexture = js.native
    def createRenderTargetTexture(size: Width, options: Boolean): NativeTexture = js.native
    def createRenderTargetTexture(size: Width, options: RenderTargetCreationOptions): NativeTexture = js.native
    
    def createVertexBuffer(data: DataArray, updateable: Boolean): NativeDataBuffer = js.native
    
    def recordVertexArrayObject(
      vertexBuffers: StringDictionary[VertexBuffer],
      indexBuffer: Nullable[NativeDataBuffer],
      effect: Effect
    ): WebGLVertexArrayObject = js.native
    
    def setColor3(uniform: WebGLUniformLocation, color3: Color3): Boolean = js.native
    
    def setColor4(uniform: WebGLUniformLocation, color3: Color3, alpha: Double): Boolean = js.native
    
    def setFloatArray(uniform: WebGLUniformLocation, array: Float32Array): Boolean = js.native
    
    def setFloatArray2(uniform: WebGLUniformLocation, array: Float32Array): Boolean = js.native
    
    def setFloatArray3(uniform: WebGLUniformLocation, array: Float32Array): Boolean = js.native
    
    def setFloatArray4(uniform: WebGLUniformLocation, array: Float32Array): Boolean = js.native
    
    def setMatrix(uniform: WebGLUniformLocation, matrix: Matrix): Unit = js.native
    
    def setViewport(viewport: Viewport): Unit = js.native
    def setViewport(viewport: Viewport, requiredWidth: Double): Unit = js.native
    def setViewport(viewport: Viewport, requiredWidth: Double, requiredHeight: Double): Unit = js.native
    def setViewport(viewport: Viewport, requiredWidth: Unit, requiredHeight: Double): Unit = js.native
    
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
  }
  
  /**
    * Container for accessors for natively-stored mesh data buffers.
    */
  @js.native
  trait NativeDataBuffer extends DataBuffer {
    
    /**
      * Accessor value used to identify/retrieve a natively-stored index buffer.
      */
    var nativeIndexBuffer: js.UndefOr[js.Any] = js.native
    
    /**
      * Accessor value used to identify/retrieve a natively-stored vertex buffer.
      */
    var nativeVertexBuffer: js.UndefOr[js.Any] = js.native
  }
  
  /** @hidden */
  @js.native
  trait NativeTexture extends InternalTexture {
    
    def getInternalTexture(): InternalTexture = js.native
    
    def getViewCount(): Double = js.native
  }
}
