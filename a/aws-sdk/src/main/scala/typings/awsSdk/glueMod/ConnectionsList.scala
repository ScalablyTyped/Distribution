package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionsList extends StObject {
  
  /**
    * A list of connections used by the job.
    */
  var Connections: js.UndefOr[OrchestrationStringList] = js.undefined
}
object ConnectionsList {
  
  @scala.inline
  def apply(): ConnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionsList]
  }
  
  @scala.inline
  implicit class ConnectionsListMutableBuilder[Self <: ConnectionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: OrchestrationStringList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: GenericString*): Self = StObject.set(x, "Connections", js.Array(value :_*))
  }
}
