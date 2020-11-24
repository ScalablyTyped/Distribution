package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBInstanceAutomatedBackupMessage extends js.Object {
  
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
    */
  var DbiResourceId: String = js.native
}
object DeleteDBInstanceAutomatedBackupMessage {
  
  @scala.inline
  def apply(DbiResourceId: String): DeleteDBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal(DbiResourceId = DbiResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupMessage]
  }
  
  @scala.inline
  implicit class DeleteDBInstanceAutomatedBackupMessageOps[Self <: DeleteDBInstanceAutomatedBackupMessage] (val x: Self) extends AnyVal {
    
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
    def setDbiResourceId(value: String): Self = this.set("DbiResourceId", value.asInstanceOf[js.Any])
  }
}
