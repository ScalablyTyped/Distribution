package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateLayerUploadRequest extends StObject {
  
  /**
    * The AWS account ID associated with the registry to which you intend to upload layers. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository to which you intend to upload layers.
    */
  var repositoryName: RepositoryName = js.native
}
object InitiateLayerUploadRequest {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): InitiateLayerUploadRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateLayerUploadRequest]
  }
  
  @scala.inline
  implicit class InitiateLayerUploadRequestMutableBuilder[Self <: InitiateLayerUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
