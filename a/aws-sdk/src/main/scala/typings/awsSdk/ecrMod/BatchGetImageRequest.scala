package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetImageRequest extends js.Object {
  /**
    * The accepted media types for the request. Valid values: application/vnd.docker.distribution.manifest.v1+json | application/vnd.docker.distribution.manifest.v2+json | application/vnd.oci.image.manifest.v1+json 
    */
  var acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.native
  /**
    * A list of image ID references that correspond to images to describe. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
    */
  var imageIds: ImageIdentifierList = js.native
  /**
    * The AWS account ID associated with the registry that contains the images to describe. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository that contains the images to describe.
    */
  var repositoryName: RepositoryName = js.native
}

object BatchGetImageRequest {
  @scala.inline
  def apply(imageIds: ImageIdentifierList, repositoryName: RepositoryName): BatchGetImageRequest = {
    val __obj = js.Dynamic.literal(imageIds = imageIds.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetImageRequest]
  }
  @scala.inline
  implicit class BatchGetImageRequestOps[Self <: BatchGetImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageIdsVarargs(value: ImageIdentifier*): Self = this.set("imageIds", js.Array(value :_*))
    @scala.inline
    def setImageIds(value: ImageIdentifierList): Self = this.set("imageIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptedMediaTypesVarargs(value: MediaType*): Self = this.set("acceptedMediaTypes", js.Array(value :_*))
    @scala.inline
    def setAcceptedMediaTypes(value: MediaTypeList): Self = this.set("acceptedMediaTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptedMediaTypes: Self = this.set("acceptedMediaTypes", js.undefined)
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

