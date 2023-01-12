package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkAccountId
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The ID of the account.  To be created in accordance with CDR ID permanence requirements
    */
  var accountId: String
  
  /**
    * Optional identifier of the account as defined by the data holder.  This must be the value presented on physical statements (if it exists) and must not be used for the value of accountId
    */
  var accountNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date that the account was created or opened
    */
  var creationDate: String
  
  /**
    * An optional display name for the account if one exists or can be derived.  The content of this field is at the discretion of the data holder
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The array of plans containing service points and associated plan details
    */
  var plans: js.Array[PlanOverview]
}
object DictkAccountId {
  
  inline def apply(accountId: String, creationDate: String, plans: js.Array[PlanOverview]): DictkAccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkAccountId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkAccountId] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberNull: Self = StObject.set(x, "accountNumber", null)
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPlans(value: js.Array[PlanOverview]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: PlanOverview*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
