package typings.consumerDataStandards.energyMod

import typings.consumerDataStandards.anon.AuthorisedContacts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountDetail
  extends StObject
     with EnergyAccountBase {
  
  /**
    * The array of plans containing service points and associated plan details
    */
  var plans: js.Array[AuthorisedContacts]
}
object EnergyAccountDetail {
  
  inline def apply(accountId: String, creationDate: String, plans: js.Array[AuthorisedContacts]): EnergyAccountDetail = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountDetail]
  }
  
  extension [Self <: EnergyAccountDetail](x: Self) {
    
    inline def setPlans(value: js.Array[AuthorisedContacts]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: AuthorisedContacts*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
