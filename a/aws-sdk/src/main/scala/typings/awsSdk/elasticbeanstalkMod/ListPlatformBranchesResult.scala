package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformBranchesResult extends js.Object {
  /**
    * In a paginated request, if this value isn't null, it's the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Summary information about the platform branches.
    */
  var PlatformBranchSummaryList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformBranchSummaryList] = js.native
}

object ListPlatformBranchesResult {
  @scala.inline
  def apply(): ListPlatformBranchesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformBranchesResult]
  }
  @scala.inline
  implicit class ListPlatformBranchesResultOps[Self <: ListPlatformBranchesResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPlatformBranchSummaryListVarargs(value: PlatformBranchSummary*): Self = this.set("PlatformBranchSummaryList", js.Array(value :_*))
    @scala.inline
    def setPlatformBranchSummaryList(value: PlatformBranchSummaryList): Self = this.set("PlatformBranchSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformBranchSummaryList: Self = this.set("PlatformBranchSummaryList", js.undefined)
  }
  
}

