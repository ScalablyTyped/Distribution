package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvTextureOptions extends StObject {
  
  /**
    * the image quality of encoded WebP images.
    */
  var imageQuality: js.UndefOr[Double] = js.undefined
  
  /**
    * The mime type of encoded images.
    */
  var imageType: js.UndefOr[String] = js.undefined
}
object CreateEnvTextureOptions {
  
  inline def apply(): CreateEnvTextureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvTextureOptions]
  }
  
  extension [Self <: CreateEnvTextureOptions](x: Self) {
    
    inline def setImageQuality(value: Double): Self = StObject.set(x, "imageQuality", value.asInstanceOf[js.Any])
    
    inline def setImageQualityUndefined: Self = StObject.set(x, "imageQuality", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
  }
}
