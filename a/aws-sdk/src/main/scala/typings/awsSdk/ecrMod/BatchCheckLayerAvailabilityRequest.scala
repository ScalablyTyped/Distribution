package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCheckLayerAvailabilityRequest extends StObject {
  
  /**
    * The digests of the image layers to check.
    */
  var layerDigests: BatchedOperationLayerDigestList
  
  /**
    * The Amazon Web Services account ID associated with the registry that contains the image layers to check. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository that is associated with the image layers to check.
    */
  var repositoryName: RepositoryName
}
object BatchCheckLayerAvailabilityRequest {
  
  inline def apply(layerDigests: BatchedOperationLayerDigestList, repositoryName: RepositoryName): BatchCheckLayerAvailabilityRequest = {
    val __obj = js.Dynamic.literal(layerDigests = layerDigests.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCheckLayerAvailabilityRequest]
  }
  
  extension [Self <: BatchCheckLayerAvailabilityRequest](x: Self) {
    
    inline def setLayerDigests(value: BatchedOperationLayerDigestList): Self = StObject.set(x, "layerDigests", value.asInstanceOf[js.Any])
    
    inline def setLayerDigestsVarargs(value: BatchedOperationLayerDigest*): Self = StObject.set(x, "layerDigests", js.Array(value*))
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
