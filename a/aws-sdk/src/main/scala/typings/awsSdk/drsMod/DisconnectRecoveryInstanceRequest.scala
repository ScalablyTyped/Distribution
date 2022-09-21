package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectRecoveryInstanceRequest extends StObject {
  
  /**
    * The ID of the Recovery Instance to disconnect.
    */
  var recoveryInstanceID: RecoveryInstanceID
}
object DisconnectRecoveryInstanceRequest {
  
  inline def apply(recoveryInstanceID: RecoveryInstanceID): DisconnectRecoveryInstanceRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceID = recoveryInstanceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectRecoveryInstanceRequest]
  }
  
  extension [Self <: DisconnectRecoveryInstanceRequest](x: Self) {
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
  }
}
