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
  def apply(): ManagedResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedResourceSummary]
  }
  @scala.inline
  implicit class ManagedResourceSummaryOps[Self <: ManagedResourceSummary] (val x: Self) extends AnyVal {
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
    def setAssociationCount(value: BoxLong): Self = this.set("AssociationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationCount: Self = this.set("AssociationCount", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

