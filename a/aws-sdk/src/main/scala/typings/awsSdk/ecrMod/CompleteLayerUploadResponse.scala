package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteLayerUploadResponse extends StObject {
  
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.native
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  
  /**
    * The upload ID associated with the layer.
    */
  var uploadId: js.UndefOr[UploadId] = js.native
}
object CompleteLayerUploadResponse {
  
  @scala.inline
  def apply(): CompleteLayerUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteLayerUploadResponse]
  }
  
  @scala.inline
  implicit class CompleteLayerUploadResponseMutableBuilder[Self <: CompleteLayerUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerDigest(value: LayerDigest): Self = StObject.set(x, "layerDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerDigestUndefined: Self = StObject.set(x, "layerDigest", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    @scala.inline
    def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
