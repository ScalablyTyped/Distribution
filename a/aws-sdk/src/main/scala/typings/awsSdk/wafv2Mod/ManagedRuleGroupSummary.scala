package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedRuleGroupSummary extends js.Object {
  /**
    * The description of the managed rule group, provided by AWS or the AWS Marketplace seller who manages it.
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
  def apply(Description: EntityDescription = null, Name: EntityName = null, VendorName: VendorName = null): ManagedRuleGroupSummary = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (VendorName != null) __obj.updateDynamic("VendorName")(VendorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedRuleGroupSummary]
  }
}

