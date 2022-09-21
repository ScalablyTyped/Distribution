package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRepositoryCatalogDataRequest extends StObject {
  
  /**
    * An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR Public Gallery.
    */
  var catalogData: RepositoryCatalogDataInput
  
  /**
    * The AWS account ID associated with the public registry the repository is in. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to create or update the catalog data for.
    */
  var repositoryName: RepositoryName
}
object PutRepositoryCatalogDataRequest {
  
  inline def apply(catalogData: RepositoryCatalogDataInput, repositoryName: RepositoryName): PutRepositoryCatalogDataRequest = {
    val __obj = js.Dynamic.literal(catalogData = catalogData.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRepositoryCatalogDataRequest]
  }
  
  extension [Self <: PutRepositoryCatalogDataRequest](x: Self) {
    
    inline def setCatalogData(value: RepositoryCatalogDataInput): Self = StObject.set(x, "catalogData", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
