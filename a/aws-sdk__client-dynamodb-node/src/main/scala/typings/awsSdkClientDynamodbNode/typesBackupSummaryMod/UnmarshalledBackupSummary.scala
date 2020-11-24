package typings.awsSdkClientDynamodbNode.typesBackupSummaryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledBackupSummary extends BackupSummary {
  
  /**
    * <p>Time at which the backup was created.</p>
    */
  @JSName("BackupCreationDateTime")
  var BackupCreationDateTime_UnmarshalledBackupSummary: js.UndefOr[Date] = js.native
  
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  @JSName("BackupExpiryDateTime")
  var BackupExpiryDateTime_UnmarshalledBackupSummary: js.UndefOr[Date] = js.native
}
object UnmarshalledBackupSummary {
  
  @scala.inline
  def apply(): UnmarshalledBackupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledBackupSummary]
  }
  
  @scala.inline
  implicit class UnmarshalledBackupSummaryOps[Self <: UnmarshalledBackupSummary] (val x: Self) extends AnyVal {
    
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
    def setBackupCreationDateTime(value: Date): Self = this.set("BackupCreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupCreationDateTime: Self = this.set("BackupCreationDateTime", js.undefined)
    
    @scala.inline
    def setBackupExpiryDateTime(value: Date): Self = this.set("BackupExpiryDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupExpiryDateTime: Self = this.set("BackupExpiryDateTime", js.undefined)
  }
}
