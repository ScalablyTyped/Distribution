package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about the maintenance windows.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.native
}

object DescribeMaintenanceWindowsResult {
  @scala.inline
  def apply(): DescribeMaintenanceWindowsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowsResult]
  }
  @scala.inline
  implicit class DescribeMaintenanceWindowsResultOps[Self <: DescribeMaintenanceWindowsResult] (val x: Self) extends AnyVal {
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
    def setWindowIdentitiesVarargs(value: MaintenanceWindowIdentity*): Self = this.set("WindowIdentities", js.Array(value :_*))
    @scala.inline
    def setWindowIdentities(value: MaintenanceWindowIdentityList): Self = this.set("WindowIdentities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowIdentities: Self = this.set("WindowIdentities", js.undefined)
  }
  
}

