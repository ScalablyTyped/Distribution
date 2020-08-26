package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCanaryRunsRequest extends js.Object {
  /**
    * Specify this parameter to limit how many runs are returned each time you use the GetCanaryRuns operation. If you omit this parameter, the default of 100 is used.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.native
  /**
    * The name of the canary that you want to see runs for.
    */
  var Name: CanaryName = js.native
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent GetCanaryRuns operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCanaryRunsRequest {
  @scala.inline
  def apply(Name: CanaryName): GetCanaryRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryRunsRequest]
  }
  @scala.inline
  implicit class GetCanaryRunsRequestOps[Self <: GetCanaryRunsRequest] (val x: Self) extends AnyVal {
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
    def setName(value: CanaryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxSize100): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

