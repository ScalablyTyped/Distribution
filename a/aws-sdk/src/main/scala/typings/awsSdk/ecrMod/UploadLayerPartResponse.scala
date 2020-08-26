package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadLayerPartResponse extends js.Object {
  /**
    * The integer value of the last byte received in the request.
    */
  var lastByteReceived: js.UndefOr[PartSize] = js.native
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  /**
    * The upload ID associated with the request.
    */
  var uploadId: js.UndefOr[UploadId] = js.native
}

object UploadLayerPartResponse {
  @scala.inline
  def apply(): UploadLayerPartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLayerPartResponse]
  }
  @scala.inline
  implicit class UploadLayerPartResponseOps[Self <: UploadLayerPartResponse] (val x: Self) extends AnyVal {
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
    def setLastByteReceived(value: PartSize): Self = this.set("lastByteReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastByteReceived: Self = this.set("lastByteReceived", js.undefined)
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

