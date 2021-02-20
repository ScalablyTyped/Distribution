package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQueuedSavingsPlanRequest extends StObject {
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: SavingsPlanId = js.native
}
object DeleteQueuedSavingsPlanRequest {
  
  @scala.inline
  def apply(savingsPlanId: SavingsPlanId): DeleteQueuedSavingsPlanRequest = {
    val __obj = js.Dynamic.literal(savingsPlanId = savingsPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedSavingsPlanRequest]
  }
  
  @scala.inline
  implicit class DeleteQueuedSavingsPlanRequestMutableBuilder[Self <: DeleteQueuedSavingsPlanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
  }
}
