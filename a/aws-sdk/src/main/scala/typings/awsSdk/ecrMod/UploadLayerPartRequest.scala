package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadLayerPartRequest extends js.Object {
  /**
    * The base64-encoded layer part payload.
    */
  var layerPartBlob: LayerPartBlob = js.native
  /**
    * The position of the first byte of the layer part witin the overall image layer.
    */
  var partFirstByte: PartSize = js.native
  /**
    * The position of the last byte of the layer part within the overall image layer.
    */
  var partLastByte: PartSize = js.native
  /**
    * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to which you are uploading layer parts.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the layer part upload.
    */
  var uploadId: UploadId = js.native
}

object UploadLayerPartRequest {
  @scala.inline
  def apply(
    layerPartBlob: LayerPartBlob,
    partFirstByte: PartSize,
    partLastByte: PartSize,
    repositoryName: RepositoryName,
    uploadId: UploadId,
    registryId: RegistryId = null
  ): UploadLayerPartRequest = {
    val __obj = js.Dynamic.literal(layerPartBlob = layerPartBlob.asInstanceOf[js.Any], partFirstByte = partFirstByte.asInstanceOf[js.Any], partLastByte = partLastByte.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLayerPartRequest]
  }
}

