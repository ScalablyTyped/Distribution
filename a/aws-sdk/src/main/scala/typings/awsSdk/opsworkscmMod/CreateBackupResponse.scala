package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackupResponse extends js.Object {
  
  /**
    * Backup created by request.
    */
  var Backup: js.UndefOr[typings.awsSdk.opsworkscmMod.Backup] = js.native
}
object CreateBackupResponse {
  
  @scala.inline
  def apply(): CreateBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupResponse]
  }
  
  @scala.inline
  implicit class CreateBackupResponseOps[Self <: CreateBackupResponse] (val x: Self) extends AnyVal {
    
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
    def setBackup(value: Backup): Self = this.set("Backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackup: Self = this.set("Backup", js.undefined)
  }
}
