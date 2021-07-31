package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetImageRequest extends StObject {
  
  /**
    * The accepted media types for the request. Valid values: application/vnd.docker.distribution.manifest.v1+json | application/vnd.docker.distribution.manifest.v2+json | application/vnd.oci.image.manifest.v1+json 
    */
  var acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.undefined
  
  /**
    * A list of image ID references that correspond to images to describe. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
    */
  var imageIds: ImageIdentifierList
  
  /**
    * The AWS account ID associated with the registry that contains the images to describe. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository that contains the images to describe.
    */
  var repositoryName: RepositoryName
}
object BatchGetImageRequest {
  
  @scala.inline
  def apply(imageIds: ImageIdentifierList, repositoryName: RepositoryName): BatchGetImageRequest = {
    val __obj = js.Dynamic.literal(imageIds = imageIds.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetImageRequest]
  }
  
  @scala.inline
  implicit class BatchGetImageRequestMutableBuilder[Self <: BatchGetImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptedMediaTypes(value: MediaTypeList): Self = StObject.set(x, "acceptedMediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedMediaTypesUndefined: Self = StObject.set(x, "acceptedMediaTypes", js.undefined)
    
    @scala.inline
    def setAcceptedMediaTypesVarargs(value: MediaType*): Self = StObject.set(x, "acceptedMediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setImageIds(value: ImageIdentifierList): Self = StObject.set(x, "imageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdsVarargs(value: ImageIdentifier*): Self = StObject.set(x, "imageIds", js.Array(value :_*))
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
