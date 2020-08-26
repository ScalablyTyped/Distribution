package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageRequest extends js.Object {
  /**
    * The image digest of the image manifest corresponding to the image.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The image manifest corresponding to the image to be uploaded.
    */
  var imageManifest: ImageManifest = js.native
  /**
    * The media type of the image manifest. If you push an image manifest that does not contain the mediaType field, you must specify the imageManifestMediaType in the request.
    */
  var imageManifestMediaType: js.UndefOr[MediaType] = js.native
  /**
    * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or Open Container Initiative (OCI) formats.
    */
  var imageTag: js.UndefOr[ImageTag] = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository in which to put the image.
    */
  var repositoryName: RepositoryName = js.native
}

object PutImageRequest {
  @scala.inline
  def apply(imageManifest: ImageManifest, repositoryName: RepositoryName): PutImageRequest = {
    val __obj = js.Dynamic.literal(imageManifest = imageManifest.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageRequest]
  }
  @scala.inline
  implicit class PutImageRequestOps[Self <: PutImageRequest] (val x: Self) extends AnyVal {
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
    def setImageManifest(value: ImageManifest): Self = this.set("imageManifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageDigest(value: ImageDigest): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDigest: Self = this.set("imageDigest", js.undefined)
    @scala.inline
    def setImageManifestMediaType(value: MediaType): Self = this.set("imageManifestMediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageManifestMediaType: Self = this.set("imageManifestMediaType", js.undefined)
    @scala.inline
    def setImageTag(value: ImageTag): Self = this.set("imageTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTag: Self = this.set("imageTag", js.undefined)
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

