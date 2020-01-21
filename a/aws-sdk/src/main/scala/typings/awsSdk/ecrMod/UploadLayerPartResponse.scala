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
  def apply(
    lastByteReceived: Int | Double = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null,
    uploadId: UploadId = null
  ): UploadLayerPartResponse = {
    val __obj = js.Dynamic.literal()
    if (lastByteReceived != null) __obj.updateDynamic("lastByteReceived")(lastByteReceived.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLayerPartResponse]
  }
}

