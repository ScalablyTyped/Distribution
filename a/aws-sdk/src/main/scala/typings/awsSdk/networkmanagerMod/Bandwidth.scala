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
  def apply(DownloadSpeed: Int | Double = null, UploadSpeed: Int | Double = null): Bandwidth = {
    val __obj = js.Dynamic.literal()
    if (DownloadSpeed != null) __obj.updateDynamic("DownloadSpeed")(DownloadSpeed.asInstanceOf[js.Any])
    if (UploadSpeed != null) __obj.updateDynamic("UploadSpeed")(UploadSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bandwidth]
  }
}

