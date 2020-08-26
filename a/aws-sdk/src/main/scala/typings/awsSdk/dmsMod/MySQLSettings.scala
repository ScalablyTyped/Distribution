package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MySQLSettings extends js.Object {
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
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.native
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.native
}

object MySQLSettings {
  @scala.inline
  def apply(): MySQLSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySQLSettings]
  }
  @scala.inline
  implicit class MySQLSettingsOps[Self <: MySQLSettings] (val x: Self) extends AnyVal {
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
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

