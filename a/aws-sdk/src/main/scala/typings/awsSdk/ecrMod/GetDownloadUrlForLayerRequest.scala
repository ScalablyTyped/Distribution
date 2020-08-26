package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDownloadUrlForLayerRequest extends js.Object {
  /**
    * The digest of the image layer to download.
    */
  var layerDigest: LayerDigest = js.native
  /**
    * The AWS account ID associated with the registry that contains the image layer to download. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository that is associated with the image layer to download.
    */
  var repositoryName: RepositoryName = js.native
}

object GetDownloadUrlForLayerRequest {
  @scala.inline
  def apply(layerDigest: LayerDigest, repositoryName: RepositoryName): GetDownloadUrlForLayerRequest = {
    val __obj = js.Dynamic.literal(layerDigest = layerDigest.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDownloadUrlForLayerRequest]
  }
  @scala.inline
  implicit class GetDownloadUrlForLayerRequestOps[Self <: GetDownloadUrlForLayerRequest] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

