package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connections extends StObject {
  
  /**
    * The connections.
    */
  var connections: js.UndefOr[ConnectionList] = js.native
}
object Connections {
  
  @scala.inline
  def apply(): Connections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connections]
  }
  
  @scala.inline
  implicit class ConnectionsMutableBuilder[Self <: Connections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: ConnectionList): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
  }
}
