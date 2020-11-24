package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterIamRolesMessage extends js.Object {
  
  /**
    * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
    */
  var AddIamRoles: js.UndefOr[IamRoleArnList] = js.native
  
  /**
    * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles from a single cluster in a single request.
    */
  var RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.native
}
object ModifyClusterIamRolesMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): ModifyClusterIamRolesMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterIamRolesMessage]
  }
  
  @scala.inline
  implicit class ModifyClusterIamRolesMessageOps[Self <: ModifyClusterIamRolesMessage] (val x: Self) extends AnyVal {
    
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddIamRolesVarargs(value: String*): Self = this.set("AddIamRoles", js.Array(value :_*))
    
    @scala.inline
    def setAddIamRoles(value: IamRoleArnList): Self = this.set("AddIamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddIamRoles: Self = this.set("AddIamRoles", js.undefined)
    
    @scala.inline
    def setRemoveIamRolesVarargs(value: String*): Self = this.set("RemoveIamRoles", js.Array(value :_*))
    
    @scala.inline
    def setRemoveIamRoles(value: IamRoleArnList): Self = this.set("RemoveIamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIamRoles: Self = this.set("RemoveIamRoles", js.undefined)
  }
}
