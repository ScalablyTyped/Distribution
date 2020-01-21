package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsResponse extends js.Object {
  /**
    * If there are more operations than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.native
  /**
    * Lists summaries of the operations.
    */
  var Operations: OperationSummaryList = js.native
}

object ListOperationsResponse {
  @scala.inline
  def apply(Operations: OperationSummaryList, NextPageMarker: PageMarker = null): ListOperationsResponse = {
    val __obj = js.Dynamic.literal(Operations = Operations.asInstanceOf[js.Any])
    if (NextPageMarker != null) __obj.updateDynamic("NextPageMarker")(NextPageMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOperationsResponse]
  }
}

