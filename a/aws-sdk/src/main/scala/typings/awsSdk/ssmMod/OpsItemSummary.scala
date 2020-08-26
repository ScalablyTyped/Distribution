package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsItemSummary extends js.Object {
  /**
    * A list of OpsItems by category.
    */
  var Category: js.UndefOr[OpsItemCategory] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
    */
  var CreatedBy: js.UndefOr[String] = js.native
  /**
    * The date and time the OpsItem was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  /**
    * The date and time the OpsItem was last updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. 
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.native
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[typings.awsSdk.ssmMod.OpsItemId] = js.native
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.native
  /**
    * A list of OpsItems by severity.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.native
  /**
    * The impacted AWS resource.
    */
  var Source: js.UndefOr[OpsItemSource] = js.native
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.native
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.native
}

object OpsItemSummary {
  @scala.inline
  def apply(): OpsItemSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemSummary]
  }
  @scala.inline
  implicit class OpsItemSummaryOps[Self <: OpsItemSummary] (val x: Self) extends AnyVal {
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
    def setCategory(value: OpsItemCategory): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setCreatedTime(value: DateTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: DateTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setOperationalData(value: OpsItemOperationalData): Self = this.set("OperationalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationalData: Self = this.set("OperationalData", js.undefined)
    @scala.inline
    def setOpsItemId(value: OpsItemId): Self = this.set("OpsItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpsItemId: Self = this.set("OpsItemId", js.undefined)
    @scala.inline
    def setPriority(value: OpsItemPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setSeverity(value: OpsItemSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
    @scala.inline
    def setSource(value: OpsItemSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setStatus(value: OpsItemStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTitle(value: OpsItemTitle): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
  
}

