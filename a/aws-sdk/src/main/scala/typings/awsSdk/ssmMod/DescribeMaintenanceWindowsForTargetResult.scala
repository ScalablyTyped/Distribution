package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowsForTargetResult extends js.Object {
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about the maintenance window targets and tasks an instance is associated with.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.native
}

object DescribeMaintenanceWindowsForTargetResult {
  @scala.inline
  def apply(): DescribeMaintenanceWindowsForTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetResult]
  }
  @scala.inline
  implicit class DescribeMaintenanceWindowsForTargetResultOps[Self <: DescribeMaintenanceWindowsForTargetResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setWindowIdentitiesVarargs(value: MaintenanceWindowIdentityForTarget*): Self = this.set("WindowIdentities", js.Array(value :_*))
    @scala.inline
    def setWindowIdentities(value: MaintenanceWindowsForTargetList): Self = this.set("WindowIdentities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowIdentities: Self = this.set("WindowIdentities", js.undefined)
  }
  
}

