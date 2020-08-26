package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourceAttributesRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.migrationhubMod.MigrationTaskName = js.native
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
  /**
    * Information about the resource that is being migrated. This data will be used to map the task to a resource in the Application Discovery Service repository.  Takes the object array of ResourceAttribute where the Type field is reserved for the following values: IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER where the identifying value can be a string up to 256 characters.     If any "VM" related value is set for a ResourceAttribute object, it is required that VM_MANAGER_ID, as a minimum, is always set. If VM_MANAGER_ID is not set, then all "VM" fields will be discarded and "VM" fields will not be used for matching the migration task to a server in Application Discovery Service repository. See the Example section below for a use case of specifying "VM" related values.    If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you know in separate type/value pairs passed to the ResourceAttributeList parameter to maximize the chances of matching.   
    */
  var ResourceAttributeList: typings.awsSdk.migrationhubMod.ResourceAttributeList = js.native
}

object PutResourceAttributesRequest {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream,
    ResourceAttributeList: ResourceAttributeList
  ): PutResourceAttributesRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any], ResourceAttributeList = ResourceAttributeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourceAttributesRequest]
  }
  @scala.inline
  implicit class PutResourceAttributesRequestOps[Self <: PutResourceAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMigrationTaskName(value: MigrationTaskName): Self = this.set("MigrationTaskName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = this.set("ProgressUpdateStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceAttributeListVarargs(value: ResourceAttribute*): Self = this.set("ResourceAttributeList", js.Array(value :_*))
    @scala.inline
    def setResourceAttributeList(value: ResourceAttributeList): Self = this.set("ResourceAttributeList", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: DryRun): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

