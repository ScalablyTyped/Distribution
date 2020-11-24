package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBProxyTargetGroupRequest extends js.Object {
  
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfiguration] = js.native
  
  /**
    * The name of the new proxy to which to assign the target group.
    */
  var DBProxyName: String = js.native
  
  /**
    * The new name for the modified DBProxyTarget. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var NewName: js.UndefOr[String] = js.native
  
  /**
    * The name of the new target group to assign to the proxy.
    */
  var TargetGroupName: String = js.native
}
object ModifyDBProxyTargetGroupRequest {
  
  @scala.inline
  def apply(DBProxyName: String, TargetGroupName: String): ModifyDBProxyTargetGroupRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any], TargetGroupName = TargetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyTargetGroupRequest]
  }
  
  @scala.inline
  implicit class ModifyDBProxyTargetGroupRequestOps[Self <: ModifyDBProxyTargetGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setDBProxyName(value: String): Self = this.set("DBProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupName(value: String): Self = this.set("TargetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPoolConfig(value: ConnectionPoolConfiguration): Self = this.set("ConnectionPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionPoolConfig: Self = this.set("ConnectionPoolConfig", js.undefined)
    
    @scala.inline
    def setNewName(value: String): Self = this.set("NewName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewName: Self = this.set("NewName", js.undefined)
  }
}
