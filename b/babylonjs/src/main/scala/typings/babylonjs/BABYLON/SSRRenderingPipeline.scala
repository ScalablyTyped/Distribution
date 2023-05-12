package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSRRenderingPipeline
  extends StObject
     with PostProcessRenderPipeline {
  
  /**
    * The blur PostProcess effect id in the pipeline
    */
  var SSRBlurRenderEffect: String = js.native
  
  /**
    * The PostProcess effect id in the pipeline that combines the SSR-Blur output with the original scene color
    */
  var SSRCombineRenderEffect: String = js.native
  
  /**
    * The SSR PostProcess effect id in the pipeline
    */
  var SSRRenderEffect: String = js.native
  
  /* private */ var _attenuateBackfaceReflection: Any = js.native
  
  /* private */ var _attenuateFacingCamera: Any = js.native
  
  /* private */ var _attenuateIntersectionDistance: Any = js.native
  
  /* private */ var _attenuateIntersectionIterations: Any = js.native
  
  /* private */ var _attenuateScreenBorders: Any = js.native
  
  /* private */ var _backfaceDepthTextureDownsample: Any = js.native
  
  /* private */ var _backfaceForceDepthWriteTransparentMeshes: Any = js.native
  
  /* private */ var _blurCombinerPostProcess: Any = js.native
  
  /* private */ var _blurDispersionStrength: Any = js.native
  
  /* private */ var _blurDownsample: Any = js.native
  
  /* private */ var _blurPostProcessX: Any = js.native
  
  /* private */ var _blurPostProcessY: Any = js.native
  
  /* private */ var _buildPipeline: Any = js.native
  
  /* private */ var _camerasToBeAttached: Any = js.native
  
  /* private */ var _clipToFrustum: Any = js.native
  
  /* private */ var _createBlurAndCombinerPostProcesses: Any = js.native
  
  /* private */ var _createSSRPostProcess: Any = js.native
  
  /* private */ var _debug: Any = js.native
  
  /* private */ var _depthRenderer: Any = js.native
  
  /* private */ var _depthRendererCamera: Any = js.native
  
  /* private */ var _disposeDepthRenderer: Any = js.native
  
  /* private */ var _disposePostProcesses: Any = js.native
  
  /* private */ var _enableAutomaticThicknessComputation: Any = js.native
  
  /* private */ var _enableSmoothReflections: Any = js.native
  
  /* private */ var _environmentTexture: Any = js.native
  
  /* private */ var _environmentTextureIsProbe: Any = js.native
  
  /* private */ var _forceGeometryBuffer: Any = js.native
  
  /* private */ var _generateOutputInGammaSpace: Any = js.native
  
  /* private */ def _geometryBufferRenderer: Any = js.native
  
  /* private */ var _getTextureSize: Any = js.native
  
  /* private */ var _inputTextureColorIsInGammaSpace: Any = js.native
  
  /* private */ var _isDirty: Any = js.native
  
  /* private */ var _isEnabled: Any = js.native
  
  /* private */ def _prePassRenderer: Any = js.native
  
  /* private */ var _resizeDepthRenderer: Any = js.native
  
  /* private */ var _samples: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _ssrDownsample: Any = js.native
  
  /* private */ var _ssrPostProcess: Any = js.native
  
  /* private */ var _textureType: Any = js.native
  
  /* private */ var _updateEffectDefines: Any = js.native
  
  /* private */ var _useBlur: Any = js.native
  
  /**
    * Adds a camera to the pipeline
    * @param camera the camera to be added
    */
  def addCamera(camera: Camera): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the backface reflections should be attenuated (default: false).
    */
  def attenuateBackfaceReflection: Boolean = js.native
  def attenuateBackfaceReflection_=(attenuate: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the reflections should be attenuated when the reflection ray is facing the camera (the view direction) (default: false).
    */
  def attenuateFacingCamera: Boolean = js.native
  def attenuateFacingCamera_=(attenuate: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the reflections should be attenuated according to the distance of the intersection (default: true).
    */
  def attenuateIntersectionDistance: Boolean = js.native
  def attenuateIntersectionDistance_=(attenuate: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the reflections should be attenuated according to the number of iterations performed to find the intersection (default: true).
    */
  def attenuateIntersectionIterations: Boolean = js.native
  def attenuateIntersectionIterations_=(attenuate: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the reflections should be attenuated at the screen borders (default: true).
    */
  def attenuateScreenBorders: Boolean = js.native
  def attenuateScreenBorders_=(attenuate: Boolean): Unit = js.native
  
  /**
    * Gets the depth renderer used to render the back faces of the scene to a depth texture.
    */
  def backfaceDepthRenderer: Nullable[DepthRenderer] = js.native
  
  /**
    * Gets or sets the downsample factor (default: 0) used to create the backface depth texture - used only if enableAutomaticThicknessComputation = true.
    * Use 0 to render the depth at full resolution, 1 to render at half resolution, 2 to render at 1/4 resolution, etc.
    * Note that you will get rendering artefacts when using a value different from 0: it's a tradeoff between image quality and performances.
    */
  def backfaceDepthTextureDownsample: Double = js.native
  def backfaceDepthTextureDownsample_=(factor: Double): Unit = js.native
  
  /**
    * Gets or sets a boolean (default: true) indicating if the depth of transparent meshes should be written to the backface depth texture (when automatic thickness computation is enabled).
    */
  def backfaceForceDepthWriteTransparentMeshes: Boolean = js.native
  def backfaceForceDepthWriteTransparentMeshes_=(force: Boolean): Unit = js.native
  
  /**
    * Gets or sets the blur dispersion strength. Set this value to 0 to disable blurring (default: 0.05)
    * The reflections are blurred based on the roughness of the surface and the distance between the pixel shaded and the reflected pixel: the higher the distance the more blurry the reflection is.
    * blurDispersionStrength allows to increase or decrease this effect.
    */
  def blurDispersionStrength: Double = js.native
  def blurDispersionStrength_=(strength: Double): Unit = js.native
  
  /**
    * Gets or sets the downsample factor used to reduce the size of the textures used to blur the reflection effect (default: 0).
    * Use 0 to blur at full resolution, 1 to render at half resolution, 2 to render at 1/3 resolution, etc.
    */
  def blurDownsample: Double = js.native
  def blurDownsample_=(downsample: Double): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the ray should be clipped to the frustum (default: true).
    * You can try to set this parameter to false to save some performances: it may produce some artefacts in some cases, but generally they won't really be visible
    */
  def clipToFrustum: Boolean = js.native
  def clipToFrustum_=(clip: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the effect should be rendered in debug mode (default: false).
    * In this mode, colors have this meaning:
    *   - blue: the ray hit the max distance (we reached maxDistance)
    *   - red: the ray ran out of steps (we reached maxSteps)
    *   - yellow: the ray went off screen
    *   - green: the ray hit a surface. The brightness of the green color is proportional to the distance between the ray origin and the intersection point: A brighter green means more computation than a darker green.
    * In the first 3 cases, the final color is calculated by mixing the skybox color with the pixel color (if environmentTexture is defined), otherwise the pixel color is not modified
    * You should try to get as few blue/red/yellow pixels as possible, as this means that the ray has gone further than if it had hit a surface.
    */
  def debug: Boolean = js.native
  def debug_=(value: Boolean): Unit = js.native
  
  def dispose(disableGeometryBufferRenderer: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean defining if geometry thickness should be computed automatically (default: false).
    * When enabled, a depth renderer is created which will render the back faces of the scene to a depth texture (meaning additional work for the GPU).
    * In that mode, the "thickness" property is still used as an offset to compute the ray intersection, but you can typically use a much lower
    * value than when enableAutomaticThicknessComputation is false (it's even possible to use a value of 0 when using low values for "step")
    * Note that for performance reasons, this option will only apply to the first camera to which the the rendering pipeline is attached!
    */
  def enableAutomaticThicknessComputation: Boolean = js.native
  def enableAutomaticThicknessComputation_=(automatic: Boolean): Unit = js.native
  
  /**
    * Gets or sets whether or not smoothing reflections is enabled (default: false)
    * Enabling smoothing will require more GPU power.
    * Note that this setting has no effect if step = 1: it's only used if step \> 1.
    */
  def enableSmoothReflections: Boolean = js.native
  def enableSmoothReflections_=(enabled: Boolean): Unit = js.native
  
  /**
    * Gets or sets the environment cube texture used to define the reflection when the reflected rays of SSR leave the view space or when the maxDistance/maxSteps is reached.
    */
  def environmentTexture: Nullable[CubeTexture] = js.native
  
  /**
    * Gets or sets the boolean defining if the environment texture is a standard cubemap (false) or a probe (true). Default value is false.
    * Note: a probe cube texture is treated differently than an ordinary cube texture because the Y axis is reversed.
    */
  def environmentTextureIsProbe: Boolean = js.native
  def environmentTextureIsProbe_=(isProbe: Boolean): Unit = js.native
  
  def environmentTexture_=(texture: Nullable[CubeTexture]): Unit = js.native
  
  /**
    * Gets or sets a boolean defining if the output color texture generated by the SSR pipeline should be in gamma space (default: true)
    * If you have a post-process that comes after the SSR and that post-process needs the input to be in a linear space, you must disable generateOutputInGammaSpace
    */
  def generateOutputInGammaSpace: Boolean = js.native
  def generateOutputInGammaSpace_=(gammaSpace: Boolean): Unit = js.native
  
  /**
    * Gets the scene the effect belongs to.
    * @returns the scene the effect belongs to.
    */
  def getScene(): Scene = js.native
  
  /**
    * Gets or sets a boolean defining if the input color texture is in gamma space (default: true)
    * The SSR effect works in linear space, so if the input texture is in gamma space, we must convert the texture to linear space before applying the effect
    */
  def inputTextureColorIsInGammaSpace: Boolean = js.native
  def inputTextureColorIsInGammaSpace_=(gammaSpace: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the effect is enabled (default: true).
    */
  def isEnabled: Boolean = js.native
  def isEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets the maxDistance used to define how far we look for reflection during the ray-marching on the reflected ray (default: 1000).
    * Note that this value is a view (camera) space distance (not pixels!).
    */
  var maxDistance: Double = js.native
  
  /**
    * Maximum number of steps during the ray marching process after which we consider an intersection could not be found (default: 1000).
    * Should be an integer value.
    */
  var maxSteps: Double = js.native
  
  /**
    * Gets or sets the falloff exponent used to compute the reflection strength. Higher values lead to fainter reflections (default: 1).
    */
  var reflectionSpecularFalloffExponent: Double = js.native
  
  /**
    * Gets or sets the minimum value for one of the reflectivity component of the material to consider it for SSR (default: 0.04).
    * If all r/g/b components of the reflectivity is below or equal this value, the pixel will not be considered reflective and SSR won't be applied.
    */
  var reflectivityThreshold: Double = js.native
  
  /**
    * Removes a camera from the pipeline
    * @param camera the camera to remove
    */
  def removeCamera(camera: Camera): Unit = js.native
  
  /**
    * Gets or sets the factor applied when computing roughness. Default value is 0.2.
    * When blurring based on roughness is enabled (meaning blurDispersionStrength \> 0), roughnessFactor is used as a global roughness factor applied on all objects.
    * If you want to disable this global roughness set it to 0.
    */
  var roughnessFactor: Double = js.native
  
  def samples: Double = js.native
  /**
    * MSAA sample count, setting this to 4 will provide 4x anti aliasing. (default: 1)
    */
  def samples_=(sampleCount: Double): Unit = js.native
  
  /**
    * Gets active scene
    */
  def scene: Scene = js.native
  
  /**
    * Number of steps to skip at start when marching the ray to avoid self collisions (default: 1)
    * 1 should normally be a good value, depending on the scene you may need to use a higher value (2 or 3)
    */
  var selfCollisionNumSkip: Double = js.native
  
  /**
    * Serializes the rendering pipeline (Used when exporting)
    * @returns the serialized object
    */
  def serialize(): Any = js.native
  
  /**
    * Gets or sets the downsample factor used to reduce the size of the texture used to compute the SSR contribution (default: 0).
    * Use 0 to render the SSR contribution at full resolution, 1 to render at half resolution, 2 to render at 1/3 resolution, etc.
    * Note that it is used only when blurring is enabled (blurDispersionStrength \> 0), because in that mode the SSR contribution is generated in a separate texture.
    */
  def ssrDownsample: Double = js.native
  def ssrDownsample_=(downsample: Double): Unit = js.native
  
  /**
    * Gets or sets the step size used to iterate until the effect finds the color of the reflection's pixel. Should be an integer \>= 1 as it is the number of pixels we advance at each step (default: 1).
    * Use higher values to improve performances (but at the expense of quality).
    */
  var step: Double = js.native
  
  /**
    * Gets or sets the current reflection strength. 1.0 is an ideal value but can be increased/decreased for particular results (default: 1).
    */
  var strength: Double = js.native
  
  /**
    * Gets or sets the thickness value used as tolerance when computing the intersection between the reflected ray and the scene (default: 0.5).
    * If setting "enableAutomaticThicknessComputation" to true, you can use lower values for "thickness" (even 0), as the geometry thickness
    * is automatically computed thank to the regular depth buffer + the backface depth buffer
    */
  var thickness: Double = js.native
}
