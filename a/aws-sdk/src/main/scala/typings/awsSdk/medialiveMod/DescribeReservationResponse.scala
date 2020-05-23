package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservationResponse extends js.Object {
  /**
    * Unique reservation ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * Number of reserved resources
    */
  var Count: js.UndefOr[integer] = js.native
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
    * Reservation UTC end date and time in ISO-8601 format, e.g. '2019-03-01T00:00:00'
    */
  var End: js.UndefOr[string] = js.native
  /**
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[double] = js.native
  /**
    * User specified reservation name
    */
  var Name: js.UndefOr[string] = js.native
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
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: js.UndefOr[string] = js.native
  /**
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.native
  /**
    * Reservation UTC start date and time in ISO-8601 format, e.g. '2018-03-01T00:00:00'
    */
  var Start: js.UndefOr[string] = js.native
  /**
    * Current state of reservation, e.g. 'ACTIVE'
    */
  var State: js.UndefOr[ReservationState] = js.native
  /**
    * A collection of key-value pairs
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[double] = js.native
}

object DescribeReservationResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    Count: js.UndefOr[integer] = js.undefined,
    CurrencyCode: string = null,
    Duration: js.UndefOr[integer] = js.undefined,
    DurationUnits: OfferingDurationUnits = null,
    End: string = null,
    FixedPrice: js.UndefOr[double] = js.undefined,
    Name: string = null,
    OfferingDescription: string = null,
    OfferingId: string = null,
    OfferingType: OfferingType = null,
    Region: string = null,
    ReservationId: string = null,
    ResourceSpecification: ReservationResourceSpecification = null,
    Start: string = null,
    State: ReservationState = null,
    Tags: Tags = null,
    UsagePrice: js.UndefOr[double] = js.undefined
  ): DescribeReservationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (DurationUnits != null) __obj.updateDynamic("DurationUnits")(DurationUnits.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OfferingDescription != null) __obj.updateDynamic("OfferingDescription")(OfferingDescription.asInstanceOf[js.Any])
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (ReservationId != null) __obj.updateDynamic("ReservationId")(ReservationId.asInstanceOf[js.Any])
    if (ResourceSpecification != null) __obj.updateDynamic("ResourceSpecification")(ResourceSpecification.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservationResponse]
  }
}

