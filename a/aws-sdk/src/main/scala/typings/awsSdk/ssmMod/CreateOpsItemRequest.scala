package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOpsItemRequest extends StObject {
  
  /**
    * Specify a category to assign to an OpsItem. 
    */
  var Category: js.UndefOr[OpsItemCategory] = js.native
  
  /**
    * Information about the OpsItem. 
    */
  var Description: OpsItemDescription = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.native
  
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see Creating OpsItems manually in the AWS Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.native
  
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.native
  
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typings.awsSdk.ssmMod.RelatedOpsItems] = js.native
  
  /**
    * Specify a severity to assign to an OpsItem.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.native
  
  /**
    * The origin of the OpsItem, such as Amazon EC2 or Systems Manager.  The source name can't contain the following strings: aws, amazon, and amzn.  
    */
  var Source: OpsItemSource = js.native
  
  /**
    * Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline IAM policy that specifies tags. For more information, see Getting started with OpsCenter in the AWS Systems Manager User Guide. Tags use a key-value pair. For example:  Key=Department,Value=Finance   To add tags to an existing OpsItem, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: OpsItemTitle = js.native
}
object CreateOpsItemRequest {
  
  @scala.inline
  def apply(Description: OpsItemDescription, Source: OpsItemSource, Title: OpsItemTitle): CreateOpsItemRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpsItemRequest]
  }
  
  @scala.inline
  implicit class CreateOpsItemRequestMutableBuilder[Self <: CreateOpsItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: OpsItemCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setDescription(value: OpsItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
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
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: OpsItemTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
