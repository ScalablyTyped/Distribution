package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupRetentionPolicy extends js.Object {
  
  /**
    * The type of backup retention policy. For the DAYS type, the value is the number of days to retain backups.
    */
  var Type: js.UndefOr[BackupRetentionType] = js.native
  
  /**
    * Use a value between 7 - 379.
    */
  var Value: js.UndefOr[BackupRetentionValue] = js.native
}
object BackupRetentionPolicy {
  
  @scala.inline
  def apply(): BackupRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupRetentionPolicy]
  }
  
  @scala.inline
  implicit class BackupRetentionPolicyOps[Self <: BackupRetentionPolicy] (val x: Self) extends AnyVal {
    
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
    def setType(value: BackupRetentionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValue(value: BackupRetentionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
