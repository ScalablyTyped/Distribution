package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecoveryInstanceRequest extends StObject {
  
  /**
    * The ID of the Recovery Instance to be deleted.
    */
  var recoveryInstanceID: RecoveryInstanceID
}
object DeleteRecoveryInstanceRequest {
  
  inline def apply(recoveryInstanceID: RecoveryInstanceID): DeleteRecoveryInstanceRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceID = recoveryInstanceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecoveryInstanceRequest]
  }
  
  extension [Self <: DeleteRecoveryInstanceRequest](x: Self) {
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
  }
}
