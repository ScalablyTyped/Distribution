package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingTargetDocument extends js.Object {
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[Double] = js.native
  /**
    * The number of seconds for the service to wait before getting sampling targets again.
    */
  var Interval: js.UndefOr[NullableInteger] = js.native
  /**
    * The number of requests per second that X-Ray allocated this service.
    */
  var ReservoirQuota: js.UndefOr[NullableInteger] = js.native
  /**
    * When the reservoir quota expires.
    */
  var ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.native
}

object SamplingTargetDocument {
  @scala.inline
  def apply(): SamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingTargetDocument]
  }
  @scala.inline
  implicit class SamplingTargetDocumentOps[Self <: SamplingTargetDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFixedRate(value: Double): Self = this.set("FixedRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedRate: Self = this.set("FixedRate", js.undefined)
    @scala.inline
    def setInterval(value: NullableInteger): Self = this.set("Interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("Interval", js.undefined)
    @scala.inline
    def setReservoirQuota(value: NullableInteger): Self = this.set("ReservoirQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservoirQuota: Self = this.set("ReservoirQuota", js.undefined)
    @scala.inline
    def setReservoirQuotaTTL(value: Timestamp): Self = this.set("ReservoirQuotaTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservoirQuotaTTL: Self = this.set("ReservoirQuotaTTL", js.undefined)
    @scala.inline
    def setRuleName(value: String): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleName: Self = this.set("RuleName", js.undefined)
  }
  
}

