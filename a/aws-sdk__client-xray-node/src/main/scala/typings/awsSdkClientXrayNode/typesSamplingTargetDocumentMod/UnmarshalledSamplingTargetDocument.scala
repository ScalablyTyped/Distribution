package typings.awsSdkClientXrayNode.typesSamplingTargetDocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSamplingTargetDocument extends SamplingTargetDocument {
  /**
    * <p>When the reservoir quota expires.</p>
    */
  @JSName("ReservoirQuotaTTL")
  var ReservoirQuotaTTL_UnmarshalledSamplingTargetDocument: js.UndefOr[Date] = js.undefined
}

object UnmarshalledSamplingTargetDocument {
  @scala.inline
  def apply(
    FixedRate: js.UndefOr[Double] = js.undefined,
    Interval: js.UndefOr[Double] = js.undefined,
    ReservoirQuota: js.UndefOr[Double] = js.undefined,
    ReservoirQuotaTTL: Date = null,
    RuleName: String = null
  ): UnmarshalledSamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FixedRate)) __obj.updateDynamic("FixedRate")(FixedRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Interval)) __obj.updateDynamic("Interval")(Interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReservoirQuota)) __obj.updateDynamic("ReservoirQuota")(ReservoirQuota.get.asInstanceOf[js.Any])
    if (ReservoirQuotaTTL != null) __obj.updateDynamic("ReservoirQuotaTTL")(ReservoirQuotaTTL.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSamplingTargetDocument]
  }
}

