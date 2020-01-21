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
  def apply(
    layerDigest: LayerDigest = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null,
    uploadId: UploadId = null
  ): CompleteLayerUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (layerDigest != null) __obj.updateDynamic("layerDigest")(layerDigest.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLayerUploadResponse]
  }
}

