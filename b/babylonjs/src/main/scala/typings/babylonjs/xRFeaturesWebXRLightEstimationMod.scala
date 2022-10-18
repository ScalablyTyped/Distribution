package typings.babylonjs

import typings.babylonjs.lightsDirectionalLightMod.DirectionalLight
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.mathsSphericalPolynomialMod.SphericalHarmonics
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRLightEstimationMod {
  
  @JSImport("babylonjs/XR/features/WebXRLightEstimation", "WebXRLightEstimation")
  @js.native
  open class WebXRLightEstimation protected () extends WebXRAbstractFeature {
    /**
      * Creates a new instance of the light estimation feature
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param options options to use when constructing this feature
      */
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * options to use when constructing this feature
      */
    options: IWebXRLightEstimationOptions
    ) = this()
    
    /* private */ var _canvasContext: Any = js.native
    
    /* private */ var _cubeMapPollTime: Any = js.native
    
    /* private */ var _getCanvasContext: Any = js.native
    
    /* private */ var _getXRGLBinding: Any = js.native
    
    /* private */ var _intensity: Any = js.native
    
    /* private */ var _lightColor: Any = js.native
    
    /* private */ var _lightDirection: Any = js.native
    
    /* private */ var _lightEstimationPollTime: Any = js.native
    
    /* private */ var _reflectionCubeMap: Any = js.native
    
    /**
      * ARCore's reflection cube map size is 16x16.
      * Once other systems support this feature we will need to change this to be dynamic.
      * see https://github.com/immersive-web/lighting-estimation/blob/main/lighting-estimation-explainer.md#cube-map-open-questions
      */
    /* private */ var _reflectionCubeMapTextureSize: Any = js.native
    
    /* private */ var _sphericalHarmonics: Any = js.native
    
    /**
      * Event Listener for "reflectionchange" events.
      */
    /* private */ var _updateReflectionCubeMap: Any = js.native
    
    /* private */ var _xrLightEstimate: Any = js.native
    
    /* private */ var _xrLightProbe: Any = js.native
    
    /* private */ var _xrWebGLBinding: Any = js.native
    
    /**
      * If createDirectionalLightSource is set to true this light source will be created automatically.
      * Otherwise this can be set with an external directional light source.
      * This light will be updated whenever the light estimation values change.
      */
    var directionalLight: Nullable[DirectionalLight] = js.native
    
    /**
      * This observable will notify when the reflection cube map is updated.
      */
    var onReflectionCubeMapUpdatedObservable: Observable[BaseTexture] = js.native
    
    /**
      * options to use when constructing this feature
      */
    val options: IWebXRLightEstimationOptions = js.native
    
    /**
      * While the estimated cube map is expected to update over time to better reflect the user's environment as they move around those changes are unlikely to happen with every XRFrame.
      * Since creating and processing the cube map is potentially expensive, especially if mip maps are needed, you can listen to the onReflectionCubeMapUpdatedObservable to determine
      * when it has been updated.
      */
    def reflectionCubeMapTexture: Nullable[BaseTexture] = js.native
    
    /**
      * The most recent light estimate.  Available starting on the first frame where the device provides a light probe.
      */
    def xrLightingEstimate: Nullable[IWebXRLightEstimation] = js.native
  }
  /* static members */
  object WebXRLightEstimation {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRLightEstimation", "WebXRLightEstimation.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRLightEstimation", "WebXRLightEstimation.Version")
    @js.native
    val Version: Double = js.native
  }
  
  trait IWebXRLightEstimation extends StObject {
    
    /**
      * Color of light source
      */
    var lightColor: Color3
    
    /**
      * The direction from the light source
      */
    var lightDirection: Vector3
    
    /**
      * The intensity of the light source
      */
    var lightIntensity: Double
    
    /**
      * Spherical harmonics coefficients of the light source
      */
    var sphericalHarmonics: SphericalHarmonics
  }
  object IWebXRLightEstimation {
    
    inline def apply(
      lightColor: Color3,
      lightDirection: Vector3,
      lightIntensity: Double,
      sphericalHarmonics: SphericalHarmonics
    ): IWebXRLightEstimation = {
      val __obj = js.Dynamic.literal(lightColor = lightColor.asInstanceOf[js.Any], lightDirection = lightDirection.asInstanceOf[js.Any], lightIntensity = lightIntensity.asInstanceOf[js.Any], sphericalHarmonics = sphericalHarmonics.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRLightEstimation]
    }
    
    extension [Self <: IWebXRLightEstimation](x: Self) {
      
      inline def setLightColor(value: Color3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
      
      inline def setLightDirection(value: Vector3): Self = StObject.set(x, "lightDirection", value.asInstanceOf[js.Any])
      
      inline def setLightIntensity(value: Double): Self = StObject.set(x, "lightIntensity", value.asInstanceOf[js.Any])
      
      inline def setSphericalHarmonics(value: SphericalHarmonics): Self = StObject.set(x, "sphericalHarmonics", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWebXRLightEstimationOptions extends StObject {
    
    /**
      * Should a directional light source be created.
      * If created, this light source will be updated whenever the light estimation values change
      */
    var createDirectionalLightSource: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How often should the cubemap update in ms.
      * If not set the cubemap will be updated every time the underlying system updates the environment texture.
      */
    var cubeMapPollInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Disable the cube map reflection feature. In this case only light direction and color will be updated
      */
    var disableCubeMapReflection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * disable applying the spherical polynomial to the cube map texture
      */
    var disableSphericalPolynomial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should the light estimation's needed vectors be constructed on each frame.
      * Use this when you use those vectors and don't want their values to change outside of the light estimation feature
      */
    var disableVectorReuse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How often should the light estimation properties update in ms.
      * If not set the light estimation properties will be updated on every frame (depending on the underlying system)
      */
    var lightEstimationPollInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Define the format to be used for the light estimation texture.
      */
    var reflectionFormat: js.UndefOr[XRReflectionFormat] = js.undefined
    
    /**
      * Should the scene's env texture be set to the cube map reflection texture
      * Note that this doesn't work is disableCubeMapReflection if set to false
      */
    var setSceneEnvironmentTexture: js.UndefOr[Boolean] = js.undefined
  }
  object IWebXRLightEstimationOptions {
    
    inline def apply(): IWebXRLightEstimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRLightEstimationOptions]
    }
    
    extension [Self <: IWebXRLightEstimationOptions](x: Self) {
      
      inline def setCreateDirectionalLightSource(value: Boolean): Self = StObject.set(x, "createDirectionalLightSource", value.asInstanceOf[js.Any])
      
      inline def setCreateDirectionalLightSourceUndefined: Self = StObject.set(x, "createDirectionalLightSource", js.undefined)
      
      inline def setCubeMapPollInterval(value: Double): Self = StObject.set(x, "cubeMapPollInterval", value.asInstanceOf[js.Any])
      
      inline def setCubeMapPollIntervalUndefined: Self = StObject.set(x, "cubeMapPollInterval", js.undefined)
      
      inline def setDisableCubeMapReflection(value: Boolean): Self = StObject.set(x, "disableCubeMapReflection", value.asInstanceOf[js.Any])
      
      inline def setDisableCubeMapReflectionUndefined: Self = StObject.set(x, "disableCubeMapReflection", js.undefined)
      
      inline def setDisableSphericalPolynomial(value: Boolean): Self = StObject.set(x, "disableSphericalPolynomial", value.asInstanceOf[js.Any])
      
      inline def setDisableSphericalPolynomialUndefined: Self = StObject.set(x, "disableSphericalPolynomial", js.undefined)
      
      inline def setDisableVectorReuse(value: Boolean): Self = StObject.set(x, "disableVectorReuse", value.asInstanceOf[js.Any])
      
      inline def setDisableVectorReuseUndefined: Self = StObject.set(x, "disableVectorReuse", js.undefined)
      
      inline def setLightEstimationPollInterval(value: Double): Self = StObject.set(x, "lightEstimationPollInterval", value.asInstanceOf[js.Any])
      
      inline def setLightEstimationPollIntervalUndefined: Self = StObject.set(x, "lightEstimationPollInterval", js.undefined)
      
      inline def setReflectionFormat(value: XRReflectionFormat): Self = StObject.set(x, "reflectionFormat", value.asInstanceOf[js.Any])
      
      inline def setReflectionFormatUndefined: Self = StObject.set(x, "reflectionFormat", js.undefined)
      
      inline def setSetSceneEnvironmentTexture(value: Boolean): Self = StObject.set(x, "setSceneEnvironmentTexture", value.asInstanceOf[js.Any])
      
      inline def setSetSceneEnvironmentTextureUndefined: Self = StObject.set(x, "setSceneEnvironmentTexture", js.undefined)
    }
  }
}
