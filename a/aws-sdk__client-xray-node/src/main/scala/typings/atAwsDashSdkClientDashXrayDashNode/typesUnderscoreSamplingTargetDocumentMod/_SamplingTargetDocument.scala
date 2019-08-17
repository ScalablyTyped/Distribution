package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingTargetDocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SamplingTargetDocument extends js.Object {
  /**
    * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
    */
  var FixedRate: js.UndefOr[Double] = js.undefined
  /**
    * <p>The number of seconds for the service to wait before getting sampling targets again.</p>
    */
  var Interval: js.UndefOr[Double] = js.undefined
  /**
    * <p>The number of requests per second that X-Ray allocated this service.</p>
    */
  var ReservoirQuota: js.UndefOr[Double] = js.undefined
  /**
    * <p>When the reservoir quota expires.</p>
    */
  var ReservoirQuotaTTL: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: js.UndefOr[String] = js.undefined
}

object _SamplingTargetDocument {
  @scala.inline
  def apply(
    FixedRate: Int | Double = null,
    Interval: Int | Double = null,
    ReservoirQuota: Int | Double = null,
    ReservoirQuotaTTL: Date | String | Double = null,
    RuleName: String = null
  ): _SamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    if (FixedRate != null) __obj.updateDynamic("FixedRate")(FixedRate.asInstanceOf[js.Any])
    if (Interval != null) __obj.updateDynamic("Interval")(Interval.asInstanceOf[js.Any])
    if (ReservoirQuota != null) __obj.updateDynamic("ReservoirQuota")(ReservoirQuota.asInstanceOf[js.Any])
    if (ReservoirQuotaTTL != null) __obj.updateDynamic("ReservoirQuotaTTL")(ReservoirQuotaTTL.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    __obj.asInstanceOf[_SamplingTargetDocument]
  }
}

