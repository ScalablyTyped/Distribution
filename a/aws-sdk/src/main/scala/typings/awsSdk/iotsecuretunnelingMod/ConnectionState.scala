package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionState extends StObject {
  
  /**
    * The last time the connection status was updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  
  /**
    * The connection status of the tunnel. Valid values are CONNECTED and DISCONNECTED.
    */
  var status: js.UndefOr[ConnectionStatus] = js.native
}
object ConnectionState {
  
  @scala.inline
  def apply(): ConnectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionState]
  }
  
  @scala.inline
  implicit class ConnectionStateMutableBuilder[Self <: ConnectionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: ConnectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
