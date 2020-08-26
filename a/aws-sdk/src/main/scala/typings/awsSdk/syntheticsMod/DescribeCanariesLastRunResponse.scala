package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCanariesLastRunResponse extends js.Object {
  /**
    * An array that contains the information from the most recent run of each canary.
    */
  var CanariesLastRun: js.UndefOr[typings.awsSdk.syntheticsMod.CanariesLastRun] = js.native
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanariesLastRun operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeCanariesLastRunResponse {
  @scala.inline
  def apply(): DescribeCanariesLastRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesLastRunResponse]
  }
  @scala.inline
  implicit class DescribeCanariesLastRunResponseOps[Self <: DescribeCanariesLastRunResponse] (val x: Self) extends AnyVal {
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
    def setCanariesLastRunVarargs(value: CanaryLastRun*): Self = this.set("CanariesLastRun", js.Array(value :_*))
    @scala.inline
    def setCanariesLastRun(value: CanariesLastRun): Self = this.set("CanariesLastRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanariesLastRun: Self = this.set("CanariesLastRun", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

