package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContinuousExportsResponse extends js.Object {
  /**
    * A list of continuous export descriptions.
    */
  var descriptions: js.UndefOr[ContinuousExportDescriptions] = js.native
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeContinuousExportsResponse {
  @scala.inline
  def apply(): DescribeContinuousExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousExportsResponse]
  }
  @scala.inline
  implicit class DescribeContinuousExportsResponseOps[Self <: DescribeContinuousExportsResponse] (val x: Self) extends AnyVal {
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
    def setDescriptionsVarargs(value: ContinuousExportDescription*): Self = this.set("descriptions", js.Array(value :_*))
    @scala.inline
    def setDescriptions(value: ContinuousExportDescriptions): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

