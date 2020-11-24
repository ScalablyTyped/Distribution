package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePermissionSetRequest extends js.Object {
  
  /**
    * The description of the PermissionSet.
    */
  var Description: js.UndefOr[PermissionSetDescription] = js.native
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The name of the PermissionSet.
    */
  var Name: PermissionSetName = js.native
  
  /**
    * Used to redirect users within the application during the federation authentication process.
    */
  var RelayState: js.UndefOr[typings.awsSdk.ssoadminMod.RelayState] = js.native
  
  /**
    * The length of time that the application user sessions are valid in the ISO-8601 standard.
    */
  var SessionDuration: js.UndefOr[Duration] = js.native
  
  /**
    * The tags to attach to the new PermissionSet.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreatePermissionSetRequest {
  
  @scala.inline
  def apply(InstanceArn: InstanceArn, Name: PermissionSetName): CreatePermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePermissionSetRequest]
  }
  
  @scala.inline
  implicit class CreatePermissionSetRequestOps[Self <: CreatePermissionSetRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceArn(value: InstanceArn): Self = this.set("InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: PermissionSetName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: PermissionSetDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setRelayState(value: RelayState): Self = this.set("RelayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelayState: Self = this.set("RelayState", js.undefined)
    
    @scala.inline
    def setSessionDuration(value: Duration): Self = this.set("SessionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDuration: Self = this.set("SessionDuration", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
