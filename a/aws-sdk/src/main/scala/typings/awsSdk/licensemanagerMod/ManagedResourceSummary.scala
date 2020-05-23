package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedResourceSummary extends js.Object {
  /**
    * Number of resources associated with licenses.
    */
  var AssociationCount: js.UndefOr[BoxLong] = js.native
  /**
    * Type of resource associated with a license.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object ManagedResourceSummary {
  @scala.inline
  def apply(AssociationCount: js.UndefOr[BoxLong] = js.undefined, ResourceType: ResourceType = null): ManagedResourceSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AssociationCount)) __obj.updateDynamic("AssociationCount")(AssociationCount.get.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedResourceSummary]
  }
}

