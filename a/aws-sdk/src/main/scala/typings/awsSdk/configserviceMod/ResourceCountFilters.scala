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
  def apply(): ResourceCountFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCountFilters]
  }
  @scala.inline
  implicit class ResourceCountFiltersOps[Self <: ResourceCountFilters] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setRegion(value: AwsRegion): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

