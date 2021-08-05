package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImageTagMutabilityResponse extends StObject {
  
  /**
    * The image tag mutability setting for the repository.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object PutImageTagMutabilityResponse {
  
  inline def apply(): PutImageTagMutabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageTagMutabilityResponse]
  }
  
  extension [Self <: PutImageTagMutabilityResponse](x: Self) {
    
    inline def setImageTagMutability(value: ImageTagMutability): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
    
    inline def setImageTagMutabilityUndefined: Self = StObject.set(x, "imageTagMutability", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
