package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformVersionsResult extends js.Object {
  /**
    * In a paginated request, if this value isn't null, it's the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Summary information about the platform versions.
    */
  var PlatformSummaryList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformSummaryList] = js.native
}

object ListPlatformVersionsResult {
  @scala.inline
  def apply(): ListPlatformVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformVersionsResult]
  }
  @scala.inline
  implicit class ListPlatformVersionsResultOps[Self <: ListPlatformVersionsResult] (val x: Self) extends AnyVal {
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
    def setPlatformSummaryListVarargs(value: PlatformSummary*): Self = this.set("PlatformSummaryList", js.Array(value :_*))
    @scala.inline
    def setPlatformSummaryList(value: PlatformSummaryList): Self = this.set("PlatformSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformSummaryList: Self = this.set("PlatformSummaryList", js.undefined)
  }
  
}

