package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

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
  var addresses: stdLib.Partial[stdLib.Record[CryptoName, java.lang.String]]
  /**
    * Associated checkout resource.
    */
  var checkout: js.UndefOr[coinbaseDashCommerceDashNodeLib.Anon_Id] = js.undefined
  /**
    * User fiendly primary key.
    */
  var code: java.lang.String
  /**
    * Charge confirmation time.
    */
  var confirmed_at: js.UndefOr[coinbaseDashCommerceDashNodeLib.Timestamp] = js.undefined
  /**
    * Charge creation time.
    */
  var created_at: coinbaseDashCommerceDashNodeLib.Timestamp
  /**
    * Charge expiration time.
    */
  var expires_at: coinbaseDashCommerceDashNodeLib.Timestamp
  /**
    * Hosted charge URL.
    */
  var hosted_url: java.lang.String
  /**
    * Charge UUID
    */
  var id: java.lang.String
  /**
    * Charge image URL.
    */
  var logo_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Charge metadata provided by you, the developer.
    */
  @JSName("metadata")
  var metadata_ChargeResource: KeyVal
  /**
    * Array of charge payment objects.
    */
  var payments: js.Array[coinbaseDashCommerceDashNodeLib.Anon_Block]
  /**
    * Charge price information object.
    */
  var pricing: Pricing
  /**
    * Resource name.
    */
  var resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.charge
  /**
    * Array of status update objects.
    */
  var timeline: js.Array[coinbaseDashCommerceDashNodeLib.Anon_Context]
}

object ChargeResource {
  @scala.inline
  def apply(
    addresses: stdLib.Partial[stdLib.Record[CryptoName, java.lang.String]],
    code: java.lang.String,
    created_at: coinbaseDashCommerceDashNodeLib.Timestamp,
    description: java.lang.String,
    expires_at: coinbaseDashCommerceDashNodeLib.Timestamp,
    hosted_url: java.lang.String,
    id: java.lang.String,
    metadata: KeyVal,
    name: java.lang.String,
    payments: js.Array[coinbaseDashCommerceDashNodeLib.Anon_Block],
    pricing: Pricing,
    pricing_type: PricingType,
    resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.charge,
    timeline: js.Array[coinbaseDashCommerceDashNodeLib.Anon_Context],
    cancel_url: java.lang.String = null,
    checkout: coinbaseDashCommerceDashNodeLib.Anon_Id = null,
    confirmed_at: coinbaseDashCommerceDashNodeLib.Timestamp = null,
    logo_url: java.lang.String = null,
    redirect_url: java.lang.String = null
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

