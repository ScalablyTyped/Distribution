package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkersWithQualificationTypeRequest extends js.Object {
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the Qualification type of the Qualifications to return.
    */
  var QualificationTypeId: EntityId = js.native
  /**
    *  The status of the Qualifications to return. Can be Granted | Revoked. 
    */
  var Status: js.UndefOr[QualificationStatus] = js.native
}

object ListWorkersWithQualificationTypeRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId): ListWorkersWithQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkersWithQualificationTypeRequest]
  }
  @scala.inline
  implicit class ListWorkersWithQualificationTypeRequestOps[Self <: ListWorkersWithQualificationTypeRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setStatus(value: QualificationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

