package typings.braintree.anon

import typings.braintree.mod.EqualitySearchFn
import typings.braintree.mod.KeyValueSearchFn
import typings.braintree.mod.MultiValueSearchFn
import typings.braintree.mod.PartialMatchSearchFn
import typings.braintree.mod.RangeFieldSearchFn
import typings.braintree.mod.TextFieldSearchFn
import typings.braintree.mod.TransactionSource
import typings.braintree.mod.TransactionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationExpiredAt extends StObject {
  
  // range fields
  def amount(): Between[String]
  // range fields
  @JSName("amount")
  var amount_Original: RangeFieldSearchFn[String]
  
  def authorizationExpiredAt(): Between[js.Date]
  @JSName("authorizationExpiredAt")
  var authorizationExpiredAt_Original: RangeFieldSearchFn[js.Date]
  
  def authorizedAt(): Between[js.Date]
  @JSName("authorizedAt")
  var authorizedAt_Original: RangeFieldSearchFn[js.Date]
  
  // text fields https://github.com/braintree/braintree_node/blob/master/lib/braintree/transaction_search.js#L9
  def billingCompany(): Contains
  // text fields https://github.com/braintree/braintree_node/blob/master/lib/braintree/transaction_search.js#L9
  @JSName("billingCompany")
  var billingCompany_Original: TextFieldSearchFn
  
  def billingCountryName(): Contains
  @JSName("billingCountryName")
  var billingCountryName_Original: TextFieldSearchFn
  
  def billingExtendedAddress(): Contains
  @JSName("billingExtendedAddress")
  var billingExtendedAddress_Original: TextFieldSearchFn
  
  def billingFirstName(): Contains
  @JSName("billingFirstName")
  var billingFirstName_Original: TextFieldSearchFn
  
  def billingLastName(): Contains
  @JSName("billingLastName")
  var billingLastName_Original: TextFieldSearchFn
  
  def billingLocality(): Contains
  @JSName("billingLocality")
  var billingLocality_Original: TextFieldSearchFn
  
  def billingPostalCode(): Contains
  @JSName("billingPostalCode")
  var billingPostalCode_Original: TextFieldSearchFn
  
  def billingRegion(): Contains
  @JSName("billingRegion")
  var billingRegion_Original: TextFieldSearchFn
  
  def billingStreetAddress(): Contains
  @JSName("billingStreetAddress")
  var billingStreetAddress_Original: TextFieldSearchFn
  
  def createdAt(): Between[js.Date]
  @JSName("createdAt")
  var createdAt_Original: RangeFieldSearchFn[js.Date]
  
  def createdUsing(): In[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any] */ js.Any
  ]
  @JSName("createdUsing")
  var createdUsing_Original: MultiValueSearchFn[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any] */ js.Any
  ]
  
  def creditCardCardholderName(): Contains
  @JSName("creditCardCardholderName")
  var creditCardCardholderName_Original: TextFieldSearchFn
  
  def creditCardCustomerLocation(): In[typings.braintree.mod.CustomerLocation]
  @JSName("creditCardCustomerLocation")
  var creditCardCustomerLocation_Original: MultiValueSearchFn[typings.braintree.mod.CustomerLocation]
  
  def creditCardExpirationDate(): Is[String]
  @JSName("creditCardExpirationDate")
  var creditCardExpirationDate_Original: EqualitySearchFn[String]
  
  def creditCardNumber(): EndsWith[String]
  @JSName("creditCardNumber")
  var creditCardNumber_Original: PartialMatchSearchFn[String]
  
  def creditCardUniqueIdentifier(): Contains
  @JSName("creditCardUniqueIdentifier")
  var creditCardUniqueIdentifier_Original: TextFieldSearchFn
  
  def creditcardCardType(): In[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
  ]
  @JSName("creditcardCardType")
  var creditcardCardType_Original: MultiValueSearchFn[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
  ]
  
  def currency(): Contains
  @JSName("currency")
  var currency_Original: TextFieldSearchFn
  
  def customerCompany(): Contains
  @JSName("customerCompany")
  var customerCompany_Original: TextFieldSearchFn
  
  def customerEmail(): Contains
  @JSName("customerEmail")
  var customerEmail_Original: TextFieldSearchFn
  
  def customerFax(): Contains
  @JSName("customerFax")
  var customerFax_Original: TextFieldSearchFn
  
  def customerFirstName(): Contains
  @JSName("customerFirstName")
  var customerFirstName_Original: TextFieldSearchFn
  
  def customerId(): Contains
  @JSName("customerId")
  var customerId_Original: TextFieldSearchFn
  
  def customerLastName(): Contains
  @JSName("customerLastName")
  var customerLastName_Original: TextFieldSearchFn
  
  def customerPhone(): Contains
  @JSName("customerPhone")
  var customerPhone_Original: TextFieldSearchFn
  
  def customerWebsite(): Contains
  @JSName("customerWebsite")
  var customerWebsite_Original: TextFieldSearchFn
  
  def disbursementDate(): Between[js.Date]
  @JSName("disbursementDate")
  var disbursementDate_Original: RangeFieldSearchFn[js.Date]
  
  def disputeDate(): Between[js.Date]
  @JSName("disputeDate")
  var disputeDate_Original: RangeFieldSearchFn[js.Date]
  
  def failedAt(): Between[js.Date]
  @JSName("failedAt")
  var failedAt_Original: RangeFieldSearchFn[js.Date]
  
  def gatewayRejectedAt(): Between[js.Date]
  @JSName("gatewayRejectedAt")
  var gatewayRejectedAt_Original: RangeFieldSearchFn[js.Date]
  
  def id(): Contains
  @JSName("id")
  var id_Original: TextFieldSearchFn
  
  def ids(): In[String]
  @JSName("ids")
  var ids_Original: MultiValueSearchFn[String]
  
  def merchantAccountId(): In[String]
  @JSName("merchantAccountId")
  var merchantAccountId_Original: MultiValueSearchFn[String]
  
  def orderId(): Contains
  @JSName("orderId")
  var orderId_Original: TextFieldSearchFn
  
  def paymentInstrumentType(): In[String]
  @JSName("paymentInstrumentType")
  var paymentInstrumentType_Original: MultiValueSearchFn[String]
  
  def paymentMethodToken(): Contains
  @JSName("paymentMethodToken")
  var paymentMethodToken_Original: TextFieldSearchFn
  
  def paypalAuthorizationId(): Contains
  @JSName("paypalAuthorizationId")
  var paypalAuthorizationId_Original: TextFieldSearchFn
  
  def paypalPayerEmail(): Contains
  @JSName("paypalPayerEmail")
  var paypalPayerEmail_Original: TextFieldSearchFn
  
  def paypalPaymentId(): Contains
  @JSName("paypalPaymentId")
  var paypalPaymentId_Original: TextFieldSearchFn
  
  def processorAuthorizationCode(): Contains
  @JSName("processorAuthorizationCode")
  var processorAuthorizationCode_Original: TextFieldSearchFn
  
  def processorDeclinedAt(): Between[js.Date]
  @JSName("processorDeclinedAt")
  var processorDeclinedAt_Original: RangeFieldSearchFn[js.Date]
  
  def refund(): `0`[Boolean]
  @JSName("refund")
  var refund_Original: KeyValueSearchFn[Boolean]
  
  def settledAt(): Between[js.Date]
  @JSName("settledAt")
  var settledAt_Original: RangeFieldSearchFn[js.Date]
  
  def settlementBatchId(): Contains
  @JSName("settlementBatchId")
  var settlementBatchId_Original: TextFieldSearchFn
  
  def shippingCompany(): Contains
  @JSName("shippingCompany")
  var shippingCompany_Original: TextFieldSearchFn
  
  def shippingCountryName(): Contains
  @JSName("shippingCountryName")
  var shippingCountryName_Original: TextFieldSearchFn
  
  def shippingExtendedAddress(): Contains
  @JSName("shippingExtendedAddress")
  var shippingExtendedAddress_Original: TextFieldSearchFn
  
  def shippingFirstName(): Contains
  @JSName("shippingFirstName")
  var shippingFirstName_Original: TextFieldSearchFn
  
  def shippingLastName(): Contains
  @JSName("shippingLastName")
  var shippingLastName_Original: TextFieldSearchFn
  
  def shippingLocality(): Contains
  @JSName("shippingLocality")
  var shippingLocality_Original: TextFieldSearchFn
  
  def shippingPostalCode(): Contains
  @JSName("shippingPostalCode")
  var shippingPostalCode_Original: TextFieldSearchFn
  
  def shippingRegion(): Contains
  @JSName("shippingRegion")
  var shippingRegion_Original: TextFieldSearchFn
  
  def shippingStreetAddress(): Contains
  @JSName("shippingStreetAddress")
  var shippingStreetAddress_Original: TextFieldSearchFn
  
  def source(): In[TransactionSource | String]
  @JSName("source")
  var source_Original: MultiValueSearchFn[TransactionSource | String]
  
  def status(): In[TransactionStatus]
  @JSName("status")
  var status_Original: MultiValueSearchFn[TransactionStatus]
  
  def storeId(): Contains
  @JSName("storeId")
  var storeId_Original: TextFieldSearchFn
  
  def storeIds(): In[String]
  @JSName("storeIds")
  var storeIds_Original: MultiValueSearchFn[String]
  
  def submittedForSettlementAt(): Between[js.Date]
  @JSName("submittedForSettlementAt")
  var submittedForSettlementAt_Original: RangeFieldSearchFn[js.Date]
  
  def `type`(): In[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
  ]
  @JSName("type")
  var type_Original: MultiValueSearchFn[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
  ]
  
  def user(): In[String]
  @JSName("user")
  var user_Original: MultiValueSearchFn[String]
  
  def voidedAt(): Between[js.Date]
  @JSName("voidedAt")
  var voidedAt_Original: RangeFieldSearchFn[js.Date]
}
object AuthorizationExpiredAt {
  
