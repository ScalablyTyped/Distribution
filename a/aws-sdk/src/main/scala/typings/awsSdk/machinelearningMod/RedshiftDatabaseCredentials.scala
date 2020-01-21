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
}

