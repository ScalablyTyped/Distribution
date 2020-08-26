package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDashboardsOutput extends js.Object {
  /**
    * The list of matching dashboards.
    */
  var DashboardEntries: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardEntries] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}

object ListDashboardsOutput {
  @scala.inline
  def apply(): ListDashboardsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardsOutput]
  }
  @scala.inline
  implicit class ListDashboardsOutputOps[Self <: ListDashboardsOutput] (val x: Self) extends AnyVal {
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
    def setDashboardEntriesVarargs(value: DashboardEntry*): Self = this.set("DashboardEntries", js.Array(value :_*))
    @scala.inline
    def setDashboardEntries(value: DashboardEntries): Self = this.set("DashboardEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardEntries: Self = this.set("DashboardEntries", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

