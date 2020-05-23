package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bandwidth extends js.Object {
  /**
    * Download speed in Mbps.
    */
  var DownloadSpeed: js.UndefOr[Integer] = js.native
  /**
    * Upload speed in Mbps.
    */
  var UploadSpeed: js.UndefOr[Integer] = js.native
}

object Bandwidth {
  @scala.inline
  def apply(DownloadSpeed: js.UndefOr[Integer] = js.undefined, UploadSpeed: js.UndefOr[Integer] = js.undefined): Bandwidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DownloadSpeed)) __obj.updateDynamic("DownloadSpeed")(DownloadSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(UploadSpeed)) __obj.updateDynamic("UploadSpeed")(UploadSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bandwidth]
  }
}

