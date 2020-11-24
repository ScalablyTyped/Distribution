package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBMDb2Settings extends js.Object {
  
  /**
    * For ongoing replication (CDC), use CurrentLSN to specify a log sequence number (LSN) where you want the replication to start.
    */
  var CurrentLsn: js.UndefOr[String] = js.native
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of bytes per read, as a NUMBER value. The default is 64 KB.
    */
  var MaxKBytesPerRead: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.native
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    * Enables ongoing replication (CDC) as a BOOLEAN value. The default is true.
    */
  var SetDataCaptureChanges: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.native
}
object IBMDb2Settings {
  
  @scala.inline
  def apply(): IBMDb2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBMDb2Settings]
  }
  
  @scala.inline
  implicit class IBMDb2SettingsOps[Self <: IBMDb2Settings] (val x: Self) extends AnyVal {
    
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
    def setCurrentLsn(value: String): Self = this.set("CurrentLsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentLsn: Self = this.set("CurrentLsn", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setMaxKBytesPerRead(value: IntegerOptional): Self = this.set("MaxKBytesPerRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKBytesPerRead: Self = this.set("MaxKBytesPerRead", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    
    @scala.inline
    def setSetDataCaptureChanges(value: BooleanOptional): Self = this.set("SetDataCaptureChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDataCaptureChanges: Self = this.set("SetDataCaptureChanges", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
