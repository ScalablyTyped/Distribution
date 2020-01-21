package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTagMapping extends js.Object {
  /**
    * Information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
    */
  var ComplianceDetails: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ComplianceDetails] = js.native
  /**
    * The ARN of the resource.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ResourceARN] = js.native
  /**
    * The tags that have been applied to one or more AWS resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ResourceTagMapping {
  @scala.inline
  def apply(ComplianceDetails: ComplianceDetails = null, ResourceARN: ResourceARN = null, Tags: TagList = null): ResourceTagMapping = {
    val __obj = js.Dynamic.literal()
    if (ComplianceDetails != null) __obj.updateDynamic("ComplianceDetails")(ComplianceDetails.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTagMapping]
  }
}

