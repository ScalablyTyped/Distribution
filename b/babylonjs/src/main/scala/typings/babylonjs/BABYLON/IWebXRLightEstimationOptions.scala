package typings.babylonjs.BABYLON

import typings.babylonjs.XRReflectionFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
