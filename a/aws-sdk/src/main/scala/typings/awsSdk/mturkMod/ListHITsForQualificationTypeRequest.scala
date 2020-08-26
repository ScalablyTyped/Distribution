package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHITsForQualificationTypeRequest extends js.Object {
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The ID of the Qualification type to use when querying HITs. 
    */
  var QualificationTypeId: EntityId = js.native
}

object ListHITsForQualificationTypeRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId): ListHITsForQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHITsForQualificationTypeRequest]
  }
  @scala.inline
  implicit class ListHITsForQualificationTypeRequestOps[Self <: ListHITsForQualificationTypeRequest] (val x: Self) extends AnyVal {
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
    def setQualificationTypeId(value: EntityId): Self = this.set("QualificationTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: ResultSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

