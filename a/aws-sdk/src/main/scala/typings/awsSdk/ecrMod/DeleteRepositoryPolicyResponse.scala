package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryPolicyResponse extends StObject {
  
  /**
    * The JSON repository policy that was deleted from the repository.
    */
  var policyText: js.UndefOr[RepositoryPolicyText] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object DeleteRepositoryPolicyResponse {
  
  @scala.inline
  def apply(): DeleteRepositoryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryPolicyResponse]
  }
  
  @scala.inline
  implicit class DeleteRepositoryPolicyResponseMutableBuilder[Self <: DeleteRepositoryPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyText(value: RepositoryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTextUndefined: Self = StObject.set(x, "policyText", js.undefined)
    
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
