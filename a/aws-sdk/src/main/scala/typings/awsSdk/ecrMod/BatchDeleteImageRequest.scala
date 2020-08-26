package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImageRequest extends js.Object {
  /**
    * A list of image ID references that correspond to images to delete. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
    */
  var imageIds: ImageIdentifierList = js.native
  /**
    * The AWS account ID associated with the registry that contains the image to delete. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository that contains the image to delete.
    */
  var repositoryName: RepositoryName = js.native
}

object BatchDeleteImageRequest {
  @scala.inline
  def apply(imageIds: ImageIdentifierList, repositoryName: RepositoryName): BatchDeleteImageRequest = {
    val __obj = js.Dynamic.literal(imageIds = imageIds.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteImageRequest]
  }
  @scala.inline
  implicit class BatchDeleteImageRequestOps[Self <: BatchDeleteImageRequest] (val x: Self) extends AnyVal {
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
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

