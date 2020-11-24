package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackupOutput extends js.Object {
  
  /**
    * Contains the details of the backup created for the table.
    */
  var BackupDetails: js.UndefOr[typings.awsSdk.dynamodbMod.BackupDetails] = js.native
}
object CreateBackupOutput {
  
  @scala.inline
  def apply(): CreateBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupOutput]
  }
  
  @scala.inline
  implicit class CreateBackupOutputOps[Self <: CreateBackupOutput] (val x: Self) extends AnyVal {
    
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
    def setBackupDetails(value: BackupDetails): Self = this.set("BackupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupDetails: Self = this.set("BackupDetails", js.undefined)
  }
}
