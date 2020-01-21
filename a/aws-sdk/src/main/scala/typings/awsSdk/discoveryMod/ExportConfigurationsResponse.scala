package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportConfigurationsResponse extends js.Object {
  /**
    * A unique identifier that you can use to query the export status.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.native
}

object ExportConfigurationsResponse {
  @scala.inline
  def apply(exportId: ConfigurationsExportId = null): ExportConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (exportId != null) __obj.updateDynamic("exportId")(exportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportConfigurationsResponse]
  }
}

