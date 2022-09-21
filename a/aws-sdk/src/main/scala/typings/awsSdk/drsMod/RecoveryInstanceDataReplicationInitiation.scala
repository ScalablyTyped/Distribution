package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstanceDataReplicationInitiation extends StObject {
  
  /**
    * The date and time of the current attempt to initiate data replication.
    */
  var startDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The steps of the current attempt to initiate data replication.
    */
  var steps: js.UndefOr[RecoveryInstanceDataReplicationInitiationSteps] = js.undefined
}
object RecoveryInstanceDataReplicationInitiation {
  
  inline def apply(): RecoveryInstanceDataReplicationInitiation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstanceDataReplicationInitiation]
  }
  
  extension [Self <: RecoveryInstanceDataReplicationInitiation](x: Self) {
    
    inline def setStartDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setSteps(value: RecoveryInstanceDataReplicationInitiationSteps): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: RecoveryInstanceDataReplicationInitiationStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
