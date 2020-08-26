package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDatabaseCredentials extends js.Object {
  var Password: RedshiftDatabasePassword = js.native
  var Username: RedshiftDatabaseUsername = js.native
}

object RedshiftDatabaseCredentials {
  @scala.inline
  def apply(Password: RedshiftDatabasePassword, Username: RedshiftDatabaseUsername): RedshiftDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDatabaseCredentials]
  }
  @scala.inline
  implicit class RedshiftDatabaseCredentialsOps[Self <: RedshiftDatabaseCredentials] (val x: Self) extends AnyVal {
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
    def setPassword(value: RedshiftDatabasePassword): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: RedshiftDatabaseUsername): Self = this.set("Username", value.asInstanceOf[js.Any])
  }
  
}

