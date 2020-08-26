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
  def apply(Operations: OperationSummaryList): ListOperationsResponse = {
    val __obj = js.Dynamic.literal(Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOperationsResponse]
  }
  @scala.inline
  implicit class ListOperationsResponseOps[Self <: ListOperationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperationsVarargs(value: OperationSummary*): Self = this.set("Operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: OperationSummaryList): Self = this.set("Operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageMarker(value: PageMarker): Self = this.set("NextPageMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageMarker: Self = this.set("NextPageMarker", js.undefined)
  }
  
}

