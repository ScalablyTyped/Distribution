package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidRenderingTargetRenderer extends StObject {
  
  /** @internal */
  var _bgDepthTexture: Nullable[InternalTexture] = js.native
  
  /* private */ var _blurDepthDepthScale: Any = js.native
  
  /* private */ var _blurDepthFilterSize: Any = js.native
  
  /* private */ var _blurDepthMaxFilterSize: Any = js.native
  
  /* private */ var _blurDepthNumIterations: Any = js.native
  
  /* private */ var _blurDepthSizeDivisor: Any = js.native
  
  /* private */ var _blurThicknessFilterSize: Any = js.native
  
  /* private */ var _blurThicknessNumIterations: Any = js.native
  
  /* private */ var _blurThicknessSizeDivisor: Any = js.native
  
  /* protected */ var _camera: Nullable[Camera] = js.native
  
  /** @internal */
  def _clearTargets(): Unit = js.native
  
  /* protected */ def _createLiquidRenderingPostProcess(): Unit = js.native
  
  /* private */ var _debug: Any = js.native
  
  /* private */ var _debugFeature: Any = js.native
  
  /* protected */ var _depthClearColor: Color4 = js.native
  
  /* private */ var _depthMapSize: Any = js.native
  
  /** @internal */
  var _depthRenderTarget: Nullable[FluidRenderingTextures] = js.native
  
  /* private */ var _diffuseMapSize: Any = js.native
  
  /** @internal */
  var _diffuseRenderTarget: Nullable[FluidRenderingTextures] = js.native
  
  /* private */ var _enableBlurDepth: Any = js.native
  
  /* private */ var _enableBlurThickness: Any = js.native
  
  /* protected */ var _engine: Engine = js.native
  
  /* private */ var _environmentMap: Any = js.native
  
  /* private */ var _generateDiffuseTexture: Any = js.native
  
  /** @internal */
  def _initialize(): Unit = js.native
  
  /* protected */ def _initializeRenderTarget(renderTarget: FluidRenderingTextures): Unit = js.native
  
  /* protected */ var _invProjectionMatrix: Matrix = js.native
  
  /* protected */ var _needInitialization: Boolean = js.native
  
  /** @internal */
  var _onUseVelocityChanged: Observable[FluidRenderingTargetRenderer] = js.native
  
  /** @internal */
  def _render(fluidObject: FluidRenderingObject): Unit = js.native
  
  /** @internal */
  var _renderPostProcess: Nullable[PostProcess] = js.native
  
  /* private */ var _samples: Any = js.native
  
  /* protected */ var _scene: Scene = js.native
  
  /* protected */ def _setBlurDepthParameters(): Unit = js.native
  
  /* protected */ def _setBlurParameters(): Unit = js.native
  /* protected */ def _setBlurParameters(renderTarget: Nullable[FluidRenderingTextures]): Unit = js.native
  
  /* protected */ def _setBlurThicknessParameters(): Unit = js.native
  
  /* protected */ var _thicknessClearColor: Color4 = js.native
  
  /* private */ var _thicknessMapSize: Any = js.native
  
  /** @internal */
  var _thicknessRenderTarget: Nullable[FluidRenderingTextures] = js.native
  
  /* private */ var _useFixedThickness: Any = js.native
  
  /* private */ var _useVelocity: Any = js.native
  
  /**
    * Depth weight in the calculation when applying the bilateral blur to generate the depth blur texture (positive number, generally between 0 and 100)
    */
  def blurDepthDepthScale: Double = js.native
  def blurDepthDepthScale_=(scale: Double): Unit = js.native
  
  /**
    * Size of the kernel used to filter the depth blur texture (positive number, generally between 1 and 20 - higher values will require more processing power from the GPU)
    */
  def blurDepthFilterSize: Double = js.native
  def blurDepthFilterSize_=(filterSize: Double): Unit = js.native
  
  /**
    * Maximum size of the kernel used to blur the depth texture (positive number, generally between 1 and 200 - higher values will require more processing power from the GPU when the particles are larger on screen)
    */
  def blurDepthMaxFilterSize: Double = js.native
  def blurDepthMaxFilterSize_=(maxFilterSize: Double): Unit = js.native
  
  /**
    * Number of blurring iterations used to generate the depth blur texture (positive number, generally between 1 and 10 - higher values will require more processing power from the GPU)
    */
  def blurDepthNumIterations: Double = js.native
  def blurDepthNumIterations_=(numIterations: Double): Unit = js.native
  
  /**
    * Gets or sets the depth size divisor (positive number, generally between 1 and 4), which is used as a divisor when creating the texture used for blurring the depth
    * For eg. if blurDepthSizeDivisor=2, the texture used to blur the depth will be half the size of the depth texture
    */
  def blurDepthSizeDivisor: Double = js.native
  def blurDepthSizeDivisor_=(scale: Double): Unit = js.native
  
  /**
    * Size of the kernel used to filter the thickness blur texture (positive number, generally between 1 and 20 - higher values will require more processing power from the GPU)
    */
  def blurThicknessFilterSize: Double = js.native
  def blurThicknessFilterSize_=(filterSize: Double): Unit = js.native
  
  /**
    * Number of blurring iterations used to generate the thickness blur texture (positive number, generally between 1 and 10 - higher values will require more processing power from the GPU)
    */
  def blurThicknessNumIterations: Double = js.native
  def blurThicknessNumIterations_=(numIterations: Double): Unit = js.native
  
  /**
    * Gets or sets the thickness size divisor (positive number, generally between 1 and 4), which is used as a divisor when creating the texture used for blurring the thickness
    * For eg. if blurThicknessSizeDivisor=2, the texture used to blur the thickness will be half the size of the thickness texture
    */
  def blurThicknessSizeDivisor: Double = js.native
  def blurThicknessSizeDivisor_=(scale: Double): Unit = js.native
  
  /**
    * Gets the camera used for the rendering
    */
  def camera: Nullable[Camera] = js.native
  
  /**
    * Gets or sets a boolean indicating if we should display a specific texture (given by debugFeature) for debugging purpose
    */
  def debug: Boolean = js.native
  
  /**
    * Gets or sets the feature (texture) to be debugged. Not used if debug is false
    */
  def debugFeature: FluidRenderingDebug = js.native
  def debugFeature_=(feature: FluidRenderingDebug): Unit = js.native
  
  def debug_=(debug: Boolean): Unit = js.native
  
  /**
    * Density of the fluid (positive number). The higher the value, the more opaque the fluid.
    */
  var density: Double = js.native
  
  /**
    * Defines the size of the depth texture.
    * If null, the texture will have the size of the screen
    */
  def depthMapSize: Nullable[Double] = js.native
  def depthMapSize_=(size: Nullable[Double]): Unit = js.native
  
  /**
    * Defines the size of the diffuse texture.
    * If null, the texture will have the size of the screen
    */
  def diffuseMapSize: Nullable[Double] = js.native
  def diffuseMapSize_=(size: Nullable[Double]): Unit = js.native
  
  /**
    * Direction of the light. The fluid is assumed to be lit by a directional light
    */
  var dirLight: Vector3 = js.native
  
  /**
    * Releases all the ressources used by the class
    * @param onlyPostProcesses If true, releases only the ressources used by the render post processes
    */
  def dispose(): Unit = js.native
  def dispose(onlyPostProcesses: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that the depth texture should be blurred
    */
  def enableBlurDepth: Boolean = js.native
  def enableBlurDepth_=(enable: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that the thickness texture should be blurred
    */
  def enableBlurThickness: Boolean = js.native
  def enableBlurThickness_=(enable: Boolean): Unit = js.native
  
  /**
    * Gets or sets the environment map used for the reflection part of the shading
    * If null, no map will be used. If undefined, the scene.environmentMap will be used (if defined)
    */
  def environmentMap: js.UndefOr[Nullable[BaseTexture]] = js.native
  def environmentMap_=(map: js.UndefOr[Nullable[BaseTexture]]): Unit = js.native
  
  /**
    * Fluid color. Not used if generateDiffuseTexture is true
    */
  var fluidColor: Color3 = js.native
  
  /**
    * Strength of the fresnel effect (value between 0 and 1). Lower the value if you want to soften the specular effect
    */
  var fresnelClamp: Double = js.native
  
  /**
    * Gets or sets a boolean indicating that the diffuse texture should be generated and used for the rendering
    */
  def generateDiffuseTexture: Boolean = js.native
  def generateDiffuseTexture_=(generate: Boolean): Unit = js.native
  
  /**
    * Minimum thickness of the particles (positive number). If useFixedThickness is true, minimumThickness is the thickness used
    */
  var minimumThickness: Double = js.native
  
  /**
    * Returns true if the class needs to be reinitialized (because of changes in parameterization)
    */
  def needInitialization: Boolean = js.native
  
  /**
    * Strength of the refraction (positive number, but generally between 0 and 0.3).
    */
  var refractionStrength: Double = js.native
  
  /**
    * Gets or sets the number of samples used by MSAA
    * Note: changing this value in WebGL does not work because depth/stencil textures can't be created with MSAA (see https://github.com/BabylonJS/Babylon.js/issues/12444)
    */
  def samples: Double = js.native
  def samples_=(samples: Double): Unit = js.native
  
  /**
    * Strength of the specular power (positive number). Increase the value to make the specular effect more concentrated
    */
  var specularPower: Double = js.native
  
  /**
    * Defines the size of the thickness texture.
    * If null, the texture will have the size of the screen
    */
  def thicknessMapSize: Nullable[Double] = js.native
  def thicknessMapSize_=(size: Nullable[Double]): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that a fixed thickness should be used instead of generating a thickness texture
    */
  def useFixedThickness: Boolean = js.native
  def useFixedThickness_=(use: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that the velocity should be used when rendering the particles as a fluid.
    * Note: the vertex buffers must contain a "velocity" buffer for this to work!
    */
  def useVelocity: Boolean = js.native
  def useVelocity_=(use: Boolean): Unit = js.native
}
