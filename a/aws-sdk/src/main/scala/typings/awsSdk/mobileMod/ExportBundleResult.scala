package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportBundleResult extends js.Object {
  /**
    *  URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or web app with the AWS resources created by the AWS Mobile Hub project. 
    */
  var downloadUrl: js.UndefOr[DownloadUrl] = js.native
}

object ExportBundleResult {
  @scala.inline
  def apply(downloadUrl: DownloadUrl = null): ExportBundleResult = {
    val __obj = js.Dynamic.literal()
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBundleResult]
  }
}

