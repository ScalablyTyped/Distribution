package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteLayerUploadResponse extends js.Object {
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
  implicit class CompleteLayerUploadResponseOps[Self <: CompleteLayerUploadResponse] (val x: Self) extends AnyVal {
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
    def setLayerDigest(value: LayerDigest): Self = this.set("layerDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerDigest: Self = this.set("layerDigest", js.undefined)
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    @scala.inline
    def setUploadId(value: UploadId): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
  }
  
}

