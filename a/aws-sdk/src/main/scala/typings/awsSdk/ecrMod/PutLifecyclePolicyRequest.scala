package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLifecyclePolicyRequest extends StObject {
  
  /**
    * The JSON repository policy text to apply to the repository.
    */
  var lifecyclePolicyText: LifecyclePolicyText
  
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to receive the policy.
    */
  var repositoryName: RepositoryName
}
object PutLifecyclePolicyRequest {
  
  inline def apply(lifecyclePolicyText: LifecyclePolicyText, repositoryName: RepositoryName): PutLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(lifecyclePolicyText = lifecyclePolicyText.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecyclePolicyRequest]
  }
  
  extension [Self <: PutLifecyclePolicyRequest](x: Self) {
    
    inline def setLifecyclePolicyText(value: LifecyclePolicyText): Self = StObject.set(x, "lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
