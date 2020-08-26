package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConfigRuleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an organization config rule.
    */
  var OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.native
}

object PutOrganizationConfigRuleResponse {
  @scala.inline
  def apply(): PutOrganizationConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOrganizationConfigRuleResponse]
  }
  @scala.inline
  implicit class PutOrganizationConfigRuleResponseOps[Self <: PutOrganizationConfigRuleResponse] (val x: Self) extends AnyVal {
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
    def setOrganizationConfigRuleArn(value: StringWithCharLimit256): Self = this.set("OrganizationConfigRuleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationConfigRuleArn: Self = this.set("OrganizationConfigRuleArn", js.undefined)
  }
  
}

