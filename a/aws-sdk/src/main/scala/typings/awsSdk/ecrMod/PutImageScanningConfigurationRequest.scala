package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutImageScanningConfigurationRequest extends StObject {
  
  /**
    * The image scanning configuration for the repository. This setting determines whether images are scanned for known vulnerabilities after being pushed to the repository.
    */
  var imageScanningConfiguration: ImageScanningConfiguration = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the repository in which to update the image scanning configuration setting. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository in which to update the image scanning configuration setting.
    */
  var repositoryName: RepositoryName = js.native
}
object PutImageScanningConfigurationRequest {
  
  @scala.inline
  def apply(imageScanningConfiguration: ImageScanningConfiguration, repositoryName: RepositoryName): PutImageScanningConfigurationRequest = {
    val __obj = js.Dynamic.literal(imageScanningConfiguration = imageScanningConfiguration.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageScanningConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutImageScanningConfigurationRequestMutableBuilder[Self <: PutImageScanningConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageScanningConfiguration(value: ImageScanningConfiguration): Self = StObject.set(x, "imageScanningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
