package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutImageScanningConfigurationResponse extends StObject {
  
  /**
    * The image scanning configuration setting for the repository.
    */
  var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.native
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object PutImageScanningConfigurationResponse {
  
  @scala.inline
  def apply(): PutImageScanningConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageScanningConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutImageScanningConfigurationResponseMutableBuilder[Self <: PutImageScanningConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageScanningConfiguration(value: ImageScanningConfiguration): Self = StObject.set(x, "imageScanningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageScanningConfigurationUndefined: Self = StObject.set(x, "imageScanningConfiguration", js.undefined)
    
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
