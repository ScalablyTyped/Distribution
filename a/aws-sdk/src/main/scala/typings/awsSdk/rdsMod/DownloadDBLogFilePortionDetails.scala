package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadDBLogFilePortionDetails extends js.Object {
  /**
    * Boolean value that if true, indicates there is more data to be downloaded.
    */
  var AdditionalDataPending: js.UndefOr[Boolean] = js.native
  /**
    * Entries from the specified log file.
    */
  var LogFileData: js.UndefOr[String] = js.native
  /**
    * A pagination token that can be used in a later DownloadDBLogFilePortion request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DownloadDBLogFilePortionDetails {
  @scala.inline
  def apply(
    AdditionalDataPending: js.UndefOr[scala.Boolean] = js.undefined,
    LogFileData: String = null,
    Marker: String = null
  ): DownloadDBLogFilePortionDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AdditionalDataPending)) __obj.updateDynamic("AdditionalDataPending")(AdditionalDataPending.asInstanceOf[js.Any])
    if (LogFileData != null) __obj.updateDynamic("LogFileData")(LogFileData.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadDBLogFilePortionDetails]
  }
}

