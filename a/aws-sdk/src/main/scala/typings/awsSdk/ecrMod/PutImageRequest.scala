package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageRequest extends js.Object {
  /**
    * The image manifest corresponding to the image to be uploaded.
    */
  var imageManifest: ImageManifest = js.native
  /**
    * The media type of the image manifest. If you push an image manifest that does not contain the mediaType field, you must specify the imageManifestMediaType in the request.
    */
  var imageManifestMediaType: js.UndefOr[MediaType] = js.native
  /**
    * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.
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
  def apply(
    imageManifest: ImageManifest,
    repositoryName: RepositoryName,
    imageManifestMediaType: MediaType = null,
    imageTag: ImageTag = null,
    registryId: RegistryId = null
  ): PutImageRequest = {
    val __obj = js.Dynamic.literal(imageManifest = imageManifest.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (imageManifestMediaType != null) __obj.updateDynamic("imageManifestMediaType")(imageManifestMediaType.asInstanceOf[js.Any])
    if (imageTag != null) __obj.updateDynamic("imageTag")(imageTag.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageRequest]
  }
}

