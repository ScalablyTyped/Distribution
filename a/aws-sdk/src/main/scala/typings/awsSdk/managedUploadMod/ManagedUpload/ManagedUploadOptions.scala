package typings.awsSdk.managedUploadMod.ManagedUpload

import typings.awsSdk.s3Mod.PutObjectRequest
import typings.awsSdk.s3Mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedUploadOptions extends js.Object {
  /**
    * Default: false
    * Whether to abort the multipart upload if an error occurs. Set to true if you want to handle failures manually.
    */
  var leavePartsOnError: js.UndefOr[Boolean] = js.native
  /**
    * A map of parameters to pass to the upload requests.
    * The "Body" parameter is required to be specified either on the service or in the params option.
    */
  var params: js.UndefOr[PutObjectRequest] = js.native
  /**
    * Default: 5 mb
    * The size in bytes for each individual part to be uploaded. Adjust the part size to ensure the number of parts does not exceed maxTotalParts. See minPartSize for the minimum allowed part size.
    */
  var partSize: js.UndefOr[Double] = js.native
  /**
    * The size of the concurrent queue manager to upload parts in parallel. Set to 1 for synchronous uploading of parts. Note that the uploader will buffer at most queueSize * partSize bytes into memory at any given time.
    * default: 4
    */
  var queueSize: js.UndefOr[Double] = js.native
  /**
    * An optional S3 service object to use for requests.
    * This object might have bound parameters used by the uploader.
    */
  var service: js.UndefOr[typings.awsSdk.s3Mod.^] = js.native
  /**
    * The tags to apply to the object.
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}

object ManagedUploadOptions {
  @scala.inline
  def apply(
    leavePartsOnError: js.UndefOr[Boolean] = js.undefined,
    params: PutObjectRequest = null,
    partSize: Int | Double = null,
    queueSize: Int | Double = null,
    service: typings.awsSdk.s3Mod.^ = null,
    tags: js.Array[Tag] = null
  ): ManagedUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leavePartsOnError)) __obj.updateDynamic("leavePartsOnError")(leavePartsOnError.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (queueSize != null) __obj.updateDynamic("queueSize")(queueSize.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedUploadOptions]
  }
}

