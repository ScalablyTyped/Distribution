package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingModifiedRelationalDatabaseValues extends js.Object {
  
  /**
    * A Boolean value indicating whether automated backup retention is enabled.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The database engine version.
    */
  var engineVersion: js.UndefOr[String] = js.native
  
  /**
    * The password for the master user of the database.
    */
  var masterUserPassword: js.UndefOr[String] = js.native
}
object PendingModifiedRelationalDatabaseValues {
  
  @scala.inline
  def apply(): PendingModifiedRelationalDatabaseValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedRelationalDatabaseValues]
  }
  
  @scala.inline
  implicit class PendingModifiedRelationalDatabaseValuesOps[Self <: PendingModifiedRelationalDatabaseValues] (val x: Self) extends AnyVal {
    
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
    def setBackupRetentionEnabled(value: Boolean): Self = this.set("backupRetentionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionEnabled: Self = this.set("backupRetentionEnabled", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: String): Self = this.set("masterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("masterUserPassword", js.undefined)
  }
}
