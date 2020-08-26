package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRulesPackagesRequest extends js.Object {
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.native
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListRulesPackages action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListRulesPackagesRequest {
  @scala.inline
  def apply(): ListRulesPackagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesPackagesRequest]
  }
  @scala.inline
  implicit class ListRulesPackagesRequestOps[Self <: ListRulesPackagesRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: ListMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

