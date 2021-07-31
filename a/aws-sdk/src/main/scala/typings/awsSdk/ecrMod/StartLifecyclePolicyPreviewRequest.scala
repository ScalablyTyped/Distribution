package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLifecyclePolicyPreviewRequest extends StObject {
  
  /**
    * The policy to be evaluated against. If you do not specify a policy, the current policy for the repository is used.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
  
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to be evaluated.
    */
  var repositoryName: RepositoryName
}
object StartLifecyclePolicyPreviewRequest {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): StartLifecyclePolicyPreviewRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLifecyclePolicyPreviewRequest]
  }
  
  @scala.inline
  implicit class StartLifecyclePolicyPreviewRequestMutableBuilder[Self <: StartLifecyclePolicyPreviewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifecyclePolicyText(value: LifecyclePolicyText): Self = StObject.set(x, "lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecyclePolicyTextUndefined: Self = StObject.set(x, "lifecyclePolicyText", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
