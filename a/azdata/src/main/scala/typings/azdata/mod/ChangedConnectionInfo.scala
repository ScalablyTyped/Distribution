package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedConnectionInfo extends js.Object {
  
  /**
    * Summary of details containing any connection changes.
    */
  var connection: ConnectionSummary = js.native
  
  /**
    * Owner URI of the connection that changed.
    */
  var connectionUri: String = js.native
}
object ChangedConnectionInfo {
  
  @scala.inline
  def apply(connection: ConnectionSummary, connectionUri: String): ChangedConnectionInfo = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], connectionUri = connectionUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedConnectionInfo]
  }
  
  @scala.inline
  implicit class ChangedConnectionInfoOps[Self <: ChangedConnectionInfo] (val x: Self) extends AnyVal {
    
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
    def setConnection(value: ConnectionSummary): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUri(value: String): Self = this.set("connectionUri", value.asInstanceOf[js.Any])
  }
}
