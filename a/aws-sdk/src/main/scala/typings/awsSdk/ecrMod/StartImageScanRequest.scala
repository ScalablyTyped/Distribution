package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImageScanRequest extends StObject {
  
  var imageId: ImageIdentifier = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the repository in which to start an image scan request. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository that contains the images to scan.
    */
  var repositoryName: RepositoryName = js.native
}
object StartImageScanRequest {
  
  @scala.inline
  def apply(imageId: ImageIdentifier, repositoryName: RepositoryName): StartImageScanRequest = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImageScanRequest]
  }
  
  @scala.inline
  implicit class StartImageScanRequestMutableBuilder[Self <: StartImageScanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
