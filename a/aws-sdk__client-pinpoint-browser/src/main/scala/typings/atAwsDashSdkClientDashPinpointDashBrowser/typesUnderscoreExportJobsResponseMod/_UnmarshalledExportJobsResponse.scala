package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobResponseMod._UnmarshalledExportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledExportJobsResponse extends _ExportJobsResponse {
  /**
    * A list of export jobs for the application.
    */
  @JSName("Item")
  var Item__UnmarshalledExportJobsResponse: js.UndefOr[js.Array[_UnmarshalledExportJobResponse]] = js.undefined
}

object _UnmarshalledExportJobsResponse {
  @scala.inline
  def apply(Item: js.Array[_UnmarshalledExportJobResponse] = null, NextToken: String = null): _UnmarshalledExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[_UnmarshalledExportJobsResponse]
  }
}

