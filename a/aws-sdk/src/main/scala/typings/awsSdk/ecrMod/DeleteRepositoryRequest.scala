package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRepositoryRequest extends StObject {
  
  /**
    *  If a repository contains images, forces the deletion.
    */
  var force: js.UndefOr[ForceFlag] = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the repository to delete. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository to delete.
    */
  var repositoryName: RepositoryName = js.native
}
object DeleteRepositoryRequest {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): DeleteRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryRequest]
  }
  
  @scala.inline
  implicit class DeleteRepositoryRequestMutableBuilder[Self <: DeleteRepositoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: ForceFlag): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
