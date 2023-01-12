package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionId extends StObject {
  
  var connectionId: integer
}
object ConnectionId {
  
  inline def apply(connectionId: integer): ConnectionId = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionId] (val x: Self) extends AnyVal {
    
    inline def setConnectionId(value: integer): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
  }
}
