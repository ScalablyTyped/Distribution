package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BUSINESS_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.CLOSED
import typings.consumerDataStandards.consumerDataStandardsStrings.CRED_AND_CHRG_CARDS
import typings.consumerDataStandards.consumerDataStandardsStrings.LEASES
import typings.consumerDataStandards.consumerDataStandardsStrings.MANY_PARTY
import typings.consumerDataStandards.consumerDataStandardsStrings.MARGIN_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.ONE_PARTY
import typings.consumerDataStandards.consumerDataStandardsStrings.OPEN
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.OVERDRAFTS
import typings.consumerDataStandards.consumerDataStandardsStrings.PERS_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.REGULATED_TRUST_ACCOUNTS
import typings.consumerDataStandards.consumerDataStandardsStrings.RESIDENTIAL_MORTGAGES
import typings.consumerDataStandards.consumerDataStandardsStrings.TERM_DEPOSITS
import typings.consumerDataStandards.consumerDataStandardsStrings.TRADE_FINANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANS_AND_SAVINGS_ACCOUNTS
import typings.consumerDataStandards.consumerDataStandardsStrings.TRAVEL_CARDS
import typings.consumerDataStandards.consumerDataStandardsStrings.TWO_PARTY
import typings.consumerDataStandards.consumerDataStandardsStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingAccountDetailV3
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A unique ID of the account adhering to the standards for ID permanence
    */
  var accountId: String
  
  /**
    * Value indicating the number of customers that have ownership of the account, according to the data holder's definition of account ownership. Does not indicate that all account owners are eligible consumers
    */
  var accountOwnership: UNKNOWN | ONE_PARTY | TWO_PARTY | MANY_PARTY | OTHER
  
  /**
    * Date that the account was created (if known)
    */
  var creationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the account as defined by the bank. This should not incorporate account numbers or PANs. If it does the values should be masked according to the rules of the MaskedAccountString common type.
    */
  var displayName: String
  
  /**
    * Flag indicating that the customer associated with the authorisation is an owner of the account. Does not indicate sole ownership, however. If not present then 'true' is assumed
    */
  var isOwned: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number
    */
  var maskedNumber: String
  
  /**
    * A customer supplied nick name for the account
    */
  var nickname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Open or closed status for the account. If not present then OPEN is assumed
    */
  var openStatus: js.UndefOr[CLOSED | OPEN | Null] = js.undefined
  
  /**
    * The category to which a product or account belongs. See [here](#product-categories) for more details
    */
  var productCategory: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS
  
  /**
    * The unique identifier of the account as defined by the data holder (akin to model number for the account)
    */
  var productName: String
}
object BankingAccountDetailV3 {
  
  inline def apply(
    accountId: String,
    accountOwnership: UNKNOWN | ONE_PARTY | TWO_PARTY | MANY_PARTY | OTHER,
    displayName: String,
    maskedNumber: String,
    productCategory: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS,
    productName: String
  ): BankingAccountDetailV3 = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], accountOwnership = accountOwnership.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], maskedNumber = maskedNumber.asInstanceOf[js.Any], productCategory = productCategory.asInstanceOf[js.Any], productName = productName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingAccountDetailV3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingAccountDetailV3] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountOwnership(value: UNKNOWN | ONE_PARTY | TWO_PARTY | MANY_PARTY | OTHER): Self = StObject.set(x, "accountOwnership", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateNull: Self = StObject.set(x, "creationDate", null)
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIsOwned(value: Boolean): Self = StObject.set(x, "isOwned", value.asInstanceOf[js.Any])
    
    inline def setIsOwnedNull: Self = StObject.set(x, "isOwned", null)
    
    inline def setIsOwnedUndefined: Self = StObject.set(x, "isOwned", js.undefined)
    
    inline def setMaskedNumber(value: String): Self = StObject.set(x, "maskedNumber", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameNull: Self = StObject.set(x, "nickname", null)
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setOpenStatus(value: CLOSED | OPEN): Self = StObject.set(x, "openStatus", value.asInstanceOf[js.Any])
    
    inline def setOpenStatusNull: Self = StObject.set(x, "openStatus", null)
    
    inline def setOpenStatusUndefined: Self = StObject.set(x, "openStatus", js.undefined)
    
    inline def setProductCategory(
      value: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS
    ): Self = StObject.set(x, "productCategory", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
  }
}
