package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExclusionsResponse extends js.Object {
  /**
    * A list of exclusions' ARNs returned by the action.
    */
  var exclusionArns: ListReturnedArnList = js.native
  /**
    * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListExclusionsResponse {
  @scala.inline
  def apply(exclusionArns: ListReturnedArnList): ListExclusionsResponse = {
    val __obj = js.Dynamic.literal(exclusionArns = exclusionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExclusionsResponse]
  }
  @scala.inline
  implicit class ListExclusionsResponseOps[Self <: ListExclusionsResponse] (val x: Self) extends AnyVal {
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
    def setExclusionArnsVarargs(value: Arn*): Self = this.set("exclusionArns", js.Array(value :_*))
    @scala.inline
    def setExclusionArns(value: ListReturnedArnList): Self = this.set("exclusionArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

