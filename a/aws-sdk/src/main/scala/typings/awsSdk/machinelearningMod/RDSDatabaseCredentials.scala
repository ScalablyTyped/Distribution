package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSDatabaseCredentials extends js.Object {
  var Password: RDSDatabasePassword = js.native
  var Username: RDSDatabaseUsername = js.native
}

object RDSDatabaseCredentials {
  @scala.inline
  def apply(Password: RDSDatabasePassword, Username: RDSDatabaseUsername): RDSDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDSDatabaseCredentials]
  }
  @scala.inline
  implicit class RDSDatabaseCredentialsOps[Self <: RDSDatabaseCredentials] (val x: Self) extends AnyVal {
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
    def setPassword(value: RDSDatabasePassword): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: RDSDatabaseUsername): Self = this.set("Username", value.asInstanceOf[js.Any])
  }
  
}

