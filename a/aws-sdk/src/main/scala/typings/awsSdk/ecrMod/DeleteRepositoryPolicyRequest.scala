package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryPolicyRequest extends StObject {
  
  /**
    * The AWS account ID associated with the registry that contains the repository policy to delete. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository that is associated with the repository policy to delete.
    */
  var repositoryName: RepositoryName
}
object DeleteRepositoryPolicyRequest {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): DeleteRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteRepositoryPolicyRequestMutableBuilder[Self <: DeleteRepositoryPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
