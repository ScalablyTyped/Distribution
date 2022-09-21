package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BUSINESS_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.CLOSED
import typings.consumerDataStandards.consumerDataStandardsStrings.CRED_AND_CHRG_CARDS
import typings.consumerDataStandards.consumerDataStandardsStrings.LEASES
import typings.consumerDataStandards.consumerDataStandardsStrings.MARGIN_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.OPEN
import typings.consumerDataStandards.consumerDataStandardsStrings.OVERDRAFTS
import typings.consumerDataStandards.consumerDataStandardsStrings.PERS_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.REGULATED_TRUST_ACCOUNTS
import typings.consumerDataStandards.consumerDataStandardsStrings.RESIDENTIAL_MORTGAGES
import typings.consumerDataStandards.consumerDataStandardsStrings.TERM_DEPOSITS
import typings.consumerDataStandards.consumerDataStandardsStrings.TRADE_FINANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANS_AND_SAVINGS_ACCOUNTS
import typings.consumerDataStandards.consumerDataStandardsStrings.TRAVEL_CARDS
import typings.consumerDataStandards.consumerDataStandardsStrings.creditCard
import typings.consumerDataStandards.consumerDataStandardsStrings.loan
import typings.consumerDataStandards.consumerDataStandardsStrings.termDeposit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addresses
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A unique ID of the account adhering to the standards for ID permanence
    */
  var accountId: String
  
  /**
    * The unmasked account number for the account. Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
    */
  var accountNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The addresses for the account to be used for correspondence
    */
  var addresses: js.UndefOr[js.Array[AddressUType]] = js.undefined
  
  /**
    * The unmasked BSB for the account. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
    */
  var bsb: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer
    */
  var bundleName: js.UndefOr[String] = js.undefined
  
  /**
    * Date that the account was created (if known)
    */
  var creationDate: js.UndefOr[String | Null] = js.undefined
  
  var creditCard: js.UndefOr[MinPaymentAmount] = js.undefined
  
  /**
    * current rate to calculate interest earned being applied to deposit balances as it stands at the time of the API call
    */
  var depositRate: js.UndefOr[String] = js.undefined
  
  /**
    * Fully described deposit rates for this account based on the equivalent structure in Product Reference
    */
  var depositRates: js.UndefOr[js.Array[AdditionalValue]] = js.undefined
  
  /**
    * The display name of the account as defined by the bank. This should not incorporate account numbers or PANs. If it does the values should be masked according to the rules of the MaskedAccountString common type.
    */
  var displayName: String
  
  /**
    * Array of features of the account based on the equivalent structure in Product Reference with the following additional field
    */
  var features: js.UndefOr[js.Array[FeatureType]] = js.undefined
  
  /**
    * Fees and charges applicable to the account based on the equivalent structure in Product Reference
    */
  var fees: js.UndefOr[js.Array[AccrualFrequency]] = js.undefined
  
  /**
    * Flag indicating that the customer associated with the authorisation is an owner of the account. Does not indicate sole ownership, however. If not present then 'true' is assumed
    */
  var isOwned: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The current rate to calculate interest payable being applied to lending balances as it stands at the time of the API call
    */
  var lendingRate: js.UndefOr[String] = js.undefined
  
  /**
    * Fully described deposit rates for this account based on the equivalent structure in Product Reference
    */
  var lendingRates: js.UndefOr[js.Array[ApplicationFrequency]] = js.undefined
  
  var loan: js.UndefOr[LoanEndDate] = js.undefined
  
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
  
  /**
    * The type of structure to present account specific fields.
    */
  var specificAccountUType: js.UndefOr[creditCard | loan | termDeposit] = js.undefined
  
  var termDeposit: js.UndefOr[js.Array[LodgementDate]] = js.undefined
}
object Addresses {
  
  inline def apply(
    accountId: String,
    displayName: String,
    maskedNumber: String,
    productCategory: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS,
    productName: String
  ): Addresses = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], maskedNumber = maskedNumber.asInstanceOf[js.Any], productCategory = productCategory.asInstanceOf[js.Any], productName = productName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addresses]
  }
  
  extension [Self <: Addresses](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
    
    inline def setAddresses(value: js.Array[AddressUType]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: AddressUType*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setBsb(value: String): Self = StObject.set(x, "bsb", value.asInstanceOf[js.Any])
    
    inline def setBsbUndefined: Self = StObject.set(x, "bsb", js.undefined)
    
    inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
    
    inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateNull: Self = StObject.set(x, "creationDate", null)
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setCreditCard(value: MinPaymentAmount): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    inline def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    inline def setDepositRate(value: String): Self = StObject.set(x, "depositRate", value.asInstanceOf[js.Any])
    
    inline def setDepositRateUndefined: Self = StObject.set(x, "depositRate", js.undefined)
    
    inline def setDepositRates(value: js.Array[AdditionalValue]): Self = StObject.set(x, "depositRates", value.asInstanceOf[js.Any])
    
    inline def setDepositRatesUndefined: Self = StObject.set(x, "depositRates", js.undefined)
    
    inline def setDepositRatesVarargs(value: AdditionalValue*): Self = StObject.set(x, "depositRates", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[FeatureType]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: FeatureType*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFees(value: js.Array[AccrualFrequency]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFeesVarargs(value: AccrualFrequency*): Self = StObject.set(x, "fees", js.Array(value*))
    
    inline def setIsOwned(value: Boolean): Self = StObject.set(x, "isOwned", value.asInstanceOf[js.Any])
    
    inline def setIsOwnedNull: Self = StObject.set(x, "isOwned", null)
    
    inline def setIsOwnedUndefined: Self = StObject.set(x, "isOwned", js.undefined)
    
    inline def setLendingRate(value: String): Self = StObject.set(x, "lendingRate", value.asInstanceOf[js.Any])
    
    inline def setLendingRateUndefined: Self = StObject.set(x, "lendingRate", js.undefined)
    
    inline def setLendingRates(value: js.Array[ApplicationFrequency]): Self = StObject.set(x, "lendingRates", value.asInstanceOf[js.Any])
    
    inline def setLendingRatesUndefined: Self = StObject.set(x, "lendingRates", js.undefined)
    
    inline def setLendingRatesVarargs(value: ApplicationFrequency*): Self = StObject.set(x, "lendingRates", js.Array(value*))
    
    inline def setLoan(value: LoanEndDate): Self = StObject.set(x, "loan", value.asInstanceOf[js.Any])
    
    inline def setLoanUndefined: Self = StObject.set(x, "loan", js.undefined)
    
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
    
    inline def setSpecificAccountUType(value: creditCard | loan | termDeposit): Self = StObject.set(x, "specificAccountUType", value.asInstanceOf[js.Any])
    
    inline def setSpecificAccountUTypeUndefined: Self = StObject.set(x, "specificAccountUType", js.undefined)
    
    inline def setTermDeposit(value: js.Array[LodgementDate]): Self = StObject.set(x, "termDeposit", value.asInstanceOf[js.Any])
    
    inline def setTermDepositUndefined: Self = StObject.set(x, "termDeposit", js.undefined)
    
    inline def setTermDepositVarargs(value: LodgementDate*): Self = StObject.set(x, "termDeposit", js.Array(value*))
  }
}
