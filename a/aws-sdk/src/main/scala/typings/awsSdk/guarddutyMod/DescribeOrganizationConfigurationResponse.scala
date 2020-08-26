package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigurationResponse extends js.Object {
  /**
    * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
    */
  var AutoEnable: Boolean = js.native
  /**
    * An object that describes which data sources are enabled automatically for member accounts.
    */
  var DataSources: js.UndefOr[OrganizationDataSourceConfigurationsResult] = js.native
  /**
    * Indicates whether the maximum number of allowed member accounts are already associated with the delegated administrator master account.
    */
  var MemberAccountLimitReached: Boolean = js.native
}

object DescribeOrganizationConfigurationResponse {
  @scala.inline
  def apply(AutoEnable: Boolean, MemberAccountLimitReached: Boolean): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any], MemberAccountLimitReached = MemberAccountLimitReached.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationConfigurationResponseOps[Self <: DescribeOrganizationConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setAutoEnable(value: Boolean): Self = this.set("AutoEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberAccountLimitReached(value: Boolean): Self = this.set("MemberAccountLimitReached", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSources(value: OrganizationDataSourceConfigurationsResult): Self = this.set("DataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSources: Self = this.set("DataSources", js.undefined)
  }
  
}

