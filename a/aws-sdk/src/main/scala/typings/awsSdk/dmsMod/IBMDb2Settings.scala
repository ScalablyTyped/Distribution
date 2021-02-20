package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBMDb2Settings extends StObject {
  
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
  implicit class IBMDb2SettingsMutableBuilder[Self <: IBMDb2Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentLsn(value: String): Self = StObject.set(x, "CurrentLsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLsnUndefined: Self = StObject.set(x, "CurrentLsn", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setMaxKBytesPerRead(value: IntegerOptional): Self = StObject.set(x, "MaxKBytesPerRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxKBytesPerReadUndefined: Self = StObject.set(x, "MaxKBytesPerRead", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    @scala.inline
    def setSetDataCaptureChanges(value: BooleanOptional): Self = StObject.set(x, "SetDataCaptureChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDataCaptureChangesUndefined: Self = StObject.set(x, "SetDataCaptureChanges", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
