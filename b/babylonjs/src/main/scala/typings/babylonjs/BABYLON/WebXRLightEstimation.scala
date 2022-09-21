package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRLightEstimation
  extends StObject
     with WebXRAbstractFeature {
  
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
