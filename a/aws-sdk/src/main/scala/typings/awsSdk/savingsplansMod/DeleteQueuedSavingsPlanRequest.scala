package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueuedSavingsPlanRequest extends StObject {
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: SavingsPlanId
}
object DeleteQueuedSavingsPlanRequest {
  
  inline def apply(savingsPlanId: SavingsPlanId): DeleteQueuedSavingsPlanRequest = {
    val __obj = js.Dynamic.literal(savingsPlanId = savingsPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedSavingsPlanRequest]
  }
  
  extension [Self <: DeleteQueuedSavingsPlanRequest](x: Self) {
    
    inline def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
  }
}
