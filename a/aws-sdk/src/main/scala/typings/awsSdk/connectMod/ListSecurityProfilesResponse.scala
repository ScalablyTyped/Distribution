package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecurityProfilesResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the security profiles.
    */
  var SecurityProfileSummaryList: js.UndefOr[typings.awsSdk.connectMod.SecurityProfileSummaryList] = js.native
}

object ListSecurityProfilesResponse {
  @scala.inline
  def apply(): ListSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesResponse]
  }
  @scala.inline
  implicit class ListSecurityProfilesResponseOps[Self <: ListSecurityProfilesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSecurityProfileSummaryListVarargs(value: SecurityProfileSummary*): Self = this.set("SecurityProfileSummaryList", js.Array(value :_*))
    @scala.inline
    def setSecurityProfileSummaryList(value: SecurityProfileSummaryList): Self = this.set("SecurityProfileSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileSummaryList: Self = this.set("SecurityProfileSummaryList", js.undefined)
  }
  
}

