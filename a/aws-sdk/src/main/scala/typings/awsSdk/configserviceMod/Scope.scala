package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  /**
    * The ID of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for ComplianceResourceTypes.
    */
  var ComplianceResourceId: js.UndefOr[BaseResourceId] = js.native
  /**
    * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only specify one type if you also specify a resource ID for ComplianceResourceId.
    */
  var ComplianceResourceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceResourceTypes] = js.native
  /**
    * The tag key that is applied to only those AWS resources that you want to trigger an evaluation for the rule.
    */
  var TagKey: js.UndefOr[StringWithCharLimit128] = js.native
  /**
    * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you specify a value for TagValue, you must also specify a value for TagKey.
    */
  var TagValue: js.UndefOr[StringWithCharLimit256] = js.native
}

object Scope {
  @scala.inline
  def apply(
    ComplianceResourceId: BaseResourceId = null,
    ComplianceResourceTypes: ComplianceResourceTypes = null,
    TagKey: StringWithCharLimit128 = null,
    TagValue: StringWithCharLimit256 = null
  ): Scope = {
    val __obj = js.Dynamic.literal()
    if (ComplianceResourceId != null) __obj.updateDynamic("ComplianceResourceId")(ComplianceResourceId.asInstanceOf[js.Any])
    if (ComplianceResourceTypes != null) __obj.updateDynamic("ComplianceResourceTypes")(ComplianceResourceTypes.asInstanceOf[js.Any])
    if (TagKey != null) __obj.updateDynamic("TagKey")(TagKey.asInstanceOf[js.Any])
    if (TagValue != null) __obj.updateDynamic("TagValue")(TagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

