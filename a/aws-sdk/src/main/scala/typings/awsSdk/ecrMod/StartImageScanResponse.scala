package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImageScanResponse extends StObject {
  
  var imageId: js.UndefOr[ImageIdentifier] = js.undefined
  
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object StartImageScanResponse {
  
  inline def apply(): StartImageScanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImageScanResponse]
  }
  
  extension [Self <: StartImageScanResponse](x: Self) {
    
    inline def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setImageScanStatus(value: ImageScanStatus): Self = StObject.set(x, "imageScanStatus", value.asInstanceOf[js.Any])
    
    inline def setImageScanStatusUndefined: Self = StObject.set(x, "imageScanStatus", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
