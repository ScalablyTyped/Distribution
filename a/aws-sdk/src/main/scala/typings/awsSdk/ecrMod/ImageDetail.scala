package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageDetail extends js.Object {
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. 
    */
  var imagePushedAt: js.UndefOr[PushTimestamp] = js.native
  /**
    * A summary of the last completed image scan.
    */
  var imageScanFindingsSummary: js.UndefOr[ImageScanFindingsSummary] = js.native
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.native
  /**
    * The size, in bytes, of the image in the repository. If the image is a manifest list, this will be the max size of all manifests in the list.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  var imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.native
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.native
  /**
    * The AWS account ID associated with the registry to which this image belongs.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to which this image belongs.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object ImageDetail {
  @scala.inline
  def apply(): ImageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDetail]
  }
  @scala.inline
  implicit class ImageDetailOps[Self <: ImageDetail] (val x: Self) extends AnyVal {
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
    def setImageDigest(value: ImageDigest): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDigest: Self = this.set("imageDigest", js.undefined)
    @scala.inline
    def setImagePushedAt(value: PushTimestamp): Self = this.set("imagePushedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePushedAt: Self = this.set("imagePushedAt", js.undefined)
    @scala.inline
    def setImageScanFindingsSummary(value: ImageScanFindingsSummary): Self = this.set("imageScanFindingsSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageScanFindingsSummary: Self = this.set("imageScanFindingsSummary", js.undefined)
    @scala.inline
    def setImageScanStatus(value: ImageScanStatus): Self = this.set("imageScanStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageScanStatus: Self = this.set("imageScanStatus", js.undefined)
    @scala.inline
    def setImageSizeInBytes(value: ImageSizeInBytes): Self = this.set("imageSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSizeInBytes: Self = this.set("imageSizeInBytes", js.undefined)
    @scala.inline
    def setImageTagsVarargs(value: ImageTag*): Self = this.set("imageTags", js.Array(value :_*))
    @scala.inline
    def setImageTags(value: ImageTagList): Self = this.set("imageTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTags: Self = this.set("imageTags", js.undefined)
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

