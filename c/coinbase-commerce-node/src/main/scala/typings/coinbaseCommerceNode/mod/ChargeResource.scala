package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.AnonBlock
import typings.coinbaseCommerceNode.AnonContext
import typings.coinbaseCommerceNode.AnonId
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.charge
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
  var checkout: js.UndefOr[AnonId] = js.undefined
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
  var payments: js.Array[AnonBlock]
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
  var timeline: js.Array[AnonContext]
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
    payments: js.Array[AnonBlock],
    pricing: Pricing,
    pricing_type: PricingType,
    resource: charge,
    timeline: js.Array[AnonContext],
    cancel_url: String = null,
    checkout: AnonId = null,
    confirmed_at: Timestamp = null,
    logo_url: String = null,
    redirect_url: String = null
  ): ChargeResource = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], hosted_url = hosted_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    if (cancel_url != null) __obj.updateDynamic("cancel_url")(cancel_url.asInstanceOf[js.Any])
    if (checkout != null) __obj.updateDynamic("checkout")(checkout.asInstanceOf[js.Any])
    if (confirmed_at != null) __obj.updateDynamic("confirmed_at")(confirmed_at.asInstanceOf[js.Any])
    if (logo_url != null) __obj.updateDynamic("logo_url")(logo_url.asInstanceOf[js.Any])
    if (redirect_url != null) __obj.updateDynamic("redirect_url")(redirect_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeResource]
  }
}

