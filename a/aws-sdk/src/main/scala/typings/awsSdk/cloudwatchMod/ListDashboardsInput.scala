package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDashboardsInput extends js.Object {
  /**
    * If you specify this parameter, only the dashboards with names starting with the specified string are listed. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_". 
    */
  var DashboardNamePrefix: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardNamePrefix] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}

object ListDashboardsInput {
  @scala.inline
  def apply(): ListDashboardsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardsInput]
  }
  @scala.inline
  implicit class ListDashboardsInputOps[Self <: ListDashboardsInput] (val x: Self) extends AnyVal {
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
    def setDashboardNamePrefix(value: DashboardNamePrefix): Self = this.set("DashboardNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardNamePrefix: Self = this.set("DashboardNamePrefix", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

