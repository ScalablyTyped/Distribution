package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Amount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingBalance
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A unique ID of the account adhering to the standards for ID permanence
    */
  var accountId: String
  
  /**
    * Object representing the available limit amortised according to payment schedule. Assumed to be zero if absent
    */
  var amortisedLimit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Balance representing the amount of funds available for transfer. Assumed to be zero or positive
    */
  var availableBalance: String
  
  /**
    * Object representing the maximum amount of credit that is available for this account. Assumed to be zero if absent
    */
  var creditLimit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency for the balance amounts. If absent assumed to be AUD
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The balance of the account at this time. Should align to the balance available via other channels such as Internet Banking. Assumed to be negative if the customer has money owing
    */
  var currentBalance: String
  
  /**
    * Optional array of balances for the account in other currencies. Included to support accounts that support multi-currency purses such as Travel Cards
    */
  var purses: js.UndefOr[js.Array[Amount] | Null] = js.undefined
}
object BankingBalance {
  
  inline def apply(accountId: String, availableBalance: String, currentBalance: String): BankingBalance = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], availableBalance = availableBalance.asInstanceOf[js.Any], currentBalance = currentBalance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingBalance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingBalance] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAmortisedLimit(value: String): Self = StObject.set(x, "amortisedLimit", value.asInstanceOf[js.Any])
    
    inline def setAmortisedLimitNull: Self = StObject.set(x, "amortisedLimit", null)
    
    inline def setAmortisedLimitUndefined: Self = StObject.set(x, "amortisedLimit", js.undefined)
    
    inline def setAvailableBalance(value: String): Self = StObject.set(x, "availableBalance", value.asInstanceOf[js.Any])
    
    inline def setCreditLimit(value: String): Self = StObject.set(x, "creditLimit", value.asInstanceOf[js.Any])
    
    inline def setCreditLimitNull: Self = StObject.set(x, "creditLimit", null)
    
    inline def setCreditLimitUndefined: Self = StObject.set(x, "creditLimit", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setCurrentBalance(value: String): Self = StObject.set(x, "currentBalance", value.asInstanceOf[js.Any])
    
    inline def setPurses(value: js.Array[Amount]): Self = StObject.set(x, "purses", value.asInstanceOf[js.Any])
    
    inline def setPursesNull: Self = StObject.set(x, "purses", null)
    
    inline def setPursesUndefined: Self = StObject.set(x, "purses", js.undefined)
    
    inline def setPursesVarargs(value: Amount*): Self = StObject.set(x, "purses", js.Array(value*))
  }
}
