package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationsForResourceResult extends js.Object {
  /**
    * (Deprecated) Returns the number of pages of results that remain.  In releases prior to June 12, 2017, this parameter returned null by the API. It is now deprecated, and the API returns the next page token parameter instead. 
    */
  var nextPageCount: js.UndefOr[String] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetOperationsForResource request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the time stamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object GetOperationsForResourceResult {
  @scala.inline
  def apply(nextPageCount: String = null, nextPageToken: String = null, operations: OperationList = null): GetOperationsForResourceResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageCount != null) __obj.updateDynamic("nextPageCount")(nextPageCount.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationsForResourceResult]
  }
}

