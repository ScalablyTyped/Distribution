package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAliasPermission extends js.Object {
  
  /**
    * Indicates whether the specified AWS account is allowed to associate the connection alias with a directory.
    */
  var AllowAssociation: BooleanObject = js.native
  
  /**
    * The identifier of the AWS account that the connection alias is shared with.
    */
  var SharedAccountId: AwsAccount = js.native
}
object ConnectionAliasPermission {
  
  @scala.inline
  def apply(AllowAssociation: BooleanObject, SharedAccountId: AwsAccount): ConnectionAliasPermission = {
    val __obj = js.Dynamic.literal(AllowAssociation = AllowAssociation.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAliasPermission]
  }
  
  @scala.inline
  implicit class ConnectionAliasPermissionOps[Self <: ConnectionAliasPermission] (val x: Self) extends AnyVal {
    
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
    def setAllowAssociation(value: BooleanObject): Self = this.set("AllowAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccountId(value: AwsAccount): Self = this.set("SharedAccountId", value.asInstanceOf[js.Any])
  }
}
