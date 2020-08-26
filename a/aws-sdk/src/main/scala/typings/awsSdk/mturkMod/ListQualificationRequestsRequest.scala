package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationRequestsRequest extends js.Object {
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
}

object ListQualificationRequestsRequest {
  @scala.inline
  def apply(): ListQualificationRequestsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationRequestsRequest]
  }
  @scala.inline
  implicit class ListQualificationRequestsRequestOps[Self <: ListQualificationRequestsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: ResultSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = this.set("QualificationTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualificationTypeId: Self = this.set("QualificationTypeId", js.undefined)
  }
  
}

