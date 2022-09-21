package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImageTagMutabilityRequest extends StObject {
  
  /**
    * The tag mutability setting for the repository. If MUTABLE is specified, image tags can be overwritten. If IMMUTABLE is specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
    */
  var imageTagMutability: ImageTagMutability
  
  /**
    * The Amazon Web Services account ID associated with the registry that contains the repository in which to update the image tag mutability settings. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository in which to update the image tag mutability settings.
    */
  var repositoryName: RepositoryName
}
object PutImageTagMutabilityRequest {
  
  inline def apply(imageTagMutability: ImageTagMutability, repositoryName: RepositoryName): PutImageTagMutabilityRequest = {
    val __obj = js.Dynamic.literal(imageTagMutability = imageTagMutability.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageTagMutabilityRequest]
  }
  
  extension [Self <: PutImageTagMutabilityRequest](x: Self) {
    
    inline def setImageTagMutability(value: ImageTagMutability): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
