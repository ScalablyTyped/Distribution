package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsResponse extends js.Object {
  /**
    * A list of ARNs that specifies the findings returned by the action.
    */
  var findingArns: ListReturnedArnList = js.native
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListFindingsResponse {
  @scala.inline
  def apply(findingArns: ListReturnedArnList): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsResponse]
  }
  @scala.inline
  implicit class ListFindingsResponseOps[Self <: ListFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindingArnsVarargs(value: Arn*): Self = this.set("findingArns", js.Array(value :_*))
    @scala.inline
    def setFindingArns(value: ListReturnedArnList): Self = this.set("findingArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

