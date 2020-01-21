package typings.awsSdkClientPinpointBrowser.typesImportJobsResponseMod

import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledImportJobsResponse extends ImportJobsResponse {
  /**
    * A list of import jobs for the application.
    */
  @JSName("Item")
  var Item_UnmarshalledImportJobsResponse: js.UndefOr[js.Array[UnmarshalledImportJobResponse]] = js.undefined
}

object UnmarshalledImportJobsResponse {
  @scala.inline
  def apply(Item: js.Array[UnmarshalledImportJobResponse] = null, NextToken: String = null): UnmarshalledImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledImportJobsResponse]
  }
}

