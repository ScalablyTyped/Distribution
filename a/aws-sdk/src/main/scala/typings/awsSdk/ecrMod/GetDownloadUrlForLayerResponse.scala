package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDownloadUrlForLayerResponse extends js.Object {
  /**
    * The pre-signed Amazon S3 download URL for the requested layer.
    */
  var downloadUrl: js.UndefOr[Url] = js.native
  /**
    * The digest of the image layer to download.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.native
}

object GetDownloadUrlForLayerResponse {
  @scala.inline
  def apply(downloadUrl: Url = null, layerDigest: LayerDigest = null): GetDownloadUrlForLayerResponse = {
    val __obj = js.Dynamic.literal()
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    if (layerDigest != null) __obj.updateDynamic("layerDigest")(layerDigest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDownloadUrlForLayerResponse]
  }
}

