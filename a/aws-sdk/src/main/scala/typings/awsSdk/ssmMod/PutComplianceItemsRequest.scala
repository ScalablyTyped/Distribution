package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutComplianceItemsRequest extends js.Object {
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
  implicit class PutComplianceItemsRequestOps[Self <: PutComplianceItemsRequest] (val x: Self) extends AnyVal {
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
    def setComplianceType(value: ComplianceTypeName): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionSummary(value: ComplianceExecutionSummary): Self = this.set("ExecutionSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: ComplianceItemEntry*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: ComplianceItemEntryList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: ComplianceResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ComplianceResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemContentHash(value: ComplianceItemContentHash): Self = this.set("ItemContentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemContentHash: Self = this.set("ItemContentHash", js.undefined)
    @scala.inline
    def setUploadType(value: ComplianceUploadType): Self = this.set("UploadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadType: Self = this.set("UploadType", js.undefined)
  }
  
}

