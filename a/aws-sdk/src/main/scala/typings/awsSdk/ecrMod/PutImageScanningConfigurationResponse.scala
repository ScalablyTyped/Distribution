package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImageScanningConfigurationResponse extends StObject {
  
  /**
    * The image scanning configuration setting for the repository.
    */
  var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object PutImageScanningConfigurationResponse {
  
  inline def apply(): PutImageScanningConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageScanningConfigurationResponse]
  }
  
  extension [Self <: PutImageScanningConfigurationResponse](x: Self) {
    
    inline def setImageScanningConfiguration(value: ImageScanningConfiguration): Self = StObject.set(x, "imageScanningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageScanningConfigurationUndefined: Self = StObject.set(x, "imageScanningConfiguration", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
