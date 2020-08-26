package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRulesPackagesResponse extends js.Object {
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of ARNs that specifies the rules packages returned by the action.
    */
  var rulesPackageArns: ListReturnedArnList = js.native
}

object ListRulesPackagesResponse {
  @scala.inline
  def apply(rulesPackageArns: ListReturnedArnList): ListRulesPackagesResponse = {
    val __obj = js.Dynamic.literal(rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRulesPackagesResponse]
  }
  @scala.inline
  implicit class ListRulesPackagesResponseOps[Self <: ListRulesPackagesResponse] (val x: Self) extends AnyVal {
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
    def setRulesPackageArnsVarargs(value: Arn*): Self = this.set("rulesPackageArns", js.Array(value :_*))
    @scala.inline
    def setRulesPackageArns(value: ListReturnedArnList): Self = this.set("rulesPackageArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

