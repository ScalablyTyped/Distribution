package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.BillingType
import typings.consumerDataStandards.consumerDataStandardsStrings.CLOSED
import typings.consumerDataStandards.consumerDataStandardsStrings.OPEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoAccountResponseData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The ID of the account. To be created in accordance with [CDR ID permanence](#id-permanence) requirements
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Masked identifier of the account as defined by the data holder. This must be the value presented on physical statements (required if it exists) and must not be used for the value of the accountId
    */
  var accountNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The retail name of the brand
    */
  var brand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date that the account was created or opened. Mandatory if openStatus is OPEN
    */
  var creationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional display name for the account if one exists or can be derived. The content of this field is at the discretion of the data holder
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time which the account was last updated
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Open or closed status for the account. If not present then OPEN is assumed
    */
  var openStatus: js.UndefOr[CLOSED | OPEN | Null] = js.undefined
  
  /**
    * The array of plans containing service and associated plan details
    */
  var plans: js.Array[BillingType]
}
object TelcoAccountResponseData {
  
  inline def apply(plans: js.Array[BillingType]): TelcoAccountResponseData = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoAccountResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoAccountResponseData] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberNull: Self = StObject.set(x, "accountNumber", null)
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandNull: Self = StObject.set(x, "brand", null)
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateNull: Self = StObject.set(x, "creationDate", null)
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setOpenStatus(value: CLOSED | OPEN): Self = StObject.set(x, "openStatus", value.asInstanceOf[js.Any])
    
    inline def setOpenStatusNull: Self = StObject.set(x, "openStatus", null)
    
    inline def setOpenStatusUndefined: Self = StObject.set(x, "openStatus", js.undefined)
    
    inline def setPlans(value: js.Array[BillingType]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: BillingType*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
