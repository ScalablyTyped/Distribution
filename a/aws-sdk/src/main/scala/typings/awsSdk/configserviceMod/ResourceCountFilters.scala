package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCountFilters extends js.Object {
  /**
    * The 12-digit ID of the account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * The region where the account is located.
    */
  var Region: js.UndefOr[AwsRegion] = js.native
  /**
    * The type of the AWS resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.configserviceMod.ResourceType] = js.native
}

object ResourceCountFilters {
  @scala.inline
  def apply(AccountId: AccountId = null, Region: AwsRegion = null, ResourceType: ResourceType = null): ResourceCountFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCountFilters]
  }
}

