package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRetentionPolicyRequest extends js.Object {
  
  /**
    * The retention policy description.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  
  /**
    * The retention policy folder configurations.
    */
  var FolderConfigurations: typings.awsSdk.workmailMod.FolderConfigurations = js.native
  
  /**
    * The retention policy ID.
    */
  var Id: js.UndefOr[ShortString] = js.native
  
  /**
    * The retention policy name.
    */
  var Name: ShortString = js.native
  
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}
object PutRetentionPolicyRequest {
  
  @scala.inline
  def apply(FolderConfigurations: FolderConfigurations, Name: ShortString, OrganizationId: OrganizationId): PutRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(FolderConfigurations = FolderConfigurations.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionPolicyRequest]
  }
  
  @scala.inline
  implicit class PutRetentionPolicyRequestOps[Self <: PutRetentionPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setFolderConfigurationsVarargs(value: FolderConfiguration*): Self = this.set("FolderConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setFolderConfigurations(value: FolderConfigurations): Self = this.set("FolderConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ShortString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setId(value: ShortString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
}
