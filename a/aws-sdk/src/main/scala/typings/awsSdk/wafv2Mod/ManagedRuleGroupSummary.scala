package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedRuleGroupSummary extends js.Object {
  
  /**
    * The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller who manages it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: js.UndefOr[EntityName] = js.native
  
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: js.UndefOr[typings.awsSdk.wafv2Mod.VendorName] = js.native
}
object ManagedRuleGroupSummary {
  
  @scala.inline
  def apply(): ManagedRuleGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedRuleGroupSummary]
  }
  
  @scala.inline
  implicit class ManagedRuleGroupSummaryOps[Self <: ManagedRuleGroupSummary] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: EntityDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setVendorName(value: VendorName): Self = this.set("VendorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorName: Self = this.set("VendorName", js.undefined)
  }
}
