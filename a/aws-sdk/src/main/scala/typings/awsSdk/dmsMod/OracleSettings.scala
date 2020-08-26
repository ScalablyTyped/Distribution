package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OracleSettings extends js.Object {
  /**
    * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this value from the  asm_user_password  value. You set this value as part of the comma-separated value that you set to the Password request parameter when you create the endpoint to access transaction logs using Binary Reader. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmPassword: js.UndefOr[SecretString] = js.native
  /**
    * For an Oracle source endpoint, your ASM server address. You can set this value from the asm_server value. You set asm_server as part of the extra connection attribute string to access an Oracle server with Binary Reader that uses ASM. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmServer: js.UndefOr[String] = js.native
  /**
    * For an Oracle source endpoint, your ASM user name. You can set this value from the asm_user value. You set asm_user as part of the extra connection attribute string to access an Oracle server with Binary Reader that uses ASM. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmUser: js.UndefOr[String] = js.native
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.native
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to access Oracle redo logs encrypted by TDE using Binary Reader. It is also the  TDE_Password  part of the comma-separated value you set to the Password request parameter when you create the endpoint. The SecurityDbEncryptian setting is related to this SecurityDbEncryptionName setting. For more information, see  Supported encryption methods for using Oracle as a source for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var SecurityDbEncryption: js.UndefOr[SecretString] = js.native
  /**
    * For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the columns and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the value of the SecurityDbEncryption setting. For more information on setting the key name value of SecurityDbEncryptionName, see the information and example for setting the securityDbEncryptionName extra connection attribute in  Supported encryption methods for using Oracle as a source for AWS DMS in the AWS Database Migration Service User Guide.
    */
  var SecurityDbEncryptionName: js.UndefOr[String] = js.native
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.native
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.native
}

object OracleSettings {
  @scala.inline
  def apply(): OracleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OracleSettings]
  }
  @scala.inline
  implicit class OracleSettingsOps[Self <: OracleSettings] (val x: Self) extends AnyVal {
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
    def setAsmPassword(value: SecretString): Self = this.set("AsmPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsmPassword: Self = this.set("AsmPassword", js.undefined)
    @scala.inline
    def setAsmServer(value: String): Self = this.set("AsmServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsmServer: Self = this.set("AsmServer", js.undefined)
    @scala.inline
    def setAsmUser(value: String): Self = this.set("AsmUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsmUser: Self = this.set("AsmUser", js.undefined)
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    @scala.inline
    def setPassword(value: SecretString): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setSecurityDbEncryption(value: SecretString): Self = this.set("SecurityDbEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityDbEncryption: Self = this.set("SecurityDbEncryption", js.undefined)
    @scala.inline
    def setSecurityDbEncryptionName(value: String): Self = this.set("SecurityDbEncryptionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityDbEncryptionName: Self = this.set("SecurityDbEncryptionName", js.undefined)
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

