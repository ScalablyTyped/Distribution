package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutComplianceItemsRequest extends StObject {
  
  /**
    * Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or Custom:string.
    */
  var ComplianceType: ComplianceTypeName = js.native
  
  /**
    * A summary of the call execution that includes an execution ID, the type of execution (for example, Command), and the date/time of the execution using a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
    */
  var ExecutionSummary: ComplianceExecutionSummary = js.native
  
  /**
    * MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be overwritten or ignored. If the content hashes match, the request to put compliance information is ignored.
    */
  var ItemContentHash: js.UndefOr[ComplianceItemContentHash] = js.native
  
  /**
    * Information about the compliance as defined by the resource type. For example, for a patch compliance type, Items includes information about the PatchSeverity, Classification, and so on.
    */
  var Items: ComplianceItemEntryList = js.native
  
  /**
    * Specify an ID for this resource. For a managed instance, this is the instance ID.
    */
  var ResourceId: ComplianceResourceId = js.native
  
  /**
    * Specify the type of resource. ManagedInstance is currently the only supported resource type.
    */
  var ResourceType: ComplianceResourceType = js.native
  
  /**
    * The mode for uploading compliance items. You can specify COMPLETE or PARTIAL. In COMPLETE mode, the system overwrites all existing compliance information for the resource. You must provide a full list of compliance items each time you send the request. In PARTIAL mode, the system overwrites compliance information for a specific association. The association must be configured with SyncCompliance set to MANUAL. By default, all requests use COMPLETE mode.  This attribute is only valid for association compliance. 
    */
  var UploadType: js.UndefOr[ComplianceUploadType] = js.native
}
object PutComplianceItemsRequest {
  
  @scala.inline
  def apply(
    ComplianceType: ComplianceTypeName,
    ExecutionSummary: ComplianceExecutionSummary,
    Items: ComplianceItemEntryList,
    ResourceId: ComplianceResourceId,
    ResourceType: ComplianceResourceType
  ): PutComplianceItemsRequest = {
    val __obj = js.Dynamic.literal(ComplianceType = ComplianceType.asInstanceOf[js.Any], ExecutionSummary = ExecutionSummary.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutComplianceItemsRequest]
  }
  
  @scala.inline
  implicit class PutComplianceItemsRequestMutableBuilder[Self <: PutComplianceItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceType(value: ComplianceTypeName): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionSummary(value: ComplianceExecutionSummary): Self = StObject.set(x, "ExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemContentHash(value: ComplianceItemContentHash): Self = StObject.set(x, "ItemContentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemContentHashUndefined: Self = StObject.set(x, "ItemContentHash", js.undefined)
    
    @scala.inline
    def setItems(value: ComplianceItemEntryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ComplianceItemEntry*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: ComplianceResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ComplianceResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadType(value: ComplianceUploadType): Self = StObject.set(x, "UploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "UploadType", js.undefined)
  }
}
