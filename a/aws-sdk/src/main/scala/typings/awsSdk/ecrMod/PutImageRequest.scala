package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImageRequest extends StObject {
  
  /**
    * The image digest of the image manifest corresponding to the image.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The image manifest corresponding to the image to be uploaded.
    */
  var imageManifest: ImageManifest
  
  /**
    * The media type of the image manifest. If you push an image manifest that does not contain the mediaType field, you must specify the imageManifestMediaType in the request.
    */
  var imageManifestMediaType: js.UndefOr[MediaType] = js.undefined
  
  /**
    * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or Open Container Initiative (OCI) formats.
    */
  var imageTag: js.UndefOr[ImageTag] = js.undefined
  
  /**
    * The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository in which to put the image.
    */
  var repositoryName: RepositoryName
}
object PutImageRequest {
  
  @scala.inline
  def apply(imageManifest: ImageManifest, repositoryName: RepositoryName): PutImageRequest = {
    val __obj = js.Dynamic.literal(imageManifest = imageManifest.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageRequest]
  }
  
  @scala.inline
  implicit class PutImageRequestMutableBuilder[Self <: PutImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    @scala.inline
    def setImageManifest(value: ImageManifest): Self = StObject.set(x, "imageManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageManifestMediaType(value: MediaType): Self = StObject.set(x, "imageManifestMediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageManifestMediaTypeUndefined: Self = StObject.set(x, "imageManifestMediaType", js.undefined)
    
    @scala.inline
    def setImageTag(value: ImageTag): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
