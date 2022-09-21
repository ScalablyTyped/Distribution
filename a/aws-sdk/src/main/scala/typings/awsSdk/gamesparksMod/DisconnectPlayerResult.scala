package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectPlayerResult extends StObject {
  
  /**
    * The list of the connection ids that could not be disconnected.
    */
  var DisconnectFailures: js.UndefOr[ConnectionIdList] = js.undefined
  
  /**
    * The list of the connection ids that were disconnected.
    */
  var DisconnectSuccesses: js.UndefOr[ConnectionIdList] = js.undefined
}
object DisconnectPlayerResult {
  
  inline def apply(): DisconnectPlayerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisconnectPlayerResult]
  }
  
  extension [Self <: DisconnectPlayerResult](x: Self) {
    
    inline def setDisconnectFailures(value: ConnectionIdList): Self = StObject.set(x, "DisconnectFailures", value.asInstanceOf[js.Any])
    
    inline def setDisconnectFailuresUndefined: Self = StObject.set(x, "DisconnectFailures", js.undefined)
    
    inline def setDisconnectFailuresVarargs(value: ConnectionId*): Self = StObject.set(x, "DisconnectFailures", js.Array(value*))
    
    inline def setDisconnectSuccesses(value: ConnectionIdList): Self = StObject.set(x, "DisconnectSuccesses", value.asInstanceOf[js.Any])
    
    inline def setDisconnectSuccessesUndefined: Self = StObject.set(x, "DisconnectSuccesses", js.undefined)
    
    inline def setDisconnectSuccessesVarargs(value: ConnectionId*): Self = StObject.set(x, "DisconnectSuccesses", js.Array(value*))
  }
}
