package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionSummary extends js.Object {
  /**
    * database name
    */
  var databaseName: String = js.native
  /**
    * server name
    */
  var serverName: String = js.native
  /**
    * user name
    */
  var userName: String = js.native
}

object ConnectionSummary {
  @scala.inline
  def apply(databaseName: String, serverName: String, userName: String): ConnectionSummary = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSummary]
  }
  @scala.inline
  implicit class ConnectionSummaryOps[Self <: ConnectionSummary] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerName(value: String): Self = this.set("serverName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
  
}

