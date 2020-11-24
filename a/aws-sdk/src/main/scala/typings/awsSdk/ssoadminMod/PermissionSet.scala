package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionSet extends js.Object {
  
  /**
    * The date that the permission set was created.
    */
  var CreatedDate: js.UndefOr[Date] = js.native
  
  /**
    * The description of the PermissionSet.
    */
  var Description: js.UndefOr[PermissionSetDescription] = js.native
  
  /**
    * The name of the permission set.
    */
  var Name: js.UndefOr[PermissionSetName] = js.native
  
  /**
    * The ARN of the permission set. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PermissionSetArn: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionSetArn] = js.native
  
  /**
    * Used to redirect users within the application during the federation authentication process.
    */
  var RelayState: js.UndefOr[typings.awsSdk.ssoadminMod.RelayState] = js.native
  
  /**
    * The length of time that the application user sessions are valid for in the ISO-8601 standard.
    */
  var SessionDuration: js.UndefOr[Duration] = js.native
}
object PermissionSet {
  
  @scala.inline
  def apply(): PermissionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionSet]
  }
  
  @scala.inline
  implicit class PermissionSetOps[Self <: PermissionSet] (val x: Self) extends AnyVal {
    
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
    def setCreatedDate(value: Date): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: PermissionSetDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setName(value: PermissionSetName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = this.set("PermissionSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionSetArn: Self = this.set("PermissionSetArn", js.undefined)
    
    @scala.inline
    def setRelayState(value: RelayState): Self = this.set("RelayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelayState: Self = this.set("RelayState", js.undefined)
    
    @scala.inline
    def setSessionDuration(value: Duration): Self = this.set("SessionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDuration: Self = this.set("SessionDuration", js.undefined)
  }
}
