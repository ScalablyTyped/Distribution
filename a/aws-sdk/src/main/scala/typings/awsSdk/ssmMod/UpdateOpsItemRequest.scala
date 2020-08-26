package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOpsItemRequest extends js.Object {
  /**
    * Specify a new category for an OpsItem.
    */
  var Category: js.UndefOr[OpsItemCategory] = js.native
  /**
    * Update the information about the OpsItem. Provide enough information so that users reading this OpsItem for the first time understand the issue. 
    */
  var Description: js.UndefOr[OpsItemDescription] = js.native
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.native
  /**
    * Add new keys or edit existing key-value pairs of the OperationalData map in the OpsItem object. Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see Creating OpsItems manually in the AWS Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.native
  /**
    * Keys that you want to remove from the OperationalData map.
    */
  var OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList] = js.native
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: typings.awsSdk.ssmMod.OpsItemId = js.native
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.native
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typings.awsSdk.ssmMod.RelatedOpsItems] = js.native
  /**
    * Specify a new severity for an OpsItem.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.native
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved. For more information, see Editing OpsItem details in the AWS Systems Manager User Guide.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.native
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.native
}

object UpdateOpsItemRequest {
  @scala.inline
  def apply(OpsItemId: OpsItemId): UpdateOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOpsItemRequest]
  }
  @scala.inline
  implicit class UpdateOpsItemRequestOps[Self <: UpdateOpsItemRequest] (val x: Self) extends AnyVal {
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
    def setOpsItemId(value: OpsItemId): Self = this.set("OpsItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: OpsItemCategory): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    @scala.inline
    def setDescription(value: OpsItemDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setNotificationsVarargs(value: OpsItemNotification*): Self = this.set("Notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: OpsItemNotifications): Self = this.set("Notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifications: Self = this.set("Notifications", js.undefined)
    @scala.inline
    def setOperationalData(value: OpsItemOperationalData): Self = this.set("OperationalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationalData: Self = this.set("OperationalData", js.undefined)
    @scala.inline
    def setOperationalDataToDeleteVarargs(value: String*): Self = this.set("OperationalDataToDelete", js.Array(value :_*))
    @scala.inline
    def setOperationalDataToDelete(value: OpsItemOpsDataKeysList): Self = this.set("OperationalDataToDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationalDataToDelete: Self = this.set("OperationalDataToDelete", js.undefined)
    @scala.inline
    def setPriority(value: OpsItemPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setRelatedOpsItemsVarargs(value: RelatedOpsItem*): Self = this.set("RelatedOpsItems", js.Array(value :_*))
    @scala.inline
    def setRelatedOpsItems(value: RelatedOpsItems): Self = this.set("RelatedOpsItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedOpsItems: Self = this.set("RelatedOpsItems", js.undefined)
    @scala.inline
    def setSeverity(value: OpsItemSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
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

