package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowsForTargetRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The type of resource you want to retrieve information about. For example, "INSTANCE".
    */
  var ResourceType: MaintenanceWindowResourceType = js.native
  /**
    * The instance ID or key/value pair to retrieve information about.
    */
  var Targets: typings.awsSdk.ssmMod.Targets = js.native
}

object DescribeMaintenanceWindowsForTargetRequest {
  @scala.inline
  def apply(ResourceType: MaintenanceWindowResourceType, Targets: Targets): DescribeMaintenanceWindowsForTargetRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetRequest]
  }
  @scala.inline
  implicit class DescribeMaintenanceWindowsForTargetRequestOps[Self <: DescribeMaintenanceWindowsForTargetRequest] (val x: Self) extends AnyVal {
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
    def setResourceType(value: MaintenanceWindowResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaintenanceWindowSearchMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

