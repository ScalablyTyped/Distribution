package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSnapshotsRequest extends js.Object {
  
  /**
    * Copies the tags from the specified volume to corresponding snapshot.
    */
  var CopyTagsFromSource: js.UndefOr[typings.awsSdk.ec2Mod.CopyTagsFromSource] = js.native
  
  /**
    *  A description propagated to every snapshot specified by the instance.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The instance to specify which volumes should be included in the snapshots.
    */
  var InstanceSpecification: typings.awsSdk.ec2Mod.InstanceSpecification = js.native
  
  /**
    * Tags to apply to every snapshot specified by the instance.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object CreateSnapshotsRequest {
  
  @scala.inline
  def apply(InstanceSpecification: InstanceSpecification): CreateSnapshotsRequest = {
    val __obj = js.Dynamic.literal(InstanceSpecification = InstanceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotsRequest]
  }
  
  @scala.inline
  implicit class CreateSnapshotsRequestOps[Self <: CreateSnapshotsRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceSpecification(value: InstanceSpecification): Self = this.set("InstanceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsFromSource(value: CopyTagsFromSource): Self = this.set("CopyTagsFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsFromSource: Self = this.set("CopyTagsFromSource", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
}
