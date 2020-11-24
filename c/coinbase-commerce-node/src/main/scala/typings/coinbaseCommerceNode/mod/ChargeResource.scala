package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.anon.Block
import typings.coinbaseCommerceNode.anon.Context
import typings.coinbaseCommerceNode.anon.Id
import typings.coinbaseCommerceNode.anon.PartialRecordCryptoNamest
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.charge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Charge creation response.
  *
  * @link https://commerce.coinbase.com/docs/api/#charge-resource
  */
@js.native
trait ChargeResource extends BaseCharge {
  
  /**
    * Set of addresses associated with the charge.
    */
  var addresses: PartialRecordCryptoNamest = js.native
  
  /**
    * Associated checkout resource.
    */
  var checkout: js.UndefOr[Id] = js.native
  
  /**
    * User fiendly primary key.
    */
  var code: String = js.native
  
  /**
    * Charge confirmation time.
    */
  var confirmed_at: js.UndefOr[Timestamp] = js.native
  
  /**
    * Charge creation time.
    */
  var created_at: Timestamp = js.native
  
  /**
    * Charge expiration time.
    */
  var expires_at: Timestamp = js.native
  
  /**
    * Hosted charge URL.
    */
  var hosted_url: String = js.native
  
  /**
    * Charge UUID
    */
  var id: String = js.native
  
  /**
    * Charge image URL.
    */
  var logo_url: js.UndefOr[String] = js.native
  
  /**
    * Charge metadata provided by you, the developer.
    */
  @JSName("metadata")
  var metadata_ChargeResource: KeyVal = js.native
  
  /**
    * Array of charge payment objects.
    */
  var payments: js.Array[Block] = js.native
  
  /**
    * Charge price information object.
    */
  var pricing: Pricing = js.native
  
  /**
    * Resource name.
    */
  var resource: charge = js.native
  
  /**
    * Array of status update objects.
    */
  var timeline: js.Array[Context] = js.native
}
object ChargeResource {
  
  @scala.inline
  def apply(
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
    resource: charge,
    timeline: js.Array[Context]
  ): ChargeResource = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], hosted_url = hosted_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeResource]
  }
  
  @scala.inline
  implicit class ChargeResourceOps[Self <: ChargeResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddresses(value: PartialRecordCryptoNamest): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Timestamp): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_at(value: Timestamp): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHosted_url(value: String): Self = this.set("hosted_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: KeyVal): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentsVarargs(value: Block*): Self = this.set("payments", js.Array(value :_*))
    
    @scala.inline
    def setPayments(value: js.Array[Block]): Self = this.set("payments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricing(value: Pricing): Self = this.set("pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: charge): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineVarargs(value: Context*): Self = this.set("timeline", js.Array(value :_*))
    
    @scala.inline
    def setTimeline(value: js.Array[Context]): Self = this.set("timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckout(value: Id): Self = this.set("checkout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckout: Self = this.set("checkout", js.undefined)
    
    @scala.inline
    def setConfirmed_at(value: Timestamp): Self = this.set("confirmed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmed_at: Self = this.set("confirmed_at", js.undefined)
    
    @scala.inline
    def setLogo_url(value: String): Self = this.set("logo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo_url: Self = this.set("logo_url", js.undefined)
  }
}
