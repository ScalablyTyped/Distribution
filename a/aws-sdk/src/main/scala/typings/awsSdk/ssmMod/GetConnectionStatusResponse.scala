package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionStatusResponse extends StObject {
  
  /**
    * The status of the connection to the managed node. For example, 'Connected' or 'Not Connected'.
    */
  var Status: js.UndefOr[ConnectionStatus] = js.undefined
  
  /**
    * The ID of the managed node to check connection status. 
    */
  var Target: js.UndefOr[SessionTarget] = js.undefined
}
object GetConnectionStatusResponse {
  
  inline def apply(): GetConnectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionStatusResponse]
  }
  
  extension [Self <: GetConnectionStatusResponse](x: Self) {
    
    inline def setStatus(value: ConnectionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTarget(value: SessionTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
