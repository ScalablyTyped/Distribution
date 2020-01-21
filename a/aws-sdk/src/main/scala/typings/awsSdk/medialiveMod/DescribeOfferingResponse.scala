package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOfferingResponse extends js.Object {
  /**
    * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
    */
  var CurrencyCode: js.UndefOr[string] = js.native
  /**
    * Lease duration, e.g. '12'
    */
  var Duration: js.UndefOr[integer] = js.native
  /**
    * Units for duration, e.g. 'MONTHS'
    */
  var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.native
  /**
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[double] = js.native
  /**
    * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
    */
  var OfferingDescription: js.UndefOr[string] = js.native
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: js.UndefOr[string] = js.native
  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  var OfferingType: js.UndefOr[typings.awsSdk.medialiveMod.OfferingType] = js.native
  /**
    * AWS region, e.g. 'us-west-2'
    */
  var Region: js.UndefOr[string] = js.native
  /**
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.native
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[double] = js.native
}

object DescribeOfferingResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    CurrencyCode: string = null,
    Duration: Int | Double = null,
    DurationUnits: OfferingDurationUnits = null,
    FixedPrice: Int | Double = null,
    OfferingDescription: string = null,
    OfferingId: string = null,
    OfferingType: OfferingType = null,
    Region: string = null,
    ResourceSpecification: ReservationResourceSpecification = null,
    UsagePrice: Int | Double = null
  ): DescribeOfferingResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (DurationUnits != null) __obj.updateDynamic("DurationUnits")(DurationUnits.asInstanceOf[js.Any])
    if (FixedPrice != null) __obj.updateDynamic("FixedPrice")(FixedPrice.asInstanceOf[js.Any])
    if (OfferingDescription != null) __obj.updateDynamic("OfferingDescription")(OfferingDescription.asInstanceOf[js.Any])
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (ResourceSpecification != null) __obj.updateDynamic("ResourceSpecification")(ResourceSpecification.asInstanceOf[js.Any])
    if (UsagePrice != null) __obj.updateDynamic("UsagePrice")(UsagePrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOfferingResponse]
  }
}

