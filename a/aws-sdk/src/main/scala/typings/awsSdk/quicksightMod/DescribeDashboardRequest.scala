package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDashboardRequest extends js.Object {
  /**
    * The alias name.
    */
  var AliasName: js.UndefOr[typings.awsSdk.quicksightMod.AliasName] = js.native
  /**
    * The ID of the AWS account that contains the dashboard that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * The version number for the dashboard. If a version number isn't passed, the latest published dashboard version is described. 
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object DescribeDashboardRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    AliasName: AliasName = null,
    VersionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): DescribeDashboardRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName.asInstanceOf[js.Any])
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardRequest]
  }
}

