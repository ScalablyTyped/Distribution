package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCommunicationsRequest extends js.Object {
  /**
    * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var afterTime: js.UndefOr[AfterTime] = js.native
  /**
    * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var beforeTime: js.UndefOr[BeforeTime] = js.native
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: CaseId = js.native
  /**
    * The maximum number of results to return before paginating.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeCommunicationsRequest {
  @scala.inline
  def apply(caseId: CaseId): DescribeCommunicationsRequest = {
    val __obj = js.Dynamic.literal(caseId = caseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCommunicationsRequest]
  }
  @scala.inline
  implicit class DescribeCommunicationsRequestOps[Self <: DescribeCommunicationsRequest] (val x: Self) extends AnyVal {
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
    def setCaseId(value: CaseId): Self = this.set("caseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterTime(value: AfterTime): Self = this.set("afterTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterTime: Self = this.set("afterTime", js.undefined)
    @scala.inline
    def setBeforeTime(value: BeforeTime): Self = this.set("beforeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeTime: Self = this.set("beforeTime", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

