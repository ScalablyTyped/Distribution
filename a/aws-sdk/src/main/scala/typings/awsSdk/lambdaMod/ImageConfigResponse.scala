package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfigResponse extends StObject {
  
  /**
    * Error response to GetFunctionConfiguration.
    */
  var Error: js.UndefOr[ImageConfigError] = js.undefined
  
  /**
    * Configuration values that override the container image Dockerfile.
    */
  var ImageConfig: js.UndefOr[typings.awsSdk.lambdaMod.ImageConfig] = js.undefined
}
object ImageConfigResponse {
  
  inline def apply(): ImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfigResponse]
  }
  
  extension [Self <: ImageConfigResponse](x: Self) {
    
    inline def setError(value: ImageConfigError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setImageConfig(value: ImageConfig): Self = StObject.set(x, "ImageConfig", value.asInstanceOf[js.Any])
    
    inline def setImageConfigUndefined: Self = StObject.set(x, "ImageConfig", js.undefined)
  }
}
