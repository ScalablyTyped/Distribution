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
  
  @scala.inline
  def apply(): StartImageScanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImageScanResponse]
  }
  
  @scala.inline
  implicit class StartImageScanResponseMutableBuilder[Self <: StartImageScanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    @scala.inline
    def setImageScanStatus(value: ImageScanStatus): Self = StObject.set(x, "imageScanStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageScanStatusUndefined: Self = StObject.set(x, "imageScanStatus", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
