package typings.awsSdk.marketplacecommerceanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSupportDataExportResult extends js.Object {
  /**
    * A unique identifier representing a specific request to the StartSupportDataExport operation. This identifier can be used to correlate a request with notifications from the SNS topic.
    */
  var dataSetRequestId: js.UndefOr[DataSetRequestId] = js.native
}

object StartSupportDataExportResult {
  @scala.inline
  def apply(dataSetRequestId: DataSetRequestId = null): StartSupportDataExportResult = {
    val __obj = js.Dynamic.literal()
    if (dataSetRequestId != null) __obj.updateDynamic("dataSetRequestId")(dataSetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSupportDataExportResult]
  }
}

