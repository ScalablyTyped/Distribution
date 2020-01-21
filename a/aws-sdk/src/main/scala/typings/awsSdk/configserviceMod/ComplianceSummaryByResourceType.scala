package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceSummaryByResourceType extends js.Object {
  /**
    * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each.
    */
  var ComplianceSummary: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceSummary] = js.native
  /**
    * The type of AWS resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object ComplianceSummaryByResourceType {
  @scala.inline
  def apply(ComplianceSummary: ComplianceSummary = null, ResourceType: StringWithCharLimit256 = null): ComplianceSummaryByResourceType = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummary != null) __obj.updateDynamic("ComplianceSummary")(ComplianceSummary.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceSummaryByResourceType]
  }
}

