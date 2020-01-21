package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationsResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get operations request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An array of key-value pairs containing information about the results of your get operations request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object GetOperationsResult {
  @scala.inline
  def apply(nextPageToken: String = null, operations: OperationList = null): GetOperationsResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationsResult]
  }
}

