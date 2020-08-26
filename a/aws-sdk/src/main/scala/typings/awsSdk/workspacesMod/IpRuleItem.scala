package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpRuleItem extends js.Object {
  /**
    * The IP address range, in CIDR notation.
    */
  var ipRule: js.UndefOr[IpRule] = js.native
  /**
    * The description.
    */
  var ruleDesc: js.UndefOr[IpRuleDesc] = js.native
}

object IpRuleItem {
  @scala.inline
  def apply(): IpRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpRuleItem]
  }
  @scala.inline
  implicit class IpRuleItemOps[Self <: IpRuleItem] (val x: Self) extends AnyVal {
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
    def setIpRule(value: IpRule): Self = this.set("ipRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpRule: Self = this.set("ipRule", js.undefined)
    @scala.inline
    def setRuleDesc(value: IpRuleDesc): Self = this.set("ruleDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleDesc: Self = this.set("ruleDesc", js.undefined)
  }
  
}

