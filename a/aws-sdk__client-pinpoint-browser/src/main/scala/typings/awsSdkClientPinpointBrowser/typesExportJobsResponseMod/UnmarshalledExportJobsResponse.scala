package typings.awsSdkClientPinpointBrowser.typesExportJobsResponseMod

import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledExportJobsResponse extends ExportJobsResponse {
  /**
    * A list of export jobs for the application.
    */
  @JSName("Item")
  var Item_UnmarshalledExportJobsResponse: js.UndefOr[js.Array[UnmarshalledExportJobResponse]] = js.undefined
}

object UnmarshalledExportJobsResponse {
  @scala.inline
  def apply(Item: js.Array[UnmarshalledExportJobResponse] = null, NextToken: String = null): UnmarshalledExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledExportJobsResponse]
  }
}

