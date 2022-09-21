package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.anon.Block
import typings.coinbaseCommerceNode.anon.Context
import typings.coinbaseCommerceNode.anon.Id
import typings.coinbaseCommerceNode.anon.PartialRecordCryptoNamest
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.charge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Charge creation response.
  *
  * @link https://commerce.coinbase.com/docs/api/#charge-resource
  */
trait ChargeResource
  extends StObject
     with BaseCharge {
  
  /**
    * Set of addresses associated with the charge.
    */
  var addresses: PartialRecordCryptoNamest
  
  /**
    * Associated checkout resource.
    */
  var checkout: js.UndefOr[Id] = js.undefined
  
  /**
    * User fiendly primary key.
    */
  var code: String
  
  /**
    * Charge confirmation time.
    */
  var confirmed_at: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Charge creation time.
    */
  var created_at: Timestamp
  
  /**
    * Charge expiration time.
    */
  var expires_at: Timestamp
  
  /**
    * Hosted charge URL.
    */
  var hosted_url: String
  
  /**
    * Charge UUID
    */
  var id: String
  
  /**
    * Charge image URL.
    */
  var logo_url: js.UndefOr[String] = js.undefined
  
  /**
    * Charge metadata provided by you, the developer.
    */
  @JSName("metadata")
  var metadata_ChargeResource: KeyVal
  
  /**
    * Array of charge payment objects.
    */
  var payments: js.Array[Block]
  
  /**
    * Charge price information object.
    */
  var pricing: Pricing
  
  /**
    * Resource name.
    */
  var resource: charge
  
  /**
    * Array of status update objects.
    */
  var timeline: js.Array[Context]
}
object ChargeResource {
  
  inline def apply(
    addresses: PartialRecordCryptoNamest,
    code: String,
    created_at: Timestamp,
    description: String,
    expires_at: Timestamp,
    hosted_url: String,
    id: String,
    metadata: KeyVal,
    name: String,
    payments: js.Array[Block],
    pricing: Pricing,
    pricing_type: PricingType,
    timeline: js.Array[Context]
  ): ChargeResource = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], hosted_url = hosted_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], resource = "charge", timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeResource]
  }
  
  extension [Self <: ChargeResource](x: Self) {
    
    inline def setAddresses(value: PartialRecordCryptoNamest): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setCheckout(value: Id): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
    
    inline def setCheckoutUndefined: Self = StObject.set(x, "checkout", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setConfirmed_at(value: Timestamp): Self = StObject.set(x, "confirmed_at", value.asInstanceOf[js.Any])
    
    inline def setConfirmed_atUndefined: Self = StObject.set(x, "confirmed_at", js.undefined)
    
    inline def setCreated_at(value: Timestamp): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: Timestamp): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setHosted_url(value: String): Self = StObject.set(x, "hosted_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogo_url(value: String): Self = StObject.set(x, "logo_url", value.asInstanceOf[js.Any])
    
    inline def setLogo_urlUndefined: Self = StObject.set(x, "logo_url", js.undefined)
    
    inline def setMetadata(value: KeyVal): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setPayments(value: js.Array[Block]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsVarargs(value: Block*): Self = StObject.set(x, "payments", js.Array(value*))
    
    inline def setPricing(value: Pricing): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    inline def setResource(value: charge): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setTimeline(value: js.Array[Context]): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineVarargs(value: Context*): Self = StObject.set(x, "timeline", js.Array(value*))
  }
}
