package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidRenderingTextures extends StObject {
  
  /* private */ var _blurNumIterations: Any = js.native
  
  /* protected */ var _blurPostProcesses: Nullable[js.Array[PostProcess]] = js.native
  
  /* protected */ var _blurTextureFormat: Double = js.native
  
  /* protected */ var _blurTextureSizeX: Double = js.native
  
  /* protected */ var _blurTextureSizeY: Double = js.native
  
  /* protected */ var _blurTextureType: Double = js.native
  
  /* protected */ var _camera: Nullable[Camera] = js.native
  
  /* protected */ def _createBlurPostProcesses(
    textureBlurSource: ThinTexture,
    textureType: Double,
    textureFormat: Double,
    blurSizeDivisor: Double,
    debugName: String
  ): js.Tuple3[RenderTargetWrapper, Texture, js.Array[PostProcess]] = js.native
  /* protected */ def _createBlurPostProcesses(
    textureBlurSource: ThinTexture,
    textureType: Double,
    textureFormat: Double,
    blurSizeDivisor: Double,
    debugName: String,
    useStandardBlur: Boolean
  ): js.Tuple3[RenderTargetWrapper, Texture, js.Array[PostProcess]] = js.native
  
  /* protected */ def _createRenderTarget(): Unit = js.native
  
  /* protected */ var _engine: Engine = js.native
  
  /* private */ var _fixReusablePostProcess: Any = js.native
  
  /* protected */ var _generateDepthBuffer: Boolean = js.native
  
  /* private */ var _getDepthThreshold: Any = js.native
  
  /* private */ var _getProjectedParticleConstant: Any = js.native
  
  /* protected */ var _height: Double = js.native
  
  /* protected */ var _name: String = js.native
  
  /* protected */ var _postProcessRunningIndex: Double = js.native
  
  /* protected */ var _rt: Nullable[RenderTargetWrapper] = js.native
  
  /* protected */ var _rtBlur: Nullable[RenderTargetWrapper] = js.native
  
  /* protected */ var _samples: Double = js.native
  
  /* protected */ var _scene: Scene = js.native
  
  /* protected */ var _texture: Nullable[Texture] = js.native
  
  /* protected */ var _textureBlurred: Nullable[Texture] = js.native
  
  /* protected */ var _textureFormat: Double = js.native
  
  /* protected */ var _textureType: Double = js.native
  
  /* protected */ var _useStandardBlur: Boolean = js.native
  
  /* protected */ var _width: Double = js.native
  
  def applyBlurPostProcesses(): Unit = js.native
  
  var blurDepthScale: Double = js.native
  
  var blurFilterSize: Double = js.native
  
  var blurMaxFilterSize: Double = js.native
  
  def blurNumIterations: Double = js.native
  def blurNumIterations_=(numIterations: Double): Unit = js.native
  
  var blurSizeDivisor: Double = js.native
  
  def dispose(): Unit = js.native
  
  var enableBlur: Boolean = js.native
  
  def initialize(): Unit = js.native
  
  var onDisposeObservable: Observable[FluidRenderingTextures] = js.native
  
  var particleSize: Double = js.native
  
  def renderTarget: Nullable[RenderTargetWrapper] = js.native
  
  def renderTargetBlur: Nullable[RenderTargetWrapper] = js.native
  
  def texture: Nullable[Texture] = js.native
  
  def textureBlur: Nullable[Texture] = js.native
}
