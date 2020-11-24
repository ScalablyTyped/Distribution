package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupPolicyDescription extends js.Object {
  
  /**
    * Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
    */
  var BackupPolicy: js.UndefOr[typings.awsSdk.efsMod.BackupPolicy] = js.native
}
object BackupPolicyDescription {
  
  @scala.inline
  def apply(): BackupPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupPolicyDescription]
  }
  
  @scala.inline
  implicit class BackupPolicyDescriptionOps[Self <: BackupPolicyDescription] (val x: Self) extends AnyVal {
    
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
    def setBackupPolicy(value: BackupPolicy): Self = this.set("BackupPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPolicy: Self = this.set("BackupPolicy", js.undefined)
  }
}
