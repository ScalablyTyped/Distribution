package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.CLOSED
import typings.consumerDataStandards.consumerDataStandardsStrings.OPEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountBaseV2
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
    * The date that the account was created or opened. Mandatory if openStatus is OPEN
    */
  var creationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional display name for the account if one exists or can be derived.  The content of this field is at the discretion of the data holder
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Open or closed status for the account. If not present then OPEN is assumed
    */
  var openStatus: js.UndefOr[CLOSED | OPEN | Null] = js.undefined
}
object EnergyAccountBaseV2 {
  
  inline def apply(accountId: String): EnergyAccountBaseV2 = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountBaseV2]
  }
  
  extension [Self <: EnergyAccountBaseV2](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberNull: Self = StObject.set(x, "accountNumber", null)
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateNull: Self = StObject.set(x, "creationDate", null)
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setOpenStatus(value: CLOSED | OPEN): Self = StObject.set(x, "openStatus", value.asInstanceOf[js.Any])
    
    inline def setOpenStatusNull: Self = StObject.set(x, "openStatus", null)
    
    inline def setOpenStatusUndefined: Self = StObject.set(x, "openStatus", js.undefined)
  }
}
