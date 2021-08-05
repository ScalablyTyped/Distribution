package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOpsItemRequest extends StObject {
  
  /**
    * Specify a new category for an OpsItem.
    */
  var Category: js.UndefOr[OpsItemCategory] = js.undefined
  
  /**
    * Update the information about the OpsItem. Provide enough information so that users reading this OpsItem for the first time understand the issue. 
    */
  var Description: js.UndefOr[OpsItemDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.undefined
  
  /**
    * Add new keys or edit existing key-value pairs of the OperationalData map in the OpsItem object. Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see Creating OpsItems manually in the AWS Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  
  /**
    * Keys that you want to remove from the OperationalData map.
    */
  var OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList] = js.undefined
  
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: typings.awsSdk.ssmMod.OpsItemId
  
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typings.awsSdk.ssmMod.RelatedOpsItems] = js.undefined
  
  /**
    * Specify a new severity for an OpsItem.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.undefined
  
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved. For more information, see Editing OpsItem details in the AWS Systems Manager User Guide.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.undefined
  
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.undefined
}
object UpdateOpsItemRequest {
  
  inline def apply(OpsItemId: OpsItemId): UpdateOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOpsItemRequest]
  }
  
  extension [Self <: UpdateOpsItemRequest](x: Self) {
    
    inline def setCategory(value: OpsItemCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setDescription(value: OpsItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setNotifications(value: OpsItemNotifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
    
    inline def setNotificationsVarargs(value: OpsItemNotification*): Self = StObject.set(x, "Notifications", js.Array(value :_*))
    
    inline def setOperationalData(value: OpsItemOperationalData): Self = StObject.set(x, "OperationalData", value.asInstanceOf[js.Any])
    
    inline def setOperationalDataToDelete(value: OpsItemOpsDataKeysList): Self = StObject.set(x, "OperationalDataToDelete", value.asInstanceOf[js.Any])
    
    inline def setOperationalDataToDeleteUndefined: Self = StObject.set(x, "OperationalDataToDelete", js.undefined)
    
    inline def setOperationalDataToDeleteVarargs(value: String*): Self = StObject.set(x, "OperationalDataToDelete", js.Array(value :_*))
    
    inline def setOperationalDataUndefined: Self = StObject.set(x, "OperationalData", js.undefined)
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: OpsItemPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setRelatedOpsItems(value: RelatedOpsItems): Self = StObject.set(x, "RelatedOpsItems", value.asInstanceOf[js.Any])
    
    inline def setRelatedOpsItemsUndefined: Self = StObject.set(x, "RelatedOpsItems", js.undefined)
    
    inline def setRelatedOpsItemsVarargs(value: RelatedOpsItem*): Self = StObject.set(x, "RelatedOpsItems", js.Array(value :_*))
    
    inline def setSeverity(value: OpsItemSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setStatus(value: OpsItemStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTitle(value: OpsItemTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
