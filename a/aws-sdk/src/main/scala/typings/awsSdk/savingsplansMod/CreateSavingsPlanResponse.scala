package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSavingsPlanResponse extends StObject {
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.native
}
object CreateSavingsPlanResponse {
  
  @scala.inline
  def apply(): CreateSavingsPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSavingsPlanResponse]
  }
  
  @scala.inline
  implicit class CreateSavingsPlanResponseMutableBuilder[Self <: CreateSavingsPlanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlanIdUndefined: Self = StObject.set(x, "savingsPlanId", js.undefined)
  }
}
