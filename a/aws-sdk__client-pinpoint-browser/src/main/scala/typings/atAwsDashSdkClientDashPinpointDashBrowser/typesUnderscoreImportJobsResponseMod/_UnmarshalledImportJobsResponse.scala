package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreImportJobsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreImportJobResponseMod._UnmarshalledImportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledImportJobsResponse extends _ImportJobsResponse {
  /**
    * A list of import jobs for the application.
    */
  @JSName("Item")
  var Item__UnmarshalledImportJobsResponse: js.UndefOr[js.Array[_UnmarshalledImportJobResponse]] = js.undefined
}

object _UnmarshalledImportJobsResponse {
  @scala.inline
  def apply(Item: js.Array[_UnmarshalledImportJobResponse] = null, NextToken: String = null): _UnmarshalledImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledImportJobsResponse]
  }
}

