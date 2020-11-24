package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreServerRequest extends js.Object {
  
  /**
    *  The ID of the backup that you want to use to restore a server. 
    */
  var BackupId: typings.awsSdk.opsworkscmMod.BackupId = js.native
  
  /**
    *  The type of instance to restore. Valid values must be specified in the following format: ^([cm][34]|t2).* For example, m5.large. Valid values are m5.large, r5.xlarge, and r5.2xlarge. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. 
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    *  The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. 
    */
  var KeyPair: js.UndefOr[typings.awsSdk.opsworkscmMod.KeyPair] = js.native
  
  /**
    *  The name of the server that you want to restore. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}
object RestoreServerRequest {
  
  @scala.inline
  def apply(BackupId: BackupId, ServerName: ServerName): RestoreServerRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreServerRequest]
  }
  
  @scala.inline
  implicit class RestoreServerRequestOps[Self <: RestoreServerRequest] (val x: Self) extends AnyVal {
    
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
    def setBackupId(value: BackupId): Self = this.set("BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setKeyPair(value: KeyPair): Self = this.set("KeyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPair: Self = this.set("KeyPair", js.undefined)
  }
}
