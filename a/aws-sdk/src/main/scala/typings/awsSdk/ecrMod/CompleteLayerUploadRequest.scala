package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteLayerUploadRequest extends js.Object {
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigests: LayerDigestList = js.native
  /**
    * The AWS account ID associated with the registry to which to upload layers. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to associate with the image layer.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the image layer.
    */
  var uploadId: UploadId = js.native
}

object CompleteLayerUploadRequest {
  @scala.inline
  def apply(layerDigests: LayerDigestList, repositoryName: RepositoryName, uploadId: UploadId): CompleteLayerUploadRequest = {
    val __obj = js.Dynamic.literal(layerDigests = layerDigests.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLayerUploadRequest]
  }
  @scala.inline
  implicit class CompleteLayerUploadRequestOps[Self <: CompleteLayerUploadRequest] (val x: Self) extends AnyVal {
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
    def setLayerDigestsVarargs(value: LayerDigest*): Self = this.set("layerDigests", js.Array(value :_*))
    @scala.inline
    def setLayerDigests(value: LayerDigestList): Self = this.set("layerDigests", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadId(value: UploadId): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

