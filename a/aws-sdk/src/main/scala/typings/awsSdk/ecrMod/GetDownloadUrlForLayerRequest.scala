package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDownloadUrlForLayerRequest extends StObject {
  
  /**
    * The digest of the image layer to download.
    */
  var layerDigest: LayerDigest
  
  /**
    * The AWS account ID associated with the registry that contains the image layer to download. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository that is associated with the image layer to download.
    */
  var repositoryName: RepositoryName
}
object GetDownloadUrlForLayerRequest {
  
  @scala.inline
  def apply(layerDigest: LayerDigest, repositoryName: RepositoryName): GetDownloadUrlForLayerRequest = {
    val __obj = js.Dynamic.literal(layerDigest = layerDigest.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDownloadUrlForLayerRequest]
  }
  
  @scala.inline
  implicit class GetDownloadUrlForLayerRequestMutableBuilder[Self <: GetDownloadUrlForLayerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerDigest(value: LayerDigest): Self = StObject.set(x, "layerDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
