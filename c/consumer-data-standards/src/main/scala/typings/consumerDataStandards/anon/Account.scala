package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.account
import typings.consumerDataStandards.consumerDataStandardsStrings.card_
import typings.consumerDataStandards.consumerDataStandardsStrings.payId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var account: js.UndefOr[AccountName] = js.undefined
  
  var card: js.UndefOr[CardNumber] = js.undefined
  
  var payId: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Type of account object included. Valid values are: **account** A standard Australian account defined by BSB/Account Number. **card** A credit or charge card to pay to (note that PANs are masked). **payId** A PayID recognised by NPP
    */
  var payeeAccountUType: account | card_ | payId
}
object Account {
  
  inline def apply(payeeAccountUType: account | card_ | payId): Account = {
    val __obj = js.Dynamic.literal(payeeAccountUType = payeeAccountUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: AccountName): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setCard(value: CardNumber): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setPayId(value: Identifier): Self = StObject.set(x, "payId", value.asInstanceOf[js.Any])
    
    inline def setPayIdUndefined: Self = StObject.set(x, "payId", js.undefined)
    
    inline def setPayeeAccountUType(value: account | card_ | payId): Self = StObject.set(x, "payeeAccountUType", value.asInstanceOf[js.Any])
  }
}
