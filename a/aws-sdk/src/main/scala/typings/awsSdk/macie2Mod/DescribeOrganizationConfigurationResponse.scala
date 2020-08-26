package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigurationResponse extends js.Object {
  /**
    * Specifies whether Amazon Macie is enabled automatically for accounts that are added to the AWS organization.
    */
  var autoEnable: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether the maximum number of Amazon Macie member accounts are already associated with the AWS organization.
    */
  var maxAccountLimitReached: js.UndefOr[boolean] = js.native
}

object DescribeOrganizationConfigurationResponse {
  @scala.inline
  def apply(): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationConfigurationResponseOps[Self <: DescribeOrganizationConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setAutoEnable(value: boolean): Self = this.set("autoEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoEnable: Self = this.set("autoEnable", js.undefined)
    @scala.inline
    def setMaxAccountLimitReached(value: boolean): Self = this.set("maxAccountLimitReached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAccountLimitReached: Self = this.set("maxAccountLimitReached", js.undefined)
  }
  
}