  inline def apply(
    amount: () => Between[String],
    authorizationExpiredAt: () => Between[js.Date],
    authorizedAt: () => Between[js.Date],
    billingCompany: () => Contains,
    billingCountryName: () => Contains,
    billingExtendedAddress: () => Contains,
    billingFirstName: () => Contains,
    billingLastName: () => Contains,
    billingLocality: () => Contains,
    billingPostalCode: () => Contains,
    billingRegion: () => Contains,
    billingStreetAddress: () => Contains,
    createdAt: () => Between[js.Date],
    createdUsing: () => In[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any] */ js.Any
    ],
    creditCardCardholderName: () => Contains,
    creditCardCustomerLocation: () => In[typings.braintree.mod.CustomerLocation],
    creditCardExpirationDate: () => Is[String],
    creditCardNumber: () => EndsWith[String],
    creditCardUniqueIdentifier: () => Contains,
    creditcardCardType: () => In[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
    ],
    currency: () => Contains,
    customerCompany: () => Contains,
    customerEmail: () => Contains,
    customerFax: () => Contains,
    customerFirstName: () => Contains,
    customerId: () => Contains,
    customerLastName: () => Contains,
    customerPhone: () => Contains,
    customerWebsite: () => Contains,
    disbursementDate: () => Between[js.Date],
    disputeDate: () => Between[js.Date],
    failedAt: () => Between[js.Date],
    gatewayRejectedAt: () => Between[js.Date],
    id: () => Contains,
    ids: () => In[String],
    merchantAccountId: () => In[String],
    orderId: () => Contains,
    paymentInstrumentType: () => In[String],
    paymentMethodToken: () => Contains,
    paypalAuthorizationId: () => Contains,
    paypalPayerEmail: () => Contains,
    paypalPaymentId: () => Contains,
    processorAuthorizationCode: () => Contains,
    processorDeclinedAt: () => Between[js.Date],
    refund: () => `0`[Boolean],
    settledAt: () => Between[js.Date],
    settlementBatchId: () => Contains,
    shippingCompany: () => Contains,
    shippingCountryName: () => Contains,
    shippingExtendedAddress: () => Contains,
    shippingFirstName: () => Contains,
    shippingLastName: () => Contains,
    shippingLocality: () => Contains,
    shippingPostalCode: () => Contains,
    shippingRegion: () => Contains,
    shippingStreetAddress: () => Contains,
    source: () => In[TransactionSource | String],
    status: () => In[TransactionStatus],
    storeId: () => Contains,
    storeIds: () => In[String],
    submittedForSettlementAt: () => Between[js.Date],
    `type`: () => In[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
    ],
    user: () => In[String],
    voidedAt: () => Between[js.Date]
  ): AuthorizationExpiredAt = {
    val __obj = js.Dynamic.literal(amount = js.Any.fromFunction0(amount), authorizationExpiredAt = js.Any.fromFunction0(authorizationExpiredAt), authorizedAt = js.Any.fromFunction0(authorizedAt), billingCompany = js.Any.fromFunction0(billingCompany), billingCountryName = js.Any.fromFunction0(billingCountryName), billingExtendedAddress = js.Any.fromFunction0(billingExtendedAddress), billingFirstName = js.Any.fromFunction0(billingFirstName), billingLastName = js.Any.fromFunction0(billingLastName), billingLocality = js.Any.fromFunction0(billingLocality), billingPostalCode = js.Any.fromFunction0(billingPostalCode), billingRegion = js.Any.fromFunction0(billingRegion), billingStreetAddress = js.Any.fromFunction0(billingStreetAddress), createdAt = js.Any.fromFunction0(createdAt), createdUsing = js.Any.fromFunction0(createdUsing), creditCardCardholderName = js.Any.fromFunction0(creditCardCardholderName), creditCardCustomerLocation = js.Any.fromFunction0(creditCardCustomerLocation), creditCardExpirationDate = js.Any.fromFunction0(creditCardExpirationDate), creditCardNumber = js.Any.fromFunction0(creditCardNumber), creditCardUniqueIdentifier = js.Any.fromFunction0(creditCardUniqueIdentifier), creditcardCardType = js.Any.fromFunction0(creditcardCardType), currency = js.Any.fromFunction0(currency), customerCompany = js.Any.fromFunction0(customerCompany), customerEmail = js.Any.fromFunction0(customerEmail), customerFax = js.Any.fromFunction0(customerFax), customerFirstName = js.Any.fromFunction0(customerFirstName), customerId = js.Any.fromFunction0(customerId), customerLastName = js.Any.fromFunction0(customerLastName), customerPhone = js.Any.fromFunction0(customerPhone), customerWebsite = js.Any.fromFunction0(customerWebsite), disbursementDate = js.Any.fromFunction0(disbursementDate), disputeDate = js.Any.fromFunction0(disputeDate), failedAt = js.Any.fromFunction0(failedAt), gatewayRejectedAt = js.Any.fromFunction0(gatewayRejectedAt), id = js.Any.fromFunction0(id), ids = js.Any.fromFunction0(ids), merchantAccountId = js.Any.fromFunction0(merchantAccountId), orderId = js.Any.fromFunction0(orderId), paymentInstrumentType = js.Any.fromFunction0(paymentInstrumentType), paymentMethodToken = js.Any.fromFunction0(paymentMethodToken), paypalAuthorizationId = js.Any.fromFunction0(paypalAuthorizationId), paypalPayerEmail = js.Any.fromFunction0(paypalPayerEmail), paypalPaymentId = js.Any.fromFunction0(paypalPaymentId), processorAuthorizationCode = js.Any.fromFunction0(processorAuthorizationCode), processorDeclinedAt = js.Any.fromFunction0(processorDeclinedAt), refund = js.Any.fromFunction0(refund), settledAt = js.Any.fromFunction0(settledAt), settlementBatchId = js.Any.fromFunction0(settlementBatchId), shippingCompany = js.Any.fromFunction0(shippingCompany), shippingCountryName = js.Any.fromFunction0(shippingCountryName), shippingExtendedAddress = js.Any.fromFunction0(shippingExtendedAddress), shippingFirstName = js.Any.fromFunction0(shippingFirstName), shippingLastName = js.Any.fromFunction0(shippingLastName), shippingLocality = js.Any.fromFunction0(shippingLocality), shippingPostalCode = js.Any.fromFunction0(shippingPostalCode), shippingRegion = js.Any.fromFunction0(shippingRegion), shippingStreetAddress = js.Any.fromFunction0(shippingStreetAddress), source = js.Any.fromFunction0(source), status = js.Any.fromFunction0(status), storeId = js.Any.fromFunction0(storeId), storeIds = js.Any.fromFunction0(storeIds), submittedForSettlementAt = js.Any.fromFunction0(submittedForSettlementAt), user = js.Any.fromFunction0(user), voidedAt = js.Any.fromFunction0(voidedAt))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[AuthorizationExpiredAt]
  }
  
  extension [Self <: AuthorizationExpiredAt](x: Self) {
    
    inline def setAmount(value: () => Between[String]): Self = StObject.set(x, "amount", js.Any.fromFunction0(value))
    
    inline def setAuthorizationExpiredAt(value: () => Between[js.Date]): Self = StObject.set(x, "authorizationExpiredAt", js.Any.fromFunction0(value))
    
    inline def setAuthorizedAt(value: () => Between[js.Date]): Self = StObject.set(x, "authorizedAt", js.Any.fromFunction0(value))
    
    inline def setBillingCompany(value: () => Contains): Self = StObject.set(x, "billingCompany", js.Any.fromFunction0(value))
    
    inline def setBillingCountryName(value: () => Contains): Self = StObject.set(x, "billingCountryName", js.Any.fromFunction0(value))
    
    inline def setBillingExtendedAddress(value: () => Contains): Self = StObject.set(x, "billingExtendedAddress", js.Any.fromFunction0(value))
    
    inline def setBillingFirstName(value: () => Contains): Self = StObject.set(x, "billingFirstName", js.Any.fromFunction0(value))
    
    inline def setBillingLastName(value: () => Contains): Self = StObject.set(x, "billingLastName", js.Any.fromFunction0(value))
    
    inline def setBillingLocality(value: () => Contains): Self = StObject.set(x, "billingLocality", js.Any.fromFunction0(value))
    
    inline def setBillingPostalCode(value: () => Contains): Self = StObject.set(x, "billingPostalCode", js.Any.fromFunction0(value))
    
    inline def setBillingRegion(value: () => Contains): Self = StObject.set(x, "billingRegion", js.Any.fromFunction0(value))
    
    inline def setBillingStreetAddress(value: () => Contains): Self = StObject.set(x, "billingStreetAddress", js.Any.fromFunction0(value))
    
    inline def setCreatedAt(value: () => Between[js.Date]): Self = StObject.set(x, "createdAt", js.Any.fromFunction0(value))
    
    inline def setCreatedUsing(
      value: () => In[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any] */ js.Any
        ]
    ): Self = StObject.set(x, "createdUsing", js.Any.fromFunction0(value))
    
    inline def setCreditCardCardholderName(value: () => Contains): Self = StObject.set(x, "creditCardCardholderName", js.Any.fromFunction0(value))
    
    inline def setCreditCardCustomerLocation(value: () => In[typings.braintree.mod.CustomerLocation]): Self = StObject.set(x, "creditCardCustomerLocation", js.Any.fromFunction0(value))
    
    inline def setCreditCardExpirationDate(value: () => Is[String]): Self = StObject.set(x, "creditCardExpirationDate", js.Any.fromFunction0(value))
    
    inline def setCreditCardNumber(value: () => EndsWith[String]): Self = StObject.set(x, "creditCardNumber", js.Any.fromFunction0(value))
    
    inline def setCreditCardUniqueIdentifier(value: () => Contains): Self = StObject.set(x, "creditCardUniqueIdentifier", js.Any.fromFunction0(value))
    
    inline def setCreditcardCardType(
      value: () => In[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
        ]
    ): Self = StObject.set(x, "creditcardCardType", js.Any.fromFunction0(value))
    
    inline def setCurrency(value: () => Contains): Self = StObject.set(x, "currency", js.Any.fromFunction0(value))
    
    inline def setCustomerCompany(value: () => Contains): Self = StObject.set(x, "customerCompany", js.Any.fromFunction0(value))
    
    inline def setCustomerEmail(value: () => Contains): Self = StObject.set(x, "customerEmail", js.Any.fromFunction0(value))
    
    inline def setCustomerFax(value: () => Contains): Self = StObject.set(x, "customerFax", js.Any.fromFunction0(value))
    
    inline def setCustomerFirstName(value: () => Contains): Self = StObject.set(x, "customerFirstName", js.Any.fromFunction0(value))
    
    inline def setCustomerId(value: () => Contains): Self = StObject.set(x, "customerId", js.Any.fromFunction0(value))
    
    inline def setCustomerLastName(value: () => Contains): Self = StObject.set(x, "customerLastName", js.Any.fromFunction0(value))
    
    inline def setCustomerPhone(value: () => Contains): Self = StObject.set(x, "customerPhone", js.Any.fromFunction0(value))
    
    inline def setCustomerWebsite(value: () => Contains): Self = StObject.set(x, "customerWebsite", js.Any.fromFunction0(value))
    
    inline def setDisbursementDate(value: () => Between[js.Date]): Self = StObject.set(x, "disbursementDate", js.Any.fromFunction0(value))
    
    inline def setDisputeDate(value: () => Between[js.Date]): Self = StObject.set(x, "disputeDate", js.Any.fromFunction0(value))
    
    inline def setFailedAt(value: () => Between[js.Date]): Self = StObject.set(x, "failedAt", js.Any.fromFunction0(value))
    
    inline def setGatewayRejectedAt(value: () => Between[js.Date]): Self = StObject.set(x, "gatewayRejectedAt", js.Any.fromFunction0(value))
    
    inline def setId(value: () => Contains): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setIds(value: () => In[String]): Self = StObject.set(x, "ids", js.Any.fromFunction0(value))
    
    inline def setMerchantAccountId(value: () => In[String]): Self = StObject.set(x, "merchantAccountId", js.Any.fromFunction0(value))
    
    inline def setOrderId(value: () => Contains): Self = StObject.set(x, "orderId", js.Any.fromFunction0(value))
    
    inline def setPaymentInstrumentType(value: () => In[String]): Self = StObject.set(x, "paymentInstrumentType", js.Any.fromFunction0(value))
    
    inline def setPaymentMethodToken(value: () => Contains): Self = StObject.set(x, "paymentMethodToken", js.Any.fromFunction0(value))
    
    inline def setPaypalAuthorizationId(value: () => Contains): Self = StObject.set(x, "paypalAuthorizationId", js.Any.fromFunction0(value))
    
    inline def setPaypalPayerEmail(value: () => Contains): Self = StObject.set(x, "paypalPayerEmail", js.Any.fromFunction0(value))
    
    inline def setPaypalPaymentId(value: () => Contains): Self = StObject.set(x, "paypalPaymentId", js.Any.fromFunction0(value))
    
    inline def setProcessorAuthorizationCode(value: () => Contains): Self = StObject.set(x, "processorAuthorizationCode", js.Any.fromFunction0(value))
    
    inline def setProcessorDeclinedAt(value: () => Between[js.Date]): Self = StObject.set(x, "processorDeclinedAt", js.Any.fromFunction0(value))
    
    inline def setRefund(value: () => `0`[Boolean]): Self = StObject.set(x, "refund", js.Any.fromFunction0(value))
    
    inline def setSettledAt(value: () => Between[js.Date]): Self = StObject.set(x, "settledAt", js.Any.fromFunction0(value))
    
    inline def setSettlementBatchId(value: () => Contains): Self = StObject.set(x, "settlementBatchId", js.Any.fromFunction0(value))
    
    inline def setShippingCompany(value: () => Contains): Self = StObject.set(x, "shippingCompany", js.Any.fromFunction0(value))
    
    inline def setShippingCountryName(value: () => Contains): Self = StObject.set(x, "shippingCountryName", js.Any.fromFunction0(value))
    
    inline def setShippingExtendedAddress(value: () => Contains): Self = StObject.set(x, "shippingExtendedAddress", js.Any.fromFunction0(value))
    
    inline def setShippingFirstName(value: () => Contains): Self = StObject.set(x, "shippingFirstName", js.Any.fromFunction0(value))
    
    inline def setShippingLastName(value: () => Contains): Self = StObject.set(x, "shippingLastName", js.Any.fromFunction0(value))
    
    inline def setShippingLocality(value: () => Contains): Self = StObject.set(x, "shippingLocality", js.Any.fromFunction0(value))
    
    inline def setShippingPostalCode(value: () => Contains): Self = StObject.set(x, "shippingPostalCode", js.Any.fromFunction0(value))
    
    inline def setShippingRegion(value: () => Contains): Self = StObject.set(x, "shippingRegion", js.Any.fromFunction0(value))
    
    inline def setShippingStreetAddress(value: () => Contains): Self = StObject.set(x, "shippingStreetAddress", js.Any.fromFunction0(value))
    
    inline def setSource(value: () => In[TransactionSource | String]): Self = StObject.set(x, "source", js.Any.fromFunction0(value))
    
    inline def setStatus(value: () => In[TransactionStatus]): Self = StObject.set(x, "status", js.Any.fromFunction0(value))
    
    inline def setStoreId(value: () => Contains): Self = StObject.set(x, "storeId", js.Any.fromFunction0(value))
    
    inline def setStoreIds(value: () => In[String]): Self = StObject.set(x, "storeIds", js.Any.fromFunction0(value))
    
    inline def setSubmittedForSettlementAt(value: () => Between[js.Date]): Self = StObject.set(x, "submittedForSettlementAt", js.Any.fromFunction0(value))
    
    inline def setType(
      value: () => In[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
        ]
    ): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setUser(value: () => In[String]): Self = StObject.set(x, "user", js.Any.fromFunction0(value))
    
    inline def setVoidedAt(value: () => Between[js.Date]): Self = StObject.set(x, "voidedAt", js.Any.fromFunction0(value))
  }
}
