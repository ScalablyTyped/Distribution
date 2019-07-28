package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import typings.coinbaseDashCommerceDashNode.Anon_Block
import typings.coinbaseDashCommerceDashNode.Anon_Context
import typings.coinbaseDashCommerceDashNode.Anon_Id
import typings.coinbaseDashCommerceDashNode.Timestamp
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.charge
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Charge creation response.
  *
  * @link https://commerce.coinbase.com/docs/api/#charge-resource
  */
trait ChargeResource extends BaseCharge {
  /**
    * Set of addresses associated with the charge.
    */
  var addresses: Partial[Record[CryptoName, String]]
  /**
    * Associated checkout resource.
    */
  var checkout: js.UndefOr[Anon_Id] = js.undefined
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
  var payments: js.Array[Anon_Block]
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
  var timeline: js.Array[Anon_Context]
}

object ChargeResource {
  @scala.inline
  def apply(
    addresses: Partial[Record[CryptoName, String]],
    code: String,
    created_at: Timestamp,
    description: String,
    expires_at: Timestamp,
    hosted_url: String,
    id: String,
    metadata: KeyVal,
    name: String,
    payments: js.Array[Anon_Block],
    pricing: Pricing,
    pricing_type: PricingType,
    resource: charge,
    timeline: js.Array[Anon_Context],
    cancel_url: String = null,
    checkout: Anon_Id = null,
    confirmed_at: Timestamp = null,
    logo_url: String = null,
    redirect_url: String = null
  ): ChargeResource = {
    val __obj = js.Dynamic.literal(addresses = addresses, code = code, created_at = created_at, description = description, expires_at = expires_at, hosted_url = hosted_url, id = id, metadata = metadata, name = name, payments = payments, pricing = pricing, pricing_type = pricing_type, resource = resource, timeline = timeline)
    if (cancel_url != null) __obj.updateDynamic("cancel_url")(cancel_url)
    if (checkout != null) __obj.updateDynamic("checkout")(checkout)
    if (confirmed_at != null) __obj.updateDynamic("confirmed_at")(confirmed_at)
    if (logo_url != null) __obj.updateDynamic("logo_url")(logo_url)
    if (redirect_url != null) __obj.updateDynamic("redirect_url")(redirect_url)
    __obj.asInstanceOf[ChargeResource]
  }
}

