package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionState extends StObject {
  
  /**
    * The last time the connection status was updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * The connection status of the tunnel. Valid values are CONNECTED and DISCONNECTED.
    */
  var status: js.UndefOr[ConnectionStatus] = js.undefined
}
object ConnectionState {
  
  inline def apply(): ConnectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionState]
  }
  
  extension [Self <: ConnectionState](x: Self) {
    
    inline def setLastUpdatedAt(value: DateType): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setStatus(value: ConnectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
