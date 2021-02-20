package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedConnectionInfo extends StObject {
  
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
  implicit class ChangedConnectionInfoMutableBuilder[Self <: ChangedConnectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: ConnectionSummary): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUri(value: String): Self = StObject.set(x, "connectionUri", value.asInstanceOf[js.Any])
  }
}
