package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationRequestsResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The number of Qualification requests on this page in the filtered results list, equivalent to the number of Qualification requests being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  /**
    * The Qualification request. The response includes one QualificationRequest element for each Qualification request returned by the query.
    */
  var QualificationRequests: js.UndefOr[QualificationRequestList] = js.native
}

object ListQualificationRequestsResponse {
  @scala.inline
  def apply(): ListQualificationRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationRequestsResponse]
  }
  @scala.inline
  implicit class ListQualificationRequestsResponseOps[Self <: ListQualificationRequestsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setNumResults(value: Integer): Self = this.set("NumResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumResults: Self = this.set("NumResults", js.undefined)
    @scala.inline
    def setQualificationRequestsVarargs(value: QualificationRequest*): Self = this.set("QualificationRequests", js.Array(value :_*))
    @scala.inline
    def setQualificationRequests(value: QualificationRequestList): Self = this.set("QualificationRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualificationRequests: Self = this.set("QualificationRequests", js.undefined)
  }
  
}

