package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItem extends StObject {
  
  /**
    * An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
    */
  var Category: js.UndefOr[OpsItemCategory] = js.undefined
  
  /**
    * The ARN of the AWS account that created the OpsItem.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the OpsItem was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The OpsItem description.
    */
  var Description: js.UndefOr[OpsItemDescription] = js.undefined
  
  /**
    * The ARN of the AWS account that last updated the OpsItem.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the OpsItem was last updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.undefined
  
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see Creating OpsItems manually in the AWS Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[typings.awsSdk.ssmMod.OpsItemId] = js.undefined
  
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  
  /**
    * One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typings.awsSdk.ssmMod.RelatedOpsItems] = js.undefined
  
  /**
    * The severity of the OpsItem. Severity options range from 1 to 4.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.undefined
  
  /**
    * The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.
    */
  var Source: js.UndefOr[OpsItemSource] = js.undefined
  
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved. For more information, see Editing OpsItem details in the AWS Systems Manager User Guide.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.undefined
  
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.undefined
  
  /**
    * The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object OpsItem {
  
  @scala.inline
  def apply(): OpsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItem]
  }
  
  @scala.inline
  implicit class OpsItemMutableBuilder[Self <: OpsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: OpsItemCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: DateTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: OpsItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: DateTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setNotifications(value: OpsItemNotifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: OpsItemNotification*): Self = StObject.set(x, "Notifications", js.Array(value :_*))
    
    @scala.inline
    def setOperationalData(value: OpsItemOperationalData): Self = StObject.set(x, "OperationalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationalDataUndefined: Self = StObject.set(x, "OperationalData", js.undefined)
    
    @scala.inline
    def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
    
    @scala.inline
    def setPriority(value: OpsItemPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setRelatedOpsItems(value: RelatedOpsItems): Self = StObject.set(x, "RelatedOpsItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedOpsItemsUndefined: Self = StObject.set(x, "RelatedOpsItems", js.undefined)
    
    @scala.inline
    def setRelatedOpsItemsVarargs(value: RelatedOpsItem*): Self = StObject.set(x, "RelatedOpsItems", js.Array(value :_*))
    
    @scala.inline
    def setSeverity(value: OpsItemSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    @scala.inline
    def setSource(value: OpsItemSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setStatus(value: OpsItemStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTitle(value: OpsItemTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
