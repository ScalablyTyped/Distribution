package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingTargetDocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSamplingTargetDocument extends _SamplingTargetDocument {
  /**
    * <p>When the reservoir quota expires.</p>
    */
  @JSName("ReservoirQuotaTTL")
  var ReservoirQuotaTTL__UnmarshalledSamplingTargetDocument: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledSamplingTargetDocument {
  @scala.inline
  def apply(
    FixedRate: Int | Double = null,
    Interval: Int | Double = null,
    ReservoirQuota: Int | Double = null,
    ReservoirQuotaTTL: Date = null,
    RuleName: String = null
  ): _UnmarshalledSamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    if (FixedRate != null) __obj.updateDynamic("FixedRate")(FixedRate.asInstanceOf[js.Any])
    if (Interval != null) __obj.updateDynamic("Interval")(Interval.asInstanceOf[js.Any])
    if (ReservoirQuota != null) __obj.updateDynamic("ReservoirQuota")(ReservoirQuota.asInstanceOf[js.Any])
    if (ReservoirQuotaTTL != null) __obj.updateDynamic("ReservoirQuotaTTL")(ReservoirQuotaTTL.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSamplingTargetDocument]
  }
}

