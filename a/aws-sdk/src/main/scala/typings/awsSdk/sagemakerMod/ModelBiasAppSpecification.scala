package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBiasAppSpecification extends StObject {
  
  /**
    * JSON formatted S3 file that defines bias parameters. For more information on this JSON configuration file, see Configure bias parameters.
    */
  var ConfigUri: S3Uri
  
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined
  
  /**
    * The container image to be run by the model bias job.
    */
  var ImageUri: typings.awsSdk.sagemakerMod.ImageUri
}
object ModelBiasAppSpecification {
  
  inline def apply(ConfigUri: S3Uri, ImageUri: ImageUri): ModelBiasAppSpecification = {
    val __obj = js.Dynamic.literal(ConfigUri = ConfigUri.asInstanceOf[js.Any], ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelBiasAppSpecification]
  }
  
  extension [Self <: ModelBiasAppSpecification](x: Self) {
    
    inline def setConfigUri(value: S3Uri): Self = StObject.set(x, "ConfigUri", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: MonitoringEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setImageUri(value: ImageUri): Self = StObject.set(x, "ImageUri", value.asInstanceOf[js.Any])
  }
}
